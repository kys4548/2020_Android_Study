package com.youngsil.kotlinsample;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BmiJavaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding);

        findViewById(R.id.bmiButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText tallField = findViewById(R.id.tallField);
                String tall = tallField.getText().toString();

                EditText weightField = findViewById(R.id.weightField);
                String weight = weightField.getText().toString();

                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                TextView resultLabel = findViewById(R.id.resultLabel);
                resultLabel.setText("키: " + tall + ", 체중 : " + weight + " BMI : " + bmi);
            }
        });
    }
}
