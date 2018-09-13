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
 * An auxiliary table contains statistical information on the relative frequency of different quasi-
 * identifiers values. It has one or several quasi-identifiers columns, and one column that
 * indicates the relative frequency of each quasi-identifier tuple. If a tuple is present in the
 * data but not in the auxiliary table, the corresponding relative frequency is assumed to be zero
 * (and thus, the tuple is highly reidentifiable).
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
public final class GooglePrivacyDlpV2AuxiliaryTable extends com.google.api.client.json.GenericJson {

  /**
   * Quasi-identifier columns. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2QuasiIdField> quasiIds;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2QuasiIdField used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2QuasiIdField.class);
  }

  /**
   * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive).
   * Null values are assumed to be zero. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId relativeFrequency;

  /**
   * Auxiliary table location. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryTable table;

  /**
   * Quasi-identifier columns. [required]
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2QuasiIdField> getQuasiIds() {
    return quasiIds;
  }

  /**
   * Quasi-identifier columns. [required]
   * @param quasiIds quasiIds or {@code null} for none
   */
  public GooglePrivacyDlpV2AuxiliaryTable setQuasiIds(java.util.List<GooglePrivacyDlpV2QuasiIdField> quasiIds) {
    this.quasiIds = quasiIds;
    return this;
  }

  /**
   * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive).
   * Null values are assumed to be zero. [required]
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getRelativeFrequency() {
    return relativeFrequency;
  }

  /**
   * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive).
   * Null values are assumed to be zero. [required]
   * @param relativeFrequency relativeFrequency or {@code null} for none
   */
  public GooglePrivacyDlpV2AuxiliaryTable setRelativeFrequency(GooglePrivacyDlpV2FieldId relativeFrequency) {
    this.relativeFrequency = relativeFrequency;
    return this;
  }

  /**
   * Auxiliary table location. [required]
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable getTable() {
    return table;
  }

  /**
   * Auxiliary table location. [required]
   * @param table table or {@code null} for none
   */
  public GooglePrivacyDlpV2AuxiliaryTable setTable(GooglePrivacyDlpV2BigQueryTable table) {
    this.table = table;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2AuxiliaryTable set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2AuxiliaryTable) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2AuxiliaryTable clone() {
    return (GooglePrivacyDlpV2AuxiliaryTable) super.clone();
  }

}
