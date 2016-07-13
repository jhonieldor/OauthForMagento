package br.com.ultra.oauthScribe.resources;

import java.util.List;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class ItemProductResource {
    public Integer id;

    public String sku;

    public String name;

    public int attribute_set_id;

    public String price;

    public int status;

    public int visibility;

    public String type_id;

    public String created_at;

    public String updated_at;

    public List<OptionProductResource> options;

    public List<TierPriceResource> tier_prices;

    public List<ProductLink> product_links;

    public List<CustomAttributeProduct> custom_attributes;

}
