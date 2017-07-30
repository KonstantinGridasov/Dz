package com.example.ghome.projectdz.dz3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghome.projectdz.R;

import com.squareup.picasso.Picasso;

/**
 * Created by GHome on 28.07.2017.
 */

public class Dz3Activity  extends Activity {



    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz3);

        final EditText editText = (EditText) findViewById(R.id.Dz3Edit);
        String s= editText.getText().toString();

        if ( s.length()>1) {
            Button buttonLoad = (Button) findViewById(R.id.dz3Button);
            buttonLoad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Picasso.with(Dz3Activity.this)
                            .load(editText.getText().toString())
                            .into((ImageView) findViewById(R.id.Dz3imageView));


                }
            });
        }




    }
}