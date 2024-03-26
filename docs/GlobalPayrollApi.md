# GlobalPayrollApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBankAccount**](GlobalPayrollApi.md#addBankAccount) | **POST** /gp/workers/{worker_id}/banks | Add bank account |
| [**createContractGp**](GlobalPayrollApi.md#createContractGp) | **POST** /contracts/gp | Create a contract |
| [**downloadGrossToNetGpReport**](GlobalPayrollApi.md#downloadGrossToNetGpReport) | **GET** /gp/reports/{gp_report_id}/gross_to_net/csv | Download gross-to-net report |
| [**getBankAccounts**](GlobalPayrollApi.md#getBankAccounts) | **GET** /gp/workers/{worker_id}/banks | Retrieve bank accounts |
| [**getBankGuide**](GlobalPayrollApi.md#getBankGuide) | **GET** /gp/workers/{worker_id}/banks/guide | Retrieve bank guide |
| [**getGrossToNetGpReport**](GlobalPayrollApi.md#getGrossToNetGpReport) | **GET** /gp/reports/{gp_report_id}/gross_to_net | List gross-to-net report |
| [**getPayslipDownloadUrl**](GlobalPayrollApi.md#getPayslipDownloadUrl) | **GET** /gp/workers/{worker_id}/payslips/{payslip_id}/download | Download payslip PDF |
| [**getPayslips**](GlobalPayrollApi.md#getPayslips) | **GET** /gp/workers/{worker_id}/payslips | Retrieve employee payslips |
| [**listPayrollEventsByLegalEntity**](GlobalPayrollApi.md#listPayrollEventsByLegalEntity) | **GET** /gp/legal-entities/{legal_entity_id}/reports | List payroll events by legal entity |
| [**modifyBankAccount**](GlobalPayrollApi.md#modifyBankAccount) | **PATCH** /gp/workers/{worker_id}/banks/{bank_id} | Modify bank account |
| [**requestTerminationProcess**](GlobalPayrollApi.md#requestTerminationProcess) | **POST** /gp/workers/{worker_id}/terminations | Request termination |
| [**updateCompensationHistory**](GlobalPayrollApi.md#updateCompensationHistory) | **PATCH** /gp/workers/{worker_id}/compensation | Update compensation |
| [**updateEmployeeInformation**](GlobalPayrollApi.md#updateEmployeeInformation) | **PATCH** /gp/workers/{worker_id}/employee-information | Update employee information |
| [**updatePtoPolicy**](GlobalPayrollApi.md#updatePtoPolicy) | **PATCH** /gp/workers/{worker_id}/pto-policy | Update PTO policy |
| [**updateWorkerAddress**](GlobalPayrollApi.md#updateWorkerAddress) | **PATCH** /gp/workers/{worker_id}/address | Update address |


<a name="addBankAccount"></a>
# **addBankAccount**
> BankAccountUpdatedContainer addBankAccount(workerId, addWorkerBankAccountContainer).execute();

Add bank account

Add a new bank account for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    WorkerBankAccountToAdd data = new WorkerBankAccountToAdd();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      BankAccountUpdatedContainer result = client
              .globalPayroll
              .addBankAccount(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#addBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountUpdatedContainer> response = client
              .globalPayroll
              .addBankAccount(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#addBankAccount");
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
| **addWorkerBankAccountContainer** | [**AddWorkerBankAccountContainer**](AddWorkerBankAccountContainer.md)| Request body to add new bank account for employee | |

### Return type

[**BankAccountUpdatedContainer**](BankAccountUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="createContractGp"></a>
# **createContractGp**
> GPContractCreatedContainer createContractGp(gpContractToCreateContainer).execute();

Create a contract

Create a Global Payroll contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    GPContractToCreate data = new GPContractToCreate();
    try {
      GPContractCreatedContainer result = client
              .globalPayroll
              .createContractGp(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#createContractGp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPContractCreatedContainer> response = client
              .globalPayroll
              .createContractGp(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#createContractGp");
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
| **gpContractToCreateContainer** | [**GPContractToCreateContainer**](GPContractToCreateContainer.md)| Global Payroll (GP) contract object that needs to be created | |

### Return type

[**GPContractCreatedContainer**](GPContractCreatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="downloadGrossToNetGpReport"></a>
# **downloadGrossToNetGpReport**
> String downloadGrossToNetGpReport(gpReportId).execute();

Download gross-to-net report

Download global payroll reports detailing gross-to-net calculations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    UUID gpReportId = UUID.randomUUID(); // Id of gp report.
    try {
      String result = client
              .globalPayroll
              .downloadGrossToNetGpReport(gpReportId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#downloadGrossToNetGpReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .globalPayroll
              .downloadGrossToNetGpReport(gpReportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#downloadGrossToNetGpReport");
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
| **gpReportId** | **UUID**| Id of gp report. | |

### Return type

**String**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getBankAccounts"></a>
# **getBankAccounts**
> WorkerBankAccountsInfoContainer getBankAccounts(workerId).execute();

Retrieve bank accounts

Retrieve all bank accounts for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
      WorkerBankAccountsInfoContainer result = client
              .globalPayroll
              .getBankAccounts(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerBankAccountsInfoContainer> response = client
              .globalPayroll
              .getBankAccounts(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getBankAccounts");
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

[**WorkerBankAccountsInfoContainer**](WorkerBankAccountsInfoContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getBankGuide"></a>
# **getBankGuide**
> BankAccountGuideContainer getBankGuide(workerId).execute();

Retrieve bank guide

Retrieve the bank form guide for employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
      BankAccountGuideContainer result = client
              .globalPayroll
              .getBankGuide(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getBankGuide");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountGuideContainer> response = client
              .globalPayroll
              .getBankGuide(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getBankGuide");
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

[**BankAccountGuideContainer**](BankAccountGuideContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getGrossToNetGpReport"></a>
# **getGrossToNetGpReport**
> GlobalPayrollG2NReportContainer getGrossToNetGpReport(gpReportId).execute();

List gross-to-net report

Get list of global payroll reports detailing gross-to-net calculations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    UUID gpReportId = UUID.randomUUID(); // Id of gp report.
    try {
      GlobalPayrollG2NReportContainer result = client
              .globalPayroll
              .getGrossToNetGpReport(gpReportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getGrossToNetGpReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GlobalPayrollG2NReportContainer> response = client
              .globalPayroll
              .getGrossToNetGpReport(gpReportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getGrossToNetGpReport");
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
| **gpReportId** | **UUID**| Id of gp report. | |

### Return type

[**GlobalPayrollG2NReportContainer**](GlobalPayrollG2NReportContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getPayslipDownloadUrl"></a>
# **getPayslipDownloadUrl**
> GPPayslipDownloadUrlContainer getPayslipDownloadUrl(workerId, payslipId).execute();

Download payslip PDF

Get download url for GP payslip.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    String payslipId = "ApdZbLvq0r0E"; // Unique identifier for a payslip.
    try {
      GPPayslipDownloadUrlContainer result = client
              .globalPayroll
              .getPayslipDownloadUrl(workerId, payslipId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getPayslipDownloadUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPPayslipDownloadUrlContainer> response = client
              .globalPayroll
              .getPayslipDownloadUrl(workerId, payslipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getPayslipDownloadUrl");
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
| **payslipId** | **String**| Unique identifier for a payslip. | |

### Return type

[**GPPayslipDownloadUrlContainer**](GPPayslipDownloadUrlContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getPayslips"></a>
# **getPayslips**
> GPPayslipsListContainer getPayslips(workerId).execute();

Retrieve employee payslips

Get of payslips for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
      GPPayslipsListContainer result = client
              .globalPayroll
              .getPayslips(workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getPayslips");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPPayslipsListContainer> response = client
              .globalPayroll
              .getPayslips(workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#getPayslips");
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

[**GPPayslipsListContainer**](GPPayslipsListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listPayrollEventsByLegalEntity"></a>
# **listPayrollEventsByLegalEntity**
> GPPayrollEventReportContainer listPayrollEventsByLegalEntity(legalEntityId).startDate(startDate).execute();

List payroll events by legal entity

Get list of global payroll events by legal entities.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    UUID legalEntityId = UUID.randomUUID(); // Id of an legal entity.
    LocalDate startDate = LocalDate.now(); // Start date of payroll report.
    try {
      GPPayrollEventReportContainer result = client
              .globalPayroll
              .listPayrollEventsByLegalEntity(legalEntityId)
              .startDate(startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#listPayrollEventsByLegalEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPPayrollEventReportContainer> response = client
              .globalPayroll
              .listPayrollEventsByLegalEntity(legalEntityId)
              .startDate(startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#listPayrollEventsByLegalEntity");
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
| **legalEntityId** | **UUID**| Id of an legal entity. | |
| **startDate** | **LocalDate**| Start date of payroll report. | [optional] |

### Return type

[**GPPayrollEventReportContainer**](GPPayrollEventReportContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="modifyBankAccount"></a>
# **modifyBankAccount**
> BankAccountUpdatedContainer modifyBankAccount(workerId, bankId, addWorkerBankAccountContainer).execute();

Modify bank account

Modify bank account for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    WorkerBankAccountToAdd data = new WorkerBankAccountToAdd();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    String bankId = "dcc7b587-2246-4909-853e-12056e90c451"; // Bank Account id.
    try {
      BankAccountUpdatedContainer result = client
              .globalPayroll
              .modifyBankAccount(data, workerId, bankId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#modifyBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountUpdatedContainer> response = client
              .globalPayroll
              .modifyBankAccount(data, workerId, bankId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#modifyBankAccount");
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
| **bankId** | **String**| Bank Account id. | |
| **addWorkerBankAccountContainer** | [**AddWorkerBankAccountContainer**](AddWorkerBankAccountContainer.md)| Request body to add new bank account for employee | |

### Return type

[**BankAccountUpdatedContainer**](BankAccountUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="requestTerminationProcess"></a>
# **requestTerminationProcess**
> WorkerTerminationContainer requestTerminationProcess(workerId, workerTerminationBodyContainer).execute();

Request termination

Request a termination for a global payroll employee. A successful call starts the termination process and does not confirm termination.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    WorkerTerminationBody data = new WorkerTerminationBody();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      WorkerTerminationContainer result = client
              .globalPayroll
              .requestTerminationProcess(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#requestTerminationProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkerTerminationContainer> response = client
              .globalPayroll
              .requestTerminationProcess(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#requestTerminationProcess");
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
| **workerTerminationBodyContainer** | [**WorkerTerminationBodyContainer**](WorkerTerminationBodyContainer.md)| Request body to add new bank account for employee | |

### Return type

[**WorkerTerminationContainer**](WorkerTerminationContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="updateCompensationHistory"></a>
# **updateCompensationHistory**
> GPEmployeeCompensationUpdatedContainer updateCompensationHistory(workerId, gpEmployeeCompensationToUpdateContainer).execute();

Update compensation

Update the compensation of a Global Payroll employee. Returns the full compensation history including the update.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    GPEmployeeCompensationUpdateData data = new GPEmployeeCompensationUpdateData();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GPEmployeeCompensationUpdatedContainer result = client
              .globalPayroll
              .updateCompensationHistory(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateCompensationHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPEmployeeCompensationUpdatedContainer> response = client
              .globalPayroll
              .updateCompensationHistory(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateCompensationHistory");
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
| **gpEmployeeCompensationToUpdateContainer** | [**GPEmployeeCompensationToUpdateContainer**](GPEmployeeCompensationToUpdateContainer.md)| The desired compensation of the Global Payroll employee | |

### Return type

[**GPEmployeeCompensationUpdatedContainer**](GPEmployeeCompensationUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="updateEmployeeInformation"></a>
# **updateEmployeeInformation**
> GPEmployeeInformationUpdatedContainer updateEmployeeInformation(workerId, gpEmployeeInformationToUpdateContainer).execute();

Update employee information

Update Global Payroll employee information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    GPEmployeeInformationUpdateData data = new GPEmployeeInformationUpdateData();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GPEmployeeInformationUpdatedContainer result = client
              .globalPayroll
              .updateEmployeeInformation(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateEmployeeInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPEmployeeInformationUpdatedContainer> response = client
              .globalPayroll
              .updateEmployeeInformation(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateEmployeeInformation");
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
| **gpEmployeeInformationToUpdateContainer** | [**GPEmployeeInformationToUpdateContainer**](GPEmployeeInformationToUpdateContainer.md)| The desired information of the Global Payroll employee | |

### Return type

[**GPEmployeeInformationUpdatedContainer**](GPEmployeeInformationUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="updatePtoPolicy"></a>
# **updatePtoPolicy**
> GenericResultUpdated updatePtoPolicy(workerId, gpEmployeePTOToUpdateContainer).execute();

Update PTO policy

Update the PTO policy of a Global Payroll employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    GPEmployeePTOUpdateData data = new GPEmployeePTOUpdateData();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GenericResultUpdated result = client
              .globalPayroll
              .updatePtoPolicy(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updatePtoPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .globalPayroll
              .updatePtoPolicy(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updatePtoPolicy");
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
| **gpEmployeePTOToUpdateContainer** | [**GPEmployeePTOToUpdateContainer**](GPEmployeePTOToUpdateContainer.md)| The desired PTO policy of the Global Payroll employee | |

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

<a name="updateWorkerAddress"></a>
# **updateWorkerAddress**
> GPEmployeeAddressUpdatedContainer updateWorkerAddress(workerId, gpEmployeeAddressToUpdateContainer).execute();

Update address

Update the address of a Global Payroll employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalPayrollApi;
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
    GPEmployeeAddressUpdateData data = new GPEmployeeAddressUpdateData();
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for a worker.
    try {
      GPEmployeeAddressUpdatedContainer result = client
              .globalPayroll
              .updateWorkerAddress(data, workerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateWorkerAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GPEmployeeAddressUpdatedContainer> response = client
              .globalPayroll
              .updateWorkerAddress(data, workerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalPayrollApi#updateWorkerAddress");
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
| **gpEmployeeAddressToUpdateContainer** | [**GPEmployeeAddressToUpdateContainer**](GPEmployeeAddressToUpdateContainer.md)| The desired address of the Global Payroll employee | |

### Return type

[**GPEmployeeAddressUpdatedContainer**](GPEmployeeAddressUpdatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

