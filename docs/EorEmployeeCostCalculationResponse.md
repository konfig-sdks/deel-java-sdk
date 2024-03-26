

# EorEmployeeCostCalculationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**salary** | **String** | The gross annual salary of the employee. |  [optional] |
|**currency** | **String** | The currency of the employee salary. |  [optional] |
|**country** | **String** | The country of employment. |  [optional] |
|**countryCode** | **String** | The country code for the country of employment. |  [optional] |
|**frequency** | **String** | The frequency that the salary is paid out to the employee. |  [optional] |
|**deelFee** | **String** | The monthly Deel fee. |  [optional] |
|**severanceAccrual** | **String** | Monthly funds to cover future potential severance payments to the employee. |  [optional] |
|**totalCosts** | **String** | Total monthly cost including salary, Deel fee, severance accrual and employer costs. |  [optional] |
|**employerCosts** | **String** | Total monthly employer costs. Does not include Deel fee, salary and severance accrual. |  [optional] |
|**costs** | [**List&lt;EorEmployeeCostCalculationResponseCostsInner&gt;**](EorEmployeeCostCalculationResponseCostsInner.md) | The various costs associated with employment in the specified country. |  [optional] |
|**additionalData** | [**EorEmployeeCostCalculationResponseAdditionalData**](EorEmployeeCostCalculationResponseAdditionalData.md) |  |  [optional] |
|**benefitsData** | [**List&lt;EorEmployeeCostCalculationResponseBenefitsDataInner&gt;**](EorEmployeeCostCalculationResponseBenefitsDataInner.md) | The various benefits costs involved in the calculation, if any. |  [optional] |



