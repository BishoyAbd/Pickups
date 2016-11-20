package com.example.el.pickups.Occasion;

import com.example.el.pickups.Items.Item;

import java.util.ArrayList;

/**
 * Created by el on 11/18/2016.
 */
public abstract class Occasion {
     String PickUpName;
     int pickUpResId;

     ArrayList<Item> items;
    abstract void addItem(Item item);

    public String getPickUpName() {
        return PickUpName;
    }

    public void setPickUpName(String pickUpName) {
        PickUpName = pickUpName;
    }

    public int getPickUpResId() {
        return pickUpResId;
    }

    public void setPickUpResId(int pickUpResId) {
        this.pickUpResId = pickUpResId;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
