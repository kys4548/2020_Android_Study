package com.youngsil.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_control.*

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)

        button.setOnClickListener {
            val number = numberField.text.toString().toInt()

            when {
                number % 2 == 0 -> toastShort("$number")
                number % 3 == 0 -> "hi"
                else -> "hi"
            }

            when(number) {
                in 1..10 -> "쩌는군"

                40, 50 -> "좋은 기능이야"

                else -> button.text = "실행"
            }
        }
    }
}
