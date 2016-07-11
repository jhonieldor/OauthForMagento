package br.com.ultra.oauthClientGoogle;

import com.google.api.client.util.Key;

import java.io.Serializable;

/**
 * Created by Jhoni on 07/07/2016.
 */
public class OrderComment implements Serializable{
    @Key
    public int is_customer_notified;

    @Key
    public int is_visible_on_front;

    @Key
    public String comment;

    @Key
    public String status;

    @Key
    public String created_at;
}
