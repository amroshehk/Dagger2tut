package com.example.dagger2tut;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";
    @Inject
    Farm farm;
    River river;
    int suger;
    @Inject
    public Coffee(River river,int suger) {
        this.suger = suger;
        this.river = river;
        Log.d(TAG, "Coffee: amr");
    }

    String getCoffeeCup(){
        return river.getWater() + " " + farm.getBeans() +" :"+ suger;
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
