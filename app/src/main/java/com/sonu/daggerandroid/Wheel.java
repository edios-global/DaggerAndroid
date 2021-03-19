package com.sonu.daggerandroid;

import android.util.Log;

import com.sonu.daggerandroid.car.Rim;
import com.sonu.daggerandroid.car.Tier;

public class Wheel {

    //we don't own this class i.e. we can't write @Inject in Constructor
    private static final String TAG = "Wheel";
    private Tier t;
    private Rim rim;

    public Wheel(Tier tier , Rim rim) {
        Log.d(TAG, "Wheel: ");
        this.t = tier;
        this.rim = rim;
    }

    public void printTierAndRimInstance(){
        Log.d(TAG, "printTierAndRimInstance:  tier "+this.t +" rim is "+this.rim);
    }
}
