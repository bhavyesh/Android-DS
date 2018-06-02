package com.aapp.activities.initializers;

import com.aapp.activities.MainActivity;
import com.aapp.base.Runner;

public class MainActivity_I extends Runner {

    private MainActivity activity;

    public void initialize(MainActivity activity){
        this.activity = activity;
        super.runner();
    }

    @Override
    protected void run(){
        activity.V.attach(activity);
        activity.C.attach(activity);
    }
}