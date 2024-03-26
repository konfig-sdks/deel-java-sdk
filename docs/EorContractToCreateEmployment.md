

# EorContractToCreateEmployment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **String** | Country code. |  |
|**state** | **String** | State code of the state/province where the this person will be employed. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Is it a full-time contract or a part-time contract? |  [optional] |
|**workVisaRequired** | **Boolean** | Do you require Deel to apply for work visa for this person? |  |
|**startDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**endDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**probationPeriod** | **Double** | Number of probation days. |  [optional] |
|**scopeOfWork** | **String** | Scope of work description. |  [optional] |
|**timeOffType** | [**TimeOffTypeEnum**](#TimeOffTypeEnum) | If you want to use standard number of holidays for this employee, choose \&quot;STANDARD\&quot;. If you want to enter a specific number of holidays, choose \&quot;SPECIFIC\&quot; and enter the number of days in the holidays field. |  [optional] |
|**holidays** | **Double** | Enter the number of holidays. Leave this field blank if you are chooseing \&quot;STANDARD\&quot; time_off_type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL_TIME | &quot;Full-time&quot; |
| PART_TIME | &quot;Part-time&quot; |



## Enum: TimeOffTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| SPECIFIC | &quot;SPECIFIC&quot; |



