package com.dojester13.splashexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    private static int TIME = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        //this handler execute run after TIME milliseconds
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //just an Intent form here to Main activity
                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }

        }, TIME);
    }

}
