package com.mertcansucu.kronometre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private long durrr;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronomether);
    }

    public void basla(View view){
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime() - durrr);
            chronometer.start();
            running = true;
        }

    }

    public void dur(View view){
        if(running){
            chronometer.stop();
            durrr = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }

    }

    public void sifirla(View view){
        chronometer.setBase(SystemClock.elapsedRealtime());
        durrr = 0;

    }


}