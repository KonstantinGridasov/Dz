package com.example.ghome.projectdz.Classwork.classwork5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by GHome on 02.08.2017.
 */
//Работает в отдельном потоке, может выполнять сложные задачи
public class MyClassworkIntentService extends IntentService{


    public static final String KEY_ACITON="KEY_ACTIION";
    public static final String MY_ACTIION=" com.example.ghome.projectdz.Classwork.classwork5.MY_ACTIION";

    public MyClassworkIntentService(String name) {
        super("MyClassworkIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
//        String action =intent.getStringExtra(KEY_ACITON);
//      Log.e("Sss","onHandleIntent action= "+action);
        Intent intentRecever=new Intent(MY_ACTIION);
        sendBroadcast(intentRecever);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public MyClassworkIntentService() {
        super("MyClassworkIntentService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("classwork5","onDestroy");
    }
}





