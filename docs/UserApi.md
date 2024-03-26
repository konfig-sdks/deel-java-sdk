# UserApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /Users | Create a user |
| [**deleteUser**](UserApi.md#deleteUser) | **DELETE** /Users/{id} | Delete a user |
| [**getById**](UserApi.md#getById) | **GET** /Users/{id} | Retrieve a single User |
| [**listDeelUsers**](UserApi.md#listDeelUsers) | **GET** /Users | List users |
| [**partiallyUpdateUser**](UserApi.md#partiallyUpdateUser) | **PATCH** /Users/{id} | Partially update/patch a user |
| [**searchOrList**](UserApi.md#searchOrList) | **POST** /Users/.search | Search or list users |
| [**updateUserById**](UserApi.md#updateUserById) | **PUT** /Users/{id} | Fully update/replace a user |


<a name="createUser"></a>
# **createUser**
> UserResponse createUser().body(body).execute();

Create a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    List<String> schemas = Arrays.asList(); // Schema URNs.
    String userName = "userName_example"; // User's email.
    CreateClientUserName name = new CreateClientUserName();
    String userType = "client"; // Type of user.
    try {
      UserResponse result = client
              .user
              .createUser(schemas, userName, name, userType)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActive());
      System.out.println(result.getEmails());
      System.out.println(result.getUserType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSchemas());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser());
      System.out.println(result.getUserName());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .user
              .createUser(schemas, userName, name, userType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
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
| **body** | [**CreateClientUser**](CreateClientUser.md)| a new user without &#39;id&#39; | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/scim+json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successfully created user |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> Object deleteUser(id).execute();

Delete a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    String id = "id_example"; // user id
    try {
      Object result = client
              .user
              .deleteUser(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .user
              .deleteUser(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUser");
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
| **id** | **String**| user id | |

### Return type

**Object**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully deleted |  -  |

<a name="getById"></a>
# **getById**
> UserResponse getById(id).execute();

Retrieve a single User

Retrieve a single user by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    String id = "id_example"; // Retrieve a single user by id.
    try {
      UserResponse result = client
              .user
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActive());
      System.out.println(result.getEmails());
      System.out.println(result.getUserType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSchemas());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser());
      System.out.println(result.getUserName());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .user
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getById");
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
| **id** | **String**| Retrieve a single user by id. | |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listDeelUsers"></a>
# **listDeelUsers**
> UserSearchResponse listDeelUsers().filter(filter).startIndex(startIndex).count(count).execute();

List users

Retrieve a list of users in Deel HR.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    String filter = "email eq \"john.doe@example.com\""; // Filter results by a given value. For now, only supports equal (eq) expression for \"email\" filter.
    Integer startIndex = 1; // Start index. (1-based)
    Integer count = 50; // Page size.
    try {
      UserSearchResponse result = client
              .user
              .listDeelUsers()
              .filter(filter)
              .startIndex(startIndex)
              .count(count)
              .execute();
      System.out.println(result);
      System.out.println(result.getResources());
      System.out.println(result.getItemsPerPage());
      System.out.println(result.getSchemas());
      System.out.println(result.getStartIndex());
      System.out.println(result.getTotalResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listDeelUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserSearchResponse> response = client
              .user
              .listDeelUsers()
              .filter(filter)
              .startIndex(startIndex)
              .count(count)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listDeelUsers");
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
| **filter** | **String**| Filter results by a given value. For now, only supports equal (eq) expression for \&quot;email\&quot; filter. | [optional] |
| **startIndex** | **Integer**| Start index. (1-based) | [optional] [default to 1] |
| **count** | **Integer**| Page size. | [optional] [default to 50] |

### Return type

[**UserSearchResponse**](UserSearchResponse.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="partiallyUpdateUser"></a>
# **partiallyUpdateUser**
> UserResponse partiallyUpdateUser(id).body(body).execute();

Partially update/patch a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    List<PatchOperation> operations = Arrays.asList(); // patch operations list
    List<String> schemas = Arrays.asList();
    String id = "id_example"; // user id
    try {
      UserResponse result = client
              .user
              .partiallyUpdateUser(operations, schemas, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActive());
      System.out.println(result.getEmails());
      System.out.println(result.getUserType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSchemas());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser());
      System.out.println(result.getUserName());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#partiallyUpdateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .user
              .partiallyUpdateUser(operations, schemas, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#partiallyUpdateUser");
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
| **id** | **String**| user id | |
| **body** | [**UserPatch**](UserPatch.md)| patch operations list | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/scim+json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully partially updated user |  -  |

<a name="searchOrList"></a>
# **searchOrList**
> UserSearchResponse searchOrList().body(body).execute();

Search or list users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    Integer count = 56; // page size
    String filter = "filter_example"; // only support 'userName' or 'email' filter expressions for now
    List<String> schemas = Arrays.asList();
    Integer startIndex = 56; // start index (1-based)
    try {
      UserSearchResponse result = client
              .user
              .searchOrList()
              .count(count)
              .filter(filter)
              .schemas(schemas)
              .startIndex(startIndex)
              .execute();
      System.out.println(result);
      System.out.println(result.getResources());
      System.out.println(result.getItemsPerPage());
      System.out.println(result.getSchemas());
      System.out.println(result.getStartIndex());
      System.out.println(result.getTotalResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#searchOrList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserSearchResponse> response = client
              .user
              .searchOrList()
              .count(count)
              .filter(filter)
              .schemas(schemas)
              .startIndex(startIndex)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#searchOrList");
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
| **body** | [**SearchRequest**](SearchRequest.md)| search parameters | [optional] |

### Return type

[**UserSearchResponse**](UserSearchResponse.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/scim+json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateUserById"></a>
# **updateUserById**
> UserResponse updateUserById(id).body(body).execute();

Fully update/replace a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    List<Email> emails = Arrays.asList();
    Name name = new Name();
    List<String> schemas = Arrays.asList();
    String userName = "userName_example"; // User's work email.
    UserMeta meta = new UserMeta();
    String id = "id_example"; // user id
    String title = "title_example"; // Job title.
    Boolean active = false; // Hiring status. True if user employment is active. False if employment is not active.
    String userType = "userType_example"; // User type.
    String id = "id_example"; // Unique resource id (UUID) defined by Deel.
    EnterpriseUser urnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser = new EnterpriseUser();
    UserExtension urnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser = new UserExtension();
    try {
      UserResponse result = client
              .user
              .updateUserById(emails, name, schemas, userName, meta, id)
              .title(title)
              .active(active)
              .userType(userType)
              .id(id)
              .urnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser(urnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser)
              .urnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser(urnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActive());
      System.out.println(result.getEmails());
      System.out.println(result.getUserType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSchemas());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser());
      System.out.println(result.getUrnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser());
      System.out.println(result.getUserName());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .user
              .updateUserById(emails, name, schemas, userName, meta, id)
              .title(title)
              .active(active)
              .userType(userType)
              .id(id)
              .urnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser(urnColonIetfColonParamsColonScimColonSchemasColonExtensionColonEnterpriseColon20ColonUser)
              .urnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser(urnColonIetfColonParamsColonScimColonSchemasColonExtensionColon20ColonUser)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserById");
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
| **id** | **String**| user id | |
| **body** | [**User**](User.md)| an existing user | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/scim+json
 - **Accept**: application/json, application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully fully updated a user |  -  |

