package com.aapp.activities.initializers;

import com.aapp.activities.BaseActivity;
import com.aapp.base.Runner;

public class BaseActivity_I extends Runner {

    private BaseActivity activity;

    public void initialize(BaseActivity activity){
        this.activity = activity;
        super.runner();
    }

    @Override
    protected void run(){
        activity.baseV.attach(activity);
        activity.baseC.attach(activity);
    }
}