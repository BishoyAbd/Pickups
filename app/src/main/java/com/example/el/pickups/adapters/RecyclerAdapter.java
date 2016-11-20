package com.example.el.pickups.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.el.pickups.Utils.Colors;
import  com.example.el.pickups.R;
import com.bumptech.glide.Glide;
import com.example.el.pickups.Occasion.Occasion;

import java.util.List;

/**
 * Created by Bishoy on 13/10/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    Context context;
    List<Occasion> occasionList;

    public RecyclerAdapter(List<Occasion> cityList) {

    }

    public RecyclerAdapter(List<Occasion> occasionList, Context context) {
        this.occasionList = occasionList;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the view and send it to the MyViewHolderConstructor
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.occasion_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        //set the data to the views in the holder(the row)
        Occasion occasion = occasionList.get(position);
        if(position<Colors.colors.length)
        holder.view.setBackgroundColor(Colors.colors[position]);

        //holder.occasionName_tv.setText(occasion.getPickUpName());
        //holder.thumbnail.setImageResource(album.getThumbnail());
        //insteade load images with Glid Library
        Glide.with(context).load(occasion.getPickUpResId()).into(holder.cityImageView);
    }


    @Override
    public int getItemCount() {
        return occasionList.size();
    }

    //--------------------------------------------------------------------------------\\
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView occasionName_tv;
        ImageView cityImageView;
        View view;

        public MyViewHolder(View itemView) {
            //this is like on createView  of the mainActivity or fragment
            //it,s job is to link views
            super(itemView);
           view=itemView;
            cityImageView = (ImageView) itemView.findViewById(R.id.occasion_image);

        }
    }
    //-----------------------------------------------------------------------------\\


}
