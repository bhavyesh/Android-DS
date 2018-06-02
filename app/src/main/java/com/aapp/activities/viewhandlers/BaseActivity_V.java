package com.aapp.activities.viewhandlers;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.RelativeLayout;

import com.aapp.R;
import com.aapp.activities.BaseActivity;
import com.aapp.base.Runner;

public class BaseActivity_V extends Runner implements View.OnClickListener {

    private BaseActivity activity;

    public RelativeLayout main_view_stub;

    public DrawerLayout drawerLayout;


    public void attach(BaseActivity activity){
        this.activity = activity;
        super.runner();
    }


    @Override
    protected void run(){

        main_view_stub = activity.findViewById(R.id.view_stub);

        activity.findViewById(R.id.action_menu).setOnClickListener(this);
        activity.findViewById(R.id.action_search).setOnClickListener(this);

        drawerLayout = activity.findViewById(R.id.drawer_layout);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.action_menu: drawerLayout.openDrawer(GravityCompat.START); break;

        }
    }


    public boolean onBackPressed(){
        if ( drawerLayout.isDrawerOpen(GravityCompat.START) ) {
            drawerLayout.closeDrawer(GravityCompat.START);
            return false;
        } else {
           return true;
        }
    }

}