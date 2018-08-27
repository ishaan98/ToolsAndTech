package com.example.cruzer.lab05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onP2Click(View v){
        startActivity(new Intent(getApplicationContext(), two.class));
    }

    public void onP1Click(View v){
        startActivity(new Intent(getApplicationContext(),one.class));
    }

    public void onP3Click(View v){
        startActivity(new Intent(getApplicationContext(), three.class));
    }
}
