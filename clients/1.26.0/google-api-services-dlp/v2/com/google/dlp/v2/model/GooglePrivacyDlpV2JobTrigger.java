/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.dlp.v2.model;

/**
 * Contains a configuration to make dlp api calls on a repeating basis. See
 * https://cloud.google.com/dlp/docs/concepts-job-triggers to learn more.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2JobTrigger extends com.google.api.client.json.GenericJson {

  /**
   * The creation timestamp of a triggeredJob, output only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * User provided description (max 256 chars)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name (max 100 chars)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A stream of errors encountered when the trigger was activated. Repeated errors may result in
   * the JobTrigger automaticaly being paused. Will return the last 100 errors. Whenever the
   * JobTrigger is modified this list will be cleared. Output only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Error> errors;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Error used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Error.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InspectJobConfig inspectJob;

  /**
   * The timestamp of the last time this trigger executed, output only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastRunTime;

  /**
   * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is
   * created, for example `projects/dlp-test-project/triggeredJobs/53234423`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A status for this trigger. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a
   * job to be started. The list may contain only a single Schedule trigger and must have at least
   * one object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Trigger> triggers;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Trigger used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Trigger.class);
  }

  /**
   * The last update timestamp of a triggeredJob, output only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The creation timestamp of a triggeredJob, output only field.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation timestamp of a triggeredJob, output only field.
   * @param createTime createTime or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * User provided description (max 256 chars)
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User provided description (max 256 chars)
   * @param description description or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name (max 100 chars)
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name (max 100 chars)
   * @param displayName displayName or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A stream of errors encountered when the trigger was activated. Repeated errors may result in
   * the JobTrigger automaticaly being paused. Will return the last 100 errors. Whenever the
   * JobTrigger is modified this list will be cleared. Output only field.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Error> getErrors() {
    return errors;
  }

  /**
   * A stream of errors encountered when the trigger was activated. Repeated errors may result in
   * the JobTrigger automaticaly being paused. Will return the last 100 errors. Whenever the
   * JobTrigger is modified this list will be cleared. Output only field.
   * @param errors errors or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setErrors(java.util.List<GooglePrivacyDlpV2Error> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectJobConfig getInspectJob() {
    return inspectJob;
  }

  /**
   * @param inspectJob inspectJob or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setInspectJob(GooglePrivacyDlpV2InspectJobConfig inspectJob) {
    this.inspectJob = inspectJob;
    return this;
  }

  /**
   * The timestamp of the last time this trigger executed, output only field.
   * @return value or {@code null} for none
   */
  public String getLastRunTime() {
    return lastRunTime;
  }

  /**
   * The timestamp of the last time this trigger executed, output only field.
   * @param lastRunTime lastRunTime or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setLastRunTime(String lastRunTime) {
    this.lastRunTime = lastRunTime;
    return this;
  }

  /**
   * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is
   * created, for example `projects/dlp-test-project/triggeredJobs/53234423`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is
   * created, for example `projects/dlp-test-project/triggeredJobs/53234423`.
   * @param name name or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A status for this trigger. [required]
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * A status for this trigger. [required]
   * @param status status or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a
   * job to be started. The list may contain only a single Schedule trigger and must have at least
   * one object.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Trigger> getTriggers() {
    return triggers;
  }

  /**
   * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a
   * job to be started. The list may contain only a single Schedule trigger and must have at least
   * one object.
   * @param triggers triggers or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setTriggers(java.util.List<GooglePrivacyDlpV2Trigger> triggers) {
    this.triggers = triggers;
    return this;
  }

  /**
   * The last update timestamp of a triggeredJob, output only field.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last update timestamp of a triggeredJob, output only field.
   * @param updateTime updateTime or {@code null} for none
   */
  public GooglePrivacyDlpV2JobTrigger setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2JobTrigger set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2JobTrigger) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2JobTrigger clone() {
    return (GooglePrivacyDlpV2JobTrigger) super.clone();
  }

}
