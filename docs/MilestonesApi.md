# MilestonesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMilestone**](MilestonesApi.md#createNewMilestone) | **POST** /contracts/{contract_id}/milestones | Create a milestone |
| [**createReview**](MilestonesApi.md#createReview) | **POST** /contracts/{contract_id}/milestones/{milestone_id}/reviews | Review a single milestone |
| [**deleteSingleMilestone**](MilestonesApi.md#deleteSingleMilestone) | **DELETE** /contracts/{contract_id}/milestones/{milestone_id} | Delete a milestone |
| [**getSingleMilestone**](MilestonesApi.md#getSingleMilestone) | **GET** /contracts/{contract_id}/milestones/{milestone_id} | Retrieve a single milestone |
| [**listByContract**](MilestonesApi.md#listByContract) | **GET** /contracts/{contract_id}/milestones | List of milestones by contract |
| [**reviewMultiple**](MilestonesApi.md#reviewMultiple) | **POST** /contracts/{contract_id}/milestones/many/reviews | Review multiple milestones |


<a name="createNewMilestone"></a>
# **createNewMilestone**
> GenericResultCreated createNewMilestone(contractId).milestoneToCreateContainer(milestoneToCreateContainer).execute();

Create a milestone

Add a new milestone to contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MilestonesApi;
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
    MilestoneProperties data = new MilestoneProperties();
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .milestones
              .createNewMilestone(data, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createNewMilestone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .milestones
              .createNewMilestone(data, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createNewMilestone");
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
| **contractId** | **String**| Deel contract id. | |
| **milestoneToCreateContainer** | [**MilestoneToCreateContainer**](MilestoneToCreateContainer.md)| Milestone object that needs to be created | [optional] |

### Return type

[**GenericResultCreated**](GenericResultCreated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="createReview"></a>
# **createReview**
> GenericResultCreated createReview(contractId, milestoneId).milestoneReviewToCreateContainer(milestoneReviewToCreateContainer).execute();

Review a single milestone

Review a milestone to approve or decline submitted work.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MilestonesApi;
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
    MilestoneReviewToCreate data = new MilestoneReviewToCreate();
    String contractId = "37nex2x"; // Deel contract id.
    String milestoneId = "milestoneId_example"; // ID of milestone to return
    try {
      GenericResultCreated result = client
              .milestones
              .createReview(data, contractId, milestoneId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .milestones
              .createReview(data, contractId, milestoneId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createReview");
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
| **contractId** | **String**| Deel contract id. | |
| **milestoneId** | **String**| ID of milestone to return | |
| **milestoneReviewToCreateContainer** | [**MilestoneReviewToCreateContainer**](MilestoneReviewToCreateContainer.md)| Milestone review object that need to be created | [optional] |

### Return type

[**GenericResultCreated**](GenericResultCreated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="deleteSingleMilestone"></a>
# **deleteSingleMilestone**
> GenericResultDeleted deleteSingleMilestone(contractId, milestoneId).execute();

Delete a milestone

Delete a single milestone from a contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MilestonesApi;
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
    String contractId = "37nex2x"; // Deel contract id.
    String milestoneId = "milestoneId_example"; // ID of milestone to return
    try {
      GenericResultDeleted result = client
              .milestones
              .deleteSingleMilestone(contractId, milestoneId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#deleteSingleMilestone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultDeleted> response = client
              .milestones
              .deleteSingleMilestone(contractId, milestoneId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#deleteSingleMilestone");
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
| **contractId** | **String**| Deel contract id. | |
| **milestoneId** | **String**| ID of milestone to return | |

### Return type

[**GenericResultDeleted**](GenericResultDeleted.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getSingleMilestone"></a>
# **getSingleMilestone**
> MilestoneContainer getSingleMilestone(contractId, milestoneId).execute();

Retrieve a single milestone

Retrieve a single milestone.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MilestonesApi;
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
    String contractId = "37nex2x"; // Deel contract id.
    String milestoneId = "milestoneId_example"; // ID of milestone to return
    try {
      MilestoneContainer result = client
              .milestones
              .getSingleMilestone(contractId, milestoneId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#getSingleMilestone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MilestoneContainer> response = client
              .milestones
              .getSingleMilestone(contractId, milestoneId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#getSingleMilestone");
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
| **contractId** | **String**| Deel contract id. | |
| **milestoneId** | **String**| ID of milestone to return | |

### Return type

[**MilestoneContainer**](MilestoneContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listByContract"></a>
# **listByContract**
> MilestoneListContainer listByContract(contractId).execute();

List of milestones by contract

Retrieve a list of milestones found for a contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MilestonesApi;
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
    String contractId = "37nex2x"; // Deel contract id.
    try {
      MilestoneListContainer result = client
              .milestones
              .listByContract(contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#listByContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MilestoneListContainer> response = client
              .milestones
              .listByContract(contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#listByContract");
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
| **contractId** | **String**| Deel contract id. | |

### Return type

[**MilestoneListContainer**](MilestoneListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="reviewMultiple"></a>
# **reviewMultiple**
> GenericResultCreated reviewMultiple(contractId).milestoneReviewsToCreateContainer(milestoneReviewsToCreateContainer).execute();

Review multiple milestones

Review a batch of milestones to approve or reject submitted work.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MilestonesApi;
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
    MilestoneReviewsToCreate data = new MilestoneReviewsToCreate();
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .milestones
              .reviewMultiple(data, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#reviewMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .milestones
              .reviewMultiple(data, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#reviewMultiple");
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
| **contractId** | **String**| Deel contract id. | |
| **milestoneReviewsToCreateContainer** | [**MilestoneReviewsToCreateContainer**](MilestoneReviewsToCreateContainer.md)| Milestone review objects that need to be created | [optional] |

### Return type

[**GenericResultCreated**](GenericResultCreated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

