// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicerequests;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ServiceRequestSeverity
{
    /**
     * Describes service required status Severity Unknown
     */
    UNKNOWN("unknown"),

    /**
     * Service Request Impact Critical
     */
    CRITICAL("critical"),

    /**
     * Service Request Impact Moderate
     */
    MODERATE("moderate"),

    /**
     * Service Request Impact Minimal
     */
    MINIMAL("minimal");

    private final String value;

    ServiceRequestSeverity(String value)
    {
        this.value = value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return value;
    }
}