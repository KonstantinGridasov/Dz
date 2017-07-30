package com.example.ghome.projectdz.classwork2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.dz1.Dz1Activity;

/**
 * Created by GHome on 26.07.2017.
 */

public class Classwork2Activity extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork2);
        final EditText username =(EditText)findViewById(R.id.NameText);
        final EditText password =(EditText)findViewById(R.id.PassText);
        Button loginButton =(Button)findViewById(R.id.LoginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Classwork2Activity.this,Dz1Activity.class);

                intent.putExtra(Dz1Activity.KEY_USERNAME,username.getText().toString());
                intent.putExtra(Dz1Activity.KEY_PASSWORD,password.getText().toString());
                startActivity(intent);
            }
        });

    }
}
