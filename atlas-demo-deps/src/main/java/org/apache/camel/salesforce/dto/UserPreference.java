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
 * Salesforce DTO for SObject UserPreference
 */
@XStreamAlias("UserPreference")
public class UserPreference extends AbstractSObjectBase {

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // Preference
    @XStreamConverter(PicklistEnumConverter.class)
    private PreferenceEnum Preference;

    @JsonProperty("Preference")
    public PreferenceEnum getPreference() {
        return this.Preference;
    }

    @JsonProperty("Preference")
    public void setPreference(PreferenceEnum Preference) {
        this.Preference = Preference;
    }

    // Value
    private String Value;

    @JsonProperty("Value")
    public String getValue() {
        return this.Value;
    }

    @JsonProperty("Value")
    public void setValue(String Value) {
        this.Value = Value;
    }

}
