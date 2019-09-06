// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

/**
 * Provides information about activation status of a subscription.
 */
public class SubscriptionActivationResult
{
    /**
     * The identifier for the subscription.
     */
    private String subscriptionId;

    /**
     * The status for the activation.
     */
    private String status;

    /**
     * Gets the subscription identifier.
     * 
     * @return The identifier for the subscription.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the subscription identifier.
     * 
     * @param value The identifier for the subscription.
     */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value;
    }

    /**
     * Gets the status for the activation.
     * 
     * @return The status for the activation.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the status for the activation.
     * 
     * @param value The status for the activation.
     */
    public void setStatus(String value)
    {
        status = value;
    }
}