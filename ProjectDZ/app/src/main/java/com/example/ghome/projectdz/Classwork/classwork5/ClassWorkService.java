package com.example.ghome.projectdz.Classwork.classwork5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by GHome on 02.08.2017.
 */

public class ClassWorkService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("aaa","onBind");
        return null;

    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("aaa","onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }


}
