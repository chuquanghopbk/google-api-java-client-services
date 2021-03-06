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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Response to a request to list web apps for a given enterprise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListWebAppsResponse extends com.google.api.client.json.GenericJson {

  /**
   * If there are more results, a token to retrieve next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of web apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebApp> webApps;

  /**
   * If there are more results, a token to retrieve next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there are more results, a token to retrieve next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListWebAppsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of web apps.
   * @return value or {@code null} for none
   */
  public java.util.List<WebApp> getWebApps() {
    return webApps;
  }

  /**
   * The list of web apps.
   * @param webApps webApps or {@code null} for none
   */
  public ListWebAppsResponse setWebApps(java.util.List<WebApp> webApps) {
    this.webApps = webApps;
    return this;
  }

  @Override
  public ListWebAppsResponse set(String fieldName, Object value) {
    return (ListWebAppsResponse) super.set(fieldName, value);
  }

  @Override
  public ListWebAppsResponse clone() {
    return (ListWebAppsResponse) super.clone();
  }

}
