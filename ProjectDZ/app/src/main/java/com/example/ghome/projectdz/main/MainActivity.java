package com.example.ghome.projectdz.main;

import android.app.Activity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.classwork2.Classwork2Activity;
import com.example.ghome.projectdz.classwork3.ClassWork3Activity;
import com.example.ghome.projectdz.dz1.Dz1Activity;
import com.example.ghome.projectdz.dz2.Dz2Activity;
import com.example.ghome.projectdz.dz3.Dz3Activity;
import com.squareup.leakcanary.LeakCanary;


/**
 * Created by GHome on 26.07.2017.
 */


public class MainActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate()");


        Button dz1Button = (Button) findViewById(R.id.MainDz1Button);
        dz1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz1Activity.class);
                startActivity(intent);
            }
        });

        Button dz2Button = (Button) findViewById(R.id.MainDz2Button);
        dz2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz2Activity.class);
                startActivity(intent);
            }
        });

        Button classwork2Button = (Button) findViewById(R.id.MainClasswork2Button);
        classwork2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Classwork2Activity.class);
                startActivity(intent);
            }
        });

        Button classwork3Button = (Button) findViewById(R.id.MainClasswork3Button);
        classwork3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassWork3Activity.class);
                startActivity(intent);
            }
        });

        Button dz3Button = (Button) findViewById(R.id.MainDz3Button);
        dz3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz3Activity.class);
                startActivity(intent);
            }
        });


    }


}