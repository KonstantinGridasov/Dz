package com.example.ghome.projectdz.Classwork.classwork5;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.ghome.projectdz.R;

/**
 * Created by GHome on 02.08.2017.
 */

public class ClassWork5Activity extends Activity {
    TextView textView;
    int i = 1;
    private BroadcastReceiver reseiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("aaaa", "onReceive");
            i++;
            textView.setText("i=" + i);
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork5);
        Log.e("ClassWork5Activity", "onCreate");

        Intent intent = new Intent(ClassWork5Activity.this, MyClassworkIntentService.class);
        intent.putExtra(MyClassworkIntentService.KEY_ACITON, "Zadanie0");
        startService(intent);

        Intent intent1 = new Intent(ClassWork5Activity.this, MyClassworkIntentService.class);
        intent1.putExtra(MyClassworkIntentService.KEY_ACITON, "Zadanie1");
        startService(intent1);

        Intent intent2 = new Intent(ClassWork5Activity.this, MyClassworkIntentService.class);
        intent2.putExtra(MyClassworkIntentService.KEY_ACITON, "Zadanie2");
        startService(intent2);


        textView = (TextView) findViewById(R.id.textViewcl5);
        startService(new Intent(this, ClassWorkService.class)); // Будет работать долго пока....


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent =new Intent(ClassWork5Activity.this, ClassWorkService.class);
                stopService(new Intent(ClassWork5Activity.this, ClassWorkService.class));
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        intentFilter.addAction(MyClassworkIntentService.MY_ACTIION);
        registerReceiver(reseiver, intentFilter);

        Intent intent = new Intent(ClassWork5Activity.this, ClassWorkService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(reseiver);
//        Intent intent= new Intent(ClassWork5Activity.this,ClassWorkService.class);
        unbindService(serviceConnection);
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




