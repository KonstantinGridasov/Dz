package com.example.ghome.projectdz.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by GHome on 09.08.2017.
 */

abstract public class BaseActivity extends Activity {

        protected BaseViewModel viewModel;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            viewModel.init();
        }

        @Override
        protected void onResume() {
            super.onResume();
            viewModel.resume();
        }

        @Override
        protected void onPause() {
            super.onPause();
            viewModel.pause();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            viewModel.release();
    }

}
