package com.sonu.daggerandroid.dagger;

import com.sonu.daggerandroid.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@Activityscope
@Subcomponent( modules =  {WheelModule.class , PetrolEngineModule.class})
public interface ActivityComponenet {
    void inject(MainActivity activity);

//    @Component.Builder
//    interface Builder123{
//
//        @BindsInstance
//        Builder123 horsepower(@Named("horsepower") int horsepower);
//
//        @BindsInstance
//        Builder123 enginecapacity(@Named("capacity") int  capacity);
//
//        Builder123 setAppcomponent(Appcomponent appcomponent);
//
//        ActivityComponenet build();
//    }

//        @Subcomponent.Builder
//        interface Builder123{
//
//        @BindsInstance
//        Builder123 horsepower(@Named("horsepower") int horsepower);
//
//        @BindsInstance
//        Builder123 enginecapacity(@Named("capacity") int  capacity);
//
//        ActivityComponenet build();
//    }

    //provide compile time verification for input and all inputs are necessary
    @Subcomponent.Factory
    interface Factory{
        ActivityComponenet create(
                @BindsInstance @Named("horsepower") int horsepower,
                @BindsInstance @Named("capacity") int  capacity
        );
    }
}
