# DefaultApi

All URIs are relative to *https://api.onfido.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelReport**](DefaultApi.md#cancelReport) | **POST** /checks/{check_id}/reports/{report_id}/cancel | This endpoint is for cancelling individual paused reports.
[**createApplicant**](DefaultApi.md#createApplicant) | **POST** /applicants | Create Applicant
[**createCheck**](DefaultApi.md#createCheck) | **POST** /applicants/{applicant_id}/checks | Create a check
[**createWebhook**](DefaultApi.md#createWebhook) | **POST** /webhooks | Create a webhook
[**destroyApplicant**](DefaultApi.md#destroyApplicant) | **DELETE** /applicants/{applicant_id} | Delete Applicant
[**downloadDocument**](DefaultApi.md#downloadDocument) | **GET** /applicants/{applicant_id}/documents/{document_id}/download | Download a documents raw data
[**downloadLivePhoto**](DefaultApi.md#downloadLivePhoto) | **GET** /live_photos/{live_photo_id}/download | Download live photo
[**findAddresses**](DefaultApi.md#findAddresses) | **GET** /addresses/pick | Search for addresses by postcode
[**findApplicant**](DefaultApi.md#findApplicant) | **GET** /applicants/{applicant_id} | Retrieve Applicant
[**findCheck**](DefaultApi.md#findCheck) | **GET** /applicants/{applicant_id}/checks/{check_id} | Retrieve a Check
[**findDocument**](DefaultApi.md#findDocument) | **GET** /applicants/{applicant_id}/documents/{document_id} | A single document can be retrieved by calling this endpoint with the document’s unique identifier.
[**findLivePhoto**](DefaultApi.md#findLivePhoto) | **GET** /live_photos/{live_photo_id} | Retrieve live photo
[**findReport**](DefaultApi.md#findReport) | **GET** /checks/{check_id}/reports/{report_id} | A single report can be retrieved using this endpoint with the corresponding unique identifier.
[**findReportTypeGroup**](DefaultApi.md#findReportTypeGroup) | **GET** /report_type_groups/{report_type_group_id} | Retrieve single report type group object
[**findWebhook**](DefaultApi.md#findWebhook) | **GET** /webhooks/{webhook_id} | Retrieve a Webhook
[**listApplicants**](DefaultApi.md#listApplicants) | **GET** /applicants | List Applicants
[**listChecks**](DefaultApi.md#listChecks) | **GET** /applicants/{applicant_id}/checks | Retrieve Checks
[**listDocuments**](DefaultApi.md#listDocuments) | **GET** /applicants/{applicant_id}/documents | List documents
[**listLivePhotos**](DefaultApi.md#listLivePhotos) | **GET** /live_photos | List live photos
[**listReportTypeGroups**](DefaultApi.md#listReportTypeGroups) | **GET** /report_type_groups | Retrieve all report type groups
[**listReports**](DefaultApi.md#listReports) | **GET** /checks/{check_id}/reports | All the reports belonging to a particular check can be listed from this endpoint.
[**listWebhooks**](DefaultApi.md#listWebhooks) | **GET** /webhooks | List webhooks
[**resumeCheck**](DefaultApi.md#resumeCheck) | **POST** /checks/{check_id}/resume | Resume a Check
[**resumeReport**](DefaultApi.md#resumeReport) | **POST** /checks/{check_id}/reports/{report_id}/resume | This endpoint is for resuming individual paused reports.
[**updateApplicant**](DefaultApi.md#updateApplicant) | **PUT** /applicants/{applicant_id} | Update Applicant
[**uploadDocument**](DefaultApi.md#uploadDocument) | **POST** /applicants/{applicant_id}/documents | Upload a document
[**uploadLivePhoto**](DefaultApi.md#uploadLivePhoto) | **POST** /live_photos | Upload live photo


<a name="cancelReport"></a>
# **cancelReport**
> cancelReport(checkId, reportId)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
String reportId = "reportId_example"; // String | 
try {
    apiInstance.cancelReport(checkId, reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelReport");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |
 **reportId** | **String**|  |

### Return type

null (empty response body)

<a name="createApplicant"></a>
# **createApplicant**
> Applicant createApplicant(data)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Applicant data = new Applicant(); // Applicant | 
try {
    Applicant result = apiInstance.createApplicant(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createApplicant");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Applicant**](Applicant.md)|  | [optional]

### Return type

[**Applicant**](Applicant.md)

<a name="createCheck"></a>
# **createCheck**
> Check createCheck(applicantId, data)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
CheckCreationRequest data = new CheckCreationRequest(); // CheckCreationRequest | 
try {
    Check result = apiInstance.createCheck(applicantId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createCheck");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **data** | [**CheckCreationRequest**](CheckCreationRequest.md)|  | [optional]

### Return type

[**Check**](Check.md)

<a name="createWebhook"></a>
# **createWebhook**
> Webhook createWebhook(data)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Webhook data = new Webhook(); // Webhook | 
try {
    Webhook result = apiInstance.createWebhook(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createWebhook");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Webhook**](Webhook.md)|  | [optional]

### Return type

[**Webhook**](Webhook.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    apiInstance.destroyApplicant(applicantId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#destroyApplicant");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

null (empty response body)

<a name="downloadDocument"></a>
# **downloadDocument**
> File downloadDocument(applicantId, documentId)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
String documentId = "documentId_example"; // String | 
try {
    File result = apiInstance.downloadDocument(applicantId, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downloadDocument");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **documentId** | **String**|  |

### Return type

[**File**](File.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String livePhotoId = "livePhotoId_example"; // String | The live photo’s unique identifier.
try {
    File result = apiInstance.downloadLivePhoto(livePhotoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downloadLivePhoto");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **livePhotoId** | **String**| The live photo’s unique identifier. |

### Return type

[**File**](File.md)

<a name="findAddresses"></a>
# **findAddresses**
> GenericAddressesList findAddresses(postcode)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String postcode = "postcode_example"; // String | 
try {
    GenericAddressesList result = apiInstance.findAddresses(postcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findAddresses");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcode** | **String**|  |

### Return type

[**GenericAddressesList**](GenericAddressesList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    Applicant result = apiInstance.findApplicant(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findApplicant");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

[**Applicant**](Applicant.md)

<a name="findCheck"></a>
# **findCheck**
> Check findCheck(applicantId, checkId)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
String checkId = "checkId_example"; // String | 
try {
    Check result = apiInstance.findCheck(applicantId, checkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findCheck");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **checkId** | **String**|  |

### Return type

[**Check**](Check.md)

<a name="findDocument"></a>
# **findDocument**
> Document findDocument(applicantId, documentId)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
String documentId = "documentId_example"; // String | 
try {
    Document result = apiInstance.findDocument(applicantId, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findDocument");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **documentId** | **String**|  |

### Return type

[**Document**](Document.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String livePhotoId = "livePhotoId_example"; // String | The live photo’s unique identifier.
try {
    LivePhoto result = apiInstance.findLivePhoto(livePhotoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findLivePhoto");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **livePhotoId** | **String**| The live photo’s unique identifier. |

### Return type

[**LivePhoto**](LivePhoto.md)

<a name="findReport"></a>
# **findReport**
> Report findReport(checkId, reportId)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
String reportId = "reportId_example"; // String | 
try {
    Report result = apiInstance.findReport(checkId, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findReport");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |
 **reportId** | **String**|  |

### Return type

[**Report**](Report.md)

<a name="findReportTypeGroup"></a>
# **findReportTypeGroup**
> ReportTypeGroup findReportTypeGroup(reportTypeGroupId)

Retrieve single report type group object

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String reportTypeGroupId = "reportTypeGroupId_example"; // String | 
try {
    ReportTypeGroup result = apiInstance.findReportTypeGroup(reportTypeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findReportTypeGroup");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportTypeGroupId** | **String**|  |

### Return type

[**ReportTypeGroup**](ReportTypeGroup.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String webhookId = "webhookId_example"; // String | 
try {
    Webhook result = apiInstance.findWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findWebhook");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**|  |

### Return type

[**Webhook**](Webhook.md)

<a name="listApplicants"></a>
# **listApplicants**
> ApplicantsList listApplicants()

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApplicantsList result = apiInstance.listApplicants();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listApplicants");
    System.err.println(e.getResponseBody());
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApplicantsList**](ApplicantsList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    ChecksList result = apiInstance.listChecks(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listChecks");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

[**ChecksList**](ChecksList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
try {
    DocumentsList result = apiInstance.listDocuments(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listDocuments");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |

### Return type

[**DocumentsList**](DocumentsList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | The id of the applicant the live photos belongs to.
try {
    LivePhotosList result = apiInstance.listLivePhotos(applicantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listLivePhotos");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**| The id of the applicant the live photos belongs to. |

### Return type

[**LivePhotosList**](LivePhotosList.md)

<a name="listReportTypeGroups"></a>
# **listReportTypeGroups**
> ReportTypeGroupsList listReportTypeGroups()

Retrieve all report type groups

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ReportTypeGroupsList result = apiInstance.listReportTypeGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listReportTypeGroups");
    System.err.println(e.getResponseBody());
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportTypeGroupsList**](ReportTypeGroupsList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
try {
    ReportsList result = apiInstance.listReports(checkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listReports");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |

### Return type

[**ReportsList**](ReportsList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    WebhooksList result = apiInstance.listWebhooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listWebhooks");
    System.err.println(e.getResponseBody());
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksList**](WebhooksList.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
try {
    apiInstance.resumeCheck(checkId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#resumeCheck");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |

### Return type

null (empty response body)

<a name="resumeReport"></a>
# **resumeReport**
> resumeReport(checkId, reportId)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String checkId = "checkId_example"; // String | 
String reportId = "reportId_example"; // String | 
try {
    apiInstance.resumeReport(checkId, reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#resumeReport");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **String**|  |
 **reportId** | **String**|  |

### Return type

null (empty response body)

<a name="updateApplicant"></a>
# **updateApplicant**
> Applicant updateApplicant(applicantId, data)

Update Applicant

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
Applicant data = new Applicant(); // Applicant | 
try {
    Applicant result = apiInstance.updateApplicant(applicantId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateApplicant");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **data** | [**Applicant**](Applicant.md)|  | [optional]

### Return type

[**Applicant**](Applicant.md)

<a name="uploadDocument"></a>
# **uploadDocument**
> Document uploadDocument(applicantId, type, side, file)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | 
String type = "type_example"; // String | 
String side = "side_example"; // String | 
File file = new File("/path/to/file.txt"); // File | 
try {
    Document result = apiInstance.uploadDocument(applicantId, type, side, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadDocument");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**|  |
 **type** | **String**|  |
 **side** | **String**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

[**Document**](Document.md)

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
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("token=" + "YOUR API KEY");
Token.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String applicantId = "applicantId_example"; // String | The applicant_id to associate the live photo to.
File file = new File("/path/to/file.txt"); // File | The file to be uploaded.
Boolean advancedValidation = true; // Boolean | Validates that the live photo contains exactly one face.
try {
    LivePhoto result = apiInstance.uploadLivePhoto(applicantId, file, advancedValidation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadLivePhoto");
    System.err.println(e.getResponseBody());
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **String**| The applicant_id to associate the live photo to. |
 **file** | **File**| The file to be uploaded. |
 **advancedValidation** | **Boolean**| Validates that the live photo contains exactly one face. | [optional]

### Return type

[**LivePhoto**](LivePhoto.md)

