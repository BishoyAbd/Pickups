package com.example.el.pickups;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.el.pickups.Occasion.Occasion;
import com.example.el.pickups.Occasion.SummerPickup;
import com.example.el.pickups.adapters.OccasionRecyclerClickListener;
import com.example.el.pickups.adapters.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView_occaion;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    private List<Occasion> occasionList=new ArrayList<>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initRecyclerView();
        recyclerView_occaion.addOnItemTouchListener( new OccasionRecyclerClickListener(MainActivity.this, recyclerView_occaion ,new OccasionRecyclerClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                         startOccasionActivity(position);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })

        );
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    void initRecyclerView(){
        initOccasions();
        recyclerView_occaion= (RecyclerView) findViewById(R.id.recyclerView_id);
        adapter=new RecyclerAdapter(occasionList,MainActivity.this);
        layoutManager=new LinearLayoutManager(MainActivity.this) ;
        recyclerView_occaion.setLayoutManager(layoutManager);
        recyclerView_occaion.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }


    void addOccasion(Occasion newOccasiona){
        occasionList.add(newOccasiona);

    }

    void initOccasions(){
        Occasion occasion=new SummerPickup("summer",R.drawable.ladder) ;
        addOccasion(occasion);
        occasion=new SummerPickup("Travel",R.drawable.bus) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.cloudy) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.sun_umbrella) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.swimsuit) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.ladder) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.bus) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.cloudy) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.sun_umbrella) ;
        addOccasion(occasion);
        occasion=new SummerPickup("summer",R.drawable.swimsuit) ;
        addOccasion(occasion);

    }

    private void startOccasionActivity(int position) {
        Intent occasionActivityIntent=new Intent(MainActivity.this,OccasionActivity.class);
        occasionActivityIntent.putExtra("position",position);
        startActivity(occasionActivityIntent);
    }



}

