package com.eduarte.labexerno1_eduarte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.btn1);
}

    public void displayMsg(View v){
        Intent i = new Intent(this, UstPlaces.class);
        startActivity(i);
    }

    public void catalogMsg(View v){
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }


}
