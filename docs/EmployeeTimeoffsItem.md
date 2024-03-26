

# EmployeeTimeoffsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeOffId** | **String** | Unique identifier of this resource. |  |
|**reason** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | Time off type. |  |
|**requestedAt** | **String** |  |  |
|**reviewedAt** | **String** |  |  |
|**withMultipleDates** | **Boolean** |  |  |
|**createdAt** | **String** |  |  |
|**updatedAt** | **String** |  |  |
|**denialReason** | **String** |  |  |
|**requester** | [**EmployeeTimeoffsItemRequester**](EmployeeTimeoffsItemRequester.md) |  |  |
|**reviewer** | [**EmployeeTimeoffsItemReviewer**](EmployeeTimeoffsItemReviewer.md) |  |  |
|**daysUsedStartYear** | **String** |  |  |
|**daysUsedEndYear** | **String** |  |  |
|**daysUsed** | **String** |  |  |
|**startDate** | **String** |  |  |
|**endDate** | **String** |  |  |
|**isStartDateHalfDay** | **Boolean** |  |  |
|**isEndDateHalfDay** | **Boolean** |  |  |
|**attachments** | [**List&lt;EmployeeTimeoffsItemAttachmentsInner&gt;**](EmployeeTimeoffsItemAttachmentsInner.md) |  |  |
|**changeRequest** | **String** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;VACATION&quot; |
| SICK_LEAVE | &quot;SICK_LEAVE&quot; |
| OTHER | &quot;OTHER&quot; |



