package com.example.el.pickups.Occasion;

import com.example.el.pickups.Items.Item;
import com.example.el.pickups.Items.SummerItem;
import com.example.el.pickups.R;

import java.util.ArrayList;

/**
 * Created by el on 11/18/2016.
 */
public class SummerPickup extends Occasion {

  public  SummerPickup(String name,int resId){
      PickUpName=name;
      pickUpResId=resId;
      items=new ArrayList<>();
      initItems();

    }
    SummerPickup(){
        items=new ArrayList<>();
        initItems();

    }


    @Override
    void addItem(Item item) {
        items.add(item);
    }

void initItems(){

     Item item=new SummerItem("Bikini", R.drawable.bikini);
    addItem(item);
    item=new SummerItem("Bag", R.drawable.bag);
    addItem(item);
    item=new SummerItem("Ball", R.drawable.ball);
    addItem(item);
    item=new SummerItem("Diving Tools", R.drawable.diving_tool);
    addItem(item);
    item=new SummerItem("Glasses", R.drawable.glasses);
    addItem(item);
    item=new SummerItem("Juice", R.drawable.juice);
    addItem(item);
    item=new SummerItem("Maio", R.drawable.maio);
    addItem(item);
    item=new SummerItem("Sand Tools", R.drawable.sand_tools);
    addItem(item);
    item=new SummerItem("Shoes", R.drawable.shoes);
    addItem(item);
    item=new SummerItem("Sun Cream", R.drawable.sun_cream);
    addItem(item);
    item=new SummerItem("Short", R.drawable._short);
    addItem(item);
    item=new SummerItem("Umbrella", R.drawable.umprella);
    addItem(item);




}
}


