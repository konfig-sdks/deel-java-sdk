

# ContractDetailsToAmend

You can specify any combination of data points that need changing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**scale** | **WorkStatementScaleEnum** |  |  [optional] |
|**effectiveDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**firstPaymentDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**firstPayment** | **Double** |  |  [optional] |
|**frequency** | **WorkStatementCycleScaleEnum** |  |  [optional] |
|**cycleEnd** | **Double** |  |  [optional] |
|**cycleEndType** | **WorkStatementCycleEndTypeEnum** |  |  [optional] |
|**paymentDueType** | **WorkStatementPaymentDueTypeEnum** |  |  [optional] |
|**paymentDueDays** | **Double** |  |  [optional] |
|**payBeforeWeekends** | **Boolean** | If the payment due is on a weekend, pay on Friday. |  [optional] |
|**jobTitleName** | **String** | You can enter new job title. |  [optional] |
|**jobTitleId** | **String** | Unique identifier of this resource. |  [optional] |
|**seniorityId** | **String** | Unique identifier of this resource. |  [optional] |
|**specialClause** | **String** | Text to describe any special clause in contract. |  [optional] |
|**scopeOfWork** | **String** | Text to describe the scope of work of the contract. |  [optional] |



