package br.com.ultra.oauthClientGoogle;

/**
 * Created by Jhoni on 11/07/2016.
 */
public class CustomerBootstrap {

    public Customer generateCustomer() {
        Customer customer = new Customer();

        customer.firstname = "Customer";
        customer.lastname = "Java";

        return customer;
    }


}
