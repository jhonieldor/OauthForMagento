package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class CustomAttributeProduct implements Serializable {

    @SerializedName("attribute_code")
    private String attributeCode;

    @SerializedName("value")
    private String value;

    public String getAttributeCode() {
        return attributeCode;
    }

    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
