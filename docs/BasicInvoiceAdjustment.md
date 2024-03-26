

# BasicInvoiceAdjustment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**id** | **String** | Unique identifier of this resource. |  |
|**type** | **InvoiceAdjustmentTypeEnum** |  |  |
|**status** | **InvoiceAdjustmentStatusEnum** |  |  |
|**dateSubmitted** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**currencyCode** | **String** |  |  |
|**invoiceId** | **Double** |  |  [optional] |
|**quantity** | **Double** |  |  |
|**totalAmount** | **String** |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**scale** | **String** |  |  [optional] |
|**customScale** | **String** |  |  [optional] |
|**attachment** | [**FileAttachmentInfo**](FileAttachmentInfo.md) |  |  |
|**worksheet** | [**BasicInvoiceAdjustmentWorksheet**](BasicInvoiceAdjustmentWorksheet.md) |  |  |
|**reviewedBy** | [**BasicInvoiceAdjustmentReviewedBy**](BasicInvoiceAdjustmentReviewedBy.md) |  |  |
|**contract** | [**BasicTimesheetContract**](BasicTimesheetContract.md) |  |  |
|**paymentCycle** | [**BasicInvoiceAdjustmentPaymentCycle**](BasicInvoiceAdjustmentPaymentCycle.md) |  |  |
|**reportedBy** | [**BasicInvoiceAdjustmentReportedBy**](BasicInvoiceAdjustmentReportedBy.md) |  |  |



