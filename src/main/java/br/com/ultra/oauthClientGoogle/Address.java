package br.com.ultra.oauthClientGoogle;

import com.google.api.client.util.Key;

import java.io.Serializable;

/**
 * Created by Jhoni on 07/07/2016.
 */
public class Address implements Serializable{

    @Key
    public String region;

    @Key
    public String postcode;

    @Key
    public String lastname;

    @Key
    public String street;

    @Key
    public String city;

    @Key
    public String email;

    @Key
    public String telephone;

    @Key
    public String country_id;

    @Key
    public String firstname;

    @Key
    public String address_type;

    @Key
    public String prefix;

    @Key
    public String middlename;

    @Key
    public String suffix;

    @Key
    public String company;

}
