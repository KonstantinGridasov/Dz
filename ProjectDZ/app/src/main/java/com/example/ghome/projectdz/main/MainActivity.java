package com.example.ghome.projectdz.main;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ghome.projectdz.Classwork.classwork6.ClassWork6Activity;
import com.example.ghome.projectdz.Dz.dz6.Dz6Activity;
import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.Classwork.classwork2.Classwork2Activity;
import com.example.ghome.projectdz.Classwork.classwork3.ClassWork3Activity;
import com.example.ghome.projectdz.Classwork.classwork4.ClassWork4Activity;
import com.example.ghome.projectdz.Classwork.classwork5.ClassWork5Activity;
import com.example.ghome.projectdz.Dz.dz1.Dz1Activity;
import com.example.ghome.projectdz.Dz.dz2.Dz2Activity;
import com.example.ghome.projectdz.Dz.dz3.Dz3Activity;
import com.example.ghome.projectdz.Dz.dz4.Dz4Activity;
import com.example.ghome.projectdz.Dz.dz5.Dz5Activity;


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

        Button dz3Button = (Button) findViewById(R.id.MainDz3Button);
        dz3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz3Activity.class);
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



        Button dz4Button = (Button) findViewById(R.id.MainDz4Button);
        dz4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz4Activity.class);
                startActivity(intent);
               overridePendingTransition(R.anim.right_in,R.anim.dz4alpha);



            }
        });

        Button classwork4button = (Button) findViewById(R.id.MainClasswork4Button);
        classwork4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassWork4Activity.class);
                startActivity(intent);
            }
        });



        Button dz5utton = (Button) findViewById(R.id.MainDz5Button);
        dz5utton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz5Activity.class);
                startActivity(intent);

            }
        });

        Button classwork5button = (Button) findViewById(R.id.MainClasswork5Button);
        classwork5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassWork5Activity.class);
                startActivity(intent);


            }
        });
        Button dz6utton = (Button) findViewById(R.id.MainDz6Button);
        dz6utton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dz6Activity.class);
                startActivity(intent);

            }
        });

        Button classwork6button = (Button) findViewById(R.id.MainClasswork6Button);
        classwork6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassWork6Activity.class);
                startActivity(intent);


            }
        });

    }


}