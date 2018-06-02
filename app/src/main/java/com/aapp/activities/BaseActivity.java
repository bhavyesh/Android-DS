package com.aapp.activities;


import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aapp.R;
import com.aapp.activities.components.BaseActivity_C;
import com.aapp.activities.initializers.BaseActivity_I;
import com.aapp.activities.viewhandlers.BaseActivity_V;

public abstract class BaseActivity extends AppCompatActivity {

    public final BaseActivity_I baseI = new BaseActivity_I();
    public final BaseActivity_V baseV = new BaseActivity_V();
    public final BaseActivity_C baseC = new BaseActivity_C();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);
        baseI.initialize(this);
    }


    @Override
    public void onBackPressed() {
        if( baseV.onBackPressed() ){
            super.onBackPressed();
        }
    }


    @Override
    public void setContentView(int layoutResID) {

        if(baseV.main_view_stub != null){

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

            View localView = layoutInflater.inflate(layoutResID, baseV.main_view_stub, false);

            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);

            baseV.main_view_stub.addView(localView, params);
        }
    }

}
