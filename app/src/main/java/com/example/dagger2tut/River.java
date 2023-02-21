package com.example.dagger2tut;

import android.nfc.Tag;
import android.util.Log;

import javax.inject.Inject;

public class River {

    private static final String TAG = "River";

    public River() {
        Log.d(TAG, "River: amr");
    }

    String getWater(){
        return "Water";
    }
}
