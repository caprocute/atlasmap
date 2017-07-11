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
 * Salesforce DTO for SObject Asset
 */
@XStreamAlias("Asset")
public class Asset extends AbstractSObjectBase {

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // Product2Id
    private String Product2Id;

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return this.Product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String Product2Id) {
        this.Product2Id = Product2Id;
    }

    // IsCompetitorProduct
    private Boolean IsCompetitorProduct;

    @JsonProperty("IsCompetitorProduct")
    public Boolean getIsCompetitorProduct() {
        return this.IsCompetitorProduct;
    }

    @JsonProperty("IsCompetitorProduct")
    public void setIsCompetitorProduct(Boolean IsCompetitorProduct) {
        this.IsCompetitorProduct = IsCompetitorProduct;
    }

    // SerialNumber
    private String SerialNumber;

    @JsonProperty("SerialNumber")
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    @JsonProperty("SerialNumber")
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    // InstallDate
    private org.joda.time.DateTime InstallDate;

    @JsonProperty("InstallDate")
    public org.joda.time.DateTime getInstallDate() {
        return this.InstallDate;
    }

    @JsonProperty("InstallDate")
    public void setInstallDate(org.joda.time.DateTime InstallDate) {
        this.InstallDate = InstallDate;
    }

    // PurchaseDate
    private org.joda.time.DateTime PurchaseDate;

    @JsonProperty("PurchaseDate")
    public org.joda.time.DateTime getPurchaseDate() {
        return this.PurchaseDate;
    }

    @JsonProperty("PurchaseDate")
    public void setPurchaseDate(org.joda.time.DateTime PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    // UsageEndDate
    private org.joda.time.DateTime UsageEndDate;

    @JsonProperty("UsageEndDate")
    public org.joda.time.DateTime getUsageEndDate() {
        return this.UsageEndDate;
    }

    @JsonProperty("UsageEndDate")
    public void setUsageEndDate(org.joda.time.DateTime UsageEndDate) {
        this.UsageEndDate = UsageEndDate;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // Price
    private Double Price;

    @JsonProperty("Price")
    public Double getPrice() {
        return this.Price;
    }

    @JsonProperty("Price")
    public void setPrice(Double Price) {
        this.Price = Price;
    }

    // Quantity
    private Double Quantity;

    @JsonProperty("Quantity")
    public Double getQuantity() {
        return this.Quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Double Quantity) {
        this.Quantity = Quantity;
    }

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

}
