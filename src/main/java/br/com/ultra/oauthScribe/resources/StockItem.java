package br.com.ultra.oauthScribe.resources;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Jhoni on 15/07/2016.
 */
public class StockItem implements Serializable{
    @SerializedName("item_id")
    private Integer itemId;

    @SerializedName("product_id")
    private Integer productId;

    @SerializedName("stock_id")
    private Integer stockId;

    @SerializedName("qty")
    private Integer qty;

    @SerializedName("is_in_stock")
    private Boolean isInStock;

    @SerializedName("is_qty_decimal")
    private Boolean isQtyDecimal;

    @SerializedName("show_default_notification_message")
    private Boolean showDefaultNotificationMessage;

    @SerializedName("use_config_min_qty")
    private Boolean useConfigMinQty;

    @SerializedName("min_qty")
    private Integer minQty;

    @SerializedName("use_config_min_sale_qty")
    private Integer useConfigMinSaleQty;

    @SerializedName("min_sale_qty")
    private Integer minSaleQty;

    @SerializedName("use_config_max_sale_qty")
    private Boolean useConfigMaxSaleQty;

    @SerializedName("max_sale_qty")
    private Integer maxSaleQty;

    @SerializedName("use_config_backorders")
    private Boolean useConfigBackorders;

    @SerializedName("backorders")
    private Integer backorders;

    @SerializedName("use_config_notify_stock_qty")
    private Boolean useConfigNotifyStockQty;

    @SerializedName("notify_stock_qty")
    private Integer notifyStockQty;

    @SerializedName("use_config_qty_increments")
    private Boolean useConfigQtyIncrements;

    @SerializedName("qty_increments")
    private Integer qtyIncrements;

    @SerializedName("use_config_enable_qty_inc")
    private Boolean useConfigEnableQtyInc;

    @SerializedName("enable_qty_increments")
    private Boolean enableQtyIncrements;

    @SerializedName("use_config_manage_stock")
    private Boolean useConfigManageStock;

    @SerializedName("manage_stock")
    private Boolean manageStock;

    @SerializedName("low_stock_date")
    private String lowStockDate;

    @SerializedName("is_decimal_divided")
    private Boolean isDecimalDivided;

    @SerializedName("stock_status_changed_auto")
    private Integer stockStatusChangedAuto;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    public Boolean getQtyDecimal() {
        return isQtyDecimal;
    }

    public void setQtyDecimal(Boolean qtyDecimal) {
        isQtyDecimal = qtyDecimal;
    }

    public Boolean getShowDefaultNotificationMessage() {
        return showDefaultNotificationMessage;
    }

    public void setShowDefaultNotificationMessage(Boolean showDefaultNotificationMessage) {
        this.showDefaultNotificationMessage = showDefaultNotificationMessage;
    }

    public Boolean getUseConfigMinQty() {
        return useConfigMinQty;
    }

    public void setUseConfigMinQty(Boolean useConfigMinQty) {
        this.useConfigMinQty = useConfigMinQty;
    }

    public Integer getMinQty() {
        return minQty;
    }

    public void setMinQty(Integer minQty) {
        this.minQty = minQty;
    }

    public Integer getUseConfigMinSaleQty() {
        return useConfigMinSaleQty;
    }

    public void setUseConfigMinSaleQty(Integer useConfigMinSaleQty) {
        this.useConfigMinSaleQty = useConfigMinSaleQty;
    }

    public Integer getMinSaleQty() {
        return minSaleQty;
    }

    public void setMinSaleQty(Integer minSaleQty) {
        this.minSaleQty = minSaleQty;
    }

    public Boolean getUseConfigMaxSaleQty() {
        return useConfigMaxSaleQty;
    }

    public void setUseConfigMaxSaleQty(Boolean useConfigMaxSaleQty) {
        this.useConfigMaxSaleQty = useConfigMaxSaleQty;
    }

    public Integer getMaxSaleQty() {
        return maxSaleQty;
    }

    public void setMaxSaleQty(Integer maxSaleQty) {
        this.maxSaleQty = maxSaleQty;
    }

    public Boolean getUseConfigBackorders() {
        return useConfigBackorders;
    }

    public void setUseConfigBackorders(Boolean useConfigBackorders) {
        this.useConfigBackorders = useConfigBackorders;
    }

    public Integer getBackorders() {
        return backorders;
    }

    public void setBackorders(Integer backorders) {
        this.backorders = backorders;
    }

    public Boolean getUseConfigNotifyStockQty() {
        return useConfigNotifyStockQty;
    }

    public void setUseConfigNotifyStockQty(Boolean useConfigNotifyStockQty) {
        this.useConfigNotifyStockQty = useConfigNotifyStockQty;
    }

    public Integer getNotifyStockQty() {
        return notifyStockQty;
    }

    public void setNotifyStockQty(Integer notifyStockQty) {
        this.notifyStockQty = notifyStockQty;
    }

    public Boolean getUseConfigQtyIncrements() {
        return useConfigQtyIncrements;
    }

    public void setUseConfigQtyIncrements(Boolean useConfigQtyIncrements) {
        this.useConfigQtyIncrements = useConfigQtyIncrements;
    }

    public Integer getQtyIncrements() {
        return qtyIncrements;
    }

    public void setQtyIncrements(Integer qtyIncrements) {
        this.qtyIncrements = qtyIncrements;
    }

    public Boolean getUseConfigEnableQtyInc() {
        return useConfigEnableQtyInc;
    }

    public void setUseConfigEnableQtyInc(Boolean useConfigEnableQtyInc) {
        this.useConfigEnableQtyInc = useConfigEnableQtyInc;
    }

    public Boolean getEnableQtyIncrements() {
        return enableQtyIncrements;
    }

    public void setEnableQtyIncrements(Boolean enableQtyIncrements) {
        this.enableQtyIncrements = enableQtyIncrements;
    }

    public Boolean getUseConfigManageStock() {
        return useConfigManageStock;
    }

    public void setUseConfigManageStock(Boolean useConfigManageStock) {
        this.useConfigManageStock = useConfigManageStock;
    }

    public Boolean getManageStock() {
        return manageStock;
    }

    public void setManageStock(Boolean manageStock) {
        this.manageStock = manageStock;
    }

    public String getLowStockDate() {
        return lowStockDate;
    }

    public void setLowStockDate(String lowStockDate) {
        this.lowStockDate = lowStockDate;
    }

    public Boolean getDecimalDivided() {
        return isDecimalDivided;
    }

    public void setDecimalDivided(Boolean decimalDivided) {
        isDecimalDivided = decimalDivided;
    }

    public Integer getStockStatusChangedAuto() {
        return stockStatusChangedAuto;
    }

    public void setStockStatusChangedAuto(Integer stockStatusChangedAuto) {
        this.stockStatusChangedAuto = stockStatusChangedAuto;
    }
}
