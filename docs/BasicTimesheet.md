

# BasicTimesheet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**id** | **String** | Unique identifier of this resource. |  |
|**type** | **String** | Deprecated - it is always \&quot;work\&quot; |  |
|**status** | **TimesheetStatusEnum** |  |  |
|**dateSubmitted** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**currencyCode** | **String** |  |  |
|**totalAmount** | **String** | is equal to quantity times rate of active work statement + bonus in this record |  |
|**quantity** | **Double** |  |  |
|**createdAt** | **String** |  |  |
|**scale** | **String** |  |  [optional] |
|**customScale** | **String** |  |  [optional] |
|**attachment** | [**FileAttachmentInfo**](FileAttachmentInfo.md) |  |  |
|**worksheet** | [**BasicTimesheetWorksheet**](BasicTimesheetWorksheet.md) |  |  |
|**reviewedBy** | [**BasicTimesheetReviewedBy**](BasicTimesheetReviewedBy.md) |  |  |
|**contract** | [**BasicTimesheetContract**](BasicTimesheetContract.md) |  |  |
|**paymentCycle** | [**BasicTimesheetPaymentCycle**](BasicTimesheetPaymentCycle.md) |  |  [optional] |
|**reportedBy** | [**BasicTimesheetReportedBy**](BasicTimesheetReportedBy.md) |  |  |



