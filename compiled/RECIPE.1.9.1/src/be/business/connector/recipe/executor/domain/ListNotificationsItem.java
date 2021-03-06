package be.business.connector.recipe.executor.domain;

import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import be.business.connector.core.exceptions.IntegrationModuleException;

/**
 * The Class ListNotificationsItem.
 */
public class ListNotificationsItem extends be.recipe.services.executor.ListNotificationsItem {

	/**
	 * Gets the linked exception.
	 *
	 * @return the linked exception
	 */
	public Throwable getLinkedException() {
		return linkedException;
	}

	public ListNotificationsItem(be.recipe.services.executor.ListNotificationsItem root) {
		super();
		this.root = root;
	}

	public ListNotificationsItem() {
		super();
	}

	/**
	 * Sets the linked exception.
	 *
	 * @param linkedException
	 *            the new linked exception
	 */
	public void setLinkedException(Throwable linkedException) {
		this.linkedException = linkedException;
	}

	/** The root. */
	be.recipe.services.executor.ListNotificationsItem root = null;

	/** The linked exception. */
	Throwable linkedException = null;

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public byte[] getContent() {
		if (linkedException != null) {
			throw new RuntimeException(linkedException);
		}
		return root != null ? root.getContent() : null;
	}

	/**
	 * Gets the sent by.
	 *
	 * @return the sent by
	 */
	public String getSentBy() {
		return root.getSentBy();
	}

	// /**
	// * Gets the sent date.
	// *
	// * @return the sent date
	// */
	// @Override
	// public Date getSentDate() {
	// return root.getSentDate().toGregorianCalendar().getTime();
	// }

	/**
	 * Sets the content.
	 *
	 * @param arg0
	 *            the new content
	 */
	public void setContent(byte[] arg0) {
		root.setContent(arg0);
	}

	/**
	 * Sets the sent by.
	 *
	 * @param arg0
	 *            the new sent by
	 */
	public void setSentBy(String arg0) {
		root.setSentBy(arg0);
	}

	/**
	 * Sets the sent date.
	 *
	 * @param arg0
	 *            the new sent date
	 * @throws DatatypeConfigurationException
	 */
	public void setSentDate(Date arg0) throws IntegrationModuleException {
		Calendar c = Calendar.getInstance();
		c.setTime(arg0);
		root.setSentDate(c);
	}

	public boolean equals(Object obj) {
		return root.equals(obj);
	}

	public int hashCode() {
		return root.hashCode();
	}

	public String toString() {
		return root.toString();
	}
}
