package com.youngsil.kotlinsample;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {

    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationContext = getApplicationContext();
    }


    public static Context getAppContext() {
        return applicationContext;
    }
}
