

# FinalPaymentCalculated


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dailyRate** | **String** | The daily rate paid. |  |
|**total** | **String** | Total amount to pay. |  |
|**remainingDays** | **String** | Dais remaining to end the contract. |  |
|**lastCycle** | [**FinalPaymentCalculatedLastCycle**](FinalPaymentCalculatedLastCycle.md) |  |  |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | Either works days or calendar days |  |
|**workweekStart** | **Double** | The day the work week starts, 0 to 6 |  |
|**workweekEnd** | **Double** | The day the work week starts, 0 to 6 |  |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_AMOUNT | &quot;CUSTOM_AMOUNT&quot; |
| WORK_DAYS | &quot;WORK_DAYS&quot; |
| CALENDAR_DAYS | &quot;CALENDAR_DAYS&quot; |
| FULL_AMOUNT | &quot;FULL_AMOUNT&quot; |



