package com.giomuathu.AquariumWarehousingSupportSystem.entity;

import lombok.*;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Data
@Table(name = "product")
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @ManyToOne()
    @JoinColumn(name = "brandId")
    BrandEntity brandId;

    @ManyToOne()
    @JoinColumn(name = "unitId")
    UnitEntity unitId;

    @ManyToOne()
    @JoinColumn(name = "userId")
    AccountEntity userId;

    @ManyToOne()
    @JoinColumn(name = "supplierId")
    SupplierEntity supplierId;

    @ManyToOne()
    @JoinColumn(name = "categoryId")
    CategoryEntity categoryId;

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

    public BrandEntity getBrandId() {
        return brandId;
    }

    public void setBrandId(BrandEntity brandId) {
        this.brandId = brandId;
    }

    public UnitEntity getUnitId() {
        return unitId;
    }

    public void setUnitId(UnitEntity unitId) {
        this.unitId = unitId;
    }

    public AccountEntity getUserId() {
        return userId;
    }

    public void setUserId(AccountEntity userId) {
        this.userId = userId;
    }

    public SupplierEntity getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(SupplierEntity supplierId) {
        this.supplierId = supplierId;
    }
}
