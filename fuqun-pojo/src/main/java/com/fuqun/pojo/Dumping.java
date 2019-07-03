package com.fuqun.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Dumping implements Serializable{
    private Long id;

    private Long brandId;

    private String name;

    private String subtile;

    private String detail;

    private BigDecimal price;

    private Long modelId;

    private Long partId;

    private Long hardnessId;

    private Date createTime;

    private Date updateTime;

    private String coilNumber;

    private Long countryId;

    private Long stock;

    private Long orderdetailedId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubtile() {
        return subtile;
    }

    public void setSubtile(String subtile) {
        this.subtile = subtile == null ? null : subtile.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Long getHardnessId() {
        return hardnessId;
    }

    public void setHardnessId(Long hardnessId) {
        this.hardnessId = hardnessId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCoilNumber() {
        return coilNumber;
    }

    public void setCoilNumber(String coilNumber) {
        this.coilNumber = coilNumber == null ? null : coilNumber.trim();
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getOrderdetailedId() {
        return orderdetailedId;
    }

    public void setOrderdetailedId(Long orderdetailedId) {
        this.orderdetailedId = orderdetailedId;
    }
}