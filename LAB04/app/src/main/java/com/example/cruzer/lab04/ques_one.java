package com.example.cruzer.lab04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ques_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_one);
    }

    public void btnOnClick(){
        Toast.makeText(this, "Name: Ishaan\nRoll: 1605612\nClass: CS-8", Toast.LENGTH_SHORT).show();
    }

}
