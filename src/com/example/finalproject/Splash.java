package com.example.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ojeshhrimal on 1/16/2015.
 */

public class Splash extends Activity {
    protected boolean _active = true;
    protected int _splashTime = 3000; // time to display the splash screen in ms



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        /****** Create Thread that will sleep for 3 seconds *************/        
        Thread background = new Thread() {
            public void run() {
                 
                try {
                    // Thread will sleep for 3 seconds
                    sleep(3*1000);
                     
                    // After 3 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                     
                    //Remove activity
                    finish();
                     
                } catch (Exception e) {
                 
                }
            }
        };
         
        // start thread
        background.start();
            }
    @Override
    protected void onDestroy() {
         
        super.onDestroy();
         
    }
}
