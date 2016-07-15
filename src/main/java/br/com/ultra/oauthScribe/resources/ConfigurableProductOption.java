package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class ConfigurableProductOption implements Serializable{
    @SerializedName("attribute_id")
    private Integer attributeId;

    @SerializedName("label")
    private String label;

    @SerializedName("position")
    private Integer position;

    @SerializedName("values")
    private List<Integer> values = new ArrayList<Integer>();

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
