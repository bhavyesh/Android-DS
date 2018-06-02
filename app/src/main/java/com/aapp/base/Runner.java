package com.aapp.base;

public abstract class Runner {

    private boolean initialized = false;

    protected final void runner(){
        if (!initialized){
            run();
            initialized = true;
        }
    }

    protected abstract void run();

}
