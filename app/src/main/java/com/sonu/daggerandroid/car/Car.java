package com.sonu.daggerandroid.car;

import android.util.Log;

import com.sonu.daggerandroid.Wheel;
import com.sonu.daggerandroid.dagger.Activityscope;

import javax.inject.Inject;

@Activityscope
public class Car {

    private static final String TAG = "Car";
    private Wheel wheel;
    private Engine engine;
    private Driver driver;

    @Inject
    public Car(Driver driver , Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
        this.driver = driver;
        Log.d(TAG, "Car: ");
    }

    public void driveCar(){
        engine.start();
        wheel.printTierAndRimInstance();
        Log.d(TAG, "Driver Name is "+driver.name +"  Driver instance :"+this.driver +" drives car instance"+this);
    }
}
