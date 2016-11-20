package com.example.el.pickups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.el.pickups.Items.Item;
import com.example.el.pickups.Items.SummerItem;
import com.example.el.pickups.Occasion.Occasion;
import com.example.el.pickups.Occasion.OccasionChooser;
import com.example.el.pickups.adapters.ItemsRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class OccasionActivity extends AppCompatActivity {

   private List<Item> items=new ArrayList<>();
    private RecyclerView itemsRecyclerView;
    ItemsRecyclerAdapter itemsRecyclerAdapter;
    RecyclerView.LayoutManager linLayoutManager;
    int position=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occasion);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){ position=bundle.getInt("position");}
        Log.e(OccasionActivity.class.getSimpleName(),"position is :"+position);
        initRecycler();

    }


void initRecycler(){
     initItems();
    itemsRecyclerView= (RecyclerView) findViewById(R.id.items_recyclerView);
    linLayoutManager=new LinearLayoutManager(OccasionActivity.this);
    itemsRecyclerAdapter=new ItemsRecyclerAdapter(items,OccasionActivity.this);
    itemsRecyclerView.setLayoutManager(linLayoutManager);
    itemsRecyclerView.setAdapter(itemsRecyclerAdapter);

}

    void initItems(){
        OccasionChooser chooser=new OccasionChooser();
        Occasion occasion=  chooser.CreateOccasion(position);
        items=occasion.getItems();
    }


}
