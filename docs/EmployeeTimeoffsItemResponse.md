

# EmployeeTimeoffsItemResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeOffId** | **String** |  |  [optional] |
|**timeOffTypeId** | **String** |  |  [optional] |
|**policyId** | **String** |  |  [optional] |
|**policyName** | **String** |  |  [optional] |
|**policyTypeName** | **String** |  |  [optional] |
|**reason** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Time off type. |  [optional] |
|**requestedAt** | **String** |  |  [optional] |
|**reviewedAt** | **String** |  |  [optional] |
|**withMultipleDates** | **Boolean** |  |  [optional] |
|**singleDate** | **String** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**denialReason** | **Boolean** |  |  [optional] |
|**requester** | [**RequesterTimeOff**](RequesterTimeOff.md) |  |  [optional] |
|**daysUsedStartYear** | **String** |  |  [optional] |
|**daysUsedEndYear** | **String** |  |  [optional] |
|**daysUsed** | **String** |  |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**endDate** | **String** |  |  [optional] |
|**isStartDateHalfDay** | **Boolean** |  |  [optional] |
|**isEndDateHalfDay** | **Boolean** |  |  [optional] |
|**attachments** | [**List&lt;EmployeeTimeoffsItemResponseAttachmentsInner&gt;**](EmployeeTimeoffsItemResponseAttachmentsInner.md) |  |  [optional] |
|**changeRequest** | **String** |  |  [optional] |
|**isUpdated** | **Boolean** |  |  [optional] |
|**appliedChanges** | **List&lt;Object&gt;** |  |  [optional] |
|**canRequestChanges** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;VACATION&quot; |
| SICK_LEAVE | &quot;SICK_LEAVE&quot; |
| OTHER | &quot;OTHER&quot; |



