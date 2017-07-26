package com.example.ghome.projectdz.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.dz1.Dz1Activity;


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
                Intent intent =new Intent(MainActivity.this, Dz1Activity.class);
                startActivity(intent);
            }
        });

    }



}
