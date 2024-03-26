

# CreateTimeoff


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Time off type. |  |
|**startDate** | **String** | Start date of employee&#39;s time off. |  [optional] |
|**endDate** | **String** | End date of employee&#39;s time off. |  [optional] |
|**withMultipleDates** | **Boolean** | If true, then multiple time off days were requested. You must supply a start and end date. If false, end date is ignored |  |
|**reason** | **String** | Description for employee&#39;s time off. |  [optional] |
|**isStartDateHalfDay** | **Boolean** | Is the start day a half day? |  [optional] |
|**isEndDateHalfDay** | **Boolean** | Is the start day a half day? |  [optional] |
|**otherTimeoffName** | **String** | Custom name for this time off. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;VACATION&quot; |
| SICK_LEAVE | &quot;SICK_LEAVE&quot; |
| OTHER | &quot;OTHER&quot; |



