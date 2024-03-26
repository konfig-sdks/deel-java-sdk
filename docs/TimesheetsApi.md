# TimesheetsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEntry**](TimesheetsApi.md#deleteEntry) | **DELETE** /timesheets/{timesheet_id} | Delete a timesheet entry |
| [**getList**](TimesheetsApi.md#getList) | **GET** /timesheets | List of timesheets |
| [**getSingleEntry**](TimesheetsApi.md#getSingleEntry) | **GET** /timesheets/{timesheet_id} | Retrieve a single timesheet entry |
| [**listByContract**](TimesheetsApi.md#listByContract) | **GET** /contracts/{contract_id}/timesheets | List of timesheets by contract |
| [**reviewMultiple**](TimesheetsApi.md#reviewMultiple) | **POST** /timesheets/many/reviews | Review multiple timesheets |
| [**reviewSingleTimesheet**](TimesheetsApi.md#reviewSingleTimesheet) | **POST** /timesheets/{timesheet_id}/reviews | Review a single timesheet |
| [**submitWorkForContractor**](TimesheetsApi.md#submitWorkForContractor) | **POST** /timesheets | Create a timesheet entry |
| [**updateEntry**](TimesheetsApi.md#updateEntry) | **PATCH** /timesheets/{timesheet_id} | Update a timesheet entry |


<a name="deleteEntry"></a>
# **deleteEntry**
> GenericResultDeleted deleteEntry(timesheetId).reason(reason).execute();

Delete a timesheet entry

Delete a single timesheet entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Double timesheetId = 3.4D; // ID of an existing timesheet
    String reason = "reason_example"; // Reason for deleting an existing timesheet
    try {
      GenericResultDeleted result = client
              .timesheets
              .deleteEntry(timesheetId)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#deleteEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultDeleted> response = client
              .timesheets
              .deleteEntry(timesheetId)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#deleteEntry");
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
| **timesheetId** | **Double**| ID of an existing timesheet | |
| **reason** | **String**| Reason for deleting an existing timesheet | [optional] |

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

<a name="getList"></a>
# **getList**
> TimesheetListContainer getList().contractId(contractId).contractTypes(contractTypes).statuses(statuses).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

List of timesheets

Retrieve a list of timesheets in your Deel account. You can filter the list by providing additional paramters e.g. contract_id, contract_type etc.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    String contractId = "contractId_example"; // Id of a Deel contract.
    List<ContractTypeEnum> contractTypes = Arrays.asList(); // Types of contracts to filter.
    List<TimesheetStatusEnum> statuses = Arrays.asList(); // Statuses of timesheets to filter.
    Double reporterId = 3.4D; // ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings
    LocalDate dateFrom = LocalDate.parse("2022-01-01T00:00:00.000Z"); // Filtered results will include records created on or after the provided date.
    LocalDate dateTo = LocalDate.parse("2022-12-01T00:00:00.000Z"); // Filtered results will include records created before the provided date.
    Double limit = 99D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    Double offset = 0D; // Return a page of results after given index of row
    try {
      TimesheetListContainer result = client
              .timesheets
              .getList()
              .contractId(contractId)
              .contractTypes(contractTypes)
              .statuses(statuses)
              .reporterId(reporterId)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetListContainer> response = client
              .timesheets
              .getList()
              .contractId(contractId)
              .contractTypes(contractTypes)
              .statuses(statuses)
              .reporterId(reporterId)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getList");
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
| **contractId** | **String**| Id of a Deel contract. | [optional] |
| **contractTypes** | [**List&lt;ContractTypeEnum&gt;**](ContractTypeEnum.md)| Types of contracts to filter. | [optional] |
| **statuses** | [**List&lt;TimesheetStatusEnum&gt;**](TimesheetStatusEnum.md)| Statuses of timesheets to filter. | [optional] |
| **reporterId** | **Double**| ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **dateFrom** | **LocalDate**| Filtered results will include records created on or after the provided date. | [optional] |
| **dateTo** | **LocalDate**| Filtered results will include records created before the provided date. | [optional] |
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 99] |
| **offset** | **Double**| Return a page of results after given index of row | [optional] [default to 0] |

### Return type

[**TimesheetListContainer**](TimesheetListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getSingleEntry"></a>
# **getSingleEntry**
> TimesheetContainer getSingleEntry(timesheetId).execute();

Retrieve a single timesheet entry

Retrieve a single timesheet entry by Id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Double timesheetId = 3.4D; // ID of an existing timesheet
    try {
      TimesheetContainer result = client
              .timesheets
              .getSingleEntry(timesheetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getSingleEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetContainer> response = client
              .timesheets
              .getSingleEntry(timesheetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getSingleEntry");
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
| **timesheetId** | **Double**| ID of an existing timesheet | |

### Return type

[**TimesheetContainer**](TimesheetContainer.md)

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
> TimesheetListContainer listByContract(contractId).contractTypes(contractTypes).statuses(statuses).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

List of timesheets by contract

Retrieve a list of timesheets found for a contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    List<ContractTypeEnum> contractTypes = Arrays.asList(); // Types of contracts to filter.
    List<TimesheetStatusEnum> statuses = Arrays.asList(); // Statuses of timesheets to filter.
    Double reporterId = 3.4D; // ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings
    LocalDate dateFrom = LocalDate.parse("2022-01-01T00:00:00.000Z"); // Filtered results will include records created on or after the provided date.
    LocalDate dateTo = LocalDate.parse("2022-12-01T00:00:00.000Z"); // Filtered results will include records created before the provided date.
    Double limit = 99D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    Double offset = 0D; // Return a page of results after given index of row
    try {
      TimesheetListContainer result = client
              .timesheets
              .listByContract(contractId)
              .contractTypes(contractTypes)
              .statuses(statuses)
              .reporterId(reporterId)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#listByContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetListContainer> response = client
              .timesheets
              .listByContract(contractId)
              .contractTypes(contractTypes)
              .statuses(statuses)
              .reporterId(reporterId)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#listByContract");
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
| **contractTypes** | [**List&lt;ContractTypeEnum&gt;**](ContractTypeEnum.md)| Types of contracts to filter. | [optional] |
| **statuses** | [**List&lt;TimesheetStatusEnum&gt;**](TimesheetStatusEnum.md)| Statuses of timesheets to filter. | [optional] |
| **reporterId** | **Double**| ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **dateFrom** | **LocalDate**| Filtered results will include records created on or after the provided date. | [optional] |
| **dateTo** | **LocalDate**| Filtered results will include records created before the provided date. | [optional] |
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 99] |
| **offset** | **Double**| Return a page of results after given index of row | [optional] [default to 0] |

### Return type

[**TimesheetListContainer**](TimesheetListContainer.md)

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
> GenericResultCreated reviewMultiple().timesheetReviewsToCreateContainer(timesheetReviewsToCreateContainer).execute();

Review multiple timesheets

Review a batch of timesheets to approve or reject submitted work.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    TimesheetReviewsToCreate data = new TimesheetReviewsToCreate();
    try {
      GenericResultCreated result = client
              .timesheets
              .reviewMultiple(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#reviewMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .timesheets
              .reviewMultiple(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#reviewMultiple");
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
| **timesheetReviewsToCreateContainer** | [**TimesheetReviewsToCreateContainer**](TimesheetReviewsToCreateContainer.md)| Timesheet review objects that need to be created | [optional] |

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

<a name="reviewSingleTimesheet"></a>
# **reviewSingleTimesheet**
> GenericResultCreated reviewSingleTimesheet(timesheetId).timesheetReviewToCreateContainer(timesheetReviewToCreateContainer).execute();

Review a single timesheet

Review a timesheet to approve or decline submitted work.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    TimesheetReviewToCreate data = new TimesheetReviewToCreate();
    Double timesheetId = 3.4D; // ID of an existing timesheet
    try {
      GenericResultCreated result = client
              .timesheets
              .reviewSingleTimesheet(data, timesheetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#reviewSingleTimesheet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .timesheets
              .reviewSingleTimesheet(data, timesheetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#reviewSingleTimesheet");
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
| **timesheetId** | **Double**| ID of an existing timesheet | |
| **timesheetReviewToCreateContainer** | [**TimesheetReviewToCreateContainer**](TimesheetReviewToCreateContainer.md)| Timesheet review object that need to be created | [optional] |

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

<a name="submitWorkForContractor"></a>
# **submitWorkForContractor**
> InvoiceAdjustmentCreatedContainer submitWorkForContractor(timesheetToCreateContainer).execute();

Create a timesheet entry

Submit work for a contractor.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    TimesheetSharedProperties data = new TimesheetSharedProperties();
    try {
      InvoiceAdjustmentCreatedContainer result = client
              .timesheets
              .submitWorkForContractor(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#submitWorkForContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceAdjustmentCreatedContainer> response = client
              .timesheets
              .submitWorkForContractor(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#submitWorkForContractor");
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
| **timesheetToCreateContainer** | [**TimesheetToCreateContainer**](TimesheetToCreateContainer.md)| Timesheet object that needs to be created | |

### Return type

[**InvoiceAdjustmentCreatedContainer**](InvoiceAdjustmentCreatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="updateEntry"></a>
# **updateEntry**
> GenericResultUpdated updateEntry(timesheetId, timesheetToUpdateContainer).execute();

Update a timesheet entry

Update a single timesheet entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    TimesheetToUpdate data = new TimesheetToUpdate();
    Double timesheetId = 3.4D; // ID of an existing timesheet
    try {
      GenericResultUpdated result = client
              .timesheets
              .updateEntry(data, timesheetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#updateEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .timesheets
              .updateEntry(data, timesheetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#updateEntry");
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
| **timesheetId** | **Double**| ID of an existing timesheet | |
| **timesheetToUpdateContainer** | [**TimesheetToUpdateContainer**](TimesheetToUpdateContainer.md)| Timesheet object that needs to be updated | |

### Return type

[**GenericResultUpdated**](GenericResultUpdated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

