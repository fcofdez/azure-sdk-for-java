/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionDefault.
 */
public interface ApiVersionDefault {
    /**
     * The interface defining all the services for ApiVersionDefault to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionDefaultService {
        @GET("/azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        Call<ResponseBody> getMethodGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        Call<ResponseBody> getMethodGlobalNotProvidedValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        Call<ResponseBody> getPathGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        Call<ResponseBody> getSwaggerGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getMethodGlobalValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getMethodGlobalNotProvidedValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getPathGlobalValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getSwaggerGlobalValid() throws ServiceException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback);

}
