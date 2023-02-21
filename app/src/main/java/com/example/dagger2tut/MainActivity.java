package com.example.dagger2tut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
@Inject
    Coffee coffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent coffeeComponent= DaggerCoffeeComponent.builder().suger(55).build();
        coffeeComponent.inject(this);


        Log.d(TAG, "onCreate: amr : "+coffee.getCoffeeCup() );

    }
}