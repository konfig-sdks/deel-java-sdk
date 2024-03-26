

# Contract


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**id** | **String** |  |  |
|**type** | **ContractTypeEnum** |  |  |
|**status** | **ContractStatusEnum** |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**jobTitle** | **String** |  |  |
|**seniority** | [**Seniority**](Seniority.md) |  |  |
|**whoReports** | **ContractWhoReportsEnum** |  |  [optional] |
|**scopeOfWork** | **String** |  |  [optional] |
|**startDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**terminationDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**specialClause** | **String** |  |  |
|**isArchived** | **Boolean** |  |  |
|**client** | [**ClientOfContract**](ClientOfContract.md) |  |  |
|**worker** | [**WorkerOfContract**](WorkerOfContract.md) |  |  |
|**invitations** | [**InvitationsOfBasicContract**](InvitationsOfBasicContract.md) |  |  |
|**signatures** | [**SignaturesOfContract**](SignaturesOfContract.md) |  |  |
|**compensationDetails** | [**CompensationDetailsOfContract**](CompensationDetailsOfContract.md) |  |  |
|**employmentDetails** | [**EmploymentDetailsOfContract**](EmploymentDetailsOfContract.md) |  |  |
|**noticePeriod** | **Double** | Days before to notice the termination of contract for eather party. |  [optional] |
|**contractTemplate** | [**ContractTemplate**](ContractTemplate.md) |  |  [optional] |
|**customFields** | [**List&lt;ContractCustomField&gt;**](ContractCustomField.md) |  |  [optional] |
|**quote** | [**EorQuoteBase**](EorQuoteBase.md) |  |  [optional] |
|**externalId** | **String** | A unique identifier for the object provided by an external system. |  [optional] |



