

# ProRata

Details of the pro rata for the first payment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | Either works days or calendar days |  [optional] |
|**rate** | **Double** | Rate to be paid. |  [optional] |
|**dailyRate** | **Double** | Daily rate to be paid. |  [optional] |
|**total** | **Double** | Total to be paid. |  [optional] |
|**cycleWorkDays** | **Double** | Total days to be work. |  [optional] |
|**workWeekStart** | **WeekDaysEnum** |  |  [optional] |
|**workWeekEnd** | **WeekDaysEnum** |  |  [optional] |
|**cycleStart** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**cycleEnd** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_AMOUNT | &quot;CUSTOM_AMOUNT&quot; |
| WORK_DAYS | &quot;WORK_DAYS&quot; |
| CALENDAR_DAYS | &quot;CALENDAR_DAYS&quot; |
| FULL_AMOUNT | &quot;FULL_AMOUNT&quot; |



