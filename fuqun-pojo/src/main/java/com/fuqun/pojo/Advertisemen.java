package com.fuqun.pojo;

import java.io.Serializable;

public class Advertisemen implements Serializable{
    private Long id;

    private String imageAdd;

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
}