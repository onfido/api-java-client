# DefaultApi

All URIs are relative to *https://api.onfido.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelReport**](DefaultApi.md#cancelReport) | **POST** /reports/{report_id}/cancel | This endpoint is for cancelling individual paused reports.
[**createApplicant**](DefaultApi.md#createApplicant) | **POST** /applicants | Create Applicant
[**createCheck**](DefaultApi.md#createCheck) | **POST** /checks | Create a check
[**createWebhook**](DefaultApi.md#createWebhook) | **POST** /webhooks | Create a webhook
[**deleteWebhook**](DefaultApi.md#deleteWebhook) | **DELETE** /webhooks/{webhook_id} | Delete a webhook
[**destroyApplicant**](DefaultApi.md#destroyApplicant) | **DELETE** /applicants/{applicant_id} | Delete Applicant
[**downloadDocument**](DefaultApi.md#downloadDocument) | **GET** /documents/{document_id}/download | Download a documents raw data
[**downloadLivePhoto**](DefaultApi.md#downloadLivePhoto) | **GET** /live_photos/{live_photo_id}/download | Download live photo
[**downloadLiveVideo**](DefaultApi.md#downloadLiveVideo) | **GET** /live_videos/{live_video_id}/download | Download live video
[**editWebhook**](DefaultApi.md#editWebhook) | **PUT** /webhooks/{webhook_id} | Edit a webhook
[**findAddresses**](DefaultApi.md#findAddresses) | **GET** /addresses/pick | Search for addresses by postcode
[**findApplicant**](DefaultApi.md#findApplicant) | **GET** /applicants/{applicant_id} | Retrieve Applicant
[**findCheck**](DefaultApi.md#findCheck) | **GET** /checks/{check_id} | Retrieve a Check
[**findDocument**](DefaultApi.md#findDocument) | **GET** /documents/{document_id} | A single document can be retrieved by calling this endpoint with the document’s unique identifier.
[**findLivePhoto**](DefaultApi.md#findLivePhoto) | **GET** /live_photos/{live_photo_id} | Retrieve live photo
[**findLiveVideo**](DefaultApi.md#findLiveVideo) | **GET** /live_videos/{live_video_id} | Retrieve live video
[**findReport**](DefaultApi.md#findReport) | **GET** /reports/{report_id} | A single report can be retrieved using this endpoint with the corresponding unique identifier.
[**findWebhook**](DefaultApi.md#findWebhook) | **GET** /webhooks/{webhook_id} | Retrieve a Webhook
[**generateSdkToken**](DefaultApi.md#generateSdkToken) | **POST** /sdk_token | Generate a SDK token
[**listApplicants**](DefaultApi.md#listApplicants) | **GET** /applicants | List Applicants
[**listChecks**](DefaultApi.md#listChecks) | **GET** /checks | Retrieve Checks
[**listDocuments**](DefaultApi.md#listDocuments) | **GET** /documents | List documents
[**listLivePhotos**](DefaultApi.md#listLivePhotos) | **GET** /live_photos | List live photos
[**listLiveVideos**](DefaultApi.md#listLiveVideos) | **GET** /live_videos | List live videos
[**listReports**](DefaultApi.md#listReports) | **GET** /reports | All the reports belonging to a particular check can be listed from this endpoint.
[**listWebhooks**](DefaultApi.md#listWebhooks) | **GET** /webhooks | List webhooks
[**restoreApplicant**](DefaultApi.md#restoreApplicant) | **POST** /applicants/{applicant_id}/restore | Restore Applicant
[**resumeCheck**](DefaultApi.md#resumeCheck) | **POST** /checks/{check_id}/resume | Resume a Check
[**resumeReport**](DefaultApi.md#resumeReport) | **POST** /reports/{report_id}/resume | This endpoint is for resuming individual paused reports.
[**updateApplicant**](DefaultApi.md#updateApplicant) | **PUT** /applicants/{applicant_id} | Update Applicant
[**uploadDocument**](DefaultApi.md#uploadDocument) | **POST** /documents | Upload a document
[**uploadLivePhoto**](DefaultApi.md#uploadLivePhoto) | **POST** /live_photos | Upload live photo


<a name="cancelReport"></a>
# **cancelReport**
> cancelReport(reportId)

This endpoint is for cancelling individual paused reports.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String reportId = "reportId_example"; // String | 
try {
    apiInstance.cancelReport(reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createApplicant"></a>
# **createApplicant**
> Applicant createApplicant(applicant)

Create Applicant

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Applicant applicant = new Applicant(); // Applicant | 
try {
    Applicant result = apiInstance.createApplicant(applicant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createApplicant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicant** | [**Applicant**](Applicant.md)|  |

### Return type

[**Applicant**](Applicant.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCheck"></a>
# **createCheck**
> Check createCheck(check)

Create a check

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Check check = new Check(); // Check | 
try {
    Check result = apiInstance.createCheck(check);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **check** | [**Check**](Check.md)|  |

### Return type

[**Check**](Check.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWebhook"></a>
# **createWebhook**
> Webhook createWebhook(webhook)

Create a webhook

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Webhook webhook = new Webhook(); // Webhook | 
try {
    Webhook result = apiInstance.createWebhook(webhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)|  |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookId)

Delete a webhook

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String webhookId = "webhookId_example"; // String | 
try {
    apiInstance.deleteWebhook(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="destroyApplicant"></a>
# **destroyApplicant**
> destroyApplicant(applicantId)

Delete Applicant

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    apiInstance.destroyApplicant(applicantId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#destroyApplicant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadDocument"></a>
# **downloadDocument**
> File downloadDocument(documentId)

Download a documents raw data

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String documentId = "documentId_example"; // String | 
try {
    File result = apiInstance.downloadDocument(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downloadDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="downloadLivePhoto"></a>
# **downloadLivePhoto**
> File downloadLivePhoto(livePhotoId)

Download live photo

Live photos are downloaded using this endpoint.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String livePhotoId = "livePhotoId_example"; // String | The live photo’s unique identifier.
try {
    File result = apiInstance.downloadLivePhoto(livePhotoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downloadLivePhoto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **livePhotoId** | **String**| The live photo’s unique identifier. |

### Return type

[**File**](File.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="downloadLiveVideo"></a>
# **downloadLiveVideo**
> File downloadLiveVideo(liveVideoId)

Download live video

Live videos are downloaded using this endpoint.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String liveVideoId = "liveVideoId_example"; // String | The live video’s unique identifier.
try {
    File result = apiInstance.downloadLiveVideo(liveVideoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downloadLiveVideo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveVideoId** | **String**| The live video’s unique identifier. |

### Return type

[**File**](File.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="editWebhook"></a>
# **editWebhook**
> Webhook editWebhook(webhookId, webhook)

Edit a webhook

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String webhookId = "webhookId_example"; // String | 
Webhook webhook = new Webhook(); // Webhook | 
try {
    Webhook result = apiInstance.editWebhook(webhookId, webhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#editWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**|  |
 **webhook** | [**Webhook**](Webhook.md)|  |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAddresses"></a>
# **findAddresses**
> AddressesList findAddresses(postcode)

Search for addresses by postcode

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String postcode = "postcode_example"; // String | 
try {
    AddressesList result = apiInstance.findAddresses(postcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcode** | **String**|  |

### Return type

[**AddressesList**](AddressesList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findApplicant"></a>
# **findApplicant**
> Applicant findApplicant(applicantId)

Retrieve Applicant

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    Applicant result = apiInstance.findApplicant(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findApplicant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

[**Applicant**](Applicant.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findCheck"></a>
# **findCheck**
> Check findCheck(checkId)

Retrieve a Check

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
try {
    Check result = apiInstance.findCheck(checkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |

### Return type

[**Check**](Check.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findDocument"></a>
# **findDocument**
> Document findDocument(documentId)

A single document can be retrieved by calling this endpoint with the document’s unique identifier.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String documentId = "documentId_example"; // String | 
try {
    Document result = apiInstance.findDocument(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**|  |

### Return type

[**Document**](Document.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLivePhoto"></a>
# **findLivePhoto**
> LivePhoto findLivePhoto(livePhotoId)

Retrieve live photo

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String livePhotoId = "livePhotoId_example"; // String | The live photo’s unique identifier.
try {
    LivePhoto result = apiInstance.findLivePhoto(livePhotoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findLivePhoto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **livePhotoId** | **String**| The live photo’s unique identifier. |

### Return type

[**LivePhoto**](LivePhoto.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLiveVideo"></a>
# **findLiveVideo**
> LiveVideo findLiveVideo(liveVideoId)

Retrieve live video

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String liveVideoId = "liveVideoId_example"; // String | The live video’s unique identifier.
try {
    LiveVideo result = apiInstance.findLiveVideo(liveVideoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findLiveVideo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveVideoId** | **String**| The live video’s unique identifier. |

### Return type

[**LiveVideo**](LiveVideo.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findReport"></a>
# **findReport**
> Report findReport(reportId)

A single report can be retrieved using this endpoint with the corresponding unique identifier.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String reportId = "reportId_example"; // String | 
try {
    Report result = apiInstance.findReport(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**|  |

### Return type

[**Report**](Report.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findWebhook"></a>
# **findWebhook**
> Webhook findWebhook(webhookId)

Retrieve a Webhook

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String webhookId = "webhookId_example"; // String | 
try {
    Webhook result = apiInstance.findWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**|  |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generateSdkToken"></a>
# **generateSdkToken**
> SdkToken generateSdkToken(sdkToken)

Generate a SDK token

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
SdkToken sdkToken = new SdkToken(); // SdkToken | 
try {
    SdkToken result = apiInstance.generateSdkToken(sdkToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#generateSdkToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdkToken** | [**SdkToken**](SdkToken.md)|  |

### Return type

[**SdkToken**](SdkToken.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listApplicants"></a>
# **listApplicants**
> ApplicantsList listApplicants(page, perPage, includeDeleted)

List Applicants

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer page = 1; // Integer | The page to return. The first page is `page=1`
Integer perPage = 20; // Integer | The number of objects per page.
Boolean includeDeleted = false; // Boolean | Whether to also include applicants scheduled for deletion.
try {
    ApplicantsList result = apiInstance.listApplicants(page, perPage, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listApplicants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page to return. The first page is &#x60;page&#x3D;1&#x60; | [optional] [default to 1]
 **perPage** | **Integer**| The number of objects per page. | [optional] [default to 20]
 **includeDeleted** | **Boolean**| Whether to also include applicants scheduled for deletion. | [optional] [default to false]

### Return type

[**ApplicantsList**](ApplicantsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listChecks"></a>
# **listChecks**
> ChecksList listChecks(applicantId)

Retrieve Checks

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    ChecksList result = apiInstance.listChecks(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listChecks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

[**ChecksList**](ChecksList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDocuments"></a>
# **listDocuments**
> DocumentsList listDocuments(applicantId)

List documents

All documents belonging to an applicant can be listed from this endpoint

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    DocumentsList result = apiInstance.listDocuments(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

[**DocumentsList**](DocumentsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLivePhotos"></a>
# **listLivePhotos**
> LivePhotosList listLivePhotos(applicantId)

List live photos

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | The id of the applicant the live photos belong to.
try {
    LivePhotosList result = apiInstance.listLivePhotos(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listLivePhotos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**| The id of the applicant the live photos belong to. |

### Return type

[**LivePhotosList**](LivePhotosList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLiveVideos"></a>
# **listLiveVideos**
> LiveVideosList listLiveVideos(applicantId)

List live videos

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | The id of the applicant the live videos belong to.
try {
    LiveVideosList result = apiInstance.listLiveVideos(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listLiveVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**| The id of the applicant the live videos belong to. |

### Return type

[**LiveVideosList**](LiveVideosList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listReports"></a>
# **listReports**
> ReportsList listReports(checkId)

All the reports belonging to a particular check can be listed from this endpoint.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
try {
    ReportsList result = apiInstance.listReports(checkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |

### Return type

[**ReportsList**](ReportsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWebhooks"></a>
# **listWebhooks**
> WebhooksList listWebhooks()

List webhooks

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    WebhooksList result = apiInstance.listWebhooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listWebhooks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksList**](WebhooksList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restoreApplicant"></a>
# **restoreApplicant**
> restoreApplicant(applicantId)

Restore Applicant

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    apiInstance.restoreApplicant(applicantId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restoreApplicant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resumeCheck"></a>
# **resumeCheck**
> resumeCheck(checkId)

Resume a Check

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
try {
    apiInstance.resumeCheck(checkId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#resumeCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resumeReport"></a>
# **resumeReport**
> resumeReport(reportId)

This endpoint is for resuming individual paused reports.

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String reportId = "reportId_example"; // String | 
try {
    apiInstance.resumeReport(reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#resumeReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplicant"></a>
# **updateApplicant**
> Applicant updateApplicant(applicantId, applicant)

Update Applicant

Allows updating of an applicant’s information before any checks are created. - Partial updates - Addresses and ID numbers present will replace existing ones - Same applicant validations to create applicant 

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
Applicant applicant = new Applicant(); // Applicant | 
try {
    Applicant result = apiInstance.updateApplicant(applicantId, applicant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateApplicant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **applicant** | [**Applicant**](Applicant.md)|  |

### Return type

[**Applicant**](Applicant.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadDocument"></a>
# **uploadDocument**
> Document uploadDocument(applicantId, type, file, side, issuingCountry)

Upload a document

Documents are uploaded using this endpoint. Along with the file upload the relevant document type must be specified. Documents must be uploaded as a multipart form. The valid file types are: jpg, png and pdf. The file size must be between 2KB and 3MB. 

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | The ID of the applicant whose document is being uploaded.
String type = "type_example"; // String | The type of document.
File file = new File("/path/to/file"); // File | The file to be uploaded.
String side = "side_example"; // String | Either the `front` or `back` of the document.
String issuingCountry = "issuingCountry_example"; // String | The issuing country of the document, a 3-letter ISO code.
try {
    Document result = apiInstance.uploadDocument(applicantId, type, file, side, issuingCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**| The ID of the applicant whose document is being uploaded. |
 **type** | **String**| The type of document. |
 **file** | **File**| The file to be uploaded. |
 **side** | **String**| Either the &#x60;front&#x60; or &#x60;back&#x60; of the document. | [optional]
 **issuingCountry** | **String**| The issuing country of the document, a 3-letter ISO code. | [optional]

### Return type

[**Document**](Document.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadLivePhoto"></a>
# **uploadLivePhoto**
> LivePhoto uploadLivePhoto(applicantId, file, advancedValidation)

Upload live photo

You can upload live photos to this endpoint. Like document upload, files must be uploaded as a multipart form. Valid file types are jpg, png and pdf. The file size must be between 32KB and 10MB. Live photos are validated at the point of upload to check that they contain exactly one face. This validation can be disabled by setting the advanced_validation argument to false. 

### Example
```java
// Import classes:
//import com.onfido.ApiClient;
//import com.onfido.ApiException;
//import com.onfido.Configuration;
//import com.onfido.auth.*;
//import com.onfido.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("Token");
tokenAuth.setApiKey("token=" + "YOUR API TOKEN");
tokenAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
File file = new File("/path/to/file"); // File | The file to be uploaded.
Boolean advancedValidation = true; // Boolean | Validates that the live photo contains exactly one face.
try {
    LivePhoto result = apiInstance.uploadLivePhoto(applicantId, file, advancedValidation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadLivePhoto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **file** | **File**| The file to be uploaded. |
 **advancedValidation** | **Boolean**| Validates that the live photo contains exactly one face. | [optional] [default to true]

### Return type

[**LivePhoto**](LivePhoto.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

