package com.sonu.daggerandroid;

import android.util.Log;

import com.sonu.daggerandroid.car.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";
    int horsepower;
    int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsepower") int horsepower, @Named("capacity") int engineCapacity) {
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
        Log.d(TAG, "PetrolEngine: ");
    }

    @Override
    public void start() {
        Log.d(TAG, "start:  hp : " + horsepower + " engomecapacity is " + this.engineCapacity);
    }
}
