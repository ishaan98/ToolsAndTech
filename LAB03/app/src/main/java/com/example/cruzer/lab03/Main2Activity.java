package com.example.cruzer.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int a = 12;
        int b = 30;
        TextView tv = findViewById(R.id.tv);
        String s = "12 + 30 = "+String.valueOf(a+b);
        tv.setText(s);

    }
}
