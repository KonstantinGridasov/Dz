package com.example.ghome.projectdz.Classwork.classwork9;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.ghome.projectdz.R;
import com.example.ghome.projectdz.base.BaseActivity;
import com.example.ghome.projectdz.databinding.ActivityClasswork9Binding;

/**
 * Created by GHome on 11.08.2017.
 */

public class ClassWork9Activity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Classwork9ViewModel classwork9ViewModel =new Classwork9ViewModel(this);
        this.viewModel=classwork9ViewModel;

        ActivityClasswork9Binding activityClasswork9Binding = DataBindingUtil.setContentView(this, R.layout.activity_classwork9);
        activityClasswork9Binding.setViewModel(classwork9ViewModel);
        super.onCreate(savedInstanceState);
    }
}
