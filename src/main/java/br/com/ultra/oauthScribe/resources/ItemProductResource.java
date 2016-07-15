package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class ItemProductResource implements Serializable {
    @SerializedName("id")
    private Integer id;

    @SerializedName("sku")
    private String sku;

    @SerializedName("name")
    private String name;

    @SerializedName("attribute_set_id")
    private int attributeSetId;

    @SerializedName("price")
    private String price;

    @SerializedName("status")
    private int status;

    @SerializedName("visibility")
    private int visibility;

    @SerializedName("type_id")
    private String typeId;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("extension_attributes")
    private ExtensionAttributes extensionAttributes;

    @SerializedName("options")
    private List<OptionProductResource> options;

    @SerializedName("tier_prices")
    private List<TierPriceResource> tierPrices;

    @SerializedName("product_links")
    private List<ProductLink> productLinks;

    @SerializedName("custom_attributes")
    private List<CustomAttributeProduct> customAttributes = new ArrayList<CustomAttributeProduct>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttributeSetId() {
        return attributeSetId;
    }

    public void setAttributeSetId(int attributeSetId) {
        this.attributeSetId = attributeSetId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ExtensionAttributes getExtensionAttributes() {
        return extensionAttributes;
    }

    public void setExtensionAttributes(ExtensionAttributes extensionAttributes) {
        this.extensionAttributes = extensionAttributes;
    }

    public List<OptionProductResource> getOptions() {
        return options;
    }

    public void setOptions(List<OptionProductResource> options) {
        this.options = options;
    }

    public List<TierPriceResource> getTierPrices() {
        return tierPrices;
    }

    public void setTierPrices(List<TierPriceResource> tierPrices) {
        this.tierPrices = tierPrices;
    }

    public List<ProductLink> getProductLinks() {
        return productLinks;
    }

    public void setProductLinks(List<ProductLink> productLinks) {
        this.productLinks = productLinks;
    }

    public List<CustomAttributeProduct> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<CustomAttributeProduct> customAttributes) {
        this.customAttributes = customAttributes;
    }
}
