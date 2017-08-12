package com.example.ghome.projectdz.Dz.dz5;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;


import com.example.ghome.projectdz.R;

/**
 * Created by GHome on 02.08.2017.
 */

public class Dz5Activity extends Activity {
    TextView textView;
    String isOn="Attention!!! WiFi is ON";
    String isoFF="Attention!!! WiFi is OFF";



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz5);
        Log.e("Dz5Activity", "onCreate");
        textView=findViewById(R.id.textViewdz5);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Dz5Activity", "onStart");
        startService(new Intent(this, Dz5Service.class));

    }

    @Override
    protected void onStop() {
        Log.e("Dz5Activity", "onStop");
        stopService(new Intent(this, Dz5Service.class));
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.e("Dz5Activity", "onResume");
        super.onResume();

    }


    @Override
    protected void onPause() {
        Log.e("Dz5Activity", "onPause");
        stopService(new Intent(this, Dz5Service.class));
        super.onPause();
    }



    @Override
    protected void onDestroy() {
        Log.e("Dz5Activity", "onDestroy");
        super.onDestroy();
    }

}
