/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.search.customer;

import com.sitewhere.spi.search.ISearchCriteria;

/**
 * Specifies criteria used to find matching customers.
 */
public interface ICustomerSearchCriteria extends ISearchCriteria {

    /**
     * Indicates if only root elements are to be returned.
     * 
     * @return
     */
    public Boolean getRootOnly();

    /**
     * Requires that customers have the given customer as a parent.
     * 
     * @return
     */
    public String getParentCustomerToken();

    /**
     * Require that customers have the given customer type.
     * 
     * @return
     */
    public String getCustomerTypeToken();
}
