package com.sonu.daggerandroid.dagger;

import com.sonu.daggerandroid.car.DieselEngine;
import com.sonu.daggerandroid.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEndingModule {
    int hp;

    public DieselEndingModule(int hp) {
        this.hp = hp;
    }

    @Provides
    int provideHorsePower() {
        return this.hp;
    }

    @Provides
    Engine getDieselEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }
}
