package com.giomuathu.AquariumWarehousingSupportSystem.model.response;

import com.giomuathu.AquariumWarehousingSupportSystem.entity.AccountEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.entity.BrandEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.entity.SupplierEntity;
import com.giomuathu.AquariumWarehousingSupportSystem.entity.UnitEntity;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {

    private Long productId;

    private String productName;

    private Date createdDate;

    private String productCode;

    private int barCode;

    private double unitPrice;

    private double retailPrice;

    private double wholesalePrice;

    private Date modifyCreate;

    private String description;

    private String tag;

    private boolean isSale;

    private int saleQuantity;

    private int stockQuantity;

    BrandDTO brandId;

    UnitDTO unitId;

    AccountDTO userId;

    SupplierDTO supplierId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public Date getModifyCreate() {
        return modifyCreate;
    }

    public void setModifyCreate(Date modifyCreate) {
        this.modifyCreate = modifyCreate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(int saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public BrandDTO getBrandId() {
        return brandId;
    }

    public void setBrandId(BrandDTO brandId) {
        this.brandId = brandId;
    }

    public UnitDTO getUnitId() {
        return unitId;
    }

    public void setUnitId(UnitDTO unitId) {
        this.unitId = unitId;
    }

    public AccountDTO getUserId() {
        return userId;
    }

    public void setUserId(AccountDTO userId) {
        this.userId = userId;
    }

    public SupplierDTO getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(SupplierDTO supplierId) {
        this.supplierId = supplierId;
    }
}
