// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductUpgradeRequestTest
{
    @Test
    void getCustomerId()
    {
        ProductUpgradeRequest resource = new ProductUpgradeRequest();
        String value = "03508667-bbab-4172-989e-3b0b925b6d7a";

        resource.setCustomerId(value);

        assertEquals(value, resource.getCustomerId());
    }

    @Test
    void getProductFamily()
    {
        ProductUpgradeRequest resource = new ProductUpgradeRequest();
        String value = "family";

        resource.setProductFamily(value);

        assertEquals(value, resource.getProductFamily());
    }
}