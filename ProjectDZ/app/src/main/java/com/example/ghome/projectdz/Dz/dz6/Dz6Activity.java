package com.example.ghome.projectdz.Dz.dz6;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghome.projectdz.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by GHome on 04.08.2017.
 */

public class Dz6Activity extends Activity {
    private RecyclerView recyclerView;

    private final String myImage_urls[] = {
            "http://api.learn2crack.com/android/images/donut.png",
            "http://api.learn2crack.com/android/images/eclair.png",
            "http://api.learn2crack.com/android/images/froyo.png",
            "http://api.learn2crack.com/android/images/ginger.png",
            "http://api.learn2crack.com/android/images/honey.png",
            "http://api.learn2crack.com/android/images/icecream.png",
            "http://api.learn2crack.com/android/images/jellybean.png",
            "http://api.learn2crack.com/android/images/kitkat.png",
            "http://api.learn2crack.com/android/images/lollipop.png",
            "http://api.learn2crack.com/android/images/marshmallow.png"
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz6);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView_Dz6);
        GridLayoutManager myGridManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(myGridManager);

        ArrayList myImage_url = myGetUrl();
        Dz6Adapter adapter = new Dz6Adapter(getApplicationContext(),myImage_url);
        recyclerView.setAdapter(adapter);


    }

    private ArrayList myGetUrl()
    {
        ArrayList myImage = new ArrayList<>();

        for(int i=0;i<myImage_urls.length;i++){
            MyImage myImage_url = new MyImage();
            myImage_url.setImage_url(myImage_urls[i]);
            myImage.add(myImage_url);
        }
        return myImage;
    }



}

