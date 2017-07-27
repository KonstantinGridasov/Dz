package com.example.ghome.projectdz.dz1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ghome.projectdz.R;

public class Dz1Activity extends Activity implements View.OnClickListener {


    private Button helloButton;
    //private int i;
    private TextView textView1;
    private TextView textView2;
    private String text1,text2;

    public static final String KEY_USERNAME="KEY_USERNAME";
    public static final String KEY_PASSWORD="KEY_PASSWORD";

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            text1=(String) textView1.getText();
            text2=(String) textView2.getText();

            textView1.setText(text2);
            textView2.setText(text1);

        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz1);
        Log.d("Dz1Activity","onCreate()");

        String username = getIntent().getStringExtra(KEY_USERNAME);
        String password = getIntent().getStringExtra(KEY_PASSWORD);

        textView1=(TextView) findViewById(R.id.textView1);
        textView2=(TextView) findViewById(R.id.textView2);

        textView1.setText(username);
        textView2.setText(password);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(listener);

        helloButton=(Button)findViewById(R.id.helloButton);

        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1=(String) textView1.getText();
                text2=(String) textView2.getText();

                textView1.setText(text2);
                textView2.setText(text1);

            }
        });


    }



    @Override
    public void onClick(View v) {
        text1=(String) textView1.getText();
        text2=(String) textView2.getText();

        textView1.setText(text2);
        textView2.setText(text1);

    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("Dz1Activity","onDestroy()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Dz1Activity","onStart()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Dz1Activity","onStop()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Dz1Activity","onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Dz1Activity","onPause()");
    }



}