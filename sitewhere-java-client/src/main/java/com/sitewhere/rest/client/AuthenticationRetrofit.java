/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.client;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Retrofit API for SiteWhere authentication.
 * 
 * @author Derek
 */
public interface AuthenticationRetrofit {
    @GET("jwt")
    Call<Void> getJwt();
}