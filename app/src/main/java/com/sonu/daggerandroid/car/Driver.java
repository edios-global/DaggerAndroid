package com.sonu.daggerandroid.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Driver {

    String name;

    public Driver(String name) {
        this.name = name;
        Log.d(TAG, "Driver: ");
    }

    //we don't own this calass
    private static final String TAG = "Driver";
}
