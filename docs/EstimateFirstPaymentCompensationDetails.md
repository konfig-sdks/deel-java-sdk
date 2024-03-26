

# EstimateFirstPaymentCompensationDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Amount to be paid. Must be a positive number. |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**scale** | **WorkStatementCycleScaleEnum** |  |  [optional] |
|**cycleEnd** | **Double** | Date invoice cycle ends. |  [optional] |
|**cycleEndType** | **WorkStatementCycleEndTypeEnum** |  |  [optional] |
|**paymentDueType** | **WorkStatementPaymentDueTypeEnum** |  |  [optional] |
|**paymentDueDays** | **Double** |  |  [optional] |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | Either works days or calendar days |  [optional] |
|**workWeekStart** | **WeekDaysEnum** |  |  [optional] |
|**workWeekEnd** | **WeekDaysEnum** |  |  [optional] |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_AMOUNT | &quot;CUSTOM_AMOUNT&quot; |
| WORK_DAYS | &quot;WORK_DAYS&quot; |
| CALENDAR_DAYS | &quot;CALENDAR_DAYS&quot; |
| FULL_AMOUNT | &quot;FULL_AMOUNT&quot; |



