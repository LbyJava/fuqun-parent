package com.fuqun.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Rank implements Serializable{
    private Long id;

    private String name;

    private BigDecimal favorablePrice;

    private Long quota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getFavorablePrice() {
        return favorablePrice;
    }

    public void setFavorablePrice(BigDecimal favorablePrice) {
        this.favorablePrice = favorablePrice;
    }

    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }
}