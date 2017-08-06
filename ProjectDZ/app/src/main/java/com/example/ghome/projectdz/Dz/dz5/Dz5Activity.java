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
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ghome.projectdz.Classwork.classwork5.ClassWorkService;
import com.example.ghome.projectdz.R;

/**
 * Created by GHome on 02.08.2017.
 */

public class Dz5Activity extends Activity {
    static TextView textView;
    int WiFiIs;
    Context mContext;

    String isOn="on";
    String isoFF="oFF";


    private BroadcastReceiver reseiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            if (mContext == null) mContext = context;

            final WifiManager wm = (WifiManager) mContext.getSystemService(mContext.WIFI_SERVICE);
            Log.e("wm", String.valueOf(wm.isWifiEnabled()));



//            int extraWifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
//                    WifiManager.WIFI_STATE_UNKNOWN);
//
//            switch (extraWifiState) {
//                case WifiManager.WIFI_STATE_DISABLED:
//                    Log.e("BroadcastReceiver", "WIFI STATE DISABLED");
//
//                    break;
//                case WifiManager.WIFI_STATE_DISABLING:
//                    Log.e("BroadcastReceiver", "WIFI STATE DISABLING");
//                    WiFiIs=0;
//
//                    break;
//                case WifiManager.WIFI_STATE_ENABLED:
//                    Log.e("BroadcastReceiver", String.valueOf(WifiManager.WIFI_STATE_ENABLED));
//                    textView.setText("WiFI is"+ );
//
//                    break;
//            }
//
//                case WifiManager.WIFI_STATE_ENABLING:
//                    Log.e("BroadcastReceiver", "WIFI STATE ENABLING");
//                    WiFiIs=1;
//                    break;
//                case WifiManager.WIFI_STATE_UNKNOWN:
//                    Log.e("BroadcastReceiver", "WIFI STATE UNKNOWN");
//                    break;

            }

    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz5);

        Log.e("Dz5Activity", "onCreate");

        startService(new Intent(this, Dz5Service.class));
        TextView textView=(TextView)findViewById(R.id.textViewdz5);
        startService(new Intent(this, Dz5Activity.class));


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Dz5Activity", "onStart");
        registerReceiver(reseiver, new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION));

        Intent intent = new Intent(Dz5Activity.this, Dz5Service.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        unbindService(serviceConnection);
        unregisterReceiver(reseiver);
        Log.e("Dz5Activity", "onStop");
        super.onStop();
    }


    @Override
    protected void onPause() {
        unregisterReceiver(reseiver);
        Log.e("Dz5Activity", "onPause");
        super.onPause();
    }


    @Override
    protected void onResume() {
        registerReceiver(reseiver, new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION));
        Log.e("Dz5Activity", "onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.e("Dz5Activity", "onDestroy");
        super.onDestroy();
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.e("aaa", "onServiceConnected");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }

    };
}
