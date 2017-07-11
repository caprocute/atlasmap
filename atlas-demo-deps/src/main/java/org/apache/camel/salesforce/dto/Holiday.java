/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Holiday
 */
@XStreamAlias("Holiday")
public class Holiday extends AbstractSObjectBase {

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // IsAllDay
    private Boolean IsAllDay;

    @JsonProperty("IsAllDay")
    public Boolean getIsAllDay() {
        return this.IsAllDay;
    }

    @JsonProperty("IsAllDay")
    public void setIsAllDay(Boolean IsAllDay) {
        this.IsAllDay = IsAllDay;
    }

    // ActivityDate
    private org.joda.time.DateTime ActivityDate;

    @JsonProperty("ActivityDate")
    public org.joda.time.DateTime getActivityDate() {
        return this.ActivityDate;
    }

    @JsonProperty("ActivityDate")
    public void setActivityDate(org.joda.time.DateTime ActivityDate) {
        this.ActivityDate = ActivityDate;
    }

    // StartTimeInMinutes
    private Integer StartTimeInMinutes;

    @JsonProperty("StartTimeInMinutes")
    public Integer getStartTimeInMinutes() {
        return this.StartTimeInMinutes;
    }

    @JsonProperty("StartTimeInMinutes")
    public void setStartTimeInMinutes(Integer StartTimeInMinutes) {
        this.StartTimeInMinutes = StartTimeInMinutes;
    }

    // EndTimeInMinutes
    private Integer EndTimeInMinutes;

    @JsonProperty("EndTimeInMinutes")
    public Integer getEndTimeInMinutes() {
        return this.EndTimeInMinutes;
    }

    @JsonProperty("EndTimeInMinutes")
    public void setEndTimeInMinutes(Integer EndTimeInMinutes) {
        this.EndTimeInMinutes = EndTimeInMinutes;
    }

    // IsRecurrence
    private Boolean IsRecurrence;

    @JsonProperty("IsRecurrence")
    public Boolean getIsRecurrence() {
        return this.IsRecurrence;
    }

    @JsonProperty("IsRecurrence")
    public void setIsRecurrence(Boolean IsRecurrence) {
        this.IsRecurrence = IsRecurrence;
    }

    // RecurrenceStartDate
    private org.joda.time.DateTime RecurrenceStartDate;

    @JsonProperty("RecurrenceStartDate")
    public org.joda.time.DateTime getRecurrenceStartDate() {
        return this.RecurrenceStartDate;
    }

    @JsonProperty("RecurrenceStartDate")
    public void setRecurrenceStartDate(org.joda.time.DateTime RecurrenceStartDate) {
        this.RecurrenceStartDate = RecurrenceStartDate;
    }

    // RecurrenceEndDateOnly
    private org.joda.time.DateTime RecurrenceEndDateOnly;

    @JsonProperty("RecurrenceEndDateOnly")
    public org.joda.time.DateTime getRecurrenceEndDateOnly() {
        return this.RecurrenceEndDateOnly;
    }

    @JsonProperty("RecurrenceEndDateOnly")
    public void setRecurrenceEndDateOnly(org.joda.time.DateTime RecurrenceEndDateOnly) {
        this.RecurrenceEndDateOnly = RecurrenceEndDateOnly;
    }

    // RecurrenceType
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceTypeEnum RecurrenceType;

    @JsonProperty("RecurrenceType")
    public RecurrenceTypeEnum getRecurrenceType() {
        return this.RecurrenceType;
    }

    @JsonProperty("RecurrenceType")
    public void setRecurrenceType(RecurrenceTypeEnum RecurrenceType) {
        this.RecurrenceType = RecurrenceType;
    }

    // RecurrenceInterval
    private Integer RecurrenceInterval;

    @JsonProperty("RecurrenceInterval")
    public Integer getRecurrenceInterval() {
        return this.RecurrenceInterval;
    }

    @JsonProperty("RecurrenceInterval")
    public void setRecurrenceInterval(Integer RecurrenceInterval) {
        this.RecurrenceInterval = RecurrenceInterval;
    }

    // RecurrenceDayOfWeekMask
    private Integer RecurrenceDayOfWeekMask;

    @JsonProperty("RecurrenceDayOfWeekMask")
    public Integer getRecurrenceDayOfWeekMask() {
        return this.RecurrenceDayOfWeekMask;
    }

    @JsonProperty("RecurrenceDayOfWeekMask")
    public void setRecurrenceDayOfWeekMask(Integer RecurrenceDayOfWeekMask) {
        this.RecurrenceDayOfWeekMask = RecurrenceDayOfWeekMask;
    }

    // RecurrenceDayOfMonth
    private Integer RecurrenceDayOfMonth;

    @JsonProperty("RecurrenceDayOfMonth")
    public Integer getRecurrenceDayOfMonth() {
        return this.RecurrenceDayOfMonth;
    }

    @JsonProperty("RecurrenceDayOfMonth")
    public void setRecurrenceDayOfMonth(Integer RecurrenceDayOfMonth) {
        this.RecurrenceDayOfMonth = RecurrenceDayOfMonth;
    }

    // RecurrenceInstance
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceInstanceEnum RecurrenceInstance;

    @JsonProperty("RecurrenceInstance")
    public RecurrenceInstanceEnum getRecurrenceInstance() {
        return this.RecurrenceInstance;
    }

    @JsonProperty("RecurrenceInstance")
    public void setRecurrenceInstance(RecurrenceInstanceEnum RecurrenceInstance) {
        this.RecurrenceInstance = RecurrenceInstance;
    }

    // RecurrenceMonthOfYear
    @XStreamConverter(PicklistEnumConverter.class)
    private RecurrenceMonthOfYearEnum RecurrenceMonthOfYear;

    @JsonProperty("RecurrenceMonthOfYear")
    public RecurrenceMonthOfYearEnum getRecurrenceMonthOfYear() {
        return this.RecurrenceMonthOfYear;
    }

    @JsonProperty("RecurrenceMonthOfYear")
    public void setRecurrenceMonthOfYear(RecurrenceMonthOfYearEnum RecurrenceMonthOfYear) {
        this.RecurrenceMonthOfYear = RecurrenceMonthOfYear;
    }

}
