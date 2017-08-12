package com.example.ghome.projectdz.Classwork.classwork8;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.base.BaseActivity;
import com.example.ghome.projectdz.databinding.ActivityClasswork8Binding;

/**
 * Created by GHome on 09.08.2017.
 */

public class ClassWork8Activity extends BaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        ClassWork8ViewModel viewModel=new ClassWork8ViewModel(this);

        this.viewModel = viewModel;


        ActivityClasswork8Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_classwork8);
        binding.setViewModel(viewModel);
        super.onCreate(savedInstanceState);

    }
}
