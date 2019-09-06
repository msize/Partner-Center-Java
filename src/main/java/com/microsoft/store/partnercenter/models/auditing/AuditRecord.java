// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.auditing;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

import org.joda.time.DateTime;

/**
 * Represents a record of operation performed by a partner user or application
 */
public class AuditRecord extends ResourceBase 
{
	/**
	 *  The identifier of the application invoking the operation.
	 */
	private String applicationId;

	/**
	 * The identifier of customer in whose context operation was performed.
	 */
	private String customerId;

	/**
	 * The name of customer in whose context operation was performed.
	 */
	private String customerName;

	/**
	 * The dictionary which holds additional data that is customized to the operation performed.
	 */
	private Iterable<KeyValuePair<String, String>> customizedData;

	/**
	 * The unique identifier for the audit record.
	 */
	private String id;

	/**
	 * The date and time when the operation was performed.
	 */
	private DateTime operationDate;

	/**
	 * The status of the operation that is audited.
	 */
	private OperationStatus operationStatus;

	/**
	 * The type of the operation being performed.
	 */
	private OperationType operationType;

	/**
	 * The identifier of the partner that performed the operation.
	 */
	private String partnerId;

	/**
	 * The new value of the resource.
	 */
	private String resourceNewValue;
	
	/**
	 * The old value of the resource.
	 */
	private String resourceOldValue;

	/**
	 * The type of the resource acted upon by the operation.
	 */
	private ResourceType resourceType;

	/**
	 * The identifier of the user who performed the operation. This could be in the context of application.
	 */
	private String userPrincipalName;

	/**
     * Gets the identifier of the application invoking the operation.
     * 
     * @return The identifier of the application invoking the operation.
     */
	public String getApplicationId()
	{
		return applicationId;
	}

	/**
     * Sets the identifier of the application invoking the operation.
     * 
     * @param value The identifier of the application invoking the operation.
     */
	public void setApplicationId(String value)
	{
		applicationId = value;
	}

	/**
     * Gets the dictionary which holds additional data that is customized to the operation performed.
     * 
     * @return The dictionary which holds additional data that is customized to the operation performed.
     */
	public Iterable<KeyValuePair<String, String>> getCustomizedData()
	{
		return customizedData;
	}

	/**
     * Sets the dictionary which holds additional data that is customized to the operation performed.
     * 
     * @param value The dictionary which holds additional data that is customized to the operation performed.
     */
	public void setCustomizedData(Iterable<KeyValuePair<String, String>> value)
	{
		customizedData = value;
	}

	/**
     * Gets the identifier of customer in whose context operation was performed.
     * 
     * @return The identifier of customer in whose context operation was performed.
     */
	public String getCustomerId()
	{
		return customerId;
	}

	/**
     * Sets the identifier of customer in whose context operation was performed.
     * 
     * @param value The identifier of customer in whose context operation was performed.
     */
	public void setCustomerId(String value)
	{
		customerId = value;
	}

	/**
     * Gets the name of customer in whose context operation was performed.
     * 
     * @return The name of customer in whose context operation was performed.
     */
	public String getCustomerName()
	{
		return customerName;
	}

	/**
     * Sets the name of customer in whose context operation was performed.
     * 
     * @param value The name of customer in whose context operation was performed.
     */
	public void setCustomerName(String value)
	{
		customerName = value;
	}

	/**
     * Gets the unique identifier for the audit record.
     * 
     * @return The unique identifier for the audit record.
     */
	public String getId()
	{
		return id;
	}

    /**
     * Sets the unique identifier for the audit record.
     * 
     * @param value The unique identifier for the audit record.
     */
	public void setId(String value)
	{
		id = value;
	}

	/**
     * Gets the date and time when the operation was performed.
     * 
     * @return The date and time when the operation was performed.
     */
	public DateTime getOperationDate()
	{
		return operationDate;
	}

    /**
     * Sets the date and time when the operation was performed.
     * 
     * @param value The date and time when the operation was performed.
     */
	public void setOperationDate(DateTime value)
	{
		operationDate = value;
	}

	/**
     * Gets the status of the operation that is audited.
     * 
     * @return The status of the operation that is audited.
     */
	public OperationStatus getOperationStatus()
	{
		return operationStatus;
	}

	/**
     * Sets the status of the operation that is audited.
     * 
     * @param value The status of the operation that is audited.
     */
	public void setOperationStatus(OperationStatus value)
	{
		operationStatus = value;
	}

	/**
     * Gets the type of the operation being performed.
     * 
     * @return The type of the operation being performed.
     */
	public OperationType getOperationType()
	{
		return operationType;
	}

	/**
     * Sets the type of the operation being performed.
     * 
     * @param value The type of the operation being performed.
     */
	public void setOperationType(OperationType value)
	{
		operationType = value;
	}

	/**
     * Gets the identifier of the partner that performed the operation.
     * 
     * @return The identifier of the partner that performed the operation.
     */
	public String getPartnerId()
	{
		return partnerId;
	}

	/**
     * Sets the identifier of the partner that performed the operation.
     * 
     * @param value The identifier of the partner that performed the operation.
     */
	public void setPartnerId(String value)
	{
		partnerId = value;
	}

	/**
     * Gets the new value of the resource.
     * 
     * @return The new value of the resource.
     */
	public String getResourceNewValue()
	{
		return resourceNewValue;
	}

	/**
     * Sets the new value of the resource.
     * 
     * @param value The new value of the resource.
     */
	public void setResourceNewValue(String value)
	{
		resourceNewValue = value;
	}

	/**
     * Gets the old value of the resource.
     * 
     * @return The old value of the resource.
     */
	public String getResourceOldValue()
	{
		return resourceOldValue;
	}

	/**
     * Sets the old value of the resource.
     * 
     * @param value The old value of the resource.
     */
	public void setResourceOldValue(String value)
	{
		resourceOldValue = value;
	}

	/**
     * Gets the type of the resource acted upon by the operation.
     * 
     * @return The type of the resource acted upon by the operation.
     */
	public ResourceType getResourceType()
	{
		return resourceType;
	}

	/**
     * Sets the type of the resource acted upon by the operation.
     * 
     * @param value The type of the resource acted upon by the operation.
     */
	public void setResourceType(ResourceType value)
	{
		resourceType = value;
	}

	/**
     * Gets the identifier of the user who performed the operation. This could be in the context of application.
     * 
     * @return The identifier of the user who performed the operation.
     */
	public String getUserPrincipalName()
	{
		return userPrincipalName;
	}

	/**
     * Sets the identifier of the user who performed the operation. This could be in the context of application.
     * 
     * @param value The identifier of the user who performed the operation.
     */
	public void setUserPrincipalName(String value)
	{
		userPrincipalName = value;
	}
}