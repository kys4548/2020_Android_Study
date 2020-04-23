package com.youngsil.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_view_binding.*

class BmiKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // UI로 사용할 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding)

        bmiButton.setOnClickListener {
            val tall = tallField.text.toString().toDouble()
            val weight = weightField.text.toString().toDouble()

            val bmi = weight / Math.pow(tall / 100.0, 2.0)

            resultLabel.text = "키 : ${tallField.text}, 체중 : ${weightField.text}, BMI : $bmi"
        }
    }
}
