

# Applicant

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier for the applicant. Read-only. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when this applicant was created. Read-only. |  [optional]
**deleteAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when this applicant is scheduled to be deleted. Read-only. |  [optional]
**href** | **String** | The uri of this resource. Read-only. |  [optional]
**sandbox** | **Boolean** | Read-only. |  [optional]
**firstName** | **String** | The applicant’s first name |  [optional]
**lastName** | **String** | The applicant’s surname |  [optional]
**email** | **String** | The applicant’s email address. Required if doing a US check, or a UK check for which &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;. |  [optional]
**dob** | [**LocalDate**](LocalDate.md) | The applicant’s date of birth |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**idNumbers** | [**List&lt;IdNumber&gt;**](IdNumber.md) |  |  [optional]



