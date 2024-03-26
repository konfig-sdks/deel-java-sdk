

# InternalPeople

People object representing a Deel

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the user |  [optional] |
|**firstName** | **String** | First name of the user |  [optional] |
|**lastName** | **String** | Last name of the user |  [optional] |
|**fullName** | **String** | Full name of the user |  [optional] |
|**email** | **String** | Email address of the user |  [optional] |
|**workEmail** | **String** | Work email address of the user |  [optional] |
|**personalEmail** | **String** | Personal email address of the user |  [optional] |
|**countryName** | **String** | Name of the country where the user is located |  [optional] |
|**birthDate** | **String** | Date of birth of the user in ISO format (yyyy-mm-dd) |  [optional] |
|**picUrl** | **String** | URL of the user&#39;s profile picture |  [optional] |
|**startDate** | **String** | Date when the user started their current employment in ISO format (yyyy-mm-dd) |  [optional] |
|**payments** | [**List&lt;Payment&gt;**](Payment.md) | List of payment objects representing the user&#39;s payment history |  [optional] |
|**hourlyReportTotal** | **String** | Total amount of hours worked by the user in ISO format (hh:mm:ss) |  [optional] |
|**clientLegalEntity** | [**PeopleClientLegalEntity**](PeopleClientLegalEntity.md) |  |  [optional] |
|**state** | **String** | State where the user is located |  [optional] |
|**seniority** | **String** | Seniority level of the user&#39;s role |  [optional] |
|**completionDate** | **String** | Date when the user&#39;s current employment is expected to end in ISO format (yyyy-mm-ddThh:mm:ss.sssZ) |  [optional] |
|**monthlyPayment** | [**MonthlyPayment**](MonthlyPayment.md) |  |  [optional] |
|**directManager** | **String** | Name of the user&#39;s direct manager |  [optional] |
|**directReports** | **String** | Names of the user&#39;s direct reports |  [optional] |
|**directReportsCount** | **Integer** | Number of direct reports that the user has |  [optional] |
|**employments** | [**List&lt;Employment&gt;**](Employment.md) | List of employment objects representing the user&#39;s employment history |  [optional] |
|**hiringStatus** | **String** | Hiring status of the user |  [optional] |
|**hiringType** | **String** | Type of employment contract that the user has |  [optional] |
|**jobTitle** | **String** | Title of the user&#39;s role |  [optional] |
|**country** | **String** | ISO 3166-1 alpha-2 code of the country where the user is located |  [optional] |
|**teamId** | **Integer** | Unique identifier for the team that the user belongs to |  [optional] |
|**team** | **String** | Name of the team that the user belongs to |  [optional] |
|**timezone** | **String** | Time zone of the user&#39;s location |  [optional] |
|**department** | **String** | Name of the department that the user belongs to |  [optional] |
|**workLocation** | **String** | Name of the user&#39;s work location |  [optional] |
|**contractTypes** | **List&lt;String&gt;** | List of contract types that the user has had in the past and/or currently has |  [optional] |
|**hasDeelUser** | **Boolean** | Indicates whether the user has a Deel account or not |  [optional] |



