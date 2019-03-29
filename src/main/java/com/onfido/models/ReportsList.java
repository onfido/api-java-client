/*
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
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
import com.onfido.models.Report;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-29T09:56:49.532Z[GMT]")
public class ReportsList {
  public static final String SERIALIZED_NAME_REPORTS = "reports";
  @SerializedName(SERIALIZED_NAME_REPORTS)
  private List<Report> reports = new ArrayList<>();

  public ReportsList reports(List<Report> reports) {
    this.reports = reports;
    return this;
  }

  public ReportsList addReportsItem(Report reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(value = "")
  public List<Report> getReports() {
    return reports;
  }

  public void setReports(List<Report> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportsList reportsList = (ReportsList) o;
    return Objects.equals(this.reports, reportsList.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsList {\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

