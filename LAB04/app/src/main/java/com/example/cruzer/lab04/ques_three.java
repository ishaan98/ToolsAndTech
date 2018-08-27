package com.example.cruzer.lab04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ques_three extends AppCompatActivity {

    EditText num1, num2;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_three);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        ans = findViewById(R.id.ans);

    }

    public void addFunc(View v){
        try {
            double a = Double.parseDouble(String.valueOf(num1.getText().toString()));
            double b = Double.parseDouble(String.valueOf(num2.getText().toString()));
            double c = a + b;
            ans.setText(String.valueOf(c));
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void subFunc(View v){
        try {
            double a = Double.parseDouble(String.valueOf(num1.getText().toString()));
            double b = Double.parseDouble(String.valueOf(num2.getText().toString()));
            double c = a - b;
            ans.setText(String.valueOf(c));
        }
        catch (Exception e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void mulFunc(View v){
        try {
            double a = Double.parseDouble(String.valueOf(num1.getText().toString()));
            double b = Double.parseDouble(String.valueOf(num2.getText().toString()));
            double c = a * b;
            ans.setText(String.valueOf(c));
        }
        catch (Exception e){
            Toast.makeText(this, "Error"+e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void divFunc(View v){
        try{
            double a = Double.parseDouble(String.valueOf(num1.getText().toString()));
            double b = Double.parseDouble(String.valueOf(num2.getText().toString()));
            double c = a/b;
            ans.setText(String.valueOf(c));
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
