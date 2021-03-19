package com.sonu.daggerandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sonu.daggerandroid.car.Car;
import com.sonu.daggerandroid.dagger.ActivityComponenet;
import com.sonu.daggerandroid.dagger.Appcomponent;
import com.sonu.daggerandroid.dagger.DieselEndingModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1;
    @Inject
    Car car2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CarComponent carComponent = DaggerCarComponent.builder()
//                .dieselEndingModule(new DieselEndingModule(10))
//                .build();

        ActivityComponenet activityComponenet = ((MyApplication)getApplication()).getAppcomponent()
                .getActivityComponenetFactory().create(1000,500);
//                .horsepower(100)
//                .enginecapacity(500)
//                .build();
//        .getActivityComponenet(new DieselEndingModule(4560));

//                .enginecapacity(45)
//                .horsepower(500)
//                .setAppcomponent(((MyApplication)getApplication()).getAppcomponent())
//                .build();
        activityComponenet.inject(this);

        car1.driveCar();
        car2.driveCar();

    }
}