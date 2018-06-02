package com.aapp.activities.components;

import com.aapp.activities.MainActivity;

public class MainActivity_C {

    private MainActivity activity;

    public void attach(MainActivity activity){
        this.activity = activity;
    }

    public void finish(){
        activity.finish();
    }
}
