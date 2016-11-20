package com.example.el.pickups.Occasion;

/**
 * Created by el on 11/19/2016.
 */
public class OccasionChooser {


    public  Occasion CreateOccasion(int position){
        Occasion occasion=null;
        if (position==0){
            return new SummerPickup();
        }
        else if(position==1){
            return new SummerPickup();

        }

        return occasion;

    }




}
