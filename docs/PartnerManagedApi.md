# PartnerManagedApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAdditionalInformationForEorEmployee**](PartnerManagedApi.md#addAdditionalInformationForEorEmployee) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/additional-information | Add additional information |
| [**addBankAccountForEorEmployee**](PartnerManagedApi.md#addBankAccountForEorEmployee) | **POST** /partner-managed/employees/{employee_id}/banks | Add bank account |
| [**downloadComplianceDocumentTemplate**](PartnerManagedApi.md#downloadComplianceDocumentTemplate) | **GET** /partner-managed/employees/{employee_id}/compliance-documents/{document_id}/templates/download | Download employee compliance document template |
| [**downloadEmployeeAgreementPdf**](PartnerManagedApi.md#downloadEmployeeAgreementPdf) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/employee-agreement/download | Download employee agreement PDF |
| [**downloadHrVerificationLettersAndDocuments**](PartnerManagedApi.md#downloadHrVerificationLettersAndDocuments) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/hr-documents/{document_id}/download | Download HR verification letters and documents |
| [**getBankGuideForEorEmployee**](PartnerManagedApi.md#getBankGuideForEorEmployee) | **GET** /partner-managed/employees/{employee_id}/banks/guide | Bank account form |
| [**getEmployeeAgreementHtml**](PartnerManagedApi.md#getEmployeeAgreementHtml) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/employee-agreement | Preview employee agreement |
| [**listEmployeeComplianceDocuments**](PartnerManagedApi.md#listEmployeeComplianceDocuments) | **GET** /partner-managed/employees/{employee_id}/compliance-documents | List of employee compliance documents |
| [**listHrVerificationLettersAndDocuments**](PartnerManagedApi.md#listHrVerificationLettersAndDocuments) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/hr-documents | List HR verification letters and documents |
| [**listPayslipsForEorEmployee**](PartnerManagedApi.md#listPayslipsForEorEmployee) | **GET** /partner-managed/employees/{employee_id}/payslips | Get list of payslips for an EOR employee |
| [**listTaxDocumentsForEmployee**](PartnerManagedApi.md#listTaxDocumentsForEmployee) | **GET** /partner-managed/employees/{employee_id}/tax-documents | List of tax documents for an employee |
| [**modifyBankAccountForEorEmployee**](PartnerManagedApi.md#modifyBankAccountForEorEmployee) | **PATCH** /partner-managed/employees/{employee_id}/banks/{bank_id} | Modify bank account for an EOR employee |
| [**previewJobOfferLetter**](PartnerManagedApi.md#previewJobOfferLetter) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/offer-letter | Preview job offer letter |
| [**requestCustomVerificationLetter**](PartnerManagedApi.md#requestCustomVerificationLetter) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/custom-verification-letter | Request custom verification letter |
| [**signContract**](PartnerManagedApi.md#signContract) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/signatures | Sign a contract |
| [**uploadComplianceDocument**](PartnerManagedApi.md#uploadComplianceDocument) | **POST** /partner-managed/employees/{employee_id}/compliance-documents/{document_id} | Upload employee compliance document |


<a name="addAdditionalInformationForEorEmployee"></a>
# **addAdditionalInformationForEorEmployee**
> GenericResultUpdated addAdditionalInformationForEorEmployee(employeeId, contractId, additionalEORInfoContainer).execute();

Add additional information

Add additional information for an EOR employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    Object data = null; // Fields for country validation mandatory found at `/eor/validations/{country_code}`.
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultUpdated result = client
              .partnerManaged
              .addAdditionalInformationForEorEmployee(data, employeeId, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#addAdditionalInformationForEorEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultUpdated> response = client
              .partnerManaged
              .addAdditionalInformationForEorEmployee(data, employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#addAdditionalInformationForEorEmployee");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **additionalEORInfoContainer** | [**AdditionalEORInfoContainer**](AdditionalEORInfoContainer.md)| Bank Account object that needs to be created | |

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
| **201** | Successful operation. |  -  |

<a name="addBankAccountForEorEmployee"></a>
# **addBankAccountForEorEmployee**
> BankAccountAddedContainer addBankAccountForEorEmployee(employeeId, bankAccountToAddContainer).execute();

Add bank account

Add bank account for an EOR employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    List<BankAccountToAddInner> data = Arrays.asList();
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    try {
      BankAccountAddedContainer result = client
              .partnerManaged
              .addBankAccountForEorEmployee(data, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#addBankAccountForEorEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountAddedContainer> response = client
              .partnerManaged
              .addBankAccountForEorEmployee(data, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#addBankAccountForEorEmployee");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **bankAccountToAddContainer** | [**BankAccountToAddContainer**](BankAccountToAddContainer.md)| Bank Account object that needs to be created | |

### Return type

[**BankAccountAddedContainer**](BankAccountAddedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a name="downloadComplianceDocumentTemplate"></a>
# **downloadComplianceDocumentTemplate**
> GetEmployeeComplianceDocumentTemplateDownloadLinkContainer downloadComplianceDocumentTemplate(employeeId, documentId).execute();

Download employee compliance document template

Get the download link for an employee compliance document template, if it exists.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    Double documentId = 1234D; // Unique identifier for a compliance document in Deel.
    try {
      GetEmployeeComplianceDocumentTemplateDownloadLinkContainer result = client
              .partnerManaged
              .downloadComplianceDocumentTemplate(employeeId, documentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadComplianceDocumentTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetEmployeeComplianceDocumentTemplateDownloadLinkContainer> response = client
              .partnerManaged
              .downloadComplianceDocumentTemplate(employeeId, documentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadComplianceDocumentTemplate");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **documentId** | **Double**| Unique identifier for a compliance document in Deel. | |

### Return type

[**GetEmployeeComplianceDocumentTemplateDownloadLinkContainer**](GetEmployeeComplianceDocumentTemplateDownloadLinkContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="downloadEmployeeAgreementPdf"></a>
# **downloadEmployeeAgreementPdf**
> EmployeeAgreementDownloadContainer downloadEmployeeAgreementPdf(employeeId, contractId).execute();

Download employee agreement PDF

Get link to download the employee agreement PDF.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      EmployeeAgreementDownloadContainer result = client
              .partnerManaged
              .downloadEmployeeAgreementPdf(employeeId, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadEmployeeAgreementPdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAgreementDownloadContainer> response = client
              .partnerManaged
              .downloadEmployeeAgreementPdf(employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadEmployeeAgreementPdf");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

### Return type

[**EmployeeAgreementDownloadContainer**](EmployeeAgreementDownloadContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="downloadHrVerificationLettersAndDocuments"></a>
# **downloadHrVerificationLettersAndDocuments**
> EmployeeAgreementDownloadContainer downloadHrVerificationLettersAndDocuments(employeeId, contractId, documentId).execute();

Download HR verification letters and documents

Retrieve URL to download HR verification letters and documents.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    Double documentId = 1234D; // Unique identifier for a compliance document in Deel.
    try {
      EmployeeAgreementDownloadContainer result = client
              .partnerManaged
              .downloadHrVerificationLettersAndDocuments(employeeId, contractId, documentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadHrVerificationLettersAndDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeAgreementDownloadContainer> response = client
              .partnerManaged
              .downloadHrVerificationLettersAndDocuments(employeeId, contractId, documentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadHrVerificationLettersAndDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **documentId** | **Double**| Unique identifier for a compliance document in Deel. | |

### Return type

[**EmployeeAgreementDownloadContainer**](EmployeeAgreementDownloadContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="getBankGuideForEorEmployee"></a>
# **getBankGuideForEorEmployee**
> BankAccountGuideContainer getBankGuideForEorEmployee(employeeId).execute();

Bank account form

Retrieve bank account form guide for an EOR employee. This data can be used to add a new bank account for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    try {
      BankAccountGuideContainer result = client
              .partnerManaged
              .getBankGuideForEorEmployee(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getBankGuideForEorEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountGuideContainer> response = client
              .partnerManaged
              .getBankGuideForEorEmployee(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getBankGuideForEorEmployee");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

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

<a name="getEmployeeAgreementHtml"></a>
# **getEmployeeAgreementHtml**
> String getEmployeeAgreementHtml(employeeId, contractId).execute();

Preview employee agreement

Retrieve an EOR Employee Agreement content in HTML.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      String result = client
              .partnerManaged
              .getEmployeeAgreementHtml(employeeId, contractId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeAgreementHtml");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .partnerManaged
              .getEmployeeAgreementHtml(employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeAgreementHtml");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

### Return type

**String**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listEmployeeComplianceDocuments"></a>
# **listEmployeeComplianceDocuments**
> GetEmployeeComplianceDocumentsContainer listEmployeeComplianceDocuments(employeeId).execute();

List of employee compliance documents

Get a list of employee compliance documents.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    try {
      GetEmployeeComplianceDocumentsContainer result = client
              .partnerManaged
              .listEmployeeComplianceDocuments(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listEmployeeComplianceDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetEmployeeComplianceDocumentsContainer> response = client
              .partnerManaged
              .listEmployeeComplianceDocuments(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listEmployeeComplianceDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**GetEmployeeComplianceDocumentsContainer**](GetEmployeeComplianceDocumentsContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listHrVerificationLettersAndDocuments"></a>
# **listHrVerificationLettersAndDocuments**
> HrVerificationLettersAndDocumentsListContainer listHrVerificationLettersAndDocuments(employeeId, contractId).execute();

List HR verification letters and documents

List all HR verification letters and documents available.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      HrVerificationLettersAndDocumentsListContainer result = client
              .partnerManaged
              .listHrVerificationLettersAndDocuments(employeeId, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listHrVerificationLettersAndDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HrVerificationLettersAndDocumentsListContainer> response = client
              .partnerManaged
              .listHrVerificationLettersAndDocuments(employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listHrVerificationLettersAndDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

### Return type

[**HrVerificationLettersAndDocumentsListContainer**](HrVerificationLettersAndDocumentsListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listPayslipsForEorEmployee"></a>
# **listPayslipsForEorEmployee**
> EmployeePayslipsListContainer listPayslipsForEorEmployee(employeeId).execute();

Get list of payslips for an EOR employee

Get list of payslips for an EOR employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    try {
      EmployeePayslipsListContainer result = client
              .partnerManaged
              .listPayslipsForEorEmployee(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listPayslipsForEorEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePayslipsListContainer> response = client
              .partnerManaged
              .listPayslipsForEorEmployee(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listPayslipsForEorEmployee");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**EmployeePayslipsListContainer**](EmployeePayslipsListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="listTaxDocumentsForEmployee"></a>
# **listTaxDocumentsForEmployee**
> EmployeeTaxDocumentsListContainer listTaxDocumentsForEmployee(employeeId).execute();

List of tax documents for an employee

Get list of tax documents for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    try {
      EmployeeTaxDocumentsListContainer result = client
              .partnerManaged
              .listTaxDocumentsForEmployee(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listTaxDocumentsForEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTaxDocumentsListContainer> response = client
              .partnerManaged
              .listTaxDocumentsForEmployee(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#listTaxDocumentsForEmployee");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**EmployeeTaxDocumentsListContainer**](EmployeeTaxDocumentsListContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="modifyBankAccountForEorEmployee"></a>
# **modifyBankAccountForEorEmployee**
> BankAccountAddedContainer modifyBankAccountForEorEmployee(employeeId, bankId, bankAccountToAddContainer).execute();

Modify bank account for an EOR employee

Modify bank account for an EOR employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    List<BankAccountToAddInner> data = Arrays.asList();
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String bankId = "dcc7b587-2246-4909-853e-12056e90c451"; // Bank Account id.
    try {
      BankAccountAddedContainer result = client
              .partnerManaged
              .modifyBankAccountForEorEmployee(data, employeeId, bankId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#modifyBankAccountForEorEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountAddedContainer> response = client
              .partnerManaged
              .modifyBankAccountForEorEmployee(data, employeeId, bankId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#modifyBankAccountForEorEmployee");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **bankId** | **String**| Bank Account id. | |
| **bankAccountToAddContainer** | [**BankAccountToAddContainer**](BankAccountToAddContainer.md)| Bank Account object that needs to be modified | |

### Return type

[**BankAccountAddedContainer**](BankAccountAddedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="previewJobOfferLetter"></a>
# **previewJobOfferLetter**
> String previewJobOfferLetter(employeeId, contractId).execute();

Preview job offer letter

Retrieve an EOR job offer letter in HTML. This endpoint does not support IC and Global Payroll contract types.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      String result = client
              .partnerManaged
              .previewJobOfferLetter(employeeId, contractId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#previewJobOfferLetter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .partnerManaged
              .previewJobOfferLetter(employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#previewJobOfferLetter");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

### Return type

**String**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a name="requestCustomVerificationLetter"></a>
# **requestCustomVerificationLetter**
> GenericResultCreated requestCustomVerificationLetter(employeeId, contractId, requestCustomVerificationLetterContainer).execute();

Request custom verification letter

Request employment verification letters, visa support, bank verification and more.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    LetterRequest data = new LetterRequest();
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .partnerManaged
              .requestCustomVerificationLetter(data, employeeId, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#requestCustomVerificationLetter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .partnerManaged
              .requestCustomVerificationLetter(data, employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#requestCustomVerificationLetter");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **requestCustomVerificationLetterContainer** | [**RequestCustomVerificationLetterContainer**](RequestCustomVerificationLetterContainer.md)| Request custom verification letter to be requested | |

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
| **201** | Successful operation. |  -  |

<a name="signContract"></a>
# **signContract**
> GenericResultCreated signContract(employeeId, contractId, employeeContractSignatureToCreateContainer).execute();

Sign a contract

Sign a contract as a employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    EmployeeContractSignatureToCreate data = new EmployeeContractSignatureToCreate();
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // Deel contract id.
    try {
      GenericResultCreated result = client
              .partnerManaged
              .signContract(data, employeeId, contractId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#signContract");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenericResultCreated> response = client
              .partnerManaged
              .signContract(data, employeeId, contractId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#signContract");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **employeeContractSignatureToCreateContainer** | [**EmployeeContractSignatureToCreateContainer**](EmployeeContractSignatureToCreateContainer.md)| Contract signature object that needs to be created | |

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

<a name="uploadComplianceDocument"></a>
# **uploadComplianceDocument**
> UploadEmployeeComplianceDocumentContainer uploadComplianceDocument(employeeId, documentId, uploadEmployeeComplianceDocumentFileContainer).execute();

Upload employee compliance document

Upload an employee compliance document.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Deel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartnerManagedApi;
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
    File _file = new File("/path/to/file"); // The employee compliance document to upload.
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // Unique identifier for an employee in Deel.
    Double documentId = 1234D; // Unique identifier for a compliance document in Deel.
    try {
      UploadEmployeeComplianceDocumentContainer result = client
              .partnerManaged
              .uploadComplianceDocument(_file, employeeId, documentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#uploadComplianceDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadEmployeeComplianceDocumentContainer> response = client
              .partnerManaged
              .uploadComplianceDocument(_file, employeeId, documentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#uploadComplianceDocument");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **documentId** | **Double**| Unique identifier for a compliance document in Deel. | |
| **uploadEmployeeComplianceDocumentFileContainer** | [**UploadEmployeeComplianceDocumentFileContainer**](UploadEmployeeComplianceDocumentFileContainer.md)| The employee compliance document data to upload. | |

### Return type

[**UploadEmployeeComplianceDocumentContainer**](UploadEmployeeComplianceDocumentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

