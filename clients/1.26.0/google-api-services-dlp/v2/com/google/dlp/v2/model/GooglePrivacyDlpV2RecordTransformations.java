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
 * A type of transformation that is applied over structured data such as a table.
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
public final class GooglePrivacyDlpV2RecordTransformations extends com.google.api.client.json.GenericJson {

  /**
   * Transform the record by applying various field transformations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2FieldTransformation> fieldTransformations;

  /**
   * Configuration defining which records get suppressed entirely. Records that match any
   * suppression rule are omitted from the output [optional].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2RecordSuppression> recordSuppressions;

  /**
   * Transform the record by applying various field transformations.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2FieldTransformation> getFieldTransformations() {
    return fieldTransformations;
  }

  /**
   * Transform the record by applying various field transformations.
   * @param fieldTransformations fieldTransformations or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordTransformations setFieldTransformations(java.util.List<GooglePrivacyDlpV2FieldTransformation> fieldTransformations) {
    this.fieldTransformations = fieldTransformations;
    return this;
  }

  /**
   * Configuration defining which records get suppressed entirely. Records that match any
   * suppression rule are omitted from the output [optional].
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2RecordSuppression> getRecordSuppressions() {
    return recordSuppressions;
  }

  /**
   * Configuration defining which records get suppressed entirely. Records that match any
   * suppression rule are omitted from the output [optional].
   * @param recordSuppressions recordSuppressions or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordTransformations setRecordSuppressions(java.util.List<GooglePrivacyDlpV2RecordSuppression> recordSuppressions) {
    this.recordSuppressions = recordSuppressions;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2RecordTransformations set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2RecordTransformations) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2RecordTransformations clone() {
    return (GooglePrivacyDlpV2RecordTransformations) super.clone();
  }

}
