package com.example.myapplication6;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.CYAN;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textview);
        tv1 = findViewById(R.id.textview1);
        tv.setText("blue");
        tv1.setText("cyan");
        tv1.setTextColor(BLUE);
        tv.setTextColor(CYAN);
        tv.setTextSize(60);
        tv1.setTextSize(60);
        tv.setWidth(500);
        tv1.setWidth(500);

    }
    public void go1(View view) {
        if (tv.getCurrentTextColor() == CYAN) {
            tv1.setTextColor(CYAN);
            tv.setTextColor(BLUE);
            tv.setText("cyan");
            tv1.setText("blue");
        }
        else{
            tv1.setTextColor(BLUE);
            tv.setTextColor(CYAN);
            tv.setText("blue");
            tv1.setText("cyan");
        }
    }
}