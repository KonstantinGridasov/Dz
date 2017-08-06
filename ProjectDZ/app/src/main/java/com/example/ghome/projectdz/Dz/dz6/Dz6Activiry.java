package com.example.ghome.projectdz.Dz.dz6;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ghome.projectdz.R;

import java.util.ArrayList;

/**
 * Created by GHome on 04.08.2017.
 */

public class Dz6Activiry extends Activity {
    private RecyclerView recyclerView;
    private ArrayList<String> stringArrayList = new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz6);
        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");
        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");
        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");
        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");

        recyclerView =findViewById(R.layout.item_rececler_view_dz6);
        GridLayoutManager loyutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(loyutManager);

        Dz6Adapter adapter = new Dz6Adapter(stringArrayList);
        recyclerView.setAdapter(adapter);

        loyutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return adapter.isHeader(position) ? loyutManager.getSpanCount() : 1;
            }
        });

    }
}
