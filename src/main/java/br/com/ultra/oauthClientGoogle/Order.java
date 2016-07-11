package br.com.ultra.oauthClientGoogle;

import com.google.api.client.util.Key;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jhoni on 07/07/2016.
 */
public class Order implements Serializable {

    @Key
    public int entity_id;

    @Key
    public Object status;

    @Key
    public Object coupon_code;

    @Key
    public Object shipping_description;

    @Key
    public int customer_id;

    @Key
    public Object base_discount_amount;

    @Key
    public Object base_grand_total;

    @Key
    public Object base_shipping_amount;

    @Key
    public Object base_shipping_tax_amount;

    @Key
    public Object base_subtotal;

    @Key
    public Object base_tax_amount;

    @Key
    public Object base_total_paid;

    @Key
    public Object base_total_refunded;

    @Key
    public Object discount_amount;

    @Key
    public Object shipping_amount;

    @Key
    public Object shipping_tax_amount;

    @Key
    public Object store_to_order_rate;

    @Key
    public Object subtotal;

    @Key
    public Object tax_amount;

    @Key
    public Object total_paid;

    @Key
    public Object total_refunded;

    @Key
    public Object base_shipping_discount_amount;

    @Key
    public Object base_subtotal_incl_tax;

    @Key
    public Object base_total_due;

    @Key
    public Object shipping_discount_amount;

    @Key
    public Object subtotal_incl_tax;

    @Key
    public Object total_due;

    @Key
    public Object increment_id;

    @Key
    public Object base_currency_code;

    @Key
    public Object discount_description;

    @Key
    public Object remote_ip;

    @Key
    public Object store_currency_code;

    @Key
    public Object store_name;

    @Key
    public Object created_at;

    @Key
    public Object shipping_incl_tax;

    @Key
    public Object payment_method;

    @Key
    public Object gift_message_from;

    @Key
    public Object gift_message_to;

    @Key
    public Object gift_message_body;

    @Key
    public Object tax_name;

    @Key
    public Object tax_rate;

    @Key
    public List<Address> addresses;

    @Key
    public List<OrderItem> order_items;

    @Key
    public List<OrderComment> order_comments;

    @Override
    public java.lang.String toString() {
        return "Order{" +
                "entity_id=" + entity_id +
                ", status=" + status +
                ", coupon_code=" + coupon_code +
                ", shipping_description=" + shipping_description +
                ", customer_id=" + customer_id +
                ", base_discount_amount=" + base_discount_amount +
                ", base_grand_total=" + base_grand_total +
                ", base_shipping_amount=" + base_shipping_amount +
                ", base_shipping_tax_amount=" + base_shipping_tax_amount +
                ", base_subtotal=" + base_subtotal +
                ", base_tax_amount=" + base_tax_amount +
                ", base_total_paid=" + base_total_paid +
                ", base_total_refunded=" + base_total_refunded +
                ", discount_amount=" + discount_amount +
                ", shipping_amount=" + shipping_amount +
                ", shipping_tax_amount=" + shipping_tax_amount +
                ", store_to_order_rate=" + store_to_order_rate +
                ", subtotal=" + subtotal +
                ", tax_amount=" + tax_amount +
                ", total_paid=" + total_paid +
                ", total_refunded=" + total_refunded +
                ", base_shipping_discount_amount=" + base_shipping_discount_amount +
                ", base_subtotal_incl_tax=" + base_subtotal_incl_tax +
                ", base_total_due=" + base_total_due +
                ", shipping_discount_amount=" + shipping_discount_amount +
                ", subtotal_incl_tax=" + subtotal_incl_tax +
                ", total_due=" + total_due +
                ", increment_id=" + increment_id +
                ", base_currency_code=" + base_currency_code +
                ", discount_description=" + discount_description +
                ", remote_ip=" + remote_ip +
                ", store_currency_code=" + store_currency_code +
                ", store_name=" + store_name +
                ", created_at=" + created_at +
                ", shipping_incl_tax=" + shipping_incl_tax +
                ", payment_method=" + payment_method +
                ", gift_message_from=" + gift_message_from +
                ", gift_message_to=" + gift_message_to +
                ", gift_message_body=" + gift_message_body +
                ", tax_name=" + tax_name +
                ", tax_rate=" + tax_rate +
                ", addresses=" + addresses +
                ", order_items=" + order_items +
                ", order_comments=" + order_comments +
                '}';
    }
}
