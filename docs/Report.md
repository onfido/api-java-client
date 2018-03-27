
# Report

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier for the report. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time at which the report was first initiated. |  [optional]
**href** | **String** | The API endpoint to retrieve the report. |  [optional]
**name** | **String** | Report type string identifier. |  [optional]
**status** | **String** | The current state of the report in the checking process. |  [optional]
**result** | **String** | The result of the report. |  [optional]
**subResult** | **String** | The sub_result of the report. It gives a more detailed result for document reports only, and will be null otherwise. |  [optional]
**variant** | **String** | Report variant string identifier. Some reports e.g. criminal_history have sub-types, which are identified by this field. |  [optional]
**options** | **Object** | Report options. Some reports e.g. criminal_history expose additional options. |  [optional]
**breakdown** | **Object** | The details of the report. This is specific to each type of report. |  [optional]
**properties** | **Object** | The properties associated with the report, if any. |  [optional]



