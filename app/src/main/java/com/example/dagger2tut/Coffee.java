package com.example.dagger2tut;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    Farm farm;
    River river;
    int suger;
    int milk;
    @Inject
    public Coffee(River river, @Suger int suger,@Milk int milk) {
        this.suger = suger;
        this.milk = milk;
        this.river = river;
        Log.d(TAG, "Coffee: amr");
    }

    String getCoffeeCup(){
        return river.getWater() + " " + farm.getBeans() +" suger:"+ suger+" milk:"+ milk;
    }

    @Inject
    void connectNetwork1(){
        Log.d(TAG, "connectNetwork1: amr");
    }
    @Inject
    void connectNetwork2(){
        Log.d(TAG, "connectNetwork2: amr");
    }
}
