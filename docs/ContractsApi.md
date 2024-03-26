# ContractsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExternalId**](ContractsApi.md#addExternalId) | **PATCH** /contracts/{contract_id} | External Id |
| [**archiveContract**](ContractsApi.md#archiveContract) | **PATCH** /contracts/{contract_id}/archive | Archive a contract |
| [**attachFileToDocument**](ContractsApi.md#attachFileToDocument) | **POST** /contracts/{contract_id}/documents | Attach a file to contract |
| [**calculateFinalPaymentAmount**](ContractsApi.md#calculateFinalPaymentAmount) | **GET** /contracts/{contract_id}/final-payments | Calculate final payment |
| [**calculateFirstPaymentAmount**](ContractsApi.md#calculateFirstPaymentAmount) | **POST** /contracts/estimate | Calculate first payment amount |
| [**clientSignContract**](ContractsApi.md#clientSignContract) | **POST** /contracts/{contract_id}/signatures | Sign a contract |
| [**editFileAttachment**](ContractsApi.md#editFileAttachment) | **PUT** /contracts/{contract_id}/documents | Edit the file attached to contract document. |
| [**findEmailsById**](ContractsApi.md#findEmailsById) | **GET** /contracts/{contract_id}/alternate_emails | Find contract emails by ID |
| [**getList**](ContractsApi.md#getList) | **GET** /contracts | List of contracts |
| [**getList_0**](ContractsApi.md#getList_0) | **GET** /contract-templates | Get contract templates |
| [**getSingleContract**](ContractsApi.md#getSingleContract) | **GET** /contracts/{contract_id} | Retrieve a single contract |
| [**inviteWorkerToSign**](ContractsApi.md#inviteWorkerToSign) | **POST** /contracts/{contract_id}/invitations | Send contract to worker |
| [**removeInvite**](ContractsApi.md#removeInvite) | **DELETE** /contracts/{contract_id}/invitations | Remove invite |


<a name="addExternalId"></a>
# **addExternalId**
> GenericResultCreated addExternalId(contractId, inputToPatchContractExternalId).execute();

External Id

Add an external Id to a Deel contract. You can use this to add a Deel contract&#39;s refernece Id in your platform. External Id can be passed as a query parameter in List contract endpoint to find this conract later.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    ContractExternalIdToPatch data = new ContractExternalIdToPatch();
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .contracts
              .addExternalId(data, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#addExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .contracts
              .addExternalId(data, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#addExternalId");
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
| **inputToPatchContractExternalId** | [**InputToPatchContractExternalId**](InputToPatchContractExternalId.md)| Contract object that needs to be created | |

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
| **200** | Successful operation. |  -  |

<a name="archiveContract"></a>
# **archiveContract**
> GenericResultUpdated archiveContract(contractId).execute();

Archive a contract

Archive a terminated, cancelled or completed contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
      GenericResultUpdated result = client
              .contracts
              .archiveContract(contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#archiveContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .contracts
              .archiveContract(contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#archiveContract");
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

[**GenericResultUpdated**](GenericResultUpdated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation. |  -  |

<a name="attachFileToDocument"></a>
# **attachFileToDocument**
> ContractDocumentContainer attachFileToDocument(contractId).fileObject(fileObject).execute();

Attach a file to contract

Attach a file to contract document.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    File _file = new File("/path/to/file"); // Upload the file you want to attach to this entry.
    try {
      ContractDocumentContainer result = client
              .contracts
              .attachFileToDocument(contractId)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#attachFileToDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractDocumentContainer> response = client
              .contracts
              .attachFileToDocument(contractId)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#attachFileToDocument");
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
| **fileObject** | [**FileObject**](FileObject.md)| A form to attach a file to contract document. | [optional] |

### Return type

[**ContractDocumentContainer**](ContractDocumentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="calculateFinalPaymentAmount"></a>
# **calculateFinalPaymentAmount**
> FinalPaymentCalculatedContainer calculateFinalPaymentAmount(contractId).endDate(endDate).calculationType(calculationType).workweekStart(workweekStart).workweekEnd(workweekEnd).execute();

Calculate final payment

Calculate the final payment due to the contractor when ending the contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    LocalDate endDate = LocalDate.now(); // The day to end the contract.
    String calculationType = "CUSTOM_AMOUNT"; // The days to calculate.
    String workweekStart = "workweekStart_example"; // The day the work week starts, 0 to 6
    String workweekEnd = "workweekEnd_example"; // The day the work week ends, 0 to 6
    try {
      FinalPaymentCalculatedContainer result = client
              .contracts
              .calculateFinalPaymentAmount(contractId)
              .endDate(endDate)
              .calculationType(calculationType)
              .workweekStart(workweekStart)
              .workweekEnd(workweekEnd)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#calculateFinalPaymentAmount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FinalPaymentCalculatedContainer> response = client
              .contracts
              .calculateFinalPaymentAmount(contractId)
              .endDate(endDate)
              .calculationType(calculationType)
              .workweekStart(workweekStart)
              .workweekEnd(workweekEnd)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#calculateFinalPaymentAmount");
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
| **endDate** | **LocalDate**| The day to end the contract. | [optional] |
| **calculationType** | **String**| The days to calculate. | [optional] [enum: CUSTOM_AMOUNT, WORK_DAYS, CALENDAR_DAYS, FULL_AMOUNT] |
| **workweekStart** | **String**| The day the work week starts, 0 to 6 | [optional] |
| **workweekEnd** | **String**| The day the work week ends, 0 to 6 | [optional] |

### Return type

[**FinalPaymentCalculatedContainer**](FinalPaymentCalculatedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="calculateFirstPaymentAmount"></a>
# **calculateFirstPaymentAmount**
> ResponseEstimateFirstPaymentContainer calculateFirstPaymentAmount(estimateFirstPaymentContainer).execute();

Calculate first payment amount

First payment is calculated from the number of working/calendar days between their start date and the start of the payment cycle.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    EstimateFirstPayment data = new EstimateFirstPayment();
    try {
      ResponseEstimateFirstPaymentContainer result = client
              .contracts
              .calculateFirstPaymentAmount(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#calculateFirstPaymentAmount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResponseEstimateFirstPaymentContainer> response = client
              .contracts
              .calculateFirstPaymentAmount(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#calculateFirstPaymentAmount");
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
| **estimateFirstPaymentContainer** | [**EstimateFirstPaymentContainer**](EstimateFirstPaymentContainer.md)| Pro-rata payment object that needs to estimated payment | |

### Return type

[**ResponseEstimateFirstPaymentContainer**](ResponseEstimateFirstPaymentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="clientSignContract"></a>
# **clientSignContract**
> GenericResultCreated clientSignContract(contractId, contractSignatureToCreateContainer).execute();

Sign a contract

Sign a contract as a client.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    ContractSignatureToCreate data = new ContractSignatureToCreate();
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .contracts
              .clientSignContract(data, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#clientSignContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .contracts
              .clientSignContract(data, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#clientSignContract");
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
| **contractSignatureToCreateContainer** | [**ContractSignatureToCreateContainer**](ContractSignatureToCreateContainer.md)| Contract signature object that needs to be created | |

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

<a name="editFileAttachment"></a>
# **editFileAttachment**
> ContractDocumentContainer editFileAttachment(contractId).fileObject(fileObject).execute();

Edit the file attached to contract document.

Overwrite the file currently attached to contract document.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    File _file = new File("/path/to/file"); // Upload the file you want to attach to this entry.
    try {
      ContractDocumentContainer result = client
              .contracts
              .editFileAttachment(contractId)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#editFileAttachment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractDocumentContainer> response = client
              .contracts
              .editFileAttachment(contractId)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#editFileAttachment");
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
| **fileObject** | [**FileObject**](FileObject.md)| A form to attach a file to contract document. | [optional] |

### Return type

[**ContractDocumentContainer**](ContractDocumentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="findEmailsById"></a>
# **findEmailsById**
> List&lt;AlternateEmailItem&gt; findEmailsById(contractId).execute();

Find contract emails by ID

Returns an array of alternate email objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
      List<AlternateEmailItem> result = client
              .contracts
              .findEmailsById(contractId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#findEmailsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AlternateEmailItem>> response = client
              .contracts
              .findEmailsById(contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#findEmailsById");
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

[**List&lt;AlternateEmailItem&gt;**](AlternateEmailItem.md)

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
> ContractListContainer getList().afterCursor(afterCursor).limit(limit).orderDirection(orderDirection).types(types).statuses(statuses).teamId(teamId).externalId(externalId).countries(countries).currencies(currencies).search(search).sortBy(sortBy).execute();

List of contracts

Retrieve a list of contracts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    String afterCursor = "afterCursor_example"; // Return next page of results after given cursor.
    Double limit = 10D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    SortDirEnum orderDirection = SortDirEnum.fromValue("asc"); // Order direction of results; ascending or descending.
    List<ContractTypeEnum> types = Arrays.asList(); // You can filter contracts by type, a contract is included in results if its type is in this list.
    List<ContractStatusEnum> statuses = Arrays.asList(); // You can filter contracts by current status, a contract is included in results if its status is in this list.
    String teamId = "teamId_example"; // Filter contracts for given team ID; NOTE: technically ALL query parameters are strings or array of strings
    String externalId = "externalId_example"; // Filter contracts for given external ID
    List<String> countries = Arrays.asList(); // Country codes of contracts to filter.
    Object currencies = null; // Currency codes of contracts to filter.
    String search = "search_example"; // Include a contract if by name or contractor name contains given search term.
    ContractsSortByEnum sortBy = ContractsSortByEnum.fromValue("contract_title"); // Sort contracts by given field name.
    try {
      ContractListContainer result = client
              .contracts
              .getList()
              .afterCursor(afterCursor)
              .limit(limit)
              .orderDirection(orderDirection)
              .types(types)
              .statuses(statuses)
              .teamId(teamId)
              .externalId(externalId)
              .countries(countries)
              .currencies(currencies)
              .search(search)
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractListContainer> response = client
              .contracts
              .getList()
              .afterCursor(afterCursor)
              .limit(limit)
              .orderDirection(orderDirection)
              .types(types)
              .statuses(statuses)
              .teamId(teamId)
              .externalId(externalId)
              .countries(countries)
              .currencies(currencies)
              .search(search)
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getList");
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
| **afterCursor** | **String**| Return next page of results after given cursor. | [optional] |
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **orderDirection** | [**SortDirEnum**](.md)| Order direction of results; ascending or descending. | [optional] [enum: asc, desc] |
| **types** | [**List&lt;ContractTypeEnum&gt;**](ContractTypeEnum.md)| You can filter contracts by type, a contract is included in results if its type is in this list. | [optional] |
| **statuses** | [**List&lt;ContractStatusEnum&gt;**](ContractStatusEnum.md)| You can filter contracts by current status, a contract is included in results if its status is in this list. | [optional] |
| **teamId** | **String**| Filter contracts for given team ID; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **externalId** | **String**| Filter contracts for given external ID | [optional] |
| **countries** | [**List&lt;String&gt;**](String.md)| Country codes of contracts to filter. | [optional] |
| **currencies** | [**Object**](.md)| Currency codes of contracts to filter. | [optional] |
| **search** | **String**| Include a contract if by name or contractor name contains given search term. | [optional] |
| **sortBy** | [**ContractsSortByEnum**](.md)| Sort contracts by given field name. | [optional] [enum: contract_title, worker_name] |

### Return type

[**ContractListContainer**](ContractListContainer.md)

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
> ContractTemplateListContainer getList_0().execute();

Get contract templates

Retrieve a list of contract templates in your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
      ContractTemplateListContainer result = client
              .contracts
              .getList_0()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getList_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractTemplateListContainer> response = client
              .contracts
              .getList_0()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getList_0");
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

[**ContractTemplateListContainer**](ContractTemplateListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getSingleContract"></a>
# **getSingleContract**
> ContractContainer getSingleContract(contractId).execute();

Retrieve a single contract

Retrieve a single contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
      ContractContainer result = client
              .contracts
              .getSingleContract(contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getSingleContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractContainer> response = client
              .contracts
              .getSingleContract(contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getSingleContract");
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

[**ContractContainer**](ContractContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="inviteWorkerToSign"></a>
# **inviteWorkerToSign**
> GenericResultCreated inviteWorkerToSign(contractId, contractInvitationToCreateContainer).execute();

Send contract to worker

Invite a worker to sign the contract. Worker will be notified via email.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
    ContractInvitationToCreate data = new ContractInvitationToCreate();
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .contracts
              .inviteWorkerToSign(data, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#inviteWorkerToSign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .contracts
              .inviteWorkerToSign(data, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#inviteWorkerToSign");
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
| **contractInvitationToCreateContainer** | [**ContractInvitationToCreateContainer**](ContractInvitationToCreateContainer.md)| Contract invitation object that needs to be created | |

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

<a name="removeInvite"></a>
# **removeInvite**
> GenericResultDeleted removeInvite(contractId).execute();

Remove invite

Remove invite in order to re-invite a worker to sign the contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractsApi;
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
      GenericResultDeleted result = client
              .contracts
              .removeInvite(contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#removeInvite");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultDeleted> response = client
              .contracts
              .removeInvite(contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#removeInvite");
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

