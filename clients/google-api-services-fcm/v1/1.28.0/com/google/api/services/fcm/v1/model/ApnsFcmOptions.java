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

package com.google.api.services.fcm.v1.model;

/**
 * Options for features provided by the FCM SDK for iOS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Cloud Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApnsFcmOptions extends com.google.api.client.json.GenericJson {

  /**
   * Label associated with the message's analytics data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analyticsLabel;

  /**
   * Contains the URL of an image that is going to be displayed in a notification. If present, it
   * will override google.firebase.fcm.v1.Notification.image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String image;

  /**
   * Label associated with the message's analytics data.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalyticsLabel() {
    return analyticsLabel;
  }

  /**
   * Label associated with the message's analytics data.
   * @param analyticsLabel analyticsLabel or {@code null} for none
   */
  public ApnsFcmOptions setAnalyticsLabel(java.lang.String analyticsLabel) {
    this.analyticsLabel = analyticsLabel;
    return this;
  }

  /**
   * Contains the URL of an image that is going to be displayed in a notification. If present, it
   * will override google.firebase.fcm.v1.Notification.image.
   * @return value or {@code null} for none
   */
  public java.lang.String getImage() {
    return image;
  }

  /**
   * Contains the URL of an image that is going to be displayed in a notification. If present, it
   * will override google.firebase.fcm.v1.Notification.image.
   * @param image image or {@code null} for none
   */
  public ApnsFcmOptions setImage(java.lang.String image) {
    this.image = image;
    return this;
  }

  @Override
  public ApnsFcmOptions set(String fieldName, Object value) {
    return (ApnsFcmOptions) super.set(fieldName, value);
  }

  @Override
  public ApnsFcmOptions clone() {
    return (ApnsFcmOptions) super.clone();
  }

}
