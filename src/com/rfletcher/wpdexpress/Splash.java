package com.rfletcher.wpdexpress;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
   
    private static int SPLASHLENGTH= 2000;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
 
        new Handler().postDelayed(new Runnable() {
 
            @Override
            public void run() {
            	
            	  boolean firstboot = getSharedPreferences("BOOT_PREF", MODE_PRIVATE).getBoolean("firstboot", true);
                  
            	   if (firstboot){
            		   Intent i = new Intent(Splash.this, WelcomeAct.class);
                       startActivity(i);

                       finish();
            	        getSharedPreferences("BOOT_PREF", MODE_PRIVATE)
            	            .edit()
            	            .putBoolean("firstboot", false)
            	            .commit();
            	    }
            	    else {
            	    	 Intent j = new Intent(Splash.this, MainActivity.class);
                         startActivity(j);

                         finish();
            	        } 
            	  
            }
        },
        SPLASHLENGTH);
    }
 
}