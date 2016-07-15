package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class OptionValue implements Serializable{
    @SerializedName("value_index")
    private Integer valueIndex;

    public OptionValue(Integer valueIndex) {
        this.valueIndex = valueIndex;
    }

    public Integer getValueIndex() {
        return valueIndex;
    }

    public void setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
    }


}
