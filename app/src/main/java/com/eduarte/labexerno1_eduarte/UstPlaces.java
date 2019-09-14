package com.eduarte.labexerno1_eduarte;

import android.app.IntentService;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UstPlaces extends AppCompatActivity {

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void USTHOSPITAL (View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.usthospital.com.ph/"));
        startActivity(i);
    }

    public void USTCARPARK (View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/ust-carpark/50137b67e4b08516d1f18b22"));
        startActivity(i);
    }

    public void USTSTEPS (View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://steps.ust.edu.ph/"));
        startActivity(i);
    }

    public void THEONE (View v){
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://theone.com.ph/"));
        startActivity(i);
    }
}
