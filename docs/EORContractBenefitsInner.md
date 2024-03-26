

# EORContractBenefitsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the benefit. |  [optional] |
|**name** | **String** | Name of the benefit. |  [optional] |
|**provider** | [**EORContractBenefitsInnerProvider**](EORContractBenefitsInnerProvider.md) |  |  [optional] |
|**offerStatus** | [**OfferStatusEnum**](#OfferStatusEnum) | Status of the offer. |  [optional] |
|**plan** | [**EORContractBenefitsInnerPlan**](EORContractBenefitsInnerPlan.md) |  |  [optional] |
|**enrollmentDetails** | [**EORContractBenefitsInnerEnrollmentDetails**](EORContractBenefitsInnerEnrollmentDetails.md) |  |  [optional] |



## Enum: OfferStatusEnum

| Name | Value |
|---- | -----|
| OFFERED | &quot;Offered&quot; |
| NOT_OFFERED | &quot;Not offered&quot; |



