package com.example.ghome.projectdz.Dz.dz5;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.ghome.projectdz.Classwork.classwork5.MyClassworkIntentService;

public class Dz5Service extends Service {
    Intent intent;
    public static String ACTION ="com.example.ghome.projectdz.Dz.dz5";

    public static  int mWIFIis=0;
    private BroadcastReceiver reseiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {


//            int extraWifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
//                    WifiManager.WIFI_STATE_UNKNOWN);
//
//            switch (extraWifiState) {
//                case WifiManager.WIFI_STATE_DISABLED:
//                    Log.e("BroadcastReceiver", "WIFI STATE DISABLED");
//                    mWIFIis = 0;
//                    break;
//                case WifiManager.WIFI_STATE_ENABLED:
//                    Log.e("BroadcastReceiver", "WIFI_STATE_ENABLED");
//                    mWIFIis = 1;
//                    break;
//            }
        }
    };

    public Dz5Service() {
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("Dz5Service","onBind");

        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("Dz5Service","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (flags == 0)
            {
            Log.e("Dz5Service", String.valueOf(flags));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(WIFI_SERVICE);
            registerReceiver(reseiver, intentFilter);

            sendBroadcast(intent);
            }
        else
            {
                unregisterReceiver(reseiver);
                stopSelf();
            }

            return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("Dz5Service","onUnbind");
        return super.onUnbind(intent);
    }
}
