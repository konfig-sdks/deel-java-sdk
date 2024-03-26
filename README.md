<div align="left">

[![Visit Deel](./header.png)](https://deel.com)

# [Deel](https://deel.com)

API specification for Deel HR user provisioning API. This YAML file is a preview of the API Deel is building. We are looking forward to your feedback.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Deel&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>deel-java-sdk</artifactId>
  <version>1.25.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:deel-java-sdk:1.25.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/deel-java-sdk-1.25.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.letsdeel.com/rest/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountingApi* | [**getDeelInvoices**](docs/AccountingApi.md#getDeelInvoices) | **GET** /invoices/deel | Retrieve Deel invoices
*AccountingApi* | [**getInvoicePdfDownloadLink**](docs/AccountingApi.md#getInvoicePdfDownloadLink) | **GET** /invoices/{invoice_id}/download | Download invoice PDF
*AccountingApi* | [**getPaidInvoices**](docs/AccountingApi.md#getPaidInvoices) | **GET** /invoices | Retrieve invoices
*AccountingApi* | [**getPaymentBreakdown**](docs/AccountingApi.md#getPaymentBreakdown) | **GET** /payments/{payment_id}/breakdown | Retrieve a payment breakdown
*AccountingApi* | [**getPaymentReceipts**](docs/AccountingApi.md#getPaymentReceipts) | **GET** /payments | Retrieve payment reciepts
*AdjustmentsApi* | [**createNewAdjustment**](docs/AdjustmentsApi.md#createNewAdjustment) | **POST** /adjustments | Create a new adjustment
*AdjustmentsApi* | [**getAll**](docs/AdjustmentsApi.md#getAll) | **GET** /contracts/{contract_id}/adjustments | Retrieve adjustments
*AdjustmentsApi* | [**getById**](docs/AdjustmentsApi.md#getById) | **GET** /adjustments/{adjustment_id} | Retrieve an adjustment
*AdjustmentsApi* | [**getCategories**](docs/AdjustmentsApi.md#getCategories) | **GET** /adjustments/categories | Retrieve categories
*AdjustmentsApi* | [**removeAdjustment**](docs/AdjustmentsApi.md#removeAdjustment) | **DELETE** /adjustments/{adjustment_id} | Delete an adjustment
*AdjustmentsApi* | [**updateAdjustment**](docs/AdjustmentsApi.md#updateAdjustment) | **PATCH** /adjustments/{adjustment_id} | Update an adjustment
*AttachmentsApi* | [**uploadDeelFile**](docs/AttachmentsApi.md#uploadDeelFile) | **POST** /attachments | Upload file to Deel
*CandidatesApi* | [**addCandidateToDeel**](docs/CandidatesApi.md#addCandidateToDeel) | **POST** /candidates | Add Candidate
*CandidatesApi* | [**updateCandidateById**](docs/CandidatesApi.md#updateCandidateById) | **PATCH** /candidates/{candidate_id} | Update Candidate
*ContractorsApi* | [**amendContractDetails**](docs/ContractorsApi.md#amendContractDetails) | **POST** /contracts/{contract_id}/amendments | Amend contract
*ContractorsApi* | [**createNewDeelContract**](docs/ContractorsApi.md#createNewDeelContract) | **POST** /contracts | Create a new contract
*ContractorsApi* | [**createNewFixedRateContract**](docs/ContractorsApi.md#createNewFixedRateContract) | **POST** /contracts/fixed-rate | Create a new contract (fixed-rate)
*ContractorsApi* | [**createNewMilestoneContract**](docs/ContractorsApi.md#createNewMilestoneContract) | **POST** /contracts/milestone-based | Create a new contract (milestone-based)
*ContractorsApi* | [**createNewTaskBasedContract**](docs/ContractorsApi.md#createNewTaskBasedContract) | **POST** /contracts/task-based | Create a new contract (task-based)
*ContractorsApi* | [**createNewTimeBasedContract**](docs/ContractorsApi.md#createNewTimeBasedContract) | **POST** /contracts/time-based | Create a new contract (time-based)
*ContractorsApi* | [**getContractPreview**](docs/ContractorsApi.md#getContractPreview) | **GET** /contracts/{contract_id}/preview | Preview a contract agreement
*ContractorsApi* | [**removePremium**](docs/ContractorsApi.md#removePremium) | **DELETE** /contracts/{contract_id}/premium | Downgrade from Premium
*ContractorsApi* | [**terminateContract**](docs/ContractorsApi.md#terminateContract) | **POST** /contracts/{contract_id}/terminations | Terminate contract
*ContractorsApi* | [**upgradeToPremium**](docs/ContractorsApi.md#upgradeToPremium) | **POST** /contracts/{contract_id}/premium | Upgrade to Premium
*ContractsApi* | [**addExternalId**](docs/ContractsApi.md#addExternalId) | **PATCH** /contracts/{contract_id} | External Id
*ContractsApi* | [**archiveContract**](docs/ContractsApi.md#archiveContract) | **PATCH** /contracts/{contract_id}/archive | Archive a contract
*ContractsApi* | [**attachFileToDocument**](docs/ContractsApi.md#attachFileToDocument) | **POST** /contracts/{contract_id}/documents | Attach a file to contract
*ContractsApi* | [**calculateFinalPaymentAmount**](docs/ContractsApi.md#calculateFinalPaymentAmount) | **GET** /contracts/{contract_id}/final-payments | Calculate final payment
*ContractsApi* | [**calculateFirstPaymentAmount**](docs/ContractsApi.md#calculateFirstPaymentAmount) | **POST** /contracts/estimate | Calculate first payment amount
*ContractsApi* | [**clientSignContract**](docs/ContractsApi.md#clientSignContract) | **POST** /contracts/{contract_id}/signatures | Sign a contract
*ContractsApi* | [**editFileAttachment**](docs/ContractsApi.md#editFileAttachment) | **PUT** /contracts/{contract_id}/documents | Edit the file attached to contract document.
*ContractsApi* | [**findEmailsById**](docs/ContractsApi.md#findEmailsById) | **GET** /contracts/{contract_id}/alternate_emails | Find contract emails by ID
*ContractsApi* | [**getList**](docs/ContractsApi.md#getList) | **GET** /contracts | List of contracts
*ContractsApi* | [**getList_0**](docs/ContractsApi.md#getList_0) | **GET** /contract-templates | Get contract templates
*ContractsApi* | [**getSingleContract**](docs/ContractsApi.md#getSingleContract) | **GET** /contracts/{contract_id} | Retrieve a single contract
*ContractsApi* | [**inviteWorkerToSign**](docs/ContractsApi.md#inviteWorkerToSign) | **POST** /contracts/{contract_id}/invitations | Send contract to worker
*ContractsApi* | [**removeInvite**](docs/ContractsApi.md#removeInvite) | **DELETE** /contracts/{contract_id}/invitations | Remove invite
*EorApi* | [**calculateEmployeeCosts**](docs/EorApi.md#calculateEmployeeCosts) | **POST** /eor/employment_cost | Employee Cost Calculator
*EorApi* | [**createContractQuote**](docs/EorApi.md#createContractQuote) | **POST** /eor | Create an EOR contract
*EorApi* | [**getContractBenefits**](docs/EorApi.md#getContractBenefits) | **GET** /eor/{contract_id}/benefits | Get EOR contract benefits
*EorApi* | [**getCountryGuide**](docs/EorApi.md#getCountryGuide) | **GET** /eor/validations/{country_code} | Retrieve country guide
*EorApi* | [**getEmployeePayslips**](docs/EorApi.md#getEmployeePayslips) | **GET** /eor/workers/{worker_id}/payslips | Retrieve employee payslips
*EorApi* | [**getPayslipDownload**](docs/EorApi.md#getPayslipDownload) | **GET** /eor/workers/{worker_id}/payslips/{payslip_id}/download | Download payslip PDF
*GlobalPayrollApi* | [**addBankAccount**](docs/GlobalPayrollApi.md#addBankAccount) | **POST** /gp/workers/{worker_id}/banks | Add bank account
*GlobalPayrollApi* | [**createContractGp**](docs/GlobalPayrollApi.md#createContractGp) | **POST** /contracts/gp | Create a contract
*GlobalPayrollApi* | [**downloadGrossToNetGpReport**](docs/GlobalPayrollApi.md#downloadGrossToNetGpReport) | **GET** /gp/reports/{gp_report_id}/gross_to_net/csv | Download gross-to-net report
*GlobalPayrollApi* | [**getBankAccounts**](docs/GlobalPayrollApi.md#getBankAccounts) | **GET** /gp/workers/{worker_id}/banks | Retrieve bank accounts
*GlobalPayrollApi* | [**getBankGuide**](docs/GlobalPayrollApi.md#getBankGuide) | **GET** /gp/workers/{worker_id}/banks/guide | Retrieve bank guide
*GlobalPayrollApi* | [**getGrossToNetGpReport**](docs/GlobalPayrollApi.md#getGrossToNetGpReport) | **GET** /gp/reports/{gp_report_id}/gross_to_net | List gross-to-net report
*GlobalPayrollApi* | [**getPayslipDownloadUrl**](docs/GlobalPayrollApi.md#getPayslipDownloadUrl) | **GET** /gp/workers/{worker_id}/payslips/{payslip_id}/download | Download payslip PDF
*GlobalPayrollApi* | [**getPayslips**](docs/GlobalPayrollApi.md#getPayslips) | **GET** /gp/workers/{worker_id}/payslips | Retrieve employee payslips
*GlobalPayrollApi* | [**listPayrollEventsByLegalEntity**](docs/GlobalPayrollApi.md#listPayrollEventsByLegalEntity) | **GET** /gp/legal-entities/{legal_entity_id}/reports | List payroll events by legal entity
*GlobalPayrollApi* | [**modifyBankAccount**](docs/GlobalPayrollApi.md#modifyBankAccount) | **PATCH** /gp/workers/{worker_id}/banks/{bank_id} | Modify bank account
*GlobalPayrollApi* | [**requestTerminationProcess**](docs/GlobalPayrollApi.md#requestTerminationProcess) | **POST** /gp/workers/{worker_id}/terminations | Request termination
*GlobalPayrollApi* | [**updateCompensationHistory**](docs/GlobalPayrollApi.md#updateCompensationHistory) | **PATCH** /gp/workers/{worker_id}/compensation | Update compensation
*GlobalPayrollApi* | [**updateEmployeeInformation**](docs/GlobalPayrollApi.md#updateEmployeeInformation) | **PATCH** /gp/workers/{worker_id}/employee-information | Update employee information
*GlobalPayrollApi* | [**updatePtoPolicy**](docs/GlobalPayrollApi.md#updatePtoPolicy) | **PATCH** /gp/workers/{worker_id}/pto-policy | Update PTO policy
*GlobalPayrollApi* | [**updateWorkerAddress**](docs/GlobalPayrollApi.md#updateWorkerAddress) | **PATCH** /gp/workers/{worker_id}/address | Update address
*InvoicesApi* | [**createAdjustment**](docs/InvoicesApi.md#createAdjustment) | **POST** /invoice-adjustments | Create an invoice adjustment
*InvoicesApi* | [**deleteAdjustment**](docs/InvoicesApi.md#deleteAdjustment) | **DELETE** /invoice-adjustments/{invoice_adjustment_id} | Delete an invoice adjustment
*InvoicesApi* | [**getAttachmentFileUrl**](docs/InvoicesApi.md#getAttachmentFileUrl) | **GET** /invoice-adjustments/{invoice_adjustment_id}/attachment | Retrieve Attachment file url.
*InvoicesApi* | [**getLineItemsByContract**](docs/InvoicesApi.md#getLineItemsByContract) | **GET** /contracts/{contract_id}/invoice-adjustments | Invoice line items by contract
*InvoicesApi* | [**listInvoiceAdjustments**](docs/InvoicesApi.md#listInvoiceAdjustments) | **GET** /invoice-adjustments | List invoice adjustments
*InvoicesApi* | [**reviewMultiple**](docs/InvoicesApi.md#reviewMultiple) | **POST** /invoice-adjustments/many/reviews | Bulk review invoice adjustments
*InvoicesApi* | [**submitAdjustmentReview**](docs/InvoicesApi.md#submitAdjustmentReview) | **POST** /invoice-adjustments/{invoice_adjustment_id}/reviews | Review an invoice adjustment
*InvoicesApi* | [**updateAdjustmentById**](docs/InvoicesApi.md#updateAdjustmentById) | **PATCH** /invoice-adjustments/{invoice_adjustment_id} | Update an invoice adjustment
*LookupsApi* | [**getCountryList**](docs/LookupsApi.md#getCountryList) | **GET** /lookups/countries | Country list
*LookupsApi* | [**getCurrenciesList**](docs/LookupsApi.md#getCurrenciesList) | **GET** /lookups/currencies | Currency list
*LookupsApi* | [**getJobTitlesList**](docs/LookupsApi.md#getJobTitlesList) | **GET** /lookups/job-titles | Job titles list
*LookupsApi* | [**getSeniorityLevels**](docs/LookupsApi.md#getSeniorityLevels) | **GET** /lookups/seniorities | Seniority levels
*LookupsApi* | [**getTimeOffTypes**](docs/LookupsApi.md#getTimeOffTypes) | **GET** /lookups/time-off-types | Time-off types
*ManagersApi* | [**createNewManager**](docs/ManagersApi.md#createNewManager) | **POST** /managers | Create a manager
*ManagersApi* | [**list**](docs/ManagersApi.md#list) | **GET** /managers | List of managers
*MilestonesApi* | [**createNewMilestone**](docs/MilestonesApi.md#createNewMilestone) | **POST** /contracts/{contract_id}/milestones | Create a milestone
*MilestonesApi* | [**createReview**](docs/MilestonesApi.md#createReview) | **POST** /contracts/{contract_id}/milestones/{milestone_id}/reviews | Review a single milestone
*MilestonesApi* | [**deleteSingleMilestone**](docs/MilestonesApi.md#deleteSingleMilestone) | **DELETE** /contracts/{contract_id}/milestones/{milestone_id} | Delete a milestone
*MilestonesApi* | [**getSingleMilestone**](docs/MilestonesApi.md#getSingleMilestone) | **GET** /contracts/{contract_id}/milestones/{milestone_id} | Retrieve a single milestone
*MilestonesApi* | [**listByContract**](docs/MilestonesApi.md#listByContract) | **GET** /contracts/{contract_id}/milestones | List of milestones by contract
*MilestonesApi* | [**reviewMultiple**](docs/MilestonesApi.md#reviewMultiple) | **POST** /contracts/{contract_id}/milestones/many/reviews | Review multiple milestones
*OffCyclePaymentsApi* | [**addPaymentInvoice**](docs/OffCyclePaymentsApi.md#addPaymentInvoice) | **POST** /contracts/{contract_id}/off-cycle-payments | Add off-cycle payment
*OffCyclePaymentsApi* | [**getList**](docs/OffCyclePaymentsApi.md#getList) | **GET** /contracts/{contract_id}/off-cycle-payments | List of off-cycle payments
*OffCyclePaymentsApi* | [**getSinglePayment**](docs/OffCyclePaymentsApi.md#getSinglePayment) | **GET** /contracts/{contract_id}/off-cycle-payments/{offcycle_payment_id} | Retrieve a single off-cycle payment
*OrganizationsApi* | [**getDepartmentList**](docs/OrganizationsApi.md#getDepartmentList) | **GET** /departments | Retrieve departments
*OrganizationsApi* | [**getDetails**](docs/OrganizationsApi.md#getDetails) | **GET** /organizations | Get current organization
*OrganizationsApi* | [**getLegalEntitiesList**](docs/OrganizationsApi.md#getLegalEntitiesList) | **GET** /legal-entities | List of legal entities
*OrganizationsApi* | [**getTeamList**](docs/OrganizationsApi.md#getTeamList) | **GET** /teams | Get team list
*OrganizationsApi* | [**getWorkingLocations**](docs/OrganizationsApi.md#getWorkingLocations) | **GET** /working-locations | Retrieve working locations
*OrganizationsApi* | [**listAgreementsWithDeel**](docs/OrganizationsApi.md#listAgreementsWithDeel) | **GET** /agreements | Get agreements with Deel.
*PartnerManagedApi* | [**addAdditionalInformationForEorEmployee**](docs/PartnerManagedApi.md#addAdditionalInformationForEorEmployee) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/additional-information | Add additional information
*PartnerManagedApi* | [**addBankAccountForEorEmployee**](docs/PartnerManagedApi.md#addBankAccountForEorEmployee) | **POST** /partner-managed/employees/{employee_id}/banks | Add bank account
*PartnerManagedApi* | [**downloadComplianceDocumentTemplate**](docs/PartnerManagedApi.md#downloadComplianceDocumentTemplate) | **GET** /partner-managed/employees/{employee_id}/compliance-documents/{document_id}/templates/download | Download employee compliance document template
*PartnerManagedApi* | [**downloadEmployeeAgreementPdf**](docs/PartnerManagedApi.md#downloadEmployeeAgreementPdf) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/employee-agreement/download | Download employee agreement PDF
*PartnerManagedApi* | [**downloadHrVerificationLettersAndDocuments**](docs/PartnerManagedApi.md#downloadHrVerificationLettersAndDocuments) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/hr-documents/{document_id}/download | Download HR verification letters and documents
*PartnerManagedApi* | [**getBankGuideForEorEmployee**](docs/PartnerManagedApi.md#getBankGuideForEorEmployee) | **GET** /partner-managed/employees/{employee_id}/banks/guide | Bank account form
*PartnerManagedApi* | [**getEmployeeAgreementHtml**](docs/PartnerManagedApi.md#getEmployeeAgreementHtml) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/employee-agreement | Preview employee agreement
*PartnerManagedApi* | [**listEmployeeComplianceDocuments**](docs/PartnerManagedApi.md#listEmployeeComplianceDocuments) | **GET** /partner-managed/employees/{employee_id}/compliance-documents | List of employee compliance documents
*PartnerManagedApi* | [**listHrVerificationLettersAndDocuments**](docs/PartnerManagedApi.md#listHrVerificationLettersAndDocuments) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/hr-documents | List HR verification letters and documents
*PartnerManagedApi* | [**listPayslipsForEorEmployee**](docs/PartnerManagedApi.md#listPayslipsForEorEmployee) | **GET** /partner-managed/employees/{employee_id}/payslips | Get list of payslips for an EOR employee
*PartnerManagedApi* | [**listTaxDocumentsForEmployee**](docs/PartnerManagedApi.md#listTaxDocumentsForEmployee) | **GET** /partner-managed/employees/{employee_id}/tax-documents | List of tax documents for an employee
*PartnerManagedApi* | [**modifyBankAccountForEorEmployee**](docs/PartnerManagedApi.md#modifyBankAccountForEorEmployee) | **PATCH** /partner-managed/employees/{employee_id}/banks/{bank_id} | Modify bank account for an EOR employee
*PartnerManagedApi* | [**previewJobOfferLetter**](docs/PartnerManagedApi.md#previewJobOfferLetter) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/offer-letter | Preview job offer letter
*PartnerManagedApi* | [**requestCustomVerificationLetter**](docs/PartnerManagedApi.md#requestCustomVerificationLetter) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/custom-verification-letter | Request custom verification letter
*PartnerManagedApi* | [**signContract**](docs/PartnerManagedApi.md#signContract) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/signatures | Sign a contract
*PartnerManagedApi* | [**uploadComplianceDocument**](docs/PartnerManagedApi.md#uploadComplianceDocument) | **POST** /partner-managed/employees/{employee_id}/compliance-documents/{document_id} | Upload employee compliance document
*PeopleApi* | [**addTimeOffRequest**](docs/PeopleApi.md#addTimeOffRequest) | **POST** /people/{worker_id}/time-offs | Add a time off request
*PeopleApi* | [**createDirectEmployee**](docs/PeopleApi.md#createDirectEmployee) | **POST** /hris/direct-employees | Create a new Hris direct employee
*PeopleApi* | [**deleteTimeOffRequest**](docs/PeopleApi.md#deleteTimeOffRequest) | **DELETE** /people/{worker_id}/time-offs/{timeoff_id} | Delete a time off request
*PeopleApi* | [**editTimeOffRequest**](docs/PeopleApi.md#editTimeOffRequest) | **PATCH** /people/{worker_id}/time-offs/{timeoff_id} | Edit a time off request
*PeopleApi* | [**getCurrentProfile**](docs/PeopleApi.md#getCurrentProfile) | **GET** /people/me | Get my current profile
*PeopleApi* | [**getList**](docs/PeopleApi.md#getList) | **GET** /internal/people | Get internal people list
*PeopleApi* | [**getList_0**](docs/PeopleApi.md#getList_0) | **GET** /people | List of people
*PeopleApi* | [**getPerson**](docs/PeopleApi.md#getPerson) | **GET** /people/{worker_id} | Retrieve a single person
*PeopleApi* | [**listTimeOffEntitlements**](docs/PeopleApi.md#listTimeOffEntitlements) | **GET** /people/{worker_id}/time-offs/entitlements | List of time off entitlements
*PeopleApi* | [**listTimeOffPolicies**](docs/PeopleApi.md#listTimeOffPolicies) | **GET** /people/{worker_id}/time-offs/policies | List of time off policies
*PeopleApi* | [**listTimeOffsByWorkerId**](docs/PeopleApi.md#listTimeOffsByWorkerId) | **GET** /people/{worker_id}/time-offs | List of time off entries
*PeopleApi* | [**reviewTimeOff**](docs/PeopleApi.md#reviewTimeOff) | **PATCH** /people/{worker_id}/time-offs/{timeoff_id}/review | Review a time off request
*PeopleApi* | [**updateDepartment**](docs/PeopleApi.md#updateDepartment) | **PUT** /people/{worker_id}/department | Update department
*PeopleApi* | [**updateWorkingLocation**](docs/PeopleApi.md#updateWorkingLocation) | **PUT** /people/{worker_id}/working-location | Update working location
*ServiceProviderConfigApi* | [**getDetails**](docs/ServiceProviderConfigApi.md#getDetails) | **GET** /ServiceProviderConfig | Get service provider config
*TasksApi* | [**createNewTask**](docs/TasksApi.md#createNewTask) | **POST** /contracts/{contract_id}/tasks | Create new task
*TasksApi* | [**deleteFromContract**](docs/TasksApi.md#deleteFromContract) | **DELETE** /contracts/{contract_id}/tasks/{task_id} | Delete task
*TasksApi* | [**getContractTasks**](docs/TasksApi.md#getContractTasks) | **GET** /contracts/{contract_id}/tasks | List of tasks
*TasksApi* | [**reviewManyTasks**](docs/TasksApi.md#reviewManyTasks) | **POST** /contracts/{contract_id}/tasks/many/reviews | Review multiple tasks
*TasksApi* | [**submitTaskReview**](docs/TasksApi.md#submitTaskReview) | **POST** /contracts/{contract_id}/tasks/{task_id}/reviews | Review a single task
*TimeOffApi* | [**addRequestObsolete**](docs/TimeOffApi.md#addRequestObsolete) | **POST** /contracts/{contract_id}/time-offs | Add a time off request (obsolete)
*TimeOffApi* | [**cancelRequestObsolete**](docs/TimeOffApi.md#cancelRequestObsolete) | **DELETE** /contracts/{contract_id}/time-offs/{timeoff_id} | Cancel a time off request (obsolete)
*TimeOffApi* | [**editRequestObsolete**](docs/TimeOffApi.md#editRequestObsolete) | **PUT** /contracts/{contract_id}/time-offs/{timeoff_id} | Edit a time off request (obsolete)
*TimeOffApi* | [**getAllObsolete**](docs/TimeOffApi.md#getAllObsolete) | **GET** /time-offs | List of time offs (obsolete)
*TimeOffApi* | [**getTimeOffTypes**](docs/TimeOffApi.md#getTimeOffTypes) | **GET** /lookups/time-off-types | Time-off types
*TimeOffApi* | [**listByContract**](docs/TimeOffApi.md#listByContract) | **GET** /contracts/{contract_id}/time-offs | List time off by contract (obsolete)
*TimeOffApi* | [**listEntitlements**](docs/TimeOffApi.md#listEntitlements) | **GET** /contracts/{contract_id}/entitlements | List time off entitlements (obsolete)
*TimeOffApi* | [**manageRequest**](docs/TimeOffApi.md#manageRequest) | **PATCH** /time-offs/{timeoff_id}/review | Review a time off request (obsolete)
*TimesheetsApi* | [**deleteEntry**](docs/TimesheetsApi.md#deleteEntry) | **DELETE** /timesheets/{timesheet_id} | Delete a timesheet entry
*TimesheetsApi* | [**getList**](docs/TimesheetsApi.md#getList) | **GET** /timesheets | List of timesheets
*TimesheetsApi* | [**getSingleEntry**](docs/TimesheetsApi.md#getSingleEntry) | **GET** /timesheets/{timesheet_id} | Retrieve a single timesheet entry
*TimesheetsApi* | [**listByContract**](docs/TimesheetsApi.md#listByContract) | **GET** /contracts/{contract_id}/timesheets | List of timesheets by contract
*TimesheetsApi* | [**reviewMultiple**](docs/TimesheetsApi.md#reviewMultiple) | **POST** /timesheets/many/reviews | Review multiple timesheets
*TimesheetsApi* | [**reviewSingleTimesheet**](docs/TimesheetsApi.md#reviewSingleTimesheet) | **POST** /timesheets/{timesheet_id}/reviews | Review a single timesheet
*TimesheetsApi* | [**submitWorkForContractor**](docs/TimesheetsApi.md#submitWorkForContractor) | **POST** /timesheets | Create a timesheet entry
*TimesheetsApi* | [**updateEntry**](docs/TimesheetsApi.md#updateEntry) | **PATCH** /timesheets/{timesheet_id} | Update a timesheet entry
*TokenApi* | [**createPublicToken**](docs/TokenApi.md#createPublicToken) | **POST** /public-tokens | Create a public token
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /Users | Create a user
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /Users/{id} | Delete a user
*UserApi* | [**getById**](docs/UserApi.md#getById) | **GET** /Users/{id} | Retrieve a single User
*UserApi* | [**listDeelUsers**](docs/UserApi.md#listDeelUsers) | **GET** /Users | List users
*UserApi* | [**partiallyUpdateUser**](docs/UserApi.md#partiallyUpdateUser) | **PATCH** /Users/{id} | Partially update/patch a user
*UserApi* | [**searchOrList**](docs/UserApi.md#searchOrList) | **POST** /Users/.search | Search or list users
*UserApi* | [**updateUserById**](docs/UserApi.md#updateUserById) | **PUT** /Users/{id} | Fully update/replace a user
*WebhooksApi* | [**createSubscription**](docs/WebhooksApi.md#createSubscription) | **POST** /webhooks | Create a webhook
*WebhooksApi* | [**deleteById**](docs/WebhooksApi.md#deleteById) | **DELETE** /webhooks/{id} | Delete a webhook
*WebhooksApi* | [**editById**](docs/WebhooksApi.md#editById) | **PATCH** /webhooks/{id} | Edit a webhook
*WebhooksApi* | [**getById**](docs/WebhooksApi.md#getById) | **GET** /webhooks/{id} | Retrieve a single webhook
*WebhooksApi* | [**listEventTypes**](docs/WebhooksApi.md#listEventTypes) | **GET** /webhooks/events/types | List of webhook event types
*WebhooksApi* | [**listWebhookSubscriptions**](docs/WebhooksApi.md#listWebhookSubscriptions) | **GET** /webhooks | List of webhooks


## Documentation for Models

 - [AddWorkerBankAccountContainer](docs/AddWorkerBankAccountContainer.md)
 - [AdditionalEORInfoContainer](docs/AdditionalEORInfoContainer.md)
 - [Address](docs/Address.md)
 - [AdjustmentCategory](docs/AdjustmentCategory.md)
 - [AdjustmentCreatedContainer](docs/AdjustmentCreatedContainer.md)
 - [AdjustmentStatusEnum](docs/AdjustmentStatusEnum.md)
 - [AdjustmentToCreate](docs/AdjustmentToCreate.md)
 - [AdjustmentToCreateContainer](docs/AdjustmentToCreateContainer.md)
 - [AdjustmentToUpdate](docs/AdjustmentToUpdate.md)
 - [AdjustmentToUpdateContainer](docs/AdjustmentToUpdateContainer.md)
 - [AdjustmentsCategoriesContainer](docs/AdjustmentsCategoriesContainer.md)
 - [AdjustmentsContainer](docs/AdjustmentsContainer.md)
 - [AdminUser](docs/AdminUser.md)
 - [AdminUserCreateContainer](docs/AdminUserCreateContainer.md)
 - [AdminUserCreateRequest](docs/AdminUserCreateRequest.md)
 - [AdminUsersContainer](docs/AdminUsersContainer.md)
 - [Agreement](docs/Agreement.md)
 - [AgreementClientLegalEntity](docs/AgreementClientLegalEntity.md)
 - [AgreementListContainer](docs/AgreementListContainer.md)
 - [AgreementMsa](docs/AgreementMsa.md)
 - [AgreementProviderLegalEntity](docs/AgreementProviderLegalEntity.md)
 - [AgreementsSearchForm](docs/AgreementsSearchForm.md)
 - [AlternateEmailItem](docs/AlternateEmailItem.md)
 - [ApiError](docs/ApiError.md)
 - [ApiErrorRequest](docs/ApiErrorRequest.md)
 - [AttachmentFileRef](docs/AttachmentFileRef.md)
 - [AuthenticationScheme](docs/AuthenticationScheme.md)
 - [AuthenticationSchemes](docs/AuthenticationSchemes.md)
 - [BankAccountAdded](docs/BankAccountAdded.md)
 - [BankAccountAddedContainer](docs/BankAccountAddedContainer.md)
 - [BankAccountGuide](docs/BankAccountGuide.md)
 - [BankAccountGuideContainer](docs/BankAccountGuideContainer.md)
 - [BankAccountStatus](docs/BankAccountStatus.md)
 - [BankAccountToAddContainer](docs/BankAccountToAddContainer.md)
 - [BankAccountToAddInner](docs/BankAccountToAddInner.md)
 - [BankAccountUpdated](docs/BankAccountUpdated.md)
 - [BankAccountUpdatedContainer](docs/BankAccountUpdatedContainer.md)
 - [BankAccountValueAllowed](docs/BankAccountValueAllowed.md)
 - [BankGuide](docs/BankGuide.md)
 - [BankGuideValidations](docs/BankGuideValidations.md)
 - [BankGuideValuesAllowedInner](docs/BankGuideValuesAllowedInner.md)
 - [BasicContract](docs/BasicContract.md)
 - [BasicInvoiceAdjustment](docs/BasicInvoiceAdjustment.md)
 - [BasicInvoiceAdjustmentPaymentCycle](docs/BasicInvoiceAdjustmentPaymentCycle.md)
 - [BasicInvoiceAdjustmentReportedBy](docs/BasicInvoiceAdjustmentReportedBy.md)
 - [BasicInvoiceAdjustmentReviewedBy](docs/BasicInvoiceAdjustmentReviewedBy.md)
 - [BasicInvoiceAdjustmentWorksheet](docs/BasicInvoiceAdjustmentWorksheet.md)
 - [BasicLegalEntity](docs/BasicLegalEntity.md)
 - [BasicOrganization](docs/BasicOrganization.md)
 - [BasicTeam](docs/BasicTeam.md)
 - [BasicTimesheet](docs/BasicTimesheet.md)
 - [BasicTimesheetContract](docs/BasicTimesheetContract.md)
 - [BasicTimesheetPaymentCycle](docs/BasicTimesheetPaymentCycle.md)
 - [BasicTimesheetReportedBy](docs/BasicTimesheetReportedBy.md)
 - [BasicTimesheetReviewedBy](docs/BasicTimesheetReviewedBy.md)
 - [BasicTimesheetWorksheet](docs/BasicTimesheetWorksheet.md)
 - [BenefitContributionStatusEnum](docs/BenefitContributionStatusEnum.md)
 - [BenefitContributionTypeEnum](docs/BenefitContributionTypeEnum.md)
 - [BenefitQuote](docs/BenefitQuote.md)
 - [BenefitStatusEnum](docs/BenefitStatusEnum.md)
 - [BreakdownCostsQuote](docs/BreakdownCostsQuote.md)
 - [BreakdownCostsQuoteMonthly](docs/BreakdownCostsQuoteMonthly.md)
 - [BulkSupported](docs/BulkSupported.md)
 - [CandidateStatusEnum](docs/CandidateStatusEnum.md)
 - [CandidateToCreate](docs/CandidateToCreate.md)
 - [CandidateToCreateContainer](docs/CandidateToCreateContainer.md)
 - [CandidateToPatch](docs/CandidateToPatch.md)
 - [CandidateToPatchContainer](docs/CandidateToPatchContainer.md)
 - [ClientLegalEntity](docs/ClientLegalEntity.md)
 - [ClientOfBasicContract](docs/ClientOfBasicContract.md)
 - [ClientOfContract](docs/ClientOfContract.md)
 - [CompensationDetailsOfContract](docs/CompensationDetailsOfContract.md)
 - [CompensationDetailsOfContractToCreateOngoingTimeBased](docs/CompensationDetailsOfContractToCreateOngoingTimeBased.md)
 - [CompensationDetailsOfContractToCreatePayAsYouGoTimeBased](docs/CompensationDetailsOfContractToCreatePayAsYouGoTimeBased.md)
 - [CompensationDetailsOfContractToCreateShared](docs/CompensationDetailsOfContractToCreateShared.md)
 - [Contract](docs/Contract.md)
 - [ContractAmendmentSentToClient](docs/ContractAmendmentSentToClient.md)
 - [ContractContainer](docs/ContractContainer.md)
 - [ContractContainerOngoingTimeBased](docs/ContractContainerOngoingTimeBased.md)
 - [ContractContainerPayAsYouGoTimeBased](docs/ContractContainerPayAsYouGoTimeBased.md)
 - [ContractContainerPaygMilestones](docs/ContractContainerPaygMilestones.md)
 - [ContractContainerPaygTasks](docs/ContractContainerPaygTasks.md)
 - [ContractCustomField](docs/ContractCustomField.md)
 - [ContractDetailsToAmend](docs/ContractDetailsToAmend.md)
 - [ContractDocumentContainer](docs/ContractDocumentContainer.md)
 - [ContractExternalIdPatchedContainer](docs/ContractExternalIdPatchedContainer.md)
 - [ContractExternalIdToPatch](docs/ContractExternalIdToPatch.md)
 - [ContractFirstSignEnum](docs/ContractFirstSignEnum.md)
 - [ContractInvitationToCreate](docs/ContractInvitationToCreate.md)
 - [ContractInvitationToCreateContainer](docs/ContractInvitationToCreateContainer.md)
 - [ContractListContainer](docs/ContractListContainer.md)
 - [ContractSearchFormWithCursor](docs/ContractSearchFormWithCursor.md)
 - [ContractSearchFormWithoutCursor](docs/ContractSearchFormWithoutCursor.md)
 - [ContractSignatureToCreate](docs/ContractSignatureToCreate.md)
 - [ContractSignatureToCreateContainer](docs/ContractSignatureToCreateContainer.md)
 - [ContractStatusEnum](docs/ContractStatusEnum.md)
 - [ContractTemplate](docs/ContractTemplate.md)
 - [ContractTemplateListContainer](docs/ContractTemplateListContainer.md)
 - [ContractTemplateSummary](docs/ContractTemplateSummary.md)
 - [ContractTerminationResult](docs/ContractTerminationResult.md)
 - [ContractTerminationResultContainer](docs/ContractTerminationResultContainer.md)
 - [ContractToAmendDetailsContainer](docs/ContractToAmendDetailsContainer.md)
 - [ContractToCreateContainer](docs/ContractToCreateContainer.md)
 - [ContractToCreateContainerOngoingTimeBased](docs/ContractToCreateContainerOngoingTimeBased.md)
 - [ContractToCreateContainerPayAsYouGoTimeBased](docs/ContractToCreateContainerPayAsYouGoTimeBased.md)
 - [ContractToCreateContainerPaygMilestones](docs/ContractToCreateContainerPaygMilestones.md)
 - [ContractToCreateContainerPaygTasks](docs/ContractToCreateContainerPaygTasks.md)
 - [ContractToCreateOngoingTimeBased](docs/ContractToCreateOngoingTimeBased.md)
 - [ContractToCreateOngoingTimeBasedAllOf](docs/ContractToCreateOngoingTimeBasedAllOf.md)
 - [ContractToCreateOngoingTimeBasedAllOf1](docs/ContractToCreateOngoingTimeBasedAllOf1.md)
 - [ContractToCreatePayAsYouGoTimeBased](docs/ContractToCreatePayAsYouGoTimeBased.md)
 - [ContractToCreatePayAsYouGoTimeBasedAllOf](docs/ContractToCreatePayAsYouGoTimeBasedAllOf.md)
 - [ContractToCreatePayAsYouGoTimeBasedAllOf1](docs/ContractToCreatePayAsYouGoTimeBasedAllOf1.md)
 - [ContractToCreatePaygMilestones](docs/ContractToCreatePaygMilestones.md)
 - [ContractToCreatePaygMilestonesAllOf](docs/ContractToCreatePaygMilestonesAllOf.md)
 - [ContractToCreatePaygTasks](docs/ContractToCreatePaygTasks.md)
 - [ContractToCreatePaygTasksAllOf](docs/ContractToCreatePaygTasksAllOf.md)
 - [ContractToCreatePaygTasksAllOf1](docs/ContractToCreatePaygTasksAllOf1.md)
 - [ContractToCreateShared](docs/ContractToCreateShared.md)
 - [ContractToCreateSharedClient](docs/ContractToCreateSharedClient.md)
 - [ContractToCreateSharedClientLegalEntity](docs/ContractToCreateSharedClientLegalEntity.md)
 - [ContractToCreateSharedClientTeam](docs/ContractToCreateSharedClientTeam.md)
 - [ContractToCreateSharedJobTitle](docs/ContractToCreateSharedJobTitle.md)
 - [ContractToCreateSharedSeniority](docs/ContractToCreateSharedSeniority.md)
 - [ContractToCreateSharedWorker](docs/ContractToCreateSharedWorker.md)
 - [ContractToTerminate](docs/ContractToTerminate.md)
 - [ContractToTerminateContainer](docs/ContractToTerminateContainer.md)
 - [ContractTypeEnum](docs/ContractTypeEnum.md)
 - [ContractTypeEnumForEstimate](docs/ContractTypeEnumForEstimate.md)
 - [ContractTypeEnumToCreate](docs/ContractTypeEnumToCreate.md)
 - [ContractWhoReportsEnum](docs/ContractWhoReportsEnum.md)
 - [ContractsSortByEnum](docs/ContractsSortByEnum.md)
 - [Contribution](docs/Contribution.md)
 - [CostQuote](docs/CostQuote.md)
 - [Country](docs/Country.md)
 - [CountryListContainer](docs/CountryListContainer.md)
 - [CreateAdminUserResponseContainer](docs/CreateAdminUserResponseContainer.md)
 - [CreateClientUser](docs/CreateClientUser.md)
 - [CreateClientUserName](docs/CreateClientUserName.md)
 - [CreatePeopleTimeoff](docs/CreatePeopleTimeoff.md)
 - [CreatePublicToken](docs/CreatePublicToken.md)
 - [CreatePublicTokenContainer](docs/CreatePublicTokenContainer.md)
 - [CreateTimeoff](docs/CreateTimeoff.md)
 - [CreateTimeoffContainer](docs/CreateTimeoffContainer.md)
 - [CreateWebhookRequest](docs/CreateWebhookRequest.md)
 - [Currency](docs/Currency.md)
 - [CurrencyListContainer](docs/CurrencyListContainer.md)
 - [DeelInvoice](docs/DeelInvoice.md)
 - [DeelInvoiceListContainer](docs/DeelInvoiceListContainer.md)
 - [Departments](docs/Departments.md)
 - [DepartmentsContainer](docs/DepartmentsContainer.md)
 - [EORContractBenefitsContainer](docs/EORContractBenefitsContainer.md)
 - [EORContractBenefitsInner](docs/EORContractBenefitsInner.md)
 - [EORContractBenefitsInnerEnrollmentDetails](docs/EORContractBenefitsInnerEnrollmentDetails.md)
 - [EORContractBenefitsInnerEnrollmentDetailsCurrent](docs/EORContractBenefitsInnerEnrollmentDetailsCurrent.md)
 - [EORContractBenefitsInnerEnrollmentDetailsPlan](docs/EORContractBenefitsInnerEnrollmentDetailsPlan.md)
 - [EORContractBenefitsInnerEnrollmentDetailsStandard](docs/EORContractBenefitsInnerEnrollmentDetailsStandard.md)
 - [EORContractBenefitsInnerPlan](docs/EORContractBenefitsInnerPlan.md)
 - [EORContractBenefitsInnerProvider](docs/EORContractBenefitsInnerProvider.md)
 - [EORPayslipDownloadUrlContainer](docs/EORPayslipDownloadUrlContainer.md)
 - [EORPayslipsListContainer](docs/EORPayslipsListContainer.md)
 - [Email](docs/Email.md)
 - [Employee](docs/Employee.md)
 - [EmployeeAgreementDownloadContainer](docs/EmployeeAgreementDownloadContainer.md)
 - [EmployeeAgreementDownloadObject](docs/EmployeeAgreementDownloadObject.md)
 - [EmployeeContractSignatureToCreate](docs/EmployeeContractSignatureToCreate.md)
 - [EmployeeContractSignatureToCreateContainer](docs/EmployeeContractSignatureToCreateContainer.md)
 - [EmployeeDepartment](docs/EmployeeDepartment.md)
 - [EmployeeDirectManager](docs/EmployeeDirectManager.md)
 - [EmployeeDirectReportsInner](docs/EmployeeDirectReportsInner.md)
 - [EmployeeList](docs/EmployeeList.md)
 - [EmployeeListClientLegalEntity](docs/EmployeeListClientLegalEntity.md)
 - [EmployeeListContainer](docs/EmployeeListContainer.md)
 - [EmployeeListMonthlyPayment](docs/EmployeeListMonthlyPayment.md)
 - [EmployeeListPaymentsInner](docs/EmployeeListPaymentsInner.md)
 - [EmployeePayslipsList](docs/EmployeePayslipsList.md)
 - [EmployeePayslipsListContainer](docs/EmployeePayslipsListContainer.md)
 - [EmployeeTaxDocumentsList](docs/EmployeeTaxDocumentsList.md)
 - [EmployeeTaxDocumentsListContainer](docs/EmployeeTaxDocumentsListContainer.md)
 - [EmployeeTimeoffsContainer](docs/EmployeeTimeoffsContainer.md)
 - [EmployeeTimeoffsCreationContainer](docs/EmployeeTimeoffsCreationContainer.md)
 - [EmployeeTimeoffsEntitlementsContainer](docs/EmployeeTimeoffsEntitlementsContainer.md)
 - [EmployeeTimeoffsEntitlementsItem](docs/EmployeeTimeoffsEntitlementsItem.md)
 - [EmployeeTimeoffsItem](docs/EmployeeTimeoffsItem.md)
 - [EmployeeTimeoffsItemAttachmentsInner](docs/EmployeeTimeoffsItemAttachmentsInner.md)
 - [EmployeeTimeoffsItemRequester](docs/EmployeeTimeoffsItemRequester.md)
 - [EmployeeTimeoffsItemResponse](docs/EmployeeTimeoffsItemResponse.md)
 - [EmployeeTimeoffsItemResponseAttachmentsInner](docs/EmployeeTimeoffsItemResponseAttachmentsInner.md)
 - [EmployeeTimeoffsItemReviewer](docs/EmployeeTimeoffsItemReviewer.md)
 - [EmployeeTimeoffsPoliciesContainer](docs/EmployeeTimeoffsPoliciesContainer.md)
 - [EmployeeTimeoffsPoliciesItem](docs/EmployeeTimeoffsPoliciesItem.md)
 - [EmployeeTimeoffsPoliciesItemEntitlement](docs/EmployeeTimeoffsPoliciesItemEntitlement.md)
 - [Employment](docs/Employment.md)
 - [EmploymentDetail](docs/EmploymentDetail.md)
 - [EmploymentDetailTeam](docs/EmploymentDetailTeam.md)
 - [EmploymentDetailsOfContract](docs/EmploymentDetailsOfContract.md)
 - [EnterpriseUser](docs/EnterpriseUser.md)
 - [EorClientTimeoffRequests](docs/EorClientTimeoffRequests.md)
 - [EorClientTimeoffs](docs/EorClientTimeoffs.md)
 - [EorClientTimeoffsContainer](docs/EorClientTimeoffsContainer.md)
 - [EorContractCreated](docs/EorContractCreated.md)
 - [EorContractCreatedCompensationDetails](docs/EorContractCreatedCompensationDetails.md)
 - [EorContractCreatedContainer](docs/EorContractCreatedContainer.md)
 - [EorContractCreatedEmployee](docs/EorContractCreatedEmployee.md)
 - [EorContractCreatedEmployment](docs/EorContractCreatedEmployment.md)
 - [EorContractCreatedHealthPlan](docs/EorContractCreatedHealthPlan.md)
 - [EorContractToCreate](docs/EorContractToCreate.md)
 - [EorContractToCreateClient](docs/EorContractToCreateClient.md)
 - [EorContractToCreateClientTeam](docs/EorContractToCreateClientTeam.md)
 - [EorContractToCreateCompensationDetails](docs/EorContractToCreateCompensationDetails.md)
 - [EorContractToCreateContainer](docs/EorContractToCreateContainer.md)
 - [EorContractToCreateEmployee](docs/EorContractToCreateEmployee.md)
 - [EorContractToCreateEmployeeAddress](docs/EorContractToCreateEmployeeAddress.md)
 - [EorContractToCreateEmployment](docs/EorContractToCreateEmployment.md)
 - [EorContractToCreateQuoteAdditionalFields](docs/EorContractToCreateQuoteAdditionalFields.md)
 - [EorContractToCreateSeniority](docs/EorContractToCreateSeniority.md)
 - [EorCountryValidations](docs/EorCountryValidations.md)
 - [EorCountryValidationsContainer](docs/EorCountryValidationsContainer.md)
 - [EorCountryValidationsDefiniteContract](docs/EorCountryValidationsDefiniteContract.md)
 - [EorCountryValidationsHealthInsurance](docs/EorCountryValidationsHealthInsurance.md)
 - [EorCountryValidationsHoliday](docs/EorCountryValidationsHoliday.md)
 - [EorCountryValidationsPartTimeHoliday](docs/EorCountryValidationsPartTimeHoliday.md)
 - [EorCountryValidationsPartTimeProbation](docs/EorCountryValidationsPartTimeProbation.md)
 - [EorCountryValidationsPension](docs/EorCountryValidationsPension.md)
 - [EorCountryValidationsProbation](docs/EorCountryValidationsProbation.md)
 - [EorCountryValidationsSalary](docs/EorCountryValidationsSalary.md)
 - [EorCountryValidationsSickDays](docs/EorCountryValidationsSickDays.md)
 - [EorCountryValidationsWorkSchedule](docs/EorCountryValidationsWorkSchedule.md)
 - [EorCountryValidationsWorkScheduleDays](docs/EorCountryValidationsWorkScheduleDays.md)
 - [EorCountryValidationsWorkScheduleHours](docs/EorCountryValidationsWorkScheduleHours.md)
 - [EorEmployeeCostCalculationRequestBody](docs/EorEmployeeCostCalculationRequestBody.md)
 - [EorEmployeeCostCalculationRequestBodyBenefitsInner](docs/EorEmployeeCostCalculationRequestBodyBenefitsInner.md)
 - [EorEmployeeCostCalculationRequestBodyContainer](docs/EorEmployeeCostCalculationRequestBodyContainer.md)
 - [EorEmployeeCostCalculationResponse](docs/EorEmployeeCostCalculationResponse.md)
 - [EorEmployeeCostCalculationResponseAdditionalData](docs/EorEmployeeCostCalculationResponseAdditionalData.md)
 - [EorEmployeeCostCalculationResponseBenefitsDataInner](docs/EorEmployeeCostCalculationResponseBenefitsDataInner.md)
 - [EorEmployeeCostCalculationResponseContainer](docs/EorEmployeeCostCalculationResponseContainer.md)
 - [EorEmployeeCostCalculationResponseCostsInner](docs/EorEmployeeCostCalculationResponseCostsInner.md)
 - [EorEntitlementListItem](docs/EorEntitlementListItem.md)
 - [EorEntitlements](docs/EorEntitlements.md)
 - [EorEntitlementsContainer](docs/EorEntitlementsContainer.md)
 - [EorField](docs/EorField.md)
 - [EorHolidaysRolloverType](docs/EorHolidaysRolloverType.md)
 - [EorQuoteBase](docs/EorQuoteBase.md)
 - [EorQuotePayload](docs/EorQuotePayload.md)
 - [EorQuotePayloadAllOf](docs/EorQuotePayloadAllOf.md)
 - [EorTimeoffsBaseItem](docs/EorTimeoffsBaseItem.md)
 - [EorTimeoffsBaseItemReviewer](docs/EorTimeoffsBaseItemReviewer.md)
 - [EorTimeoffsContainer](docs/EorTimeoffsContainer.md)
 - [EorTimeoffsEmployeeItem](docs/EorTimeoffsEmployeeItem.md)
 - [EorTimeoffsItemContainer](docs/EorTimeoffsItemContainer.md)
 - [EstimateFirstPayment](docs/EstimateFirstPayment.md)
 - [EstimateFirstPaymentCompensationDetails](docs/EstimateFirstPaymentCompensationDetails.md)
 - [EstimateFirstPaymentContainer](docs/EstimateFirstPaymentContainer.md)
 - [ExchangeRates](docs/ExchangeRates.md)
 - [FileAttachment](docs/FileAttachment.md)
 - [FileAttachmentInfo](docs/FileAttachmentInfo.md)
 - [FileObject](docs/FileObject.md)
 - [FileRefTypeEnum](docs/FileRefTypeEnum.md)
 - [FilterSupported](docs/FilterSupported.md)
 - [FinalPaymentCalculated](docs/FinalPaymentCalculated.md)
 - [FinalPaymentCalculatedContainer](docs/FinalPaymentCalculatedContainer.md)
 - [FinalPaymentCalculatedLastCycle](docs/FinalPaymentCalculatedLastCycle.md)
 - [FirstPaymentDate](docs/FirstPaymentDate.md)
 - [GPClient](docs/GPClient.md)
 - [GPContractCreated](docs/GPContractCreated.md)
 - [GPContractCreatedClient](docs/GPContractCreatedClient.md)
 - [GPContractCreatedClientLegalEntity](docs/GPContractCreatedClientLegalEntity.md)
 - [GPContractCreatedCompensationDetails](docs/GPContractCreatedCompensationDetails.md)
 - [GPContractCreatedContainer](docs/GPContractCreatedContainer.md)
 - [GPContractCreatedEmployee](docs/GPContractCreatedEmployee.md)
 - [GPContractCreatedEmployment](docs/GPContractCreatedEmployment.md)
 - [GPContractCreatedEmploymentHolidays](docs/GPContractCreatedEmploymentHolidays.md)
 - [GPContractSalaryScaleEnum](docs/GPContractSalaryScaleEnum.md)
 - [GPContractSalaryStatusEnum](docs/GPContractSalaryStatusEnum.md)
 - [GPContractStatusTypeEnum](docs/GPContractStatusTypeEnum.md)
 - [GPContractToCreate](docs/GPContractToCreate.md)
 - [GPContractToCreateCompensationDetails](docs/GPContractToCreateCompensationDetails.md)
 - [GPContractToCreateContainer](docs/GPContractToCreateContainer.md)
 - [GPContractToCreateEmployee](docs/GPContractToCreateEmployee.md)
 - [GPContractToCreateEmployeeAddress](docs/GPContractToCreateEmployeeAddress.md)
 - [GPContractToCreateEmployment](docs/GPContractToCreateEmployment.md)
 - [GPContractToCreateEmploymentHolidays](docs/GPContractToCreateEmploymentHolidays.md)
 - [GPEmployeeAddressToUpdateContainer](docs/GPEmployeeAddressToUpdateContainer.md)
 - [GPEmployeeAddressUpdateData](docs/GPEmployeeAddressUpdateData.md)
 - [GPEmployeeAddressUpdated](docs/GPEmployeeAddressUpdated.md)
 - [GPEmployeeAddressUpdatedContainer](docs/GPEmployeeAddressUpdatedContainer.md)
 - [GPEmployeeCompensationToUpdateContainer](docs/GPEmployeeCompensationToUpdateContainer.md)
 - [GPEmployeeCompensationUpdateData](docs/GPEmployeeCompensationUpdateData.md)
 - [GPEmployeeCompensationUpdatedContainer](docs/GPEmployeeCompensationUpdatedContainer.md)
 - [GPEmployeeCompensationUpdatedInner](docs/GPEmployeeCompensationUpdatedInner.md)
 - [GPEmployeeInformationToUpdateContainer](docs/GPEmployeeInformationToUpdateContainer.md)
 - [GPEmployeeInformationUpdateData](docs/GPEmployeeInformationUpdateData.md)
 - [GPEmployeeInformationUpdatedContainer](docs/GPEmployeeInformationUpdatedContainer.md)
 - [GPEmployeePTOToUpdateContainer](docs/GPEmployeePTOToUpdateContainer.md)
 - [GPEmployeePTOUpdateData](docs/GPEmployeePTOUpdateData.md)
 - [GPPayrollEventReportContainer](docs/GPPayrollEventReportContainer.md)
 - [GPPayrollEventReportsInner](docs/GPPayrollEventReportsInner.md)
 - [GPPayslipDownloadUrlContainer](docs/GPPayslipDownloadUrlContainer.md)
 - [GPPayslipsListContainer](docs/GPPayslipsListContainer.md)
 - [GenericReportReviewCreated](docs/GenericReportReviewCreated.md)
 - [GenericReportReviewCreatedContainer](docs/GenericReportReviewCreatedContainer.md)
 - [GenericResultCreated](docs/GenericResultCreated.md)
 - [GenericResultCreatedData](docs/GenericResultCreatedData.md)
 - [GenericResultCreatedWithId](docs/GenericResultCreatedWithId.md)
 - [GenericResultCreatedWithIdData](docs/GenericResultCreatedWithIdData.md)
 - [GenericResultDeleted](docs/GenericResultDeleted.md)
 - [GenericResultDeletedData](docs/GenericResultDeletedData.md)
 - [GenericResultUpdated](docs/GenericResultUpdated.md)
 - [GenericResultUpdatedData](docs/GenericResultUpdatedData.md)
 - [GetEmployeeComplianceDocumentTemplateDownloadLinkContainer](docs/GetEmployeeComplianceDocumentTemplateDownloadLinkContainer.md)
 - [GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData](docs/GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.md)
 - [GetEmployeeComplianceDocumentsContainer](docs/GetEmployeeComplianceDocumentsContainer.md)
 - [GetEmployeeComplianceDocumentsContainerData](docs/GetEmployeeComplianceDocumentsContainerData.md)
 - [GetEmployeeComplianceDocumentsContainerDataDocumentsInner](docs/GetEmployeeComplianceDocumentsContainerDataDocumentsInner.md)
 - [GlobalPayrollG2NReport](docs/GlobalPayrollG2NReport.md)
 - [GlobalPayrollG2NReportContainer](docs/GlobalPayrollG2NReportContainer.md)
 - [HRDocumentInfo](docs/HRDocumentInfo.md)
 - [HealthInsuranceProvider](docs/HealthInsuranceProvider.md)
 - [HealthInsuranceProviderAttachmentsInner](docs/HealthInsuranceProviderAttachmentsInner.md)
 - [HealthInsuranceProviderPlansInner](docs/HealthInsuranceProviderPlansInner.md)
 - [HiringStatusEnum](docs/HiringStatusEnum.md)
 - [HrVerificationLettersAndDocumentsListContainer](docs/HrVerificationLettersAndDocumentsListContainer.md)
 - [HrisCompensation](docs/HrisCompensation.md)
 - [HrisContractBase](docs/HrisContractBase.md)
 - [HrisDirectEmployee](docs/HrisDirectEmployee.md)
 - [HrisDirectEmployeeContainer](docs/HrisDirectEmployeeContainer.md)
 - [HrisDirectEmployeeDetails](docs/HrisDirectEmployeeDetails.md)
 - [HrisDirectEmployeeResponse](docs/HrisDirectEmployeeResponse.md)
 - [HrisDirectEmployeeResponseAllOf](docs/HrisDirectEmployeeResponseAllOf.md)
 - [HrisDirectEmployeeVacationInfo](docs/HrisDirectEmployeeVacationInfo.md)
 - [HrisJobInformationBase](docs/HrisJobInformationBase.md)
 - [HrisJobInformationTitleId](docs/HrisJobInformationTitleId.md)
 - [HrisJobInformationTitleIdAllOf](docs/HrisJobInformationTitleIdAllOf.md)
 - [HrisJobInformationTitleName](docs/HrisJobInformationTitleName.md)
 - [HrisJobInformationTitleNameAllOf](docs/HrisJobInformationTitleNameAllOf.md)
 - [HrisTeamInformation](docs/HrisTeamInformation.md)
 - [InputToCreateFileRef](docs/InputToCreateFileRef.md)
 - [InputToCreateFileRefData](docs/InputToCreateFileRefData.md)
 - [InputToCreatePgoTask](docs/InputToCreatePgoTask.md)
 - [InputToDeletePgoTask](docs/InputToDeletePgoTask.md)
 - [InputToPatchContractExternalId](docs/InputToPatchContractExternalId.md)
 - [InputToShieldContract](docs/InputToShieldContract.md)
 - [InputToShieldContractData](docs/InputToShieldContractData.md)
 - [InternalPeople](docs/InternalPeople.md)
 - [InternalPeopleContainer](docs/InternalPeopleContainer.md)
 - [InvitationsOfBasicContract](docs/InvitationsOfBasicContract.md)
 - [InviteTeamMemberToSign](docs/InviteTeamMemberToSign.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceAdjustment](docs/InvoiceAdjustment.md)
 - [InvoiceAdjustmentApprover](docs/InvoiceAdjustmentApprover.md)
 - [InvoiceAdjustmentApproversContainer](docs/InvoiceAdjustmentApproversContainer.md)
 - [InvoiceAdjustmentAttachmentContainer](docs/InvoiceAdjustmentAttachmentContainer.md)
 - [InvoiceAdjustmentContainer](docs/InvoiceAdjustmentContainer.md)
 - [InvoiceAdjustmentCreated](docs/InvoiceAdjustmentCreated.md)
 - [InvoiceAdjustmentCreatedContainer](docs/InvoiceAdjustmentCreatedContainer.md)
 - [InvoiceAdjustmentListContainer](docs/InvoiceAdjustmentListContainer.md)
 - [InvoiceAdjustmentPendingForApproval](docs/InvoiceAdjustmentPendingForApproval.md)
 - [InvoiceAdjustmentPendingForApprovalApproversInner](docs/InvoiceAdjustmentPendingForApprovalApproversInner.md)
 - [InvoiceAdjustmentReviewToCreate](docs/InvoiceAdjustmentReviewToCreate.md)
 - [InvoiceAdjustmentReviewToCreateContainer](docs/InvoiceAdjustmentReviewToCreateContainer.md)
 - [InvoiceAdjustmentReviewsToCreate](docs/InvoiceAdjustmentReviewsToCreate.md)
 - [InvoiceAdjustmentReviewsToCreateContainer](docs/InvoiceAdjustmentReviewsToCreateContainer.md)
 - [InvoiceAdjustmentSearchContainer](docs/InvoiceAdjustmentSearchContainer.md)
 - [InvoiceAdjustmentStatusEnum](docs/InvoiceAdjustmentStatusEnum.md)
 - [InvoiceAdjustmentToCreate](docs/InvoiceAdjustmentToCreate.md)
 - [InvoiceAdjustmentToCreateContainer](docs/InvoiceAdjustmentToCreateContainer.md)
 - [InvoiceAdjustmentToCreateWithFile](docs/InvoiceAdjustmentToCreateWithFile.md)
 - [InvoiceAdjustmentToUpdate](docs/InvoiceAdjustmentToUpdate.md)
 - [InvoiceAdjustmentToUpdateContainer](docs/InvoiceAdjustmentToUpdateContainer.md)
 - [InvoiceAdjustmentTypeEnum](docs/InvoiceAdjustmentTypeEnum.md)
 - [InvoiceAdjustmentTypeToCreateEnum](docs/InvoiceAdjustmentTypeToCreateEnum.md)
 - [InvoiceContract](docs/InvoiceContract.md)
 - [InvoiceContractTypes](docs/InvoiceContractTypes.md)
 - [InvoiceContractor](docs/InvoiceContractor.md)
 - [InvoiceDownloadContainer](docs/InvoiceDownloadContainer.md)
 - [InvoiceDownloadLinkContainer](docs/InvoiceDownloadLinkContainer.md)
 - [InvoiceDownloadObject](docs/InvoiceDownloadObject.md)
 - [InvoiceListContainer](docs/InvoiceListContainer.md)
 - [InvoiceObject](docs/InvoiceObject.md)
 - [InvoiceStatusEnum](docs/InvoiceStatusEnum.md)
 - [InvoiceTypeEnum](docs/InvoiceTypeEnum.md)
 - [JobTitle](docs/JobTitle.md)
 - [JobTitleListContainer](docs/JobTitleListContainer.md)
 - [JobTitleListContainerPage](docs/JobTitleListContainerPage.md)
 - [LegalEntityListContainer](docs/LegalEntityListContainer.md)
 - [LegalEntityType](docs/LegalEntityType.md)
 - [LetterRequest](docs/LetterRequest.md)
 - [Manager](docs/Manager.md)
 - [MaritalStatusEnum](docs/MaritalStatusEnum.md)
 - [Meta](docs/Meta.md)
 - [MetaDataOfContractToCreate](docs/MetaDataOfContractToCreate.md)
 - [Milestone](docs/Milestone.md)
 - [MilestoneContainer](docs/MilestoneContainer.md)
 - [MilestoneListContainer](docs/MilestoneListContainer.md)
 - [MilestoneProperties](docs/MilestoneProperties.md)
 - [MilestoneReportedBy](docs/MilestoneReportedBy.md)
 - [MilestoneReviewToCreate](docs/MilestoneReviewToCreate.md)
 - [MilestoneReviewToCreateContainer](docs/MilestoneReviewToCreateContainer.md)
 - [MilestoneReviewedBy](docs/MilestoneReviewedBy.md)
 - [MilestoneReviewsToCreate](docs/MilestoneReviewsToCreate.md)
 - [MilestoneReviewsToCreateContainer](docs/MilestoneReviewsToCreateContainer.md)
 - [MilestoneToCreateContainer](docs/MilestoneToCreateContainer.md)
 - [MilestoneToCreateFormWithFile](docs/MilestoneToCreateFormWithFile.md)
 - [MonthlyPayment](docs/MonthlyPayment.md)
 - [Name](docs/Name.md)
 - [OffCyclePayment](docs/OffCyclePayment.md)
 - [OffCyclePaymentContainer](docs/OffCyclePaymentContainer.md)
 - [OffCyclePaymentListContainer](docs/OffCyclePaymentListContainer.md)
 - [OffCyclePaymentReportedBy](docs/OffCyclePaymentReportedBy.md)
 - [OffCyclePaymentToCreate](docs/OffCyclePaymentToCreate.md)
 - [OffCyclePaymentToCreateContainer](docs/OffCyclePaymentToCreateContainer.md)
 - [OffCyclePaymentTypeEnum](docs/OffCyclePaymentTypeEnum.md)
 - [OrganizationListContainer](docs/OrganizationListContainer.md)
 - [OutputToCreateFileRef](docs/OutputToCreateFileRef.md)
 - [OutputToCreateFileRefContainer](docs/OutputToCreateFileRefContainer.md)
 - [PageInfo](docs/PageInfo.md)
 - [PageInfoWithCursorNew](docs/PageInfoWithCursorNew.md)
 - [PageInfoWithoutCursor](docs/PageInfoWithoutCursor.md)
 - [PageInfoWithoutCursorNew](docs/PageInfoWithoutCursorNew.md)
 - [PatchOperation](docs/PatchOperation.md)
 - [PatchWebhookRequest](docs/PatchWebhookRequest.md)
 - [Payment](docs/Payment.md)
 - [PaymentBreakDown](docs/PaymentBreakDown.md)
 - [PaymentBreakDownContainer](docs/PaymentBreakDownContainer.md)
 - [PaymentListContainer](docs/PaymentListContainer.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodEnum](docs/PaymentMethodEnum.md)
 - [PaymentObject](docs/PaymentObject.md)
 - [PaymentStatementInitiatedWebhook](docs/PaymentStatementInitiatedWebhook.md)
 - [PaymentStatusEnum](docs/PaymentStatusEnum.md)
 - [PaymentWorker](docs/PaymentWorker.md)
 - [PayrollAdjustment](docs/PayrollAdjustment.md)
 - [PayrollAdjustmentFile](docs/PayrollAdjustmentFile.md)
 - [PayslipDownloadUrl](docs/PayslipDownloadUrl.md)
 - [Payslips](docs/Payslips.md)
 - [PensionEORContractToCreate](docs/PensionEORContractToCreate.md)
 - [PensionProvider](docs/PensionProvider.md)
 - [PeopleByIdContainer](docs/PeopleByIdContainer.md)
 - [PeopleByIdContainerData](docs/PeopleByIdContainerData.md)
 - [PeopleByIdContainerDataAllOf](docs/PeopleByIdContainerDataAllOf.md)
 - [PeopleClientLegalEntity](docs/PeopleClientLegalEntity.md)
 - [PeopleContainer](docs/PeopleContainer.md)
 - [PeopleCustomField](docs/PeopleCustomField.md)
 - [PeopleMe](docs/PeopleMe.md)
 - [PeoplePayment](docs/PeoplePayment.md)
 - [PeopleSortByEnum](docs/PeopleSortByEnum.md)
 - [PeopleTimeOffContainer](docs/PeopleTimeOffContainer.md)
 - [PgoTask](docs/PgoTask.md)
 - [PgoTaskReviewsByIdToCreate](docs/PgoTaskReviewsByIdToCreate.md)
 - [PgoTaskReviewsToCreate](docs/PgoTaskReviewsToCreate.md)
 - [PgoTaskToCreate](docs/PgoTaskToCreate.md)
 - [PgoTaskToDelete](docs/PgoTaskToDelete.md)
 - [PremiumResultAdded](docs/PremiumResultAdded.md)
 - [PremiumResultAddedContainer](docs/PremiumResultAddedContainer.md)
 - [PremiumResultAddedMisclassificationGuarantee](docs/PremiumResultAddedMisclassificationGuarantee.md)
 - [PremiumResultAddedPenalties](docs/PremiumResultAddedPenalties.md)
 - [PremiumResultAddedThirdPartyLiabilities](docs/PremiumResultAddedThirdPartyLiabilities.md)
 - [PremiumToAdd](docs/PremiumToAdd.md)
 - [PremiumToAddContainer](docs/PremiumToAddContainer.md)
 - [ProRata](docs/ProRata.md)
 - [ProfileTypeEnum](docs/ProfileTypeEnum.md)
 - [PublicToken](docs/PublicToken.md)
 - [PublicTokenCreatedContainer](docs/PublicTokenCreatedContainer.md)
 - [RequestBodyToCreatePgoTaskReviewsByIdReviewsContainer](docs/RequestBodyToCreatePgoTaskReviewsByIdReviewsContainer.md)
 - [RequestBodyToCreatePgoTaskReviewsReviewsContainer](docs/RequestBodyToCreatePgoTaskReviewsReviewsContainer.md)
 - [RequestCustomVerificationLetterContainer](docs/RequestCustomVerificationLetterContainer.md)
 - [RequestCustomVerificationLetterWithFile](docs/RequestCustomVerificationLetterWithFile.md)
 - [RequestCustomVerificationLetterWithFileAllOf](docs/RequestCustomVerificationLetterWithFileAllOf.md)
 - [RequesterTimeOff](docs/RequesterTimeOff.md)
 - [ResponseBodyForAdjustmentById](docs/ResponseBodyForAdjustmentById.md)
 - [ResponseEstimateFirstPayment](docs/ResponseEstimateFirstPayment.md)
 - [ResponseEstimateFirstPaymentContainer](docs/ResponseEstimateFirstPaymentContainer.md)
 - [SalaryFrequencyScaleEnum](docs/SalaryFrequencyScaleEnum.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [Seniority](docs/Seniority.md)
 - [SeniorityListContainer](docs/SeniorityListContainer.md)
 - [SeniorityRequired](docs/SeniorityRequired.md)
 - [ServiceProviderConfig](docs/ServiceProviderConfig.md)
 - [SignaturesOfBasicContract](docs/SignaturesOfBasicContract.md)
 - [SignaturesOfContract](docs/SignaturesOfContract.md)
 - [SortDirEnum](docs/SortDirEnum.md)
 - [StateOfCountry](docs/StateOfCountry.md)
 - [Supported](docs/Supported.md)
 - [TaskCreated](docs/TaskCreated.md)
 - [TaskCreatedContainer](docs/TaskCreatedContainer.md)
 - [TaskListContainer](docs/TaskListContainer.md)
 - [Team](docs/Team.md)
 - [TeamListContainer](docs/TeamListContainer.md)
 - [TeamOfBasicContract](docs/TeamOfBasicContract.md)
 - [TeamOfContract](docs/TeamOfContract.md)
 - [TimeoffReview](docs/TimeoffReview.md)
 - [TimeoffReviewInternal](docs/TimeoffReviewInternal.md)
 - [TimeoffToReviewContainer](docs/TimeoffToReviewContainer.md)
 - [TimeoffToReviewInternalContainer](docs/TimeoffToReviewInternalContainer.md)
 - [TimeoffTypeListContainer](docs/TimeoffTypeListContainer.md)
 - [TimeoffsAttachmentsItem](docs/TimeoffsAttachmentsItem.md)
 - [TimeoffsProfile](docs/TimeoffsProfile.md)
 - [TimeoffsProfileNullable](docs/TimeoffsProfileNullable.md)
 - [TimeoffsStatusEnum](docs/TimeoffsStatusEnum.md)
 - [TimeoffsTypeEnum](docs/TimeoffsTypeEnum.md)
 - [Timesheet](docs/Timesheet.md)
 - [TimesheetAccountingRefsInner](docs/TimesheetAccountingRefsInner.md)
 - [TimesheetAccountingRefsInnerMappingCategory](docs/TimesheetAccountingRefsInnerMappingCategory.md)
 - [TimesheetApprover](docs/TimesheetApprover.md)
 - [TimesheetApproversContainer](docs/TimesheetApproversContainer.md)
 - [TimesheetContainer](docs/TimesheetContainer.md)
 - [TimesheetListContainer](docs/TimesheetListContainer.md)
 - [TimesheetReviewToCreate](docs/TimesheetReviewToCreate.md)
 - [TimesheetReviewToCreateContainer](docs/TimesheetReviewToCreateContainer.md)
 - [TimesheetReviewsToCreate](docs/TimesheetReviewsToCreate.md)
 - [TimesheetReviewsToCreateContainer](docs/TimesheetReviewsToCreateContainer.md)
 - [TimesheetSearchContainer](docs/TimesheetSearchContainer.md)
 - [TimesheetSharedProperties](docs/TimesheetSharedProperties.md)
 - [TimesheetStatusEnum](docs/TimesheetStatusEnum.md)
 - [TimesheetToCreateContainer](docs/TimesheetToCreateContainer.md)
 - [TimesheetToCreateWithFile](docs/TimesheetToCreateWithFile.md)
 - [TimesheetToUpdate](docs/TimesheetToUpdate.md)
 - [TimesheetToUpdateContainer](docs/TimesheetToUpdateContainer.md)
 - [TimesheetTypeEnum](docs/TimesheetTypeEnum.md)
 - [UpdateWorkerDepartment](docs/UpdateWorkerDepartment.md)
 - [UpdateWorkerDepartmentContainer](docs/UpdateWorkerDepartmentContainer.md)
 - [UpdateWorkerWorkingLocation](docs/UpdateWorkerWorkingLocation.md)
 - [UpdateWorkerWorkingLocationContainer](docs/UpdateWorkerWorkingLocationContainer.md)
 - [UploadEmployeeComplianceDocumentContainer](docs/UploadEmployeeComplianceDocumentContainer.md)
 - [UploadEmployeeComplianceDocumentContainerData](docs/UploadEmployeeComplianceDocumentContainerData.md)
 - [UploadEmployeeComplianceDocumentFileContainer](docs/UploadEmployeeComplianceDocumentFileContainer.md)
 - [User](docs/User.md)
 - [UserExtension](docs/UserExtension.md)
 - [UserExtensionEmploymentsInner](docs/UserExtensionEmploymentsInner.md)
 - [UserMeta](docs/UserMeta.md)
 - [UserPatch](docs/UserPatch.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseAllOf](docs/UserResponseAllOf.md)
 - [UserSearchResponse](docs/UserSearchResponse.md)
 - [UsersSearchForm](docs/UsersSearchForm.md)
 - [ValidationType](docs/ValidationType.md)
 - [ValidationTypeEnum](docs/ValidationTypeEnum.md)
 - [WebhookEventTypeListResponse](docs/WebhookEventTypeListResponse.md)
 - [WebhookEventTypeResponse](docs/WebhookEventTypeResponse.md)
 - [WebhookItem](docs/WebhookItem.md)
 - [WebhookItemResponse](docs/WebhookItemResponse.md)
 - [WebhookListResponse](docs/WebhookListResponse.md)
 - [WeekDaysEnum](docs/WeekDaysEnum.md)
 - [WorkStatementCycleEndTypeEnum](docs/WorkStatementCycleEndTypeEnum.md)
 - [WorkStatementCycleScaleEnum](docs/WorkStatementCycleScaleEnum.md)
 - [WorkStatementPaymentDueTypeEnum](docs/WorkStatementPaymentDueTypeEnum.md)
 - [WorkStatementScaleEnum](docs/WorkStatementScaleEnum.md)
 - [WorkStatementScaleEnumOptional](docs/WorkStatementScaleEnumOptional.md)
 - [WorkerBankAccountInfo](docs/WorkerBankAccountInfo.md)
 - [WorkerBankAccountInfoAllOf](docs/WorkerBankAccountInfoAllOf.md)
 - [WorkerBankAccountToAdd](docs/WorkerBankAccountToAdd.md)
 - [WorkerBankAccountsInfoContainer](docs/WorkerBankAccountsInfoContainer.md)
 - [WorkerLegalEntity](docs/WorkerLegalEntity.md)
 - [WorkerOfBasicContract](docs/WorkerOfBasicContract.md)
 - [WorkerOfContract](docs/WorkerOfContract.md)
 - [WorkerTermination](docs/WorkerTermination.md)
 - [WorkerTerminationBody](docs/WorkerTerminationBody.md)
 - [WorkerTerminationBodyContainer](docs/WorkerTerminationBodyContainer.md)
 - [WorkerTerminationContainer](docs/WorkerTerminationContainer.md)
 - [WorkingLocationsContainer](docs/WorkingLocationsContainer.md)
 - [WorkingLocationsInner](docs/WorkingLocationsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
