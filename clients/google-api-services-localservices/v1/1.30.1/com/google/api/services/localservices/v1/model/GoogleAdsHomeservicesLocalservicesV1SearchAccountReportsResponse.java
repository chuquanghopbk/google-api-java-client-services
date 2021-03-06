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

package com.google.api.services.localservices.v1.model;

/**
 * A page of the response received from the SearchAccountReports method. A paginated response where
 * more pages are available has `next_page_token` set. This token can be used in a subsequent
 * request to retrieve the next request page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Local Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of account reports which maps 1:1 to a particular linked GLS account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsHomeservicesLocalservicesV1AccountReport> accountReports;

  static {
    // hack to force ProGuard to consider GoogleAdsHomeservicesLocalservicesV1AccountReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsHomeservicesLocalservicesV1AccountReport.class);
  }

  /**
   * Pagination token to retrieve the next page of results. When `next_page_token` is not filled in,
   * there is no next page and the list returned is the last page in the result set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of account reports which maps 1:1 to a particular linked GLS account.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsHomeservicesLocalservicesV1AccountReport> getAccountReports() {
    return accountReports;
  }

  /**
   * List of account reports which maps 1:1 to a particular linked GLS account.
   * @param accountReports accountReports or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse setAccountReports(java.util.List<GoogleAdsHomeservicesLocalservicesV1AccountReport> accountReports) {
    this.accountReports = accountReports;
    return this;
  }

  /**
   * Pagination token to retrieve the next page of results. When `next_page_token` is not filled in,
   * there is no next page and the list returned is the last page in the result set.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token to retrieve the next page of results. When `next_page_token` is not filled in,
   * there is no next page and the list returned is the last page in the result set.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse set(String fieldName, Object value) {
    return (GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse clone() {
    return (GoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse) super.clone();
  }

}
