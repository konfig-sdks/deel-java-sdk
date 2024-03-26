

# EorContractToCreateCompensationDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**salary** | **Double** | Employee&#39;s gross annual salary. |  [optional] |
|**currency** | **String** | Salary currency. |  |
|**variableCompensation** | **Double** | Variable compensation. For example, if the person will earn 5% of the gross annual salary as the variable compensation, enter 5. |  [optional] |
|**variableCompensationType** | [**VariableCompensationTypeEnum**](#VariableCompensationTypeEnum) | Should be set only if variable_compensation is set. It can be PERCENTAGE or FIXED. |  [optional] |



## Enum: VariableCompensationTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| FIXED | &quot;FIXED&quot; |
| NULL | &quot;null&quot; |



