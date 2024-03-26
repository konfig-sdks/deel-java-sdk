# ServiceProviderConfigApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](ServiceProviderConfigApi.md#getDetails) | **GET** /ServiceProviderConfig | Get service provider config |


<a name="getDetails"></a>
# **getDetails**
> ServiceProviderConfig getDetails().execute();

Get service provider config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceProviderConfigApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.letsdeel.com/rest/v2";
    
    // Configure HTTP bearer authorization: deelToken
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Deel client = new Deel(configuration);
    try {
      ServiceProviderConfig result = client
              .serviceProviderConfig
              .getDetails()
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthenticationSchemes());
      System.out.println(result.getBulk());
      System.out.println(result.getChangePassword());
      System.out.println(result.getEtag());
      System.out.println(result.getFilter());
      System.out.println(result.getPatch());
      System.out.println(result.getSchemas());
      System.out.println(result.getSort());
      System.out.println(result.getXmlDataFormat());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProviderConfigApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceProviderConfig> response = client
              .serviceProviderConfig
              .getDetails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProviderConfigApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceProviderConfig**](ServiceProviderConfig.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

