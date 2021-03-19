package com.sonu.daggerandroid.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    int hp;
//
//    @Inject
//    public DieselEngine(int horsePower) {
//        Log.d(TAG, "DieselEngine: ");
//    }

    @Inject
    public DieselEngine(int horsePower) {
        this.hp = horsePower;
        Log.d(TAG, "DieselEngine: ");
    }

    @Override
    public void start() {
        Log.d(TAG, "start:  hp  "+hp);
    }
}
