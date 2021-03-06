/*
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Check
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T16:30:58.546Z[GMT]")
public class Check {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_DOWNLOAD_URI = "download_uri";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URI)
  private String downloadUri;

  public static final String SERIALIZED_NAME_FORM_URI = "form_uri";
  @SerializedName(SERIALIZED_NAME_FORM_URI)
  private String formUri;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_RESULTS_URI = "results_uri";
  @SerializedName(SERIALIZED_NAME_RESULTS_URI)
  private String resultsUri;

  public static final String SERIALIZED_NAME_REPORT_NAMES = "report_names";
  @SerializedName(SERIALIZED_NAME_REPORT_NAMES)
  private List<String> reportNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICANT_ID = "applicant_id";
  @SerializedName(SERIALIZED_NAME_APPLICANT_ID)
  private String applicantId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICANT_PROVIDES_DATA = "applicant_provides_data";
  @SerializedName(SERIALIZED_NAME_APPLICANT_PROVIDES_DATA)
  private Boolean applicantProvidesData;

  public static final String SERIALIZED_NAME_SUPPRESS_FORM_EMAILS = "suppress_form_emails";
  @SerializedName(SERIALIZED_NAME_SUPPRESS_FORM_EMAILS)
  private Boolean suppressFormEmails;

  public static final String SERIALIZED_NAME_ASYNCHRONOUS = "asynchronous";
  @SerializedName(SERIALIZED_NAME_ASYNCHRONOUS)
  private Boolean asynchronous;

  public static final String SERIALIZED_NAME_REPORT_IDS = "report_ids";
  @SerializedName(SERIALIZED_NAME_REPORT_IDS)
  private List<String> reportIds = new ArrayList<>();

   /**
   * The unique identifier for the check. Read-only.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the check. Read-only.")
  public String getId() {
    return id;
  }

   /**
   * The date and time when this check was created. Read-only.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The date and time when this check was created. Read-only.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * The uri of this resource. Read-only.
   * @return href
  **/
  @ApiModelProperty(value = "The uri of this resource. Read-only.")
  public String getHref() {
    return href;
  }

   /**
   * The current state of the check in the checking process. Read-only.
   * @return status
  **/
  @ApiModelProperty(value = "The current state of the check in the checking process. Read-only.")
  public String getStatus() {
    return status;
  }

   /**
   * The overall result of the check, based on the results of the constituent reports. Read-only.
   * @return result
  **/
  @ApiModelProperty(value = "The overall result of the check, based on the results of the constituent reports. Read-only.")
  public String getResult() {
    return result;
  }

   /**
   * A link to a PDF output of the check results. Append &#x60;.pdf&#x60; to get the pdf file. Read-only.
   * @return downloadUri
  **/
  @ApiModelProperty(value = "A link to a PDF output of the check results. Append `.pdf` to get the pdf file. Read-only.")
  public String getDownloadUri() {
    return downloadUri;
  }

   /**
   * A link to the applicant form, if &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;. Read-only.
   * @return formUri
  **/
  @ApiModelProperty(value = "A link to the applicant form, if `applicant_provides_data` is `true`. Read-only.")
  public String getFormUri() {
    return formUri;
  }

   /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, redirect to this URI when the applicant has submitted their data. Read-only.
   * @return redirectUri
  **/
  @ApiModelProperty(value = "For checks where `applicant_provides_data` is `true`, redirect to this URI when the applicant has submitted their data. Read-only.")
  public String getRedirectUri() {
    return redirectUri;
  }

   /**
   * A link to the corresponding results page on the Onfido dashboard.
   * @return resultsUri
  **/
  @ApiModelProperty(value = "A link to the corresponding results page on the Onfido dashboard.")
  public String getResultsUri() {
    return resultsUri;
  }

  public Check reportNames(List<String> reportNames) {
    this.reportNames = reportNames;
    return this;
  }

  public Check addReportNamesItem(String reportNamesItem) {
    if (this.reportNames == null) {
      this.reportNames = new ArrayList<>();
    }
    this.reportNames.add(reportNamesItem);
    return this;
  }

   /**
   * An array of report names (strings).
   * @return reportNames
  **/
  @ApiModelProperty(value = "An array of report names (strings).")
  public List<String> getReportNames() {
    return reportNames;
  }

  public void setReportNames(List<String> reportNames) {
    this.reportNames = reportNames;
  }

  public Check applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The ID of the applicant to do the check on.
   * @return applicantId
  **/
  @ApiModelProperty(value = "The ID of the applicant to do the check on.")
  public String getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }

  public Check tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Check addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Array of tags being assigned to this check.
   * @return tags
  **/
  @ApiModelProperty(value = "Array of tags being assigned to this check.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Check applicantProvidesData(Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
    return this;
  }

   /**
   * Send an applicant form to applicant to complete to proceed with check. Defaults to false. 
   * @return applicantProvidesData
  **/
  @ApiModelProperty(value = "Send an applicant form to applicant to complete to proceed with check. Defaults to false. ")
  public Boolean getApplicantProvidesData() {
    return applicantProvidesData;
  }

  public void setApplicantProvidesData(Boolean applicantProvidesData) {
    this.applicantProvidesData = applicantProvidesData;
  }

  public Check suppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
    return this;
  }

   /**
   * For checks where &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;, applicant form will not be automatically sent if &#x60;suppress_form_emails&#x60; is set to &#x60;true&#x60;. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. 
   * @return suppressFormEmails
  **/
  @ApiModelProperty(value = "For checks where `applicant_provides_data` is `true`, applicant form will not be automatically sent if `suppress_form_emails` is set to `true`. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. Defaults to false. ")
  public Boolean getSuppressFormEmails() {
    return suppressFormEmails;
  }

  public void setSuppressFormEmails(Boolean suppressFormEmails) {
    this.suppressFormEmails = suppressFormEmails;
  }

  public Check asynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
    return this;
  }

   /**
   * Defaults to &#x60;true&#x60;. Write-only. If set to &#x60;false&#x60;, you will only receive a response when all reports in your check have completed. 
   * @return asynchronous
  **/
  @ApiModelProperty(value = "Defaults to `true`. Write-only. If set to `false`, you will only receive a response when all reports in your check have completed. ")
  public Boolean getAsynchronous() {
    return asynchronous;
  }

  public void setAsynchronous(Boolean asynchronous) {
    this.asynchronous = asynchronous;
  }

  public Check reportIds(List<String> reportIds) {
    this.reportIds = reportIds;
    return this;
  }

  public Check addReportIdsItem(String reportIdsItem) {
    if (this.reportIds == null) {
      this.reportIds = new ArrayList<>();
    }
    this.reportIds.add(reportIdsItem);
    return this;
  }

   /**
   * An array of report ids.
   * @return reportIds
  **/
  @ApiModelProperty(value = "An array of report ids.")
  public List<String> getReportIds() {
    return reportIds;
  }

  public void setReportIds(List<String> reportIds) {
    this.reportIds = reportIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Check check = (Check) o;
    return Objects.equals(this.id, check.id) &&
        Objects.equals(this.createdAt, check.createdAt) &&
        Objects.equals(this.href, check.href) &&
        Objects.equals(this.status, check.status) &&
        Objects.equals(this.result, check.result) &&
        Objects.equals(this.downloadUri, check.downloadUri) &&
        Objects.equals(this.formUri, check.formUri) &&
        Objects.equals(this.redirectUri, check.redirectUri) &&
        Objects.equals(this.resultsUri, check.resultsUri) &&
        Objects.equals(this.reportNames, check.reportNames) &&
        Objects.equals(this.applicantId, check.applicantId) &&
        Objects.equals(this.tags, check.tags) &&
        Objects.equals(this.applicantProvidesData, check.applicantProvidesData) &&
        Objects.equals(this.suppressFormEmails, check.suppressFormEmails) &&
        Objects.equals(this.asynchronous, check.asynchronous) &&
        Objects.equals(this.reportIds, check.reportIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, status, result, downloadUri, formUri, redirectUri, resultsUri, reportNames, applicantId, tags, applicantProvidesData, suppressFormEmails, asynchronous, reportIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    formUri: ").append(toIndentedString(formUri)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
    sb.append("    reportNames: ").append(toIndentedString(reportNames)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applicantProvidesData: ").append(toIndentedString(applicantProvidesData)).append("\n");
    sb.append("    suppressFormEmails: ").append(toIndentedString(suppressFormEmails)).append("\n");
    sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
    sb.append("    reportIds: ").append(toIndentedString(reportIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

