package com.example.idoid.radiobutton;

import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3;
    Button btn1,btn2;
    LinearLayout liner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1=(RadioButton)findViewById((R.id.radioButton));
        rb2=(RadioButton)findViewById((R.id.radioButton3));
        rb3=(RadioButton)findViewById((R.id.radioButton4));
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        liner=(LinearLayout)findViewById(R.id.liner);
    }
    void onclick1(View view) {
        if (rb1.isChecked()) {
            liner.setBackgroundColor(Color.RED);
        } else {
            if (rb2.isChecked()) {
                liner.setBackgroundColor(Color.GREEN);
            } else {
                if (rb3.isChecked()) {
                    liner.setBackgroundColor(Color.BLUE);
                }
            }
        }
    }
    void onclick2(View view){
        liner.setBackgroundColor(Color.WHITE);
    }
}
