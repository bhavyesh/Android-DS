package com.aapp.activities.viewhandlers;

import android.view.View;

import com.aapp.activities.MainActivity;

import com.aapp.base.Runner;

public class MainActivity_V extends Runner implements View.OnClickListener {

    private MainActivity activity;


    public void attach(MainActivity activity){
        this.activity = activity;
        super.runner();
    }


    @Override
    protected void run(){



    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

        }
    }

}