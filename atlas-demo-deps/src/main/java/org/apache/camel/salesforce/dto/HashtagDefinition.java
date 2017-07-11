/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject HashtagDefinition
 */
@XStreamAlias("HashtagDefinition")
public class HashtagDefinition extends AbstractSObjectBase {

    // NameNorm
    private String NameNorm;

    @JsonProperty("NameNorm")
    public String getNameNorm() {
        return this.NameNorm;
    }

    @JsonProperty("NameNorm")
    public void setNameNorm(String NameNorm) {
        this.NameNorm = NameNorm;
    }

    // HashtagCount
    private Integer HashtagCount;

    @JsonProperty("HashtagCount")
    public Integer getHashtagCount() {
        return this.HashtagCount;
    }

    @JsonProperty("HashtagCount")
    public void setHashtagCount(Integer HashtagCount) {
        this.HashtagCount = HashtagCount;
    }

}
