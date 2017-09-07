package com.xuewenhui.base.bean;

/**
 * Created by WuXirui
 * Create Time: 2017/9/4
 * Description:
 */

public class Bean {
    private int id;
    private String name;

    public Bean() {
    }

    public Bean(int id, String name) {
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
