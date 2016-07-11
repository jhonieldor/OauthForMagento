package br.com.ultra.oauthClientGoogle;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.sun.istack.internal.NotNull;

import java.io.InputStream;
import java.io.Serializable;

/**
 * Created by Jhoni on 06/07/2016.
 */
public class Product implements Serializable {

    @Key
    public int entity_id;

    /*
    Product type. Can have the "simple" value.
     */
    @NotNull
    @Key
    public String type_id;

    /*
    Product SKU
     */
    @NotNull
    @Key
    public String sku;

    /*
    Product status. Can have the following values:
    1- Enabled, 2 - Disabled.
     */
    @Key
    public int status;

    /*
    Product visibility. Can have the following values:
            1 - Not Visible Individually, 2 - Catalog,
            3 - Search, 4 - Catalog, Search.
    */
    @Key
    public int visibility;

    /*
    Product tax class. Can have the following values: 0 - None,
    2 - taxable Goods, 4 - Shipping, etc., depending on created tax classes.
     */
    @NotNull
    @Key
    public int tax_class_id;
    
    @Key
    public int cor;

    @Key
    public int tamanho;

    @NotNull
    @Key
    public String weight;

    @Key
    public String price;


    @Key
    public String special_price;

    /*The Manufacturer's Suggested Retail Price option.
     The price that a manufacturer suggests to sell the product at
     */
    @Key
    public String msrp;

    @Key
    public String name;

    @Key
    public String url_key;

    @Key
    public String country_of_manufacture;

    @Key
    public int msrp_enabled;

    @Key
    public int msrp_display_actual_price_type;

    @Key
    public String meta_title;

    @Key
    public String meta_description;

    /*
    Custom design applied for the product page
    */
    @Key
    public String custom_design;

    /*
    Page template that can be applied to the product page
     */
    @Key
    public String page_layout;

    /*
    Defines how the custom options for the product will be displayed.
    Can have the following values: Block after Info Column or Product
    Info Column
     */
    @Key
    public String options_container;

    /*
    Defines whether the gift message is available for the product
     */
    @Key
    public int gift_message_available;

    @Key
    public String product_tag;

    @Key
    public String news_from_date;

    @Key
    public String news_to_date;

    @Key
    public String special_from_date;

    @Key
    public String special_to_date;

    @Key
    public String custom_design_from;

    @Key
    public String custom_design_to;

    /*
    Product description.
     */
    @NotNull
    @Key
    public String description;

    /*
    Product short description.
     */
    @NotNull
    @Key
    public String short_description;

    /*
    Product meta keywords
     */
    @Key
    public String meta_keyword;

    /*
    An XML block to alter the page layout
     */
    @Key
    public String custom_layout_update;

    /*
    Attribute set for the product.
     */
    @NotNull
    @Key
    public int attribute_set_id;
}
