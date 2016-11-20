package com.example.el.pickups.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.el.pickups.Items.Item;
import com.example.el.pickups.Items.SummerItem;
import com.example.el.pickups.R;
import com.example.el.pickups.Utils.Colors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by el on 11/19/2016.
 */
public class ItemsRecyclerAdapter extends RecyclerView.Adapter<ItemsRecyclerAdapter.MyViewHolder> {
Context context;
    List<Item> itemsList;

   public  ItemsRecyclerAdapter(List<Item> items,Context context){
        this.context=context;
        this.itemsList=items;

    }
    public  ItemsRecyclerAdapter(){

    }


    @Override
    public ItemsRecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsRecyclerAdapter.MyViewHolder holder, int position) {
        Item item= (SummerItem) itemsList.get(position);
        Log.e("ItemsRecyclerAdapter",item.getName());
        holder.itemName_tv.setText(item.getName());
        Glide.with(context).load(item.getItemResId()).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView itemName_tv;
        ImageView itemImage;
        CheckBox itemCheckBox;
        View view;
        public MyViewHolder(View itemView) {
            super(itemView);
            view=itemView;
            itemName_tv= (TextView) itemView.findViewById(R.id.itemName_tv);
            Typeface typeface=Typeface.createFromAsset(view.getContext().getAssets(),"YanoneKaffeesatz_Regular.ttf");
            itemName_tv.setTextColor(view.getContext().getResources().getColor(R.color.text_secondary));
            itemName_tv.setTypeface(typeface);
            itemImage= (ImageView) itemView.findViewById(R.id.item_imageView);
            itemCheckBox= (CheckBox) itemView.findViewById(R.id.item_cb);


        }
    }
}
