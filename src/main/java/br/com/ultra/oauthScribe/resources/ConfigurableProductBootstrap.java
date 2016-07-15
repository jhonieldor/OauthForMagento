package br.com.ultra.oauthScribe.resources;

import com.sun.deploy.panel.ITreeNode;

import javax.print.DocFlavor;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class ConfigurableProductBootstrap {

    public ConfigurableProduct generateConfigurableProduct(){

        ItemProductResource itemProductResource = new ItemProductResource();
        itemProductResource.setSku("CONFIGPFJAVA1001");
        itemProductResource.setName("Product CFG From Java");
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
        configurableProductOption1.getValues().add(7);
        configurableProductOption1.getValues().add(8);
        configurableProductOption1.getValues().add(9);
        configurableProductOption1.getValues().add(10);
        extensionAttributes.getConfigurableProductOptions().add(configurableProductOption1);

        ConfigurableProductOption configurableProductOption2 = new ConfigurableProductOption();
        configurableProductOption2.setAttributeId(131);
        configurableProductOption2.setLabel("Tamanho");
        configurableProductOption2.setPosition(0);
        configurableProductOption2.getValues().add(4);
        configurableProductOption2.getValues().add(5);
        configurableProductOption2.getValues().add(6);
        extensionAttributes.getConfigurableProductOptions().add(configurableProductOption2);

//        itemProductResource.setE
//        configurableProductOption1.setValues();


//        stockItem.setN

//        extensionAttributes.

//        itemProductResource.extension_attributes = null;


        return null;

    }
}
