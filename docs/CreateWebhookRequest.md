

# CreateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Webhook subscription description. |  |
|**name** | **String** | Webhook subscription name. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of webhook. |  |
|**url** | **String** | Endpoint to receive webhook. |  |
|**signingKey** | **String** | The webhook&#39;s signing key, used to generate webhook signatures. |  |
|**apiVersion** | **String** | Deel API version. Currently Deel accepts v1 or v2 version. |  |
|**events** | **List&lt;String&gt;** | The list of events to enable for this subscription. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



