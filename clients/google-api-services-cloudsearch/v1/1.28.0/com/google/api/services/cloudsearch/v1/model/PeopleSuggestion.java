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

package com.google.api.services.cloudsearch.v1.model;

/**
 * This field contains information about the person being suggested.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PeopleSuggestion extends com.google.api.client.json.GenericJson {

  /**
   * Suggested person. All fields of the person object might not be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Person person;

  /**
   * Suggested person. All fields of the person object might not be populated.
   * @return value or {@code null} for none
   */
  public Person getPerson() {
    return person;
  }

  /**
   * Suggested person. All fields of the person object might not be populated.
   * @param person person or {@code null} for none
   */
  public PeopleSuggestion setPerson(Person person) {
    this.person = person;
    return this;
  }

  @Override
  public PeopleSuggestion set(String fieldName, Object value) {
    return (PeopleSuggestion) super.set(fieldName, value);
  }

  @Override
  public PeopleSuggestion clone() {
    return (PeopleSuggestion) super.clone();
  }

}
