package com.ren.bean;

import java.io.Serializable;

/**
 * @author Ren
 */

public class GoodsInfo implements Serializable {

    int id;
    String name;

    public GoodsInfo() {
    }

    public GoodsInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
