package com.youngsil.kotlinsample;

import android.widget.Toast;

public class ToastUtilJava{

    public static void toastShort(String message) {
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show();
    }
}
