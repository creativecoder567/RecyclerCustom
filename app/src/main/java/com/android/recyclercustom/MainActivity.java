package com.android.recyclercustom;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    int[] images = {
            R.drawable.fur0,
            R.drawable.fur2,
            R.drawable.fur3,
            R.drawable.slider2,
            R.drawable.slider3,
            R.drawable.slider4,
            R.drawable.fur0,
            R.drawable.slider3,
            R.drawable.fur3,
            R.drawable.slider2,
    };
    String[] names;
    Data data;
    ArrayList<Data> datas = new ArrayList<>();

    ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mNoOfColumns = calculateNoOfColumns(getApplicationContext());
        names = new String[] {
                "BED ROOOM",
                "SOFA BLUE",
                "SOFA MODERN",
                "INTERIOR",
                "LIVING ROOM",
                "MODERN HALL",
                "MODERN BED",
                "NEW DESIGN",
                "NEW SOFA",
                "DINNER HALL"};

        int count = 0;
        for(String a:names){
             data = new Data(images[count],a);
             count++;
            datas.add(data);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        layoutManager = new GridLayoutManager(MainActivity.this,mNoOfColumns);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(datas,this);
        recyclerView.setAdapter(adapter);



    }

    public static int calculateNoOfColumns(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int noOfColumns = (int) (dpWidth / 180);
        return noOfColumns;
    }
}
