package com.sonu.daggerandroid.dagger;

import com.sonu.daggerandroid.PetrolEngine;
import com.sonu.daggerandroid.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public  abstract class PetrolEngineModule {

    @Binds
    abstract Engine getPetrolEngine(PetrolEngine engine);
}
