package br.com.ultra.oauthClientGoogle;

import com.google.api.client.util.Key;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Jhoni on 07/07/2016.
 */
public class OrderItem implements Serializable {
    @Key
    public int item_id;

    @Key
    public Object parent_item_id;

    @Key
    public Object sku;

    @Key
    public Object name;

    @Key
    public Object qty_canceled;

    @Key
    public Object qty_invoiced;

    @Key
    public Object qty_ordered;

    @Key
    public Object qty_refunded;

    @Key
    public Object qty_shipped;

    @Key
    public Object price;

    @Key
    public Object base_price;

    @Key
    public Object original_price;

    @Key
    public Object base_original_price;

    @Key
    public Object tax_percent;

    @Key
    public Object tax_amount;

    @Key
    public Object base_tax_amount;

    @Key
    public Object discount_amount;

    @Key
    public Object base_discount_amount;

    @Key
    public Object row_total;

    @Key
    public Object base_row_total;

    @Key
    public Object price_incl_tax;

    @Key
    public Object row_total_incl_tax;

    @Key
    public Object base_row_total_incl_tax;
}
