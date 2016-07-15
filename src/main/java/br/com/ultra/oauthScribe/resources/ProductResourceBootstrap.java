package br.com.ultra.oauthScribe.resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jhoni on 13/07/2016.
 */
public class ProductResourceBootstrap {

    public ProductResource generateProduct(){
        ProductResource productResource = new ProductResource();

        ItemProductResource item1 = new ItemProductResource();
//        item1.id = null;
//        item1.name = "Product From Java 2";
        item1.setName("Product From Java 3");
//        item1.sku = "38323420923239898";
        item1.setSku("PSKU3");
//        item1.attribute_set_id = 4;
        item1.setAttributeSetId(4);
//        item1.price = "0";
        item1.setPrice(Double.toString(0.0));
//        item1.status = 1;
        item1.setStatus(1);
//        item1.visibility = 4;
        item1.setVisibility(4);
//        item1.type_id = "configurable";
        item1.setTypeId("configurable");
//        item1.created_at = "2016-07-12 11:51:28";
        item1.setCreatedAt("2016-07-12 11:51:28");
//        item1.updated_at = "2016-07-13 16:46:04";
        item1.setUpdatedAt("2016-07-13 16:46:04");
        productResource.setProduct(item1);
//        productResource.
//        productResource.search_criteria = null;
//        productResource.to
        return productResource;
    }
}
