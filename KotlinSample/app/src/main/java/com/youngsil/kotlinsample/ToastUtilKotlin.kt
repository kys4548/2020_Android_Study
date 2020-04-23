@file:JvmName("ToastUtil")
package com.youngsil.kotlinsample

import android.widget.Toast

@JvmOverloads
fun toast(message:String, length:Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), message, length).show()

}