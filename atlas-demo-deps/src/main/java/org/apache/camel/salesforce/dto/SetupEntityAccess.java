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
 * Salesforce DTO for SObject SetupEntityAccess
 */
@XStreamAlias("SetupEntityAccess")
public class SetupEntityAccess extends AbstractSObjectBase {

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // SetupEntityId
    private String SetupEntityId;

    @JsonProperty("SetupEntityId")
    public String getSetupEntityId() {
        return this.SetupEntityId;
    }

    @JsonProperty("SetupEntityId")
    public void setSetupEntityId(String SetupEntityId) {
        this.SetupEntityId = SetupEntityId;
    }

    // SetupEntityType
    @XStreamConverter(PicklistEnumConverter.class)
    private SetupEntityTypeEnum SetupEntityType;

    @JsonProperty("SetupEntityType")
    public SetupEntityTypeEnum getSetupEntityType() {
        return this.SetupEntityType;
    }

    @JsonProperty("SetupEntityType")
    public void setSetupEntityType(SetupEntityTypeEnum SetupEntityType) {
        this.SetupEntityType = SetupEntityType;
    }

}
