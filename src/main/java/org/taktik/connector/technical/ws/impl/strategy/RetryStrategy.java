package org.taktik.connector.technical.ws.impl.strategy;

import org.taktik.connector.technical.exception.NoNextEndpointException;
import org.taktik.connector.technical.exception.RetryNextEndpointException;
import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.exception.TechnicalConnectorExceptionValues;
import org.taktik.connector.technical.ws.domain.GenericRequest;
import org.taktik.connector.technical.ws.impl.AbstractWsSender;
import be.fgov.ehealth.technicalconnector.bootstrap.bcp.EndpointDistributor;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryStrategy extends AbstractWsSender implements InvokeStrategy {
   private static final Logger LOG = LoggerFactory.getLogger(RetryStrategy.class);
   private static EndpointDistributor distributor = EndpointDistributor.getInstance();

   public boolean invoke(InvokeStrategyContext invokeStrategyContext) {
      GenericRequest genericRequest = invokeStrategyContext.getRequest();
      RetryStrategy.RetryContext ctx = new RetryStrategy.RetryContext(this.getCurrentEndpoint(genericRequest));
      int alternatives = distributor.getAmountOfAlternatives(ctx.endpoint);

      for(int i = 0; i < alternatives; ++i) {
         String activeEndpoint = distributor.getActiveEndpoint(ctx.endpoint);
         if (!ctx.invokedEndpoints.contains(activeEndpoint)) {
            ctx.invokedEndpoints.add(activeEndpoint);
            genericRequest.setEndpoint(activeEndpoint);

            try {
               invokeStrategyContext.setResponse(super.call(genericRequest));
               return false;
            } catch (RetryNextEndpointException var8) {
               this.retryNext(ctx, activeEndpoint, var8);
            } catch (TechnicalConnectorException var9) {
               invokeStrategyContext.setException(var9);
               return true;
            }
         } else {
            LOG.debug("Endpoint [{}] already invoked, skipping it.", activeEndpoint);
         }
      }

      if (EndpointDistributor.update()) {
         return this.invoke(invokeStrategyContext);
      } else {
         invokeStrategyContext.setException(new TechnicalConnectorException(TechnicalConnectorExceptionValues.ERROR_WS, ExceptionUtils.getRootCause(ctx.lastException), ExceptionUtils.getRootCauseMessage(ctx.lastException)));
         return true;
      }
   }

   private void retryNext(RetryStrategy.RetryContext ctx, String activeEndpoint, RetryNextEndpointException e) {
      LOG.error("Unable to invoke endpoint [{}], activating next one.", activeEndpoint, e);

      try {
         distributor.activateNextEndPoint(activeEndpoint);
      } catch (NoNextEndpointException var5) {
         LOG.error("Unable to activate alternative", var5);
      }

   }

   private static class RetryContext {
      String endpoint;
      Exception lastException;
      List<String> invokedEndpoints = new ArrayList();

      RetryContext(String endpoint) {
         this.endpoint = endpoint;
      }
   }
}
