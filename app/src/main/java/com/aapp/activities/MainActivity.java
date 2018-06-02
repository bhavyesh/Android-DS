package com.aapp.activities;

import android.os.Bundle;

import com.aapp.R;
import com.aapp.activities.components.MainActivity_C;
import com.aapp.activities.initializers.MainActivity_I;
import com.aapp.activities.viewhandlers.MainActivity_V;

public class MainActivity extends BaseActivity {

    public final MainActivity_I I = new MainActivity_I();
    public final MainActivity_V V = new MainActivity_V();
    public final MainActivity_C C = new MainActivity_C();



    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        I.initialize(this);

    }
}