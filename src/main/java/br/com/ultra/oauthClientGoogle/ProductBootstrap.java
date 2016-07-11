package br.com.ultra.oauthClientGoogle;

/**
 * Created by Jhoni on 07/07/2016.
 */
public class ProductBootstrap {

    public Product generateProduct(){

        Product product = new Product();

        product.cor = 4;
        product.tamanho = 8;
        product.type_id = "simple";
        product.sku = "9898988489498";
        product.status = 1;
        product.visibility = 1;
        product.tax_class_id = 0;
        product.weight = Double.toString(1.0100);
        product.price = Double.toString(1.95);
        product.name = "Product From Java";
        product.url_key = "pFJ-p";
        product.msrp_enabled = 1;
        product.msrp_display_actual_price_type = 4;
        product.options_container = "container1";
        product.product_tag = "PFJ";
        product.description = "Product from java";
        product.short_description = "Produto gerado no Java";
        product.entity_id = 9;
        product.attribute_set_id = 4;
        return product;

    }


}
