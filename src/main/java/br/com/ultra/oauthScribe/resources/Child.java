package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class Child implements Serializable {

    @SerializedName("childSku")
    private String childSku;

    public Child(String childSku) {
        this.childSku = childSku;
    }

    public String getChildSku() {
        return childSku;
    }

    public void setChildSku(String childSku) {
        this.childSku = childSku;
    }
}
