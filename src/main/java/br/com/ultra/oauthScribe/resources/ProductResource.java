package br.com.ultra.oauthScribe.resources;

import java.util.List;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class ProductResource {

    public List<ItemProductResource> items;

    public ItemProductResource product;

    public SearchCriteria search_criteria;

    public Integer total_count;
}
