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

package com.google.api.services.realtimebidding.v1.model;

/**
 * The number of HTTP calls made to the given domain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DomainCalls extends com.google.api.client.json.GenericJson {

  /**
   * The domain name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Number of HTTP calls made to the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer httpCallCount;

  /**
   * The domain name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * The domain name.
   * @param domain domain or {@code null} for none
   */
  public DomainCalls setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Number of HTTP calls made to the domain.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHttpCallCount() {
    return httpCallCount;
  }

  /**
   * Number of HTTP calls made to the domain.
   * @param httpCallCount httpCallCount or {@code null} for none
   */
  public DomainCalls setHttpCallCount(java.lang.Integer httpCallCount) {
    this.httpCallCount = httpCallCount;
    return this;
  }

  @Override
  public DomainCalls set(String fieldName, Object value) {
    return (DomainCalls) super.set(fieldName, value);
  }

  @Override
  public DomainCalls clone() {
    return (DomainCalls) super.clone();
  }

}
