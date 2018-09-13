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

package com.google.storagetransfer.v1.model;

/**
 * Represents a whole calendar date, for example date of birth. The time of day and time zone are
 * either specified elsewhere or are not significant. The date is relative to the Proleptic
 * Gregorian Calendar. The day can be 0 to represent a year and month where the day is not
 * significant, for example credit card expiration date. The year can be 0 to represent a month and
 * day independent of year, for example anniversary date. Related types are google.type.TimeOfDay
 * and `google.protobuf.Timestamp`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Date extends com.google.api.client.json.GenericJson {

  /**
   * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
   * year/month where the day is not significant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer day;

  /**
   * Month of year. Must be from 1 to 12, or 0 if specifying a date without a month.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer month;

  /**
   * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
   * year/month where the day is not significant.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
   * year/month where the day is not significant.
   * @param day day or {@code null} for none
   */
  public Date setDay(java.lang.Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Month of year. Must be from 1 to 12, or 0 if specifying a date without a month.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMonth() {
    return month;
  }

  /**
   * Month of year. Must be from 1 to 12, or 0 if specifying a date without a month.
   * @param month month or {@code null} for none
   */
  public Date setMonth(java.lang.Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
   * @param year year or {@code null} for none
   */
  public Date setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public Date set(String fieldName, Object value) {
    return (Date) super.set(fieldName, value);
  }

  @Override
  public Date clone() {
    return (Date) super.clone();
  }

}
