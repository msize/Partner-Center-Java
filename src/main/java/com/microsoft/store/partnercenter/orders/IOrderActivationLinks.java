// -----------------------------------------------------------------------
// <copyright file="IOrderActivationLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemActivationLink;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Encapsulates customer order activation link behavior.
 */
public interface IOrderActivationLinks
    extends IPartnerComponent<Tuple<String, String>>, IEntireEntityCollectionRetrievalOperations<OrderLineItemActivationLink, ResourceCollection<OrderLineItemActivationLink>>
{
}