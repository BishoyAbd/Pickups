package com.example.el.pickups.Items;

/**
 * Created by el on 11/18/2016.
 */
public abstract class Item {
     String name;
     int itemResId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemResId() {
        return itemResId;
    }

    public void setItemResId(int itemResId) {
        this.itemResId = itemResId;
    }

}
