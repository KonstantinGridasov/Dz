package com.example.ghome.projectdz.Dz.dz5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

public class Dz5Service extends Service {
    public Dz5Service() {
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("ClassWorkService","onBind");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("ClassWorkService","onCreate");


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("","onStartCommand");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("","onUnbind");
        return super.onUnbind(intent);
    }
}
