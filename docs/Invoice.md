

# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the invoice. |  |
|**status** | **InvoiceStatusEnum** |  |  |
|**currency** | **String** | Currency code. |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**total** | **String** | Total invoice amount including Fee and VAT. |  |
|**label** | **String** | Label of the invoice. |  |
|**paidAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**vatTotal** | **String** | Amount of VAT. |  |
|**vatPercentage** | **String** | VAT percentage. |  |
|**isOverdue** | **Boolean** | Indicates if the invoice is overdue. |  |
|**issuedAt** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**vatId** | **String** | VAT identification number. |  |
|**dueDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**contractId** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |



