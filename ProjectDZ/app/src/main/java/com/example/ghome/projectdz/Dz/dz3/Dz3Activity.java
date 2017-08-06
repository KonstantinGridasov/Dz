package com.example.ghome.projectdz.Dz.dz3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghome.projectdz.BuildConfig;
import com.example.ghome.projectdz.R;

import com.squareup.picasso.Picasso;

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
        editText.setText((String)"http://minionomaniya.ru/wp-content/uploads/2015/09/%D0%9A%D0%B0%D1%80%D1%82%D0%B8%D0%BD%D0%BA%D0%B8-%D0%BC%D0%B8%D0%BD%D1%8C%D0%BE%D0%BD%D0%BE%D0%B2.jpg");
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