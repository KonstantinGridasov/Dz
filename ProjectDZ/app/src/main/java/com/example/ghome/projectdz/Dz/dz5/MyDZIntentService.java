package com.example.ghome.projectdz.Dz.dz5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by GHome on 02.08.2017.
 */

public class MyDZIntentService extends IntentService {
    public static final String MY_ACTIION="com.example.ghome.projectdz.Dz.dz5.MY_ACTIION";


    public MyDZIntentService(String name) {
        super("MyClassworkIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.e("onHandleIntent", String.valueOf(intent));



    }
    public MyDZIntentService() {
        super("MyClassworkIntentService");
    }


}
