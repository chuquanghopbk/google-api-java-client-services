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

package com.google.api.services.logging.v2.model;

/**
 * Describes the customer-managed encryption key (CMEK) settings associated with a project, folder,
 * organization, billing account, or flexible resource.Note: CMEK for the Logs Router can currently
 * only be configured for GCP organizations. Once configured, it applies to all projects and folders
 * in the GCP organization.See Enabling CMEK for Logs Router for more information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CmekSettings extends com.google.api.client.json.GenericJson {

  /**
   * The resource name for the configured Cloud KMS key.KMS key name format:
   * "projects/PROJECT_ID/locations/LOCATION/keyRings/KEYRING/cryptoKeys/KEY"For example:  "projects
   * /my-project-id/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name"To enable CMEK
   * for the Logs Router, set this field to a valid kms_key_name for which the associated service
   * account has the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the
   * key.The Cloud KMS key used by the Log Router can be updated by changing the kms_key_name to a
   * new valid key name. Encryption operations that are in progress will be completed with the key
   * that was in use when they started. Decryption operations will be completed using the key that
   * was used at the time of encryption unless access to that key has been revoked.To disable CMEK
   * for the Logs Router, set this field to an empty string.See Enabling CMEK for Logs Router for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * Output only. The resource name of the CMEK settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The service account that will be used by the Logs Router to access your Cloud KMS
   * key.Before enabling CMEK for Logs Router, you must first assign the role
   * roles/cloudkms.cryptoKeyEncrypterDecrypter to the service account that the Logs Router will use
   * to access your Cloud KMS key. Use GetCmekSettings to obtain the service account ID.See Enabling
   * CMEK for Logs Router for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountId;

  /**
   * The resource name for the configured Cloud KMS key.KMS key name format:
   * "projects/PROJECT_ID/locations/LOCATION/keyRings/KEYRING/cryptoKeys/KEY"For example:  "projects
   * /my-project-id/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name"To enable CMEK
   * for the Logs Router, set this field to a valid kms_key_name for which the associated service
   * account has the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the
   * key.The Cloud KMS key used by the Log Router can be updated by changing the kms_key_name to a
   * new valid key name. Encryption operations that are in progress will be completed with the key
   * that was in use when they started. Decryption operations will be completed using the key that
   * was used at the time of encryption unless access to that key has been revoked.To disable CMEK
   * for the Logs Router, set this field to an empty string.See Enabling CMEK for Logs Router for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * The resource name for the configured Cloud KMS key.KMS key name format:
   * "projects/PROJECT_ID/locations/LOCATION/keyRings/KEYRING/cryptoKeys/KEY"For example:  "projects
   * /my-project-id/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name"To enable CMEK
   * for the Logs Router, set this field to a valid kms_key_name for which the associated service
   * account has the required roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the
   * key.The Cloud KMS key used by the Log Router can be updated by changing the kms_key_name to a
   * new valid key name. Encryption operations that are in progress will be completed with the key
   * that was in use when they started. Decryption operations will be completed using the key that
   * was used at the time of encryption unless access to that key has been revoked.To disable CMEK
   * for the Logs Router, set this field to an empty string.See Enabling CMEK for Logs Router for
   * more information.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public CmekSettings setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * Output only. The resource name of the CMEK settings.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the CMEK settings.
   * @param name name or {@code null} for none
   */
  public CmekSettings setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The service account that will be used by the Logs Router to access your Cloud KMS
   * key.Before enabling CMEK for Logs Router, you must first assign the role
   * roles/cloudkms.cryptoKeyEncrypterDecrypter to the service account that the Logs Router will use
   * to access your Cloud KMS key. Use GetCmekSettings to obtain the service account ID.See Enabling
   * CMEK for Logs Router for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountId() {
    return serviceAccountId;
  }

  /**
   * Output only. The service account that will be used by the Logs Router to access your Cloud KMS
   * key.Before enabling CMEK for Logs Router, you must first assign the role
   * roles/cloudkms.cryptoKeyEncrypterDecrypter to the service account that the Logs Router will use
   * to access your Cloud KMS key. Use GetCmekSettings to obtain the service account ID.See Enabling
   * CMEK for Logs Router for more information.
   * @param serviceAccountId serviceAccountId or {@code null} for none
   */
  public CmekSettings setServiceAccountId(java.lang.String serviceAccountId) {
    this.serviceAccountId = serviceAccountId;
    return this;
  }

  @Override
  public CmekSettings set(String fieldName, Object value) {
    return (CmekSettings) super.set(fieldName, value);
  }

  @Override
  public CmekSettings clone() {
    return (CmekSettings) super.clone();
  }

}
