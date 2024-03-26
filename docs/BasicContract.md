

# BasicContract


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**id** | **String** |  |  |
|**type** | **ContractTypeEnum** |  |  |
|**status** | **ContractStatusEnum** |  |  |
|**client** | [**ClientOfBasicContract**](ClientOfBasicContract.md) |  |  |
|**worker** | [**WorkerOfBasicContract**](WorkerOfBasicContract.md) |  |  |
|**invitations** | [**InvitationsOfBasicContract**](InvitationsOfBasicContract.md) |  |  |
|**signatures** | [**SignaturesOfBasicContract**](SignaturesOfBasicContract.md) |  |  |
|**isShielded** | **Boolean** |  |  |
|**isArchived** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**terminationDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**noticePeriod** | **Double** | Days before to notice the termination of contract for eather party. |  [optional] |
|**scale** | **String** | The payment scale (e.g., hourly, weekly, monthly, etc.) |  [optional] |
|**whoReports** | **ContractWhoReportsEnum** |  |  [optional] |
|**externalId** | **String** | A unique identifier for the object provided by an external system. |  [optional] |



