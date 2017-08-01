package com.example.ghome.projectdz.dz4;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.AnimatorRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.dz3.Dz3Activity;
import com.squareup.picasso.Picasso;

/**
 * Created by GHome on 31.07.2017.
 */

public class Dz4Activity extends Activity {
    ImageView imageView;
    Animation anim = null;
    private AnimationDrawable mAnimationDrawable;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz4);

        imageView = (ImageView) findViewById(R.id.Dz4Sova1);
        imageView.setBackgroundResource(R.drawable.sova);

        mAnimationDrawable=(AnimationDrawable) imageView.getBackground();


        //registerForContextMenu(imageView);
        Button buttonAnim = (Button) findViewById(R.id.Dz4Button);
        buttonAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimationDrawable.start();
            }
        });


    }
}