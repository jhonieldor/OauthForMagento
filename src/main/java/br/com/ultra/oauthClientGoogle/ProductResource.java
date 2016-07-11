package br.com.ultra.oauthClientGoogle;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by Jhoni on 07/07/2016.
 */
public class ProductResource {

    @Key
    public List<Product> list;

    @Key
    public int limit;

    @Key("has_more")
    public boolean hasMore;
}
