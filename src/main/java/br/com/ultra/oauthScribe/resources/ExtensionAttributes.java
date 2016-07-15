package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class ExtensionAttributes implements Serializable{

    @SerializedName("stock_item")
    private StockItem stockItem;

    @SerializedName("configurable_product_options")
    private List<ConfigurableProductOption> configurableProductOptions;

    @SerializedName("configurable_product_links")
    private List<Integer> configurableProductLinks = new ArrayList<Integer>();

    public StockItem getStockItem() {
        return stockItem;
    }

    public void setStockItem(StockItem stockItem) {
        this.stockItem = stockItem;
    }

    public List<ConfigurableProductOption> getConfigurableProductOptions() {
        return configurableProductOptions;
    }

    public void setConfigurableProductOptions(List<ConfigurableProductOption> configurableProductOptions) {
        this.configurableProductOptions = configurableProductOptions;
    }

    public List<Integer> getConfigurableProductLinks() {
        return configurableProductLinks;
    }

    public void setConfigurableProductLinks(List<Integer> configurableProductLinks) {
        this.configurableProductLinks = configurableProductLinks;
    }
}
