package com.example.ghome.projectdz.Classwork.classwork7;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.databinding.ActivityClasswork7Binding;

/**
 * Created by GHome on 07.08.2017.
 */

public class ClassWork7Activity extends Activity {

    public ObservableField<String> myText= new ObservableField<>("Ура, все работает");
    private Thread thread;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityClasswork7Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_classwork7);

        binding.setActivity(this);
//        binding.superTextView.setText(" ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    final  int a=i;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                       runOnUiThread(new Runnable() {
                           @Override

                               public void run()
                               {
                                   myText.set(String.valueOf(a));
                               }

                       });


                }
            }
        });


        thread.start();

    }
}




