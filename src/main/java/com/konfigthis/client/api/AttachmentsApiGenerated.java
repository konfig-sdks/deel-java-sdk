/*
 * Deel REST API
 * API specification for Deel HR user provisioning API. This YAML file is a preview of the API Deel is building. We are looking forward to your feedback.
 *
 * The version of the OpenAPI document: 1.25.0
 * Contact: apiteam@deel.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.InputToCreateFileRef;
import com.konfigthis.client.model.InputToCreateFileRefData;
import com.konfigthis.client.model.OutputToCreateFileRefContainer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AttachmentsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AttachmentsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AttachmentsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call uploadDeelFileCall(InputToCreateFileRef inputToCreateFileRef, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = inputToCreateFileRef;

        // create path and map variables
        String localVarPath = "/attachments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "deelToken", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadDeelFileValidateBeforeCall(InputToCreateFileRef inputToCreateFileRef, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'inputToCreateFileRef' is set
        if (inputToCreateFileRef == null) {
            throw new ApiException("Missing the required parameter 'inputToCreateFileRef' when calling uploadDeelFile(Async)");
        }

        return uploadDeelFileCall(inputToCreateFileRef, _callback);

    }


    private ApiResponse<OutputToCreateFileRefContainer> uploadDeelFileWithHttpInfo(InputToCreateFileRef inputToCreateFileRef) throws ApiException {
        okhttp3.Call localVarCall = uploadDeelFileValidateBeforeCall(inputToCreateFileRef, null);
        Type localVarReturnType = new TypeToken<OutputToCreateFileRefContainer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call uploadDeelFileAsync(InputToCreateFileRef inputToCreateFileRef, final ApiCallback<OutputToCreateFileRefContainer> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadDeelFileValidateBeforeCall(inputToCreateFileRef, _callback);
        Type localVarReturnType = new TypeToken<OutputToCreateFileRefContainer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UploadDeelFileRequestBuilder {
        private final InputToCreateFileRefData data;

        private UploadDeelFileRequestBuilder(InputToCreateFileRefData data) {
            this.data = data;
        }

        /**
         * Build call for uploadDeelFile
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            InputToCreateFileRef inputToCreateFileRef = buildBodyParams();
            return uploadDeelFileCall(inputToCreateFileRef, _callback);
        }

        private InputToCreateFileRef buildBodyParams() {
            InputToCreateFileRef inputToCreateFileRef = new InputToCreateFileRef();
            inputToCreateFileRef.data(this.data);
            return inputToCreateFileRef;
        }

        /**
         * Execute uploadDeelFile request
         * @return OutputToCreateFileRefContainer
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public OutputToCreateFileRefContainer execute() throws ApiException {
            InputToCreateFileRef inputToCreateFileRef = buildBodyParams();
            ApiResponse<OutputToCreateFileRefContainer> localVarResp = uploadDeelFileWithHttpInfo(inputToCreateFileRef);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute uploadDeelFile request with HTTP info returned
         * @return ApiResponse&lt;OutputToCreateFileRefContainer&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OutputToCreateFileRefContainer> executeWithHttpInfo() throws ApiException {
            InputToCreateFileRef inputToCreateFileRef = buildBodyParams();
            return uploadDeelFileWithHttpInfo(inputToCreateFileRef);
        }

        /**
         * Execute uploadDeelFile request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OutputToCreateFileRefContainer> _callback) throws ApiException {
            InputToCreateFileRef inputToCreateFileRef = buildBodyParams();
            return uploadDeelFileAsync(inputToCreateFileRef, _callback);
        }
    }

    /**
     * Upload file to Deel
     * Upload file to Deel storage to use the file attachment feature for other endpoints.
     * @param inputToCreateFileRef File info object that needs to be created. (required)
     * @return UploadDeelFileRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public UploadDeelFileRequestBuilder uploadDeelFile(InputToCreateFileRefData data) throws IllegalArgumentException {
        if (data == null) throw new IllegalArgumentException("\"data\" is required but got null");
        return new UploadDeelFileRequestBuilder(data);
    }
}
