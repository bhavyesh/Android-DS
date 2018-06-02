package com.aapp.application;

import android.app.Application;


public class BaseApplication extends Application {

    public final BaseApplication_I I = new BaseApplication_I();
    public final BaseApplication_C C = new BaseApplication_C();

    @Override
    public void onCreate() {

        super.onCreate();

        I.initialize(this);

    }
}