

# EorTimeoffsBaseItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | **String** | Reason for requesting time off. |  [optional] |
|**type** | **TimeoffsTypeEnum** | The type of time off. |  |
|**requestedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**reviewedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**denialReason** | **String** | Reason why time off was denied. |  [optional] |
|**hasMultipleDates** | **Boolean** | Indicates if multiple time off days are requested. |  [optional] |
|**status** | **TimeoffsStatusEnum** | Status of the time off request. |  |
|**otherTimeoffName** | **String** | Custom title for the time off. Only specify if type is \&quot;OTHER\&quot;. |  [optional] |
|**requester** | [**TimeoffsProfileNullable**](TimeoffsProfileNullable.md) | Employee who requested the time off. |  [optional] |
|**reviewer** | [**EorTimeoffsBaseItemReviewer**](EorTimeoffsBaseItemReviewer.md) | User who reviewed the time off. |  [optional] |
|**daysUsedStartYear** | **String** | Days used at the start year. |  [optional] |
|**daysUsedEndYear** | **String** | Days used at the end year. |  [optional] |
|**totalDaysUsed** | **String** | Total number of time off days used. |  [optional] |
|**startDateIsHalfDay** | **Boolean** | Indicates if the first day of time off is a half day. |  [optional] |
|**endDateIsHalfDay** | **Boolean** | Indicates if the last day of time off is a half day. |  [optional] |
|**singleDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**dateIsHalfDay** | **Boolean** | If true, only a single date was specified. |  [optional] |
|**attachments** | [**List&lt;TimeoffsAttachmentsItem&gt;**](TimeoffsAttachmentsItem.md) | A list of attachments. 2022-09-08 FE only allows for \&quot;SICK LEAVE\&quot; |  [optional] |



