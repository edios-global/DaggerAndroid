package com.sonu.daggerandroid.dagger;

import com.sonu.daggerandroid.Wheel;
import com.sonu.daggerandroid.car.Rim;
import com.sonu.daggerandroid.car.Tier;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelModule {

    @Activityscope
    @Provides
    static Rim getRim() {
        return new Rim();
    }

    @Provides
    static Tier getTier() {
        return new Tier();
    }

    @Provides
    static Wheel getWheel(Rim rim, Tier tier) {
        return new Wheel(tier, rim);
    }
}
