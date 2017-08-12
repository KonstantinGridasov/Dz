package com.example.ghome.projectdz.Classwork.classwork8;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.os.AsyncTask;
import android.support.annotation.IntegerRes;
import android.util.Log;


import com.example.ghome.projectdz.Classwork.classwork7.ClassWork7Activity;
import com.example.ghome.projectdz.base.BaseViewModel;

/**
 * Created by GHome on 09.08.2017.
 */

public class ClassWork8ViewModel implements BaseViewModel {

    public Activity activity;
    public ObservableField<String> helloText= new ObservableField<>("Hello");

    public ClassWork8ViewModel(Activity activity ) {
        this.activity=activity;
    }


    @Override
    public void init() {

    }

    @Override
    public void release() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }


    public void onSuperOnClick()
    {
        Log.e("ClassWork8ViewModel","Onclick");
        Intent intent = new Intent(activity, ClassWork7Activity.class);
        activity.startActivity(intent);
    }


    public class MyAsyncTask extends AsyncTask<Void, Integer,String>{


        @Override
        protected void onPreExecute() {
            //выполняется в UI потоке , до начала работы метода doInBackground
            //выполняется первым как вызвали start
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... params) {
            //ТУт выполняется все в отдельном потоке
            // затем данные передаются в onPostExecute
            publishProgress(20); // Вызвать метод onProgressUpdate

            return "";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            //тут все выполняется В UI потоке
            //вхожное значение s передатся из метода doInBackground
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //тут все выполдняется в UI потоке
            // этот метод надо вызвать самостоятельно из doInBackground

        }
    }






}
