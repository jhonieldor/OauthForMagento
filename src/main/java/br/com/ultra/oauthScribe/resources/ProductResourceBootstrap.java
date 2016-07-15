package br.com.ultra.oauthScribe.resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class ProductResourceBootstrap {

    public ProductResource generateProduct(String SKU, String name){
        ProductResource productResource = new ProductResource();

        ItemProductResource item1 = new ItemProductResource();
        item1.setName(name);
        item1.setSku(SKU);
        item1.setAttributeSetId(4);
        item1.setPrice(Double.toString(0.0));
        item1.setStatus(1);
        item1.setVisibility(4);
        item1.setTypeId("configurable");
        item1.setCreatedAt("2016-07-12 11:51:28");
        item1.setUpdatedAt("2016-07-13 16:46:04");
        productResource.setProduct(item1);
        return productResource;
    }

}
