package com.example.ghome.projectdz.dz3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghome.projectdz.BuildConfig;
import com.example.ghome.projectdz.R;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by GHome on 28.07.2017.
 */

public class Dz3Activity  extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz3);

        TextView textView =(TextView) findViewById(R.id.Dz3TextGradle);
        textView.setText(BuildConfig.API_ENDPOINT);

        final EditText editText = (EditText) findViewById(R.id.Dz3Edit);

        Button buttonLoad = (Button) findViewById(R.id.dz3Button);
            buttonLoad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Picasso.with(Dz3Activity.this)
                            .load(Uri.parse(editText.getText().toString()))
                            .into((ImageView) findViewById(R.id.Dz3imageView));

                }
            });
        }

}