

# ContractToCreatePaygMilestones


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the contract. |  |
|**countryCode** | **String** | Country code. |  [optional] |
|**stateCode** | **String** | The state or province code. Use country lookup endpoint to retrieve state codes. |  [optional] |
|**scopeOfWork** | **String** | Describe the work to be performed. |  [optional] |
|**specialClause** | **String** | Enter any special clause you may have. |  [optional] |
|**terminationDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**client** | [**ContractToCreateSharedClient**](ContractToCreateSharedClient.md) |  |  |
|**jobTitle** | [**ContractToCreateSharedJobTitle**](ContractToCreateSharedJobTitle.md) |  |  |
|**seniority** | [**ContractToCreateSharedSeniority**](ContractToCreateSharedSeniority.md) |  |  [optional] |
|**noticePeriod** | **Double** | Days before to notice the termination of contract for eather party. |  [optional] |
|**whoReports** | **ContractWhoReportsEnum** |  |  [optional] |
|**meta** | [**MetaDataOfContractToCreate**](MetaDataOfContractToCreate.md) |  |  |
|**externalId** | **String** | External Id. |  [optional] |
|**worker** | [**ContractToCreateSharedWorker**](ContractToCreateSharedWorker.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**startDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**compensationDetails** | [**CompensationDetailsOfContractToCreateShared**](CompensationDetailsOfContractToCreateShared.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAYG_MILESTONES | &quot;payg_milestones&quot; |



