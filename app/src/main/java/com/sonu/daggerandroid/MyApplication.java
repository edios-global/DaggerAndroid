package com.sonu.daggerandroid;

import android.app.Application;

import com.sonu.daggerandroid.dagger.Appcomponent;
import com.sonu.daggerandroid.dagger.DaggerAppcomponent;
import com.sonu.daggerandroid.dagger.DriverModule;

public class MyApplication  extends Application {
    Appcomponent appcomponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appcomponent = DaggerAppcomponent.factory().create(new DriverModule("sonu"));
    }

    public Appcomponent getAppcomponent() {
        return appcomponent;
    }
}
