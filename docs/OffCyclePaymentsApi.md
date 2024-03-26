# OffCyclePaymentsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPaymentInvoice**](OffCyclePaymentsApi.md#addPaymentInvoice) | **POST** /contracts/{contract_id}/off-cycle-payments | Add off-cycle payment |
| [**getList**](OffCyclePaymentsApi.md#getList) | **GET** /contracts/{contract_id}/off-cycle-payments | List of off-cycle payments |
| [**getSinglePayment**](OffCyclePaymentsApi.md#getSinglePayment) | **GET** /contracts/{contract_id}/off-cycle-payments/{offcycle_payment_id} | Retrieve a single off-cycle payment |


<a name="addPaymentInvoice"></a>
# **addPaymentInvoice**
> GenericResultCreatedWithId addPaymentInvoice(contractId).offCyclePaymentToCreateContainer(offCyclePaymentToCreateContainer).execute();

Add off-cycle payment

Add a new invoice line-item for the purpose of off-cycle payment for a given contract.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OffCyclePaymentsApi;
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
    OffCyclePaymentToCreate data = new OffCyclePaymentToCreate();
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreatedWithId result = client
              .offCyclePayments
              .addPaymentInvoice(data, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#addPaymentInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreatedWithId> response = client
              .offCyclePayments
              .addPaymentInvoice(data, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#addPaymentInvoice");
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
| **offCyclePaymentToCreateContainer** | [**OffCyclePaymentToCreateContainer**](OffCyclePaymentToCreateContainer.md)| Off-cycle payment object that needs to be created | [optional] |

### Return type

[**GenericResultCreatedWithId**](GenericResultCreatedWithId.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getList"></a>
# **getList**
> OffCyclePaymentListContainer getList(contractId).execute();

List of off-cycle payments

Retrieve a list of off-cycle payments for the given contract id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OffCyclePaymentsApi;
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
      OffCyclePaymentListContainer result = client
              .offCyclePayments
              .getList(contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OffCyclePaymentListContainer> response = client
              .offCyclePayments
              .getList(contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#getList");
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

[**OffCyclePaymentListContainer**](OffCyclePaymentListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getSinglePayment"></a>
# **getSinglePayment**
> OffCyclePaymentContainer getSinglePayment(contractId, offcyclePaymentId).execute();

Retrieve a single off-cycle payment

Retrieve a single off-cycle payment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OffCyclePaymentsApi;
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
    String offcyclePaymentId = "offcyclePaymentId_example"; // ID of off-cycle payment to return
    try {
      OffCyclePaymentContainer result = client
              .offCyclePayments
              .getSinglePayment(contractId, offcyclePaymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#getSinglePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OffCyclePaymentContainer> response = client
              .offCyclePayments
              .getSinglePayment(contractId, offcyclePaymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#getSinglePayment");
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
| **offcyclePaymentId** | **String**| ID of off-cycle payment to return | |

### Return type

[**OffCyclePaymentContainer**](OffCyclePaymentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

