# onfido-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.onfido</groupId>
    <artifactId>onfido-java</artifactId>
    <version>1.1.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.onfido:onfido-java:1.1.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/onfido-java-1.1.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.onfido.*;
import com.onfido.auth.*;
import com.onfido.models.*;
import com.onfido.api.DefaultApi;

import java.time.LocalDate;
import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: Token
        ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
        Token.setApiKey("token=" + "YOUR API KEY");
        Token.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        // setting applicant details
        Applicant applicant = new Applicant();
        applicant.setFirstName("John");
        applicant.setLastName("Smith");
        applicant.setDob(LocalDate.parse("1980-01-22"));
        applicant.setCountry("GBR");

        Address address = new Address();
        address.setBuildingNumber("100");
        address.setStreet("Main Street");
        address.setTown("London");
        address.setPostcode("SW4 6EH");
        address.setCountry("GBR");

        List<Address> addresses = new ArrayList<Address>();
        addresses.add(address);
        applicant.setAddresses(addresses);

        // setting check request details
        CheckCreationRequest check = new CheckCreationRequest();
        check.setType("express");

        Report report = new Report();
        report.setName("identity");

        List<Report> reports = new ArrayList<Report>();
        reports.add(report);
        check.setReports(reports);
        try {
            Applicant newApplicant = apiInstance.createApplicant(applicant);
            String applicantId = newApplicant.getId();
            check.setApplicantId(applicantId);
            Check newCheck = apiInstance.createCheck(check);
            System.out.println(newCheck);
        } catch (ApiException e) {
            System.err.println("Exception creating an applicant/check");
            System.err.println(e.getResponseBody());
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.onfido.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**cancelReport**](docs/DefaultApi.md#cancelReport) | **POST** /checks/{check_id}/reports/{report_id}/cancel | This endpoint is for cancelling individual paused reports.
*DefaultApi* | [**createApplicant**](docs/DefaultApi.md#createApplicant) | **POST** /applicants | Create Applicant
*DefaultApi* | [**createCheck**](docs/DefaultApi.md#createCheck) | **POST** /applicants/{applicant_id}/checks | Create a check
*DefaultApi* | [**createWebhook**](docs/DefaultApi.md#createWebhook) | **POST** /webhooks | Create a webhook
*DefaultApi* | [**destroyApplicant**](docs/DefaultApi.md#destroyApplicant) | **DELETE** /applicants/{applicant_id} | Delete Applicant
*DefaultApi* | [**downloadDocument**](docs/DefaultApi.md#downloadDocument) | **GET** /applicants/{applicant_id}/documents/{document_id}/download | Download a documents raw data
*DefaultApi* | [**downloadLivePhoto**](docs/DefaultApi.md#downloadLivePhoto) | **GET** /live_photos/{live_photo_id}/download | Download live photo
*DefaultApi* | [**findAddresses**](docs/DefaultApi.md#findAddresses) | **GET** /addresses/pick | Search for addresses by postcode
*DefaultApi* | [**findApplicant**](docs/DefaultApi.md#findApplicant) | **GET** /applicants/{applicant_id} | Retrieve Applicant
*DefaultApi* | [**findCheck**](docs/DefaultApi.md#findCheck) | **GET** /applicants/{applicant_id}/checks/{check_id} | Retrieve a Check
*DefaultApi* | [**findDocument**](docs/DefaultApi.md#findDocument) | **GET** /applicants/{applicant_id}/documents/{document_id} | A single document can be retrieved by calling this endpoint with the document’s unique identifier.
*DefaultApi* | [**findLivePhoto**](docs/DefaultApi.md#findLivePhoto) | **GET** /live_photos/{live_photo_id} | Retrieve live photo
*DefaultApi* | [**findReport**](docs/DefaultApi.md#findReport) | **GET** /checks/{check_id}/reports/{report_id} | A single report can be retrieved using this endpoint with the corresponding unique identifier.
*DefaultApi* | [**findReportTypeGroup**](docs/DefaultApi.md#findReportTypeGroup) | **GET** /report_type_groups/{report_type_group_id} | Retrieve single report type group object
*DefaultApi* | [**findWebhook**](docs/DefaultApi.md#findWebhook) | **GET** /webhooks/{webhook_id} | Retrieve a Webhook
*DefaultApi* | [**listApplicants**](docs/DefaultApi.md#listApplicants) | **GET** /applicants | List Applicants
*DefaultApi* | [**listChecks**](docs/DefaultApi.md#listChecks) | **GET** /applicants/{applicant_id}/checks | Retrieve Checks
*DefaultApi* | [**listDocuments**](docs/DefaultApi.md#listDocuments) | **GET** /applicants/{applicant_id}/documents | List documents
*DefaultApi* | [**listLivePhotos**](docs/DefaultApi.md#listLivePhotos) | **GET** /live_photos | List live photos
*DefaultApi* | [**listReportTypeGroups**](docs/DefaultApi.md#listReportTypeGroups) | **GET** /report_type_groups | Retrieve all report type groups
*DefaultApi* | [**listReports**](docs/DefaultApi.md#listReports) | **GET** /checks/{check_id}/reports | All the reports belonging to a particular check can be listed from this endpoint.
*DefaultApi* | [**listWebhooks**](docs/DefaultApi.md#listWebhooks) | **GET** /webhooks | List webhooks
*DefaultApi* | [**resumeCheck**](docs/DefaultApi.md#resumeCheck) | **POST** /checks/{check_id}/resume | Resume a Check
*DefaultApi* | [**resumeReport**](docs/DefaultApi.md#resumeReport) | **POST** /checks/{check_id}/reports/{report_id}/resume | This endpoint is for resuming individual paused reports.
*DefaultApi* | [**updateApplicant**](docs/DefaultApi.md#updateApplicant) | **PUT** /applicants/{applicant_id} | Update Applicant
*DefaultApi* | [**uploadDocument**](docs/DefaultApi.md#uploadDocument) | **POST** /applicants/{applicant_id}/documents | Upload a document
*DefaultApi* | [**uploadLivePhoto**](docs/DefaultApi.md#uploadLivePhoto) | **POST** /live_photos | Upload live photo


## Documentation for Models

 - [Address](docs/Address.md)
 - [Applicant](docs/Applicant.md)
 - [ApplicantsList](docs/ApplicantsList.md)
 - [Check](docs/Check.md)
 - [CheckCreationRequest](docs/CheckCreationRequest.md)
 - [ChecksList](docs/ChecksList.md)
 - [Document](docs/Document.md)
 - [DocumentsList](docs/DocumentsList.md)
 - [Error](docs/Error.md)
 - [GenericAddress](docs/GenericAddress.md)
 - [GenericAddressesList](docs/GenericAddressesList.md)
 - [IdNumber](docs/IdNumber.md)
 - [LivePhoto](docs/LivePhoto.md)
 - [LivePhotosList](docs/LivePhotosList.md)
 - [Report](docs/Report.md)
 - [ReportType](docs/ReportType.md)
 - [ReportTypeGroup](docs/ReportTypeGroup.md)
 - [ReportTypeGroupsList](docs/ReportTypeGroupsList.md)
 - [ReportTypeOption](docs/ReportTypeOption.md)
 - [ReportsList](docs/ReportsList.md)
 - [Webhook](docs/Webhook.md)
 - [WebhooksList](docs/WebhooksList.md)

