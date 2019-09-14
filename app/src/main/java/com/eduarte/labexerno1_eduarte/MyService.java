package com.eduarte.labexerno1_eduarte;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {

    public MyService(){
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Place 1", "UST HOSPITAL");
        Log.d("Place 2", "UST CARPARK");
        Log.d("Place 3", "UST STEPS");
        Log.d("Place 4", "THE ONE");

    }
}
