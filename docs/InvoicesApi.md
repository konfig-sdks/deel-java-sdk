# InvoicesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAdjustment**](InvoicesApi.md#createAdjustment) | **POST** /invoice-adjustments | Create an invoice adjustment |
| [**deleteAdjustment**](InvoicesApi.md#deleteAdjustment) | **DELETE** /invoice-adjustments/{invoice_adjustment_id} | Delete an invoice adjustment |
| [**getAttachmentFileUrl**](InvoicesApi.md#getAttachmentFileUrl) | **GET** /invoice-adjustments/{invoice_adjustment_id}/attachment | Retrieve Attachment file url. |
| [**getLineItemsByContract**](InvoicesApi.md#getLineItemsByContract) | **GET** /contracts/{contract_id}/invoice-adjustments | Invoice line items by contract |
| [**listInvoiceAdjustments**](InvoicesApi.md#listInvoiceAdjustments) | **GET** /invoice-adjustments | List invoice adjustments |
| [**reviewMultiple**](InvoicesApi.md#reviewMultiple) | **POST** /invoice-adjustments/many/reviews | Bulk review invoice adjustments |
| [**submitAdjustmentReview**](InvoicesApi.md#submitAdjustmentReview) | **POST** /invoice-adjustments/{invoice_adjustment_id}/reviews | Review an invoice adjustment |
| [**updateAdjustmentById**](InvoicesApi.md#updateAdjustmentById) | **PATCH** /invoice-adjustments/{invoice_adjustment_id} | Update an invoice adjustment |


<a name="createAdjustment"></a>
# **createAdjustment**
> InvoiceAdjustmentCreatedContainer createAdjustment(invoiceAdjustmentToCreateContainer).recurring(recurring).execute();

Create an invoice adjustment

Create an invoice adjustment using this endpoint. For example, you can add a bonus, commission, VAT %, deduction etc. to an invoice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    InvoiceAdjustmentToCreate data = new InvoiceAdjustmentToCreate();
    Boolean recurring = true; // Add this invoice adjustment as recurring
    try {
      InvoiceAdjustmentCreatedContainer result = client
              .invoices
              .createAdjustment(data)
              .recurring(recurring)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createAdjustment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceAdjustmentCreatedContainer> response = client
              .invoices
              .createAdjustment(data)
              .recurring(recurring)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createAdjustment");
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
| **invoiceAdjustmentToCreateContainer** | [**InvoiceAdjustmentToCreateContainer**](InvoiceAdjustmentToCreateContainer.md)| InvoiceAdjustment object that needs to be created | |
| **recurring** | **Boolean**| Add this invoice adjustment as recurring | [optional] |

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

<a name="deleteAdjustment"></a>
# **deleteAdjustment**
> GenericResultDeleted deleteAdjustment(invoiceAdjustmentId).reason(reason).execute();

Delete an invoice adjustment

Delete an existing invoice adjustment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    Double invoiceAdjustmentId = 3.4D; // ID of an existing invoice adjustment
    String reason = "reason_example"; // Reason for deleting an existing invoice adjustment
    try {
      GenericResultDeleted result = client
              .invoices
              .deleteAdjustment(invoiceAdjustmentId)
              .reason(reason)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteAdjustment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultDeleted> response = client
              .invoices
              .deleteAdjustment(invoiceAdjustmentId)
              .reason(reason)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteAdjustment");
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
| **invoiceAdjustmentId** | **Double**| ID of an existing invoice adjustment | |
| **reason** | **String**| Reason for deleting an existing invoice adjustment | [optional] |

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

<a name="getAttachmentFileUrl"></a>
# **getAttachmentFileUrl**
> InvoiceAdjustmentAttachmentContainer getAttachmentFileUrl(invoiceAdjustmentId).execute();

Retrieve Attachment file url.

Retrieve Attachment file url of specified id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    Double invoiceAdjustmentId = 3.4D; // ID of an existing invoice adjustment
    try {
      InvoiceAdjustmentAttachmentContainer result = client
              .invoices
              .getAttachmentFileUrl(invoiceAdjustmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getAttachmentFileUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceAdjustmentAttachmentContainer> response = client
              .invoices
              .getAttachmentFileUrl(invoiceAdjustmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getAttachmentFileUrl");
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
| **invoiceAdjustmentId** | **Double**| ID of an existing invoice adjustment | |

### Return type

[**InvoiceAdjustmentAttachmentContainer**](InvoiceAdjustmentAttachmentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getLineItemsByContract"></a>
# **getLineItemsByContract**
> InvoiceAdjustmentListContainer getLineItemsByContract(contractId).contractTypes(contractTypes).types(types).statuses(statuses).invoiceId(invoiceId).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

Invoice line items by contract

Retrieve invoice line items for a given contract id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    List<ContractTypeEnum> contractTypes = Arrays.asList(); // types of contracts to filter
    List<InvoiceAdjustmentTypeEnum> types = Arrays.asList(); // types of invoice adjustments to filter
    List<InvoiceAdjustmentStatusEnum> statuses = Arrays.asList(); // statuses of invoice adjustment to filter
    Double invoiceId = 3.4D; // ID of an existing invoice; NOTE: technically ALL query parameters are strings or array of strings
    Double reporterId = 3.4D; // ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings
    LocalDate dateFrom = LocalDate.now(); // to get invoice adjustments submitted on or after given start date (inclusive)
    LocalDate dateTo = LocalDate.now(); // to get invoice adjustments submitted before given end date (excludes records submitted on this date)
    Double limit = 10D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    Double offset = 0D; // Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings
    try {
      InvoiceAdjustmentListContainer result = client
              .invoices
              .getLineItemsByContract(contractId)
              .contractTypes(contractTypes)
              .types(types)
              .statuses(statuses)
              .invoiceId(invoiceId)
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
      System.err.println("Exception when calling InvoicesApi#getLineItemsByContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceAdjustmentListContainer> response = client
              .invoices
              .getLineItemsByContract(contractId)
              .contractTypes(contractTypes)
              .types(types)
              .statuses(statuses)
              .invoiceId(invoiceId)
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
      System.err.println("Exception when calling InvoicesApi#getLineItemsByContract");
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
| **contractTypes** | [**List&lt;ContractTypeEnum&gt;**](ContractTypeEnum.md)| types of contracts to filter | [optional] |
| **types** | [**List&lt;InvoiceAdjustmentTypeEnum&gt;**](InvoiceAdjustmentTypeEnum.md)| types of invoice adjustments to filter | [optional] |
| **statuses** | [**List&lt;InvoiceAdjustmentStatusEnum&gt;**](InvoiceAdjustmentStatusEnum.md)| statuses of invoice adjustment to filter | [optional] |
| **invoiceId** | **Double**| ID of an existing invoice; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **reporterId** | **Double**| ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **dateFrom** | **LocalDate**| to get invoice adjustments submitted on or after given start date (inclusive) | [optional] |
| **dateTo** | **LocalDate**| to get invoice adjustments submitted before given end date (excludes records submitted on this date) | [optional] |
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **offset** | **Double**| Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 0] |

### Return type

[**InvoiceAdjustmentListContainer**](InvoiceAdjustmentListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listInvoiceAdjustments"></a>
# **listInvoiceAdjustments**
> InvoiceAdjustmentListContainer listInvoiceAdjustments().contractId(contractId).contractTypes(contractTypes).types(types).statuses(statuses).invoiceId(invoiceId).reporterId(reporterId).dateFrom(dateFrom).dateTo(dateTo).limit(limit).offset(offset).execute();

List invoice adjustments

Retrieve invoice adjustments. You can filter the list by providing additional parameters e.g. contract_id, contract_type etc.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String contractId = "contractId_example"; // Id of an Deel contract.
    List<ContractTypeEnum> contractTypes = Arrays.asList(); // types of contracts to filter
    List<InvoiceAdjustmentTypeEnum> types = Arrays.asList(); // types of invoice adjustments to filter
    List<InvoiceAdjustmentStatusEnum> statuses = Arrays.asList(); // statuses of invoice adjustment to filter
    Double invoiceId = 3.4D; // ID of an existing invoice; NOTE: technically ALL query parameters are strings or array of strings
    Double reporterId = 3.4D; // ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings
    LocalDate dateFrom = LocalDate.now(); // to get invoice adjustments submitted on or after given start date (inclusive)
    LocalDate dateTo = LocalDate.now(); // to get invoice adjustments submitted before given end date (excludes records submitted on this date)
    Double limit = 10D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    Double offset = 0D; // Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings
    try {
      InvoiceAdjustmentListContainer result = client
              .invoices
              .listInvoiceAdjustments()
              .contractId(contractId)
              .contractTypes(contractTypes)
              .types(types)
              .statuses(statuses)
              .invoiceId(invoiceId)
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
      System.err.println("Exception when calling InvoicesApi#listInvoiceAdjustments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceAdjustmentListContainer> response = client
              .invoices
              .listInvoiceAdjustments()
              .contractId(contractId)
              .contractTypes(contractTypes)
              .types(types)
              .statuses(statuses)
              .invoiceId(invoiceId)
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
      System.err.println("Exception when calling InvoicesApi#listInvoiceAdjustments");
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
| **contractId** | **String**| Id of an Deel contract. | [optional] |
| **contractTypes** | [**List&lt;ContractTypeEnum&gt;**](ContractTypeEnum.md)| types of contracts to filter | [optional] |
| **types** | [**List&lt;InvoiceAdjustmentTypeEnum&gt;**](InvoiceAdjustmentTypeEnum.md)| types of invoice adjustments to filter | [optional] |
| **statuses** | [**List&lt;InvoiceAdjustmentStatusEnum&gt;**](InvoiceAdjustmentStatusEnum.md)| statuses of invoice adjustment to filter | [optional] |
| **invoiceId** | **Double**| ID of an existing invoice; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **reporterId** | **Double**| ID of an existing profile; NOTE: technically ALL query parameters are strings or array of strings | [optional] |
| **dateFrom** | **LocalDate**| to get invoice adjustments submitted on or after given start date (inclusive) | [optional] |
| **dateTo** | **LocalDate**| to get invoice adjustments submitted before given end date (excludes records submitted on this date) | [optional] |
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **offset** | **Double**| Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 0] |

### Return type

[**InvoiceAdjustmentListContainer**](InvoiceAdjustmentListContainer.md)

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
> GenericResultCreated reviewMultiple().invoiceAdjustmentReviewsToCreateContainer(invoiceAdjustmentReviewsToCreateContainer).execute();

Bulk review invoice adjustments

Review multiple invoice adjustments to approve or decline a batch.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    InvoiceAdjustmentReviewsToCreate data = new InvoiceAdjustmentReviewsToCreate();
    try {
      GenericResultCreated result = client
              .invoices
              .reviewMultiple(data)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#reviewMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .invoices
              .reviewMultiple(data)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#reviewMultiple");
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
| **invoiceAdjustmentReviewsToCreateContainer** | [**InvoiceAdjustmentReviewsToCreateContainer**](InvoiceAdjustmentReviewsToCreateContainer.md)| InvoiceAdjustment review objects that need to be created | [optional] |

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

<a name="submitAdjustmentReview"></a>
# **submitAdjustmentReview**
> GenericResultCreated submitAdjustmentReview(invoiceAdjustmentId).invoiceAdjustmentReviewToCreateContainer(invoiceAdjustmentReviewToCreateContainer).execute();

Review an invoice adjustment

Review an invoice adjustment to approve or decline it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    InvoiceAdjustmentReviewToCreate data = new InvoiceAdjustmentReviewToCreate();
    Double invoiceAdjustmentId = 3.4D; // ID of an existing invoice adjustment
    try {
      GenericResultCreated result = client
              .invoices
              .submitAdjustmentReview(data, invoiceAdjustmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#submitAdjustmentReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .invoices
              .submitAdjustmentReview(data, invoiceAdjustmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#submitAdjustmentReview");
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
| **invoiceAdjustmentId** | **Double**| ID of an existing invoice adjustment | |
| **invoiceAdjustmentReviewToCreateContainer** | [**InvoiceAdjustmentReviewToCreateContainer**](InvoiceAdjustmentReviewToCreateContainer.md)| InvoiceAdjustment review object that need to be created | [optional] |

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

<a name="updateAdjustmentById"></a>
# **updateAdjustmentById**
> GenericResultUpdated updateAdjustmentById(invoiceAdjustmentId, invoiceAdjustmentToUpdateContainer).execute();

Update an invoice adjustment

Update an existing invoice adjustment. It is not possible to update VAT adjustments, we recommend you to delete the existing VAT adjust and create a new one.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    InvoiceAdjustmentToUpdate data = new InvoiceAdjustmentToUpdate();
    Double invoiceAdjustmentId = 3.4D; // ID of an existing invoice adjustment
    try {
      GenericResultUpdated result = client
              .invoices
              .updateAdjustmentById(data, invoiceAdjustmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateAdjustmentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .invoices
              .updateAdjustmentById(data, invoiceAdjustmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateAdjustmentById");
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
| **invoiceAdjustmentId** | **Double**| ID of an existing invoice adjustment | |
| **invoiceAdjustmentToUpdateContainer** | [**InvoiceAdjustmentToUpdateContainer**](InvoiceAdjustmentToUpdateContainer.md)| InvoiceAdjustment object that needs to be updated | |

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

