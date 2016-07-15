package br.com.ultra.oauthScribe.resources;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class ConfigurableProductBootstrap {

    public ConfigurableProduct generateConfigurableProduct(String SKU, String name){

        ItemProductResource itemProductResource = new ItemProductResource();
        itemProductResource.setSku(SKU);
        itemProductResource.setName(name);
        itemProductResource.setAttributeSetId(4);
        itemProductResource.setPrice(Double.toString(0.0));
        itemProductResource.setStatus(1);
        itemProductResource.setVisibility(4);
        itemProductResource.setTypeId("configurable");
        itemProductResource.setCreatedAt("2016-07-14 13:13:15");
        itemProductResource.setUpdatedAt("2016-07-14 19:03:27");

        ExtensionAttributes extensionAttributes = new ExtensionAttributes();

        StockItem stockItem = new StockItem();

        stockItem.setStockId(1);
        stockItem.setQty(0);
        stockItem.setInStock(true);
        stockItem.setQtyDecimal(false);
        stockItem.setShowDefaultNotificationMessage(false);
        stockItem.setUseConfigMinQty(true);
        stockItem.setMinQty(0);
        stockItem.setUseConfigMinQty(true);
        stockItem.setMaxSaleQty(10000);
        stockItem.setUseConfigBackorders(true);
        stockItem.setBackorders(0);
        stockItem.setUseConfigNotifyStockQty(true);
        stockItem.setNotifyStockQty(1);
        stockItem.setUseConfigQtyIncrements(true);
        stockItem.setQtyIncrements(0);
        stockItem.setUseConfigEnableQtyInc(true);
        stockItem.setEnableQtyIncrements(false);
        stockItem.setUseConfigManageStock(true);
        stockItem.setManageStock(true);
        stockItem.setLowStockDate("2016-07-14 13:13:15");
        stockItem.setDecimalDivided(false);
        stockItem.setStockStatusChangedAuto(1);
        extensionAttributes.setStockItem(stockItem);

        ConfigurableProductOption configurableProductOption1 = new ConfigurableProductOption();
        configurableProductOption1.setAttributeId(132);
        configurableProductOption1.setLabel("Cor");
        configurableProductOption1.setPosition(1);

        OptionValue optionValue1 = new OptionValue(7);
        configurableProductOption1.getValues().add(optionValue1);

        OptionValue optionValue2 = new OptionValue(8);
        configurableProductOption1.getValues().add(optionValue2);

        OptionValue optionValue3 = new OptionValue(9);
        configurableProductOption1.getValues().add(optionValue3);

        OptionValue optionValue4 = new OptionValue(10);
        configurableProductOption1.getValues().add(optionValue4);
        extensionAttributes.getConfigurableProductOptions().add(configurableProductOption1);

        ConfigurableProductOption configurableProductOption2 = new ConfigurableProductOption();
        configurableProductOption2.setAttributeId(131);
        configurableProductOption2.setLabel("Tamanho");
        configurableProductOption2.setPosition(0);

        OptionValue optionValue5 = new OptionValue(4);
        configurableProductOption2.getValues().add(optionValue5);

        OptionValue optionValue6 = new OptionValue(5);
        configurableProductOption2.getValues().add(optionValue6);

        OptionValue optionValue7 = new OptionValue(6);
        configurableProductOption2.getValues().add(optionValue7);

        extensionAttributes.getConfigurableProductOptions().add(configurableProductOption2);

        itemProductResource.setExtensionAttributes(extensionAttributes);

        ConfigurableProduct configurableProduct = new ConfigurableProduct();

        configurableProduct.setProduct(itemProductResource);

        return configurableProduct;

    }

    public ProductResource generateSimpleProduct(String SKU, String name){
        ItemProductResource itemProductResource = new ItemProductResource();
        itemProductResource.setName(name);
        itemProductResource.setSku(SKU);
        itemProductResource.setAttributeSetId(4);
        itemProductResource.setPrice(Double.toString(32));
        itemProductResource.setStatus(1);
        itemProductResource.setVisibility(1);
        itemProductResource.setTypeId("virtual");
        itemProductResource.setCreatedAt("2016-07-14 13:16:54");
        itemProductResource.setUpdatedAt("2016-07-14 13:52:16");

        ExtensionAttributes extensionAttributes = new ExtensionAttributes();
        StockItem stockItem = new StockItem();
        stockItem.setStockId(1);
        stockItem.setQty(500);
        stockItem.setInStock(true);
        stockItem.setQtyDecimal(false);
        stockItem.setShowDefaultNotificationMessage(false);
        stockItem.setUseConfigMinQty(true);
        stockItem.setMinQty(0);
        stockItem.setUseConfigMinSaleQty(1);
        stockItem.setMinSaleQty(1);
        stockItem.setUseConfigMaxSaleQty(true);
        stockItem.setMaxSaleQty(10000);
        stockItem.setUseConfigBackorders(true);
        stockItem.setBackorders(0);
        stockItem.setUseConfigNotifyStockQty(true);
        stockItem.setNotifyStockQty(1);
        stockItem.setUseConfigQtyIncrements(true);
        stockItem.setQtyIncrements(0);
        stockItem.setUseConfigEnableQtyInc(false);
        stockItem.setEnableQtyIncrements(false);
        stockItem.setUseConfigManageStock(true);
        stockItem.setManageStock(true);
        stockItem.setLowStockDate(null);
        stockItem.setDecimalDivided(false);
        stockItem.setStockStatusChangedAuto(0);
        extensionAttributes.setStockItem(stockItem);

        itemProductResource.setExtensionAttributes(extensionAttributes);

        CustomAttributeProduct customAttributeProduct1 = new CustomAttributeProduct();
        customAttributeProduct1.setAttributeCode("meta_title");
        customAttributeProduct1.setValue(name);
        itemProductResource.getCustomAttributes().add(customAttributeProduct1);

        CustomAttributeProduct customAttributeProduct2 = new CustomAttributeProduct();
        customAttributeProduct2.setAttributeCode("meta_keyword");
        customAttributeProduct2.setValue(name);
        itemProductResource.getCustomAttributes().add(customAttributeProduct2);

        CustomAttributeProduct customAttributeProduct3 = new CustomAttributeProduct();
        customAttributeProduct3.setAttributeCode("tamanho");
        customAttributeProduct3.setValue("5");
        itemProductResource.getCustomAttributes().add(customAttributeProduct3);

        CustomAttributeProduct customAttributeProduct4 = new CustomAttributeProduct();
        customAttributeProduct4.setAttributeCode("cor");
        customAttributeProduct4.setValue("8");
        itemProductResource.getCustomAttributes().add(customAttributeProduct3);

        ProductResource productResource = new ProductResource();
        productResource.setProduct(itemProductResource);

        return productResource;
    }

    public Child generateChild(String childSku){
        return new Child(childSku);
    }


}
