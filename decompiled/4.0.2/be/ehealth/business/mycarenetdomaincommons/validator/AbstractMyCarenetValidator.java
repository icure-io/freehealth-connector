package be.ehealth.business.mycarenetdomaincommons.validator;

public abstract class AbstractMyCarenetValidator {
   public AbstractMyCarenetValidator() {
   }

   protected static String addPath(String currentPath, String newPathNode) {
      return currentPath + "->" + newPathNode;
   }
}
