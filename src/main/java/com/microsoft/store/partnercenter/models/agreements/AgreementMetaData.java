// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.agreements;

/**
 * Represents the meta data about agreements.
 */
public class AgreementMetaData
{
    /**
     * The download link for the agreement.
     */
    private String agreementLink;

    /**
     * The type of agreement.
     */
    private String agreementType;

    /**
     * The template identifier for the agreement.
     */
    private String templateId;

    /**
     * The ranking for the version enforcement.
     */
    private int versionRank;

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
     * Gets the agreement type.
     * 
     * @return The type of agreement.
     */
    public String getAgreementType()
    {
        return agreementType;
    }

    /**
     * Sets the agreement type. 
     * 
     * @param value The type of agreement.
     */
    public void setAgreementType(String value)
    {
        agreementType = value;
    }

    /**
     * Gets the template identifier for the agreement.
     * 
     * @return The template identifier for the agreement.
     */
    public String getTemplateId()
    {
        return templateId;
    }

    /**
     * Sets the template identifier for the agreement.
     * 
     * @param value The template identifier for the agreement.
     */
    public void setTemplateId(String value)
    {
        templateId = value;
    }

    /**
     * Gets the ranking for the version enforcement.
     * 
     * @return The ranking for the version enforcement.
     */
    public int getVersionRank()
    {
        return versionRank;
    }

    /**
     * Sets the ranking for the version enforcement.
     * 
     * @param value The ranking for the version enforcement.
     */
    public void setVersionRank(int value)
    {
        versionRank = value;
    }
}