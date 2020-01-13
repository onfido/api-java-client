

# Check

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier for the check. Read-only. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when this check was created. Read-only. |  [optional]
**href** | **String** | The uri of this resource. Read-only. |  [optional]
**status** | **String** | The current state of the check in the checking process. Read-only. |  [optional]
**result** | **String** | The overall result of the check, based on the results of the constituent reports. Read-only. |  [optional]
**downloadUri** | **String** | A link to a PDF output of the check results. Append &#x60;.pdf&#x60; to get the pdf file. Read-only. |  [optional]
**formUri** | **String** | A link to the applicant form, if &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;. Read-only. |  [optional]
**redirectUri** | **String** | For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, redirect to this URI when the applicant has submitted their data. Read-only. |  [optional]
**resultsUri** | **String** | A link to the corresponding results page on the Onfido dashboard. |  [optional]
**reportNames** | **List&lt;String&gt;** | An array of report names (strings). |  [optional]
**applicantId** | **String** | The ID of the applicant to do the check on. |  [optional]
**tags** | **List&lt;String&gt;** | Array of tags being assigned to this check. |  [optional]
**applicantProvidesData** | **Boolean** | Send an applicant form to applicant to complete to proceed with check. Defaults to false.  |  [optional]
**suppressFormEmails** | **Boolean** | For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, applicant form will not be automatically sent if &#x60;suppress_form_emails&#x60; is set to &#x60;true&#x60;. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false.  |  [optional]
**asynchronous** | **Boolean** | Defaults to &#x60;true&#x60;. Write-only. If set to &#x60;false&#x60;, you will only receive a response when all reports in your check have completed.  |  [optional]
**reportIds** | **List&lt;String&gt;** | An array of report ids. |  [optional]



