package com.sonu.daggerandroid.dagger;


import com.sonu.daggerandroid.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DriverModule.class})
public interface Appcomponent {
    //Driver getDriver();

    //all the moodule having constructor should be passed in parameter
//    ActivityComponenet getActivityComponenet(DieselEndingModule module);
//    ActivityComponenet.Builder123 getActivityComponenet();
    ActivityComponenet.Factory getActivityComponenetFactory();

    @Component.Factory
    interface Factory{
        Appcomponent create(DriverModule module);
    }

}
