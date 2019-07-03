package com.fuqun.pojo;

import java.io.Serializable;

public class Image implements Serializable{
    private Long id;

    private String imageAdd;

    private Long goodsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageAdd() {
        return imageAdd;
    }

    public void setImageAdd(String imageAdd) {
        this.imageAdd = imageAdd == null ? null : imageAdd.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}