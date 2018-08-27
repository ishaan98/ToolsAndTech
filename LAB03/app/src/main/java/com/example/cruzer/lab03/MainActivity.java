package com.example.cruzer.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String roll = "1605612";
        String br = "CSE";

        Toast.makeText(this, roll+"\n"+br, Toast.LENGTH_LONG).show();

    }
}
