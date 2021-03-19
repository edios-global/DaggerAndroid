package com.sonu.daggerandroid.dagger;

import com.sonu.daggerandroid.car.Driver;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    String driverName ;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver getDriver(){
        return  new Driver(driverName);
    }
}
