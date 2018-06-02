package com.aapp.application;

import com.aapp.base.Runner;

public class BaseApplication_I extends Runner {

    private BaseApplication application;

    public void initialize(BaseApplication application){
        this.application = application;
        super.runner();
    }

    @Override
    public void run(){
        application.C.attach(application);
    }

}
