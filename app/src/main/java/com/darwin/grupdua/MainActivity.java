package com.darwin.grupdua;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText et_min, et_max;
    Button b_generate;
    TextView tv_output;

    Random r;
    int min, max, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_min = findViewById(R.id.et_min);
        et_max = findViewById(R.id.et_max);
        b_generate = findViewById(R.id.b_generate);
        tv_output = findViewById(R.id.tv_output);

        r = new Random();
        b_generate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String tempMin, tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();
                if (!tempMin.equals("") && !tempMax.equals("")) {
                    min = Integer.parseInt(tempMin);
                    max = Integer.parseInt(tempMax);

                    if (max > min) {
                        output = r.nextInt((max - min) + 1) + min;
                        tv_output.setText("" + output);
                    }
                }
            }
        });
    }

}