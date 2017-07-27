package com.example.ghome.projectdz.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.classwork2.Classwork2Activity;
import com.example.ghome.projectdz.dz1.Dz1Activity;
import com.example.ghome.projectdz.dz2.Dz2Activity;


/**
 * Created by GHome on 26.07.2017.
 */

public class MainActivity extends Activity {
    @Override
     protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dz1Button =(Button) findViewById(R.id.dz1Button);
        dz1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MainActivity.this, Dz1Activity.class);
                startActivity(intent1);
            }
        });

        Button dz2Button =(Button) findViewById(R.id.dz2Button);
        dz2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(MainActivity.this, Dz2Activity.class);
                startActivity(intent2);
            }
        });

        Button classwork2Button =(Button) findViewById(R.id.classwork2Button);
        classwork2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 =new Intent(MainActivity.this, Classwork2Activity.class);
                startActivity(intent3);
            }
        });



    }



}
