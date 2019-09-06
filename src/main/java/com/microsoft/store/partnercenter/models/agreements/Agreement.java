// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.agreements;

import com.microsoft.store.partnercenter.models.Contact;
import com.microsoft.store.partnercenter.models.ResourceBase;
import org.joda.time.DateTime;

/**
 * Represents the details of certification provided by the partner.
 */
public class Agreement
        extends ResourceBase
{
    /**
     * The download link for the agreement.
     */
    private String agreementLink;

    /**
     * The date the agreement was signed.
     */
    private DateTime dateAgreed;

    /**
     * The primary contact for the agreement.
     */
    private Contact primaryContact;

    /**
     * The template identifier of the agreement.
     */
    private String templateId;

    /**
     * The type of agreement.
     */
    private String type;

    /**
     * The partner's user identifier.
     */
    private String userId;

    /**
     * Gets the download link for the agreement.
     * 
     * @return The download link for the agreement.
     */
    public String getAgreementLink()
    {
        return agreementLink;
    }

    /**
     * Sets the download link for the agreement.
     * 
     * @param value The download link for the agreement.
     */
    public void setAgreementLink(String value)
    {
        agreementLink = value;
    }

    /**
     * Gets the date the agreement was signed.
     * 
     * @return The date the agreement was signed.
     */
    public DateTime getDateAgreed()
    {
        return dateAgreed;
    }

    /**
     * Sets the date the agreement was signed.
     * 
     * @param value The date the agreement was signed.
     */
    public void setDateAgreed(DateTime value)
    {
        dateAgreed = value;
    }

    /**
     * Gets the primary contact for the agreement.
     * 
     * @return The primary contact for the agreement.
     */
    public Contact getPrimaryContact()
    {
        return primaryContact;
    }

    /**
     * Sets the primary contact for the agreement.
     * 
     * @param value The primary contact for the agreement.
     */
    public void setPrimaryContact(Contact value)
    {
        primaryContact = value;
    }

    /**
     * Gets the template identifier of the agreement.
     * 
     * @return The template identifier of the agreement.
     */
    public String getTemplateId()
    {
        return templateId;
    }

    /**
     * Sets the template identifier of the agreement.
     * 
     * @param value The template identifier of the agreement.
     */
    public void setTemplateId(String value)
    {
        templateId = value;
    }

    /**
     * Gets the agreement type. 
     * 
     * @return The type of agreement.
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the agreement type.
     * 
     * @param value The type of agreement.
     */
    public void setType(String value)
    {
        type = value;
    }

    /**
     * Gets the partner's user identifier.
     * 
     * @return The partner's user identifier.
     */
    public String getUserId()
    {
        return userId;
    }

    /**
     * Sets the partner's user identifier.
     * 
     * @param value The partner's user identifier.
     */
    public void setUserId(String value)
    {
        userId = value;
    }
}