package com.example.dagger2tut;

import android.util.Log;

import javax.inject.Inject;

public class Farm {
    private static final String TAG = "Farm";
    @Inject
    public Farm() {
        Log.d(TAG, "Farm: amr");
    }

    String getBeans(){
        return "Beans";
    }
}
