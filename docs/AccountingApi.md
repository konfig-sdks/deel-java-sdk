# AccountingApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDeelInvoices**](AccountingApi.md#getDeelInvoices) | **GET** /invoices/deel | Retrieve Deel invoices |
| [**getInvoicePdfDownloadLink**](AccountingApi.md#getInvoicePdfDownloadLink) | **GET** /invoices/{invoice_id}/download | Download invoice PDF |
| [**getPaidInvoices**](AccountingApi.md#getPaidInvoices) | **GET** /invoices | Retrieve invoices |
| [**getPaymentBreakdown**](AccountingApi.md#getPaymentBreakdown) | **GET** /payments/{payment_id}/breakdown | Retrieve a payment breakdown |
| [**getPaymentReceipts**](AccountingApi.md#getPaymentReceipts) | **GET** /payments | Retrieve payment reciepts |


<a name="getDeelInvoices"></a>
# **getDeelInvoices**
> DeelInvoiceListContainer getDeelInvoices().limit(limit).offset(offset).execute();

Retrieve Deel invoices

Retrieve a list of invoices related to Deel fees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    Double limit = 10D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    Double offset = 0D; // Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings
    try {
      DeelInvoiceListContainer result = client
              .accounting
              .getDeelInvoices()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDeelInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeelInvoiceListContainer> response = client
              .accounting
              .getDeelInvoices()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDeelInvoices");
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
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **offset** | **Double**| Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 0] |

### Return type

[**DeelInvoiceListContainer**](DeelInvoiceListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getInvoicePdfDownloadLink"></a>
# **getInvoicePdfDownloadLink**
> InvoiceDownloadLinkContainer getInvoicePdfDownloadLink(invoiceId).execute();

Download invoice PDF

Get link to download the invoice PDF.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    String invoiceId = "invoiceId_example"; // ID of an existing invoice
    try {
      InvoiceDownloadLinkContainer result = client
              .accounting
              .getInvoicePdfDownloadLink(invoiceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getInvoicePdfDownloadLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceDownloadLinkContainer> response = client
              .accounting
              .getInvoicePdfDownloadLink(invoiceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getInvoicePdfDownloadLink");
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
| **invoiceId** | **String**| ID of an existing invoice | |

### Return type

[**InvoiceDownloadLinkContainer**](InvoiceDownloadLinkContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getPaidInvoices"></a>
# **getPaidInvoices**
> InvoiceListContainer getPaidInvoices().issuedFromDate(issuedFromDate).issuedToDate(issuedToDate).limit(limit).offset(offset).execute();

Retrieve invoices

Retrieve a list of paid invoices for your workforce.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    String issuedFromDate = "issuedFromDate_example"; // to get records created after given issue date
    String issuedToDate = "issuedToDate_example"; // to get records created before given issued date
    Double limit = 10D; // Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings
    Double offset = 0D; // Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings
    try {
      InvoiceListContainer result = client
              .accounting
              .getPaidInvoices()
              .issuedFromDate(issuedFromDate)
              .issuedToDate(issuedToDate)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaidInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoiceListContainer> response = client
              .accounting
              .getPaidInvoices()
              .issuedFromDate(issuedFromDate)
              .issuedToDate(issuedToDate)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaidInvoices");
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
| **issuedFromDate** | **String**| to get records created after given issue date | [optional] |
| **issuedToDate** | **String**| to get records created before given issued date | [optional] |
| **limit** | **Double**| Return a page of results with given number of records; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **offset** | **Double**| Return a page of results after given index of row; NOTE: technically ALL query parameters are strings or array of strings | [optional] [default to 0] |

### Return type

[**InvoiceListContainer**](InvoiceListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getPaymentBreakdown"></a>
# **getPaymentBreakdown**
> PaymentBreakDownContainer getPaymentBreakdown(paymentId).execute();

Retrieve a payment breakdown

Get a full breakdown of a payment made to Deel. Breakdown will include individual invoices and Deel fee as line items.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    String paymentId = "paymentId_example";
    try {
      PaymentBreakDownContainer result = client
              .accounting
              .getPaymentBreakdown(paymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaymentBreakdown");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentBreakDownContainer> response = client
              .accounting
              .getPaymentBreakdown(paymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaymentBreakdown");
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
| **paymentId** | **String**|  | |

### Return type

[**PaymentBreakDownContainer**](PaymentBreakDownContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getPaymentReceipts"></a>
# **getPaymentReceipts**
> PaymentListContainer getPaymentReceipts().dateFrom(dateFrom).dateTo(dateTo).currencies(currencies).entities(entities).execute();

Retrieve payment reciepts

Retrieve a list of payments made to Deel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountingApi;
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
    LocalDate dateFrom = LocalDate.parse("2022-01-01T00:00:00.000Z"); // Filtered results will include records created on or after the provided date.
    LocalDate dateTo = LocalDate.parse("2022-12-01T00:00:00.000Z"); // Filtered results will include records created before the provided date.
    Object currencies = null; // Currency codes of contracts to filter.
    Object entities = null; // Filter by legal entity type; company, or individual
    try {
      PaymentListContainer result = client
              .accounting
              .getPaymentReceipts()
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .currencies(currencies)
              .entities(entities)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaymentReceipts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentListContainer> response = client
              .accounting
              .getPaymentReceipts()
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .currencies(currencies)
              .entities(entities)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaymentReceipts");
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
| **dateFrom** | **LocalDate**| Filtered results will include records created on or after the provided date. | [optional] |
| **dateTo** | **LocalDate**| Filtered results will include records created before the provided date. | [optional] |
| **currencies** | [**Object**](.md)| Currency codes of contracts to filter. | [optional] |
| **entities** | [**Object**](.md)| Filter by legal entity type; company, or individual | [optional] |

### Return type

[**PaymentListContainer**](PaymentListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

