
# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of the webhook. Read-only. |  [optional]
**token** | **String** | Webhook secret token used to sign the webhook&#39;s payload. Read-only. |  [optional]
**href** | **String** | The API endpoint to retrieve the webhook. Read-only. |  [optional]
**url** | **String** | The url that will listen to notifications (must be https). | 
**enabled** | **Boolean** | Determine if the webhook is active. |  [optional]
**environments** | **List&lt;String&gt;** | The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments.  |  [optional]
**events** | **List&lt;String&gt;** | The events that will be published to the webhook. The supported events are: &#x60;report.completed&#x60;, &#x60;report.withdrawn&#x60;, &#x60;check.completed&#x60;, &#x60;check.started&#x60;, &#x60;check.form_opened&#x60;, &#x60;check.form_completed&#x60;. If the events parameter is omitted all the events will be subscribed.  |  [optional]



