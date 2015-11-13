package com.faith.brooksidefinalapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class Splashscreen extends AppCompatActivity {

    public  static int SPLASH=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent=new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH);

    }
}
