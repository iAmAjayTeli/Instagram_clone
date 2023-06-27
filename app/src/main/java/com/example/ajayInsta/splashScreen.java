package com.example.ajayInsta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.window.SplashScreen;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    getAllStackTraces();
                } finally {
                     Intent intent=new Intent(splashScreen.this, MainActivity.class);
                     finish();
                     startActivity(intent);
                }
            }
        };thread.start();
    }
}