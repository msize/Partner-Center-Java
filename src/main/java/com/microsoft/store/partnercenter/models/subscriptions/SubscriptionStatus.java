// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionStatus
{
    /**
     * Enum representing the available states for a subscription Indicates nothing - no status, used as an initializer
     */
    NONE("none"),

    /**
     * Subscription state: Active
     */
    ACTIVE("active"),

    /**
     * Subscription state: Suspended
     */
    SUSPENDED("suspended"),

    /**
     * Subscription state: Deleted
     */
    DELETED("deleted");

    private final String value;

    SubscriptionStatus(String value)
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