

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Double** | Unique identifier of the payment. |  |
|**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  |
|**status** | **PaymentStatusEnum** |  |  |
|**paymentCurrency** | **String** | Currency code. |  |
|**label** | **String** |  |  |
|**paidAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**total** | **String** | Total paid. |  |
|**workers** | [**List&lt;PaymentWorker&gt;**](PaymentWorker.md) |  |  |



