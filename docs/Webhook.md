
# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of the webhook. |  [optional]
**url** | **String** | The url of the webhook |  [optional]
**token** | **String** | Webhook secret token used to sign the webhook&#39;s payload |  [optional]
**enabled** | **Boolean** | Determine if the webhook is active. |  [optional]
**href** | **String** | The API endpoint to retrieve the webhook. |  [optional]
**environments** | **List&lt;String&gt;** | The environments from which the webhook will receive events. |  [optional]
**events** | **List&lt;String&gt;** | The events that will be published to the webhook. |  [optional]



