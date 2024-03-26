# PeopleApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTimeOffRequest**](PeopleApi.md#addTimeOffRequest) | **POST** /people/{worker_id}/time-offs | Add a time off request |
| [**createDirectEmployee**](PeopleApi.md#createDirectEmployee) | **POST** /hris/direct-employees | Create a new Hris direct employee |
| [**deleteTimeOffRequest**](PeopleApi.md#deleteTimeOffRequest) | **DELETE** /people/{worker_id}/time-offs/{timeoff_id} | Delete a time off request |
| [**editTimeOffRequest**](PeopleApi.md#editTimeOffRequest) | **PATCH** /people/{worker_id}/time-offs/{timeoff_id} | Edit a time off request |
| [**getCurrentProfile**](PeopleApi.md#getCurrentProfile) | **GET** /people/me | Get my current profile |
| [**getList**](PeopleApi.md#getList) | **GET** /internal/people | Get internal people list |
| [**getList_0**](PeopleApi.md#getList_0) | **GET** /people | List of people |
| [**getPerson**](PeopleApi.md#getPerson) | **GET** /people/{worker_id} | Retrieve a single person |
| [**listTimeOffEntitlements**](PeopleApi.md#listTimeOffEntitlements) | **GET** /people/{worker_id}/time-offs/entitlements | List of time off entitlements |
| [**listTimeOffPolicies**](PeopleApi.md#listTimeOffPolicies) | **GET** /people/{worker_id}/time-offs/policies | List of time off policies |
| [**listTimeOffsByWorkerId**](PeopleApi.md#listTimeOffsByWorkerId) | **GET** /people/{worker_id}/time-offs | List of time off entries |
| [**reviewTimeOff**](PeopleApi.md#reviewTimeOff) | **PATCH** /people/{worker_id}/time-offs/{timeoff_id}/review | Review a time off request |
| [**updateDepartment**](PeopleApi.md#updateDepartment) | **PUT** /people/{worker_id}/department | Update department |
| [**updateWorkingLocation**](PeopleApi.md#updateWorkingLocation) | **PUT** /people/{worker_id}/working-location | Update working location |


<a name="addTimeOffRequest"></a>
# **addTimeOffRequest**
> EmployeeTimeoffsCreationContainer addTimeOffRequest(workerId).createPeopleTimeoff(createPeopleTimeoff).execute();

Add a time off request

Add a time off request for a worker. New requests are auto-approved.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String type = "VACATION"; // Time off type.
    String startDate = "startDate_example"; // Start date of employee's time off.
    String endDate = "endDate_example"; // End date of employee's time off.
    String reason = "reason_example"; // Description for employee's time off.
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    File attachments = new File("/path/to/file"); // Attachments for employee's time off.
    try {
      EmployeeTimeoffsCreationContainer result = client
              .people
              .addTimeOffRequest(type, startDate, endDate, reason, workerId)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#addTimeOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeoffsCreationContainer> response = client
              .people
              .addTimeOffRequest(type, startDate, endDate, reason, workerId)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#addTimeOffRequest");
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
| **workerId** | **String**| Unique identifier for a worker. | |
| **createPeopleTimeoff** | [**CreatePeopleTimeoff**](CreatePeopleTimeoff.md)| Detail of the time off that will be registered to the contract. | [optional] |

### Return type

[**EmployeeTimeoffsCreationContainer**](EmployeeTimeoffsCreationContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="createDirectEmployee"></a>
# **createDirectEmployee**
> HrisDirectEmployeeContainer createDirectEmployee(hrisDirectEmployee).execute();

Create a new Hris direct employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.letsdeel.com/rest/v2";
    Deel client = new Deel(configuration);
    HrisDirectEmployeeDetails employeeDetails = new HrisDirectEmployeeDetails();
    HrisTeamInformation teamInformation = new HrisTeamInformation();
    Object jobInformation = null;
    HrisCompensation compensation = new HrisCompensation();
    Object contract = null;
    HrisDirectEmployeeVacationInfo vacationInfo = new HrisDirectEmployeeVacationInfo();
    try {
      HrisDirectEmployeeContainer result = client
              .people
              .createDirectEmployee(employeeDetails, teamInformation, jobInformation, compensation, contract)
              .vacationInfo(vacationInfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createDirectEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HrisDirectEmployeeContainer> response = client
              .people
              .createDirectEmployee(employeeDetails, teamInformation, jobInformation, compensation, contract)
              .vacationInfo(vacationInfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createDirectEmployee");
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
| **hrisDirectEmployee** | [**HrisDirectEmployee**](HrisDirectEmployee.md)| Hris direct employee object that will be created | |

### Return type

[**HrisDirectEmployeeContainer**](HrisDirectEmployeeContainer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Hris direct employee object that was created or edited |  -  |
| **409** | A matching profile already exists |  -  |

<a name="deleteTimeOffRequest"></a>
# **deleteTimeOffRequest**
> GenericResultDeleted deleteTimeOffRequest(timeoffId, workerId).execute();

Delete a time off request

Delete a time off request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String timeoffId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a time-off in Deel.
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GenericResultDeleted result = client
              .people
              .deleteTimeOffRequest(timeoffId, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteTimeOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultDeleted> response = client
              .people
              .deleteTimeOffRequest(timeoffId, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#deleteTimeOffRequest");
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
| **timeoffId** | **String**| Unique identifier for a time-off in Deel. | |
| **workerId** | **String**| Unique identifier for a worker. | |

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

<a name="editTimeOffRequest"></a>
# **editTimeOffRequest**
> EmployeeTimeoffsCreationContainer editTimeOffRequest(timeoffId, workerId).peopleTimeOffContainer(peopleTimeOffContainer).execute();

Edit a time off request

Edit a time off request for a worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String timeoffId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a time-off in Deel.
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    String type = "VACATION"; // Time off type.
    String startDate = "startDate_example"; // Start date of employee's time off.
    String endDate = "endDate_example"; // End date of employee's time off.
    String reason = "reason_example"; // Description for employee's time off.
    File attachments = new File("/path/to/file"); // Attachments for employee's time off.
    try {
      EmployeeTimeoffsCreationContainer result = client
              .people
              .editTimeOffRequest(timeoffId, workerId)
              .type(type)
              .startDate(startDate)
              .endDate(endDate)
              .reason(reason)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#editTimeOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeoffsCreationContainer> response = client
              .people
              .editTimeOffRequest(timeoffId, workerId)
              .type(type)
              .startDate(startDate)
              .endDate(endDate)
              .reason(reason)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#editTimeOffRequest");
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
| **timeoffId** | **String**| Unique identifier for a time-off in Deel. | |
| **workerId** | **String**| Unique identifier for a worker. | |
| **peopleTimeOffContainer** | [**PeopleTimeOffContainer**](PeopleTimeOffContainer.md)| Detail of the time off that will be updated. | [optional] |

### Return type

[**EmployeeTimeoffsCreationContainer**](EmployeeTimeoffsCreationContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getCurrentProfile"></a>
# **getCurrentProfile**
> PeopleMe getCurrentProfile().execute();

Get my current profile

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      PeopleMe result = client
              .people
              .getCurrentProfile()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getUsername());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getLastName());
      System.out.println(result.getFullName());
      System.out.println(result.getEmail());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getProfileType());
      System.out.println(result.getSlackUserId());
      System.out.println(result.getSlackTeamId());
      System.out.println(result.getOrganizationId());
      System.out.println(result.getOrganizationName());
      System.out.println(result.getClientCountry());
      System.out.println(result.getContractorCountry());
      System.out.println(result.getHrisEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getCurrentProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleMe> response = client
              .people
              .getCurrentProfile()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getCurrentProfile");
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

[**PeopleMe**](PeopleMe.md)

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
> InternalPeopleContainer getList().offset(offset).limit(limit).execute();

Get internal people list

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    Double offset = 0D; // Return a page of results with given number of records.
    Double limit = 3.4D; // Return a page of results with given number of records.
    try {
      InternalPeopleContainer result = client
              .people
              .getList()
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InternalPeopleContainer> response = client
              .people
              .getList()
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getList");
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
| **offset** | **Double**| Return a page of results with given number of records. | [optional] [default to 0] |
| **limit** | **Double**| Return a page of results with given number of records. | [optional] |

### Return type

[**InternalPeopleContainer**](InternalPeopleContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getList_0"></a>
# **getList_0**
> PeopleContainer getList_0().offset(offset).limit(limit).search(search).sortBy(sortBy).sortOrder(sortOrder).hiringStatuses(hiringStatuses).execute();

List of people

Retrieve a list of People in your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    Double offset = 0D; // Return a page of results with given number of records.
    Double limit = 3.4D; // Return a page of results with given number of records.
    String search = "search_example"; // Include a contract if by name or contractor name contains given search term.
    PeopleSortByEnum sortBy = PeopleSortByEnum.fromValue("id"); // Sort people by given field name.
    SortDirEnum sortOrder = SortDirEnum.fromValue("asc"); // Order direction of results; ascending or descending.
    HiringStatusEnum hiringStatuses = HiringStatusEnum.fromValue("active"); // Employee's current hiring status.
    try {
      PeopleContainer result = client
              .people
              .getList_0()
              .offset(offset)
              .limit(limit)
              .search(search)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .hiringStatuses(hiringStatuses)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getList_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleContainer> response = client
              .people
              .getList_0()
              .offset(offset)
              .limit(limit)
              .search(search)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .hiringStatuses(hiringStatuses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getList_0");
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
| **offset** | **Double**| Return a page of results with given number of records. | [optional] [default to 0] |
| **limit** | **Double**| Return a page of results with given number of records. | [optional] |
| **search** | **String**| Include a contract if by name or contractor name contains given search term. | [optional] |
| **sortBy** | [**PeopleSortByEnum**](.md)| Sort people by given field name. | [optional] [enum: id, first_name, last_name, full_name, email, country, birth_date, hiring_type, start_date, team, job_title, hiring_status, completion_date, direct_manager, direct_reports_count] |
| **sortOrder** | [**SortDirEnum**](.md)| Order direction of results; ascending or descending. | [optional] [enum: asc, desc] |
| **hiringStatuses** | [**HiringStatusEnum**](.md)| Employee&#39;s current hiring status. | [optional] [enum: active, inactive, onboarding] |

### Return type

[**PeopleContainer**](PeopleContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getPerson"></a>
# **getPerson**
> PeopleByIdContainer getPerson(workerId).execute();

Retrieve a single person

Retrieve a single person in your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      PeopleByIdContainer result = client
              .people
              .getPerson(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleByIdContainer> response = client
              .people
              .getPerson(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPerson");
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
| **workerId** | **String**| Unique identifier for a worker. | |

### Return type

[**PeopleByIdContainer**](PeopleByIdContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listTimeOffEntitlements"></a>
# **listTimeOffEntitlements**
> EmployeeTimeoffsEntitlementsContainer listTimeOffEntitlements(workerId).execute();

List of time off entitlements

Retrieve a list of time off entitlements for a worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      EmployeeTimeoffsEntitlementsContainer result = client
              .people
              .listTimeOffEntitlements(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTimeOffEntitlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeoffsEntitlementsContainer> response = client
              .people
              .listTimeOffEntitlements(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTimeOffEntitlements");
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
| **workerId** | **String**| Unique identifier for a worker. | |

### Return type

[**EmployeeTimeoffsEntitlementsContainer**](EmployeeTimeoffsEntitlementsContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="listTimeOffPolicies"></a>
# **listTimeOffPolicies**
> EmployeeTimeoffsPoliciesContainer listTimeOffPolicies(workerId).execute();

List of time off policies

Retrieve a list of time off policies for a worker.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      EmployeeTimeoffsPoliciesContainer result = client
              .people
              .listTimeOffPolicies(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTimeOffPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeoffsPoliciesContainer> response = client
              .people
              .listTimeOffPolicies(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTimeOffPolicies");
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
| **workerId** | **String**| Unique identifier for a worker. | |

### Return type

[**EmployeeTimeoffsPoliciesContainer**](EmployeeTimeoffsPoliciesContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="listTimeOffsByWorkerId"></a>
# **listTimeOffsByWorkerId**
> EmployeeTimeoffsContainer listTimeOffsByWorkerId(workerId).execute();

List of time off entries

List of time offs by worker id. Worker id can be retreived using /people endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      EmployeeTimeoffsContainer result = client
              .people
              .listTimeOffsByWorkerId(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTimeOffsByWorkerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeoffsContainer> response = client
              .people
              .listTimeOffsByWorkerId(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listTimeOffsByWorkerId");
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
| **workerId** | **String**| Unique identifier for a worker. | |

### Return type

[**EmployeeTimeoffsContainer**](EmployeeTimeoffsContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="reviewTimeOff"></a>
# **reviewTimeOff**
> EmployeeTimeoffsContainer reviewTimeOff(timeoffId, workerId, timeoffToReviewInternalContainer).execute();

Review a time off request

Approve or decline a time off request. New requests are auto-approved. Hence they don&#39;t need to be manually approved.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    TimeoffReviewInternal data = new TimeoffReviewInternal();
    String timeoffId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a time-off in Deel.
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      EmployeeTimeoffsContainer result = client
              .people
              .reviewTimeOff(data, timeoffId, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#reviewTimeOff");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTimeoffsContainer> response = client
              .people
              .reviewTimeOff(data, timeoffId, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#reviewTimeOff");
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
| **timeoffId** | **String**| Unique identifier for a time-off in Deel. | |
| **workerId** | **String**| Unique identifier for a worker. | |
| **timeoffToReviewInternalContainer** | [**TimeoffToReviewInternalContainer**](TimeoffToReviewInternalContainer.md)| Timeoff acceptance approve or decline. | |

### Return type

[**EmployeeTimeoffsContainer**](EmployeeTimeoffsContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateDepartment"></a>
# **updateDepartment**
> GenericResultUpdated updateDepartment(workerId).updateWorkerDepartmentContainer(updateWorkerDepartmentContainer).execute();

Update department

Update worker department.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    UpdateWorkerDepartment data = new UpdateWorkerDepartment();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GenericResultUpdated result = client
              .people
              .updateDepartment(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateDepartment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .people
              .updateDepartment(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateDepartment");
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
| **workerId** | **String**| Unique identifier for a worker. | |
| **updateWorkerDepartmentContainer** | [**UpdateWorkerDepartmentContainer**](UpdateWorkerDepartmentContainer.md)| Detail of the department data to attach for worker. | [optional] |

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

<a name="updateWorkingLocation"></a>
# **updateWorkingLocation**
> GenericResultUpdated updateWorkingLocation(workerId).updateWorkerWorkingLocationContainer(updateWorkerWorkingLocationContainer).execute();

Update working location

Update worker working location.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
    UpdateWorkerWorkingLocation data = new UpdateWorkerWorkingLocation();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GenericResultUpdated result = client
              .people
              .updateWorkingLocation(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateWorkingLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .people
              .updateWorkingLocation(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updateWorkingLocation");
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
| **workerId** | **String**| Unique identifier for a worker. | |
| **updateWorkerWorkingLocationContainer** | [**UpdateWorkerWorkingLocationContainer**](UpdateWorkerWorkingLocationContainer.md)| Detail of the working location data to attach for worker. | [optional] |

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

