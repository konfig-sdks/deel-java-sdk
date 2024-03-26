

# InvoiceAdjustmentToCreate

Details of invoice adjustment to create.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the adjustment. |  |
|**contractId** | **String** | Id of a Deel contract. |  |
|**dateSubmitted** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**type** | **InvoiceAdjustmentTypeToCreateEnum** |  |  |
|**amount** | **Double** | Amount to be paid. Must be a positive number. |  |
|**paymentCycleId** | **Double** | ID of an existing active payment cycle - required if type is \&quot;vat\&quot; |  [optional] |



