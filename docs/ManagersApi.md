# ManagersApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewManager**](ManagersApi.md#createNewManager) | **POST** /managers | Create a manager |
| [**list**](ManagersApi.md#list) | **GET** /managers | List of managers |


<a name="createNewManager"></a>
# **createNewManager**
> CreateAdminUserResponseContainer createNewManager(adminUserCreateContainer).execute();

Create a manager

Create a new organization manager.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManagersApi;
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
    AdminUserCreateRequest data = new AdminUserCreateRequest();
    try {
      CreateAdminUserResponseContainer result = client
              .managers
              .createNewManager(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagersApi#createNewManager");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateAdminUserResponseContainer> response = client
              .managers
              .createNewManager(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagersApi#createNewManager");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminUserCreateContainer** | [**AdminUserCreateContainer**](AdminUserCreateContainer.md)| Basic information of the new admin user. | |

### Return type

[**CreateAdminUserResponseContainer**](CreateAdminUserResponseContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Basic information of the new admin user. |  -  |
| **409** | A matching profile already exists. |  -  |

<a name="list"></a>
# **list**
> AdminUsersContainer list().limit(limit).offset(offset).execute();

List of managers

List all organization managers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManagersApi;
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
    String limit = "50"; // Maximum number of records to return.
    String offset = "0"; // Offset/index of record for the next page of records to return.
    try {
      AdminUsersContainer result = client
              .managers
              .list()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AdminUsersContainer> response = client
              .managers
              .list()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **String**| Maximum number of records to return. | [optional] [default to 50] |
| **offset** | **String**| Offset/index of record for the next page of records to return. | [optional] [default to 0] |

### Return type

[**AdminUsersContainer**](AdminUsersContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Basic information of the new admin user. |  -  |
| **409** | A matching profile already exists. |  -  |

