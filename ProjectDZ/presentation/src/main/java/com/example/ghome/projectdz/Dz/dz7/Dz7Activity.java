package com.example.ghome.projectdz.Dz.dz7;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ghome.projectdz.databinding.ActivityDz7Binding;
import com.example.ghome.projectdz.R;



/**
 * Created by GHome on 07.08.2017.
 */

public class Dz7Activity extends Activity {
    ActivityDz7Binding binding;
    ImageView view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.setContentView(this,R.layout.activity_dz7);

        binding.setActivity(this);

        final User man=new User("Корбан Далас",30,"Мужской","https://st.kp.yandex.net/images/actor_iphone/iphone360_110.jpg");
        final User woman= new User("Лилу Далас",26,"Женский","http://www.graycell.ru/picture/big/yovovich.jpg" );

        binding.setUser(woman);
        super.onCreate(savedInstanceState);

        view=findViewById(R.id.imageMultipass);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               User change = binding.getUser();
                if (change==man) binding.setUser(woman);
                else binding.setUser(man);
            }
        });


    }
    @BindingAdapter({"bind:urlImage"})
    public static void setUrlImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }



}


