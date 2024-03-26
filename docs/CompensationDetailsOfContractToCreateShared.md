

# CompensationDetailsOfContractToCreateShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Amount to be paid. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts. |  [optional] |
|**currencyCode** | **String** |  |  |
|**frequency** | **WorkStatementCycleScaleEnum** |  |  |
|**cycleEnd** | **Double** | Date invoice cycle ends. |  |
|**cycleEndType** | **WorkStatementCycleEndTypeEnum** |  |  |
|**paymentDueType** | **WorkStatementPaymentDueTypeEnum** |  |  |
|**paymentDueDays** | **Double** |  |  |
|**payBeforeWeekends** | **Boolean** | If the payment due is on a weekend, pay on Friday. |  [optional] |
|**firstPaymentDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**firstPayment** | **Double** | First payment amount. |  [optional] |
|**noticePeriod** | **Double** | Days before to notice the termination of contract for eather party. |  [optional] |



