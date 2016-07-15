package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class ProductResource {

    @SerializedName("items")
    private List<ItemProductResource> items;

    @SerializedName("product")
    private ItemProductResource product;

    @SerializedName("search_criteria")
    private SearchCriteria searchCriteria;

    @SerializedName("total_count")
    private Integer totalCount;

    public List<ItemProductResource> getItems() {
        return items;
    }

    public void setItems(List<ItemProductResource> items) {
        this.items = items;
    }

    public ItemProductResource getProduct() {
        return product;
    }

    public void setProduct(ItemProductResource product) {
        this.product = product;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
