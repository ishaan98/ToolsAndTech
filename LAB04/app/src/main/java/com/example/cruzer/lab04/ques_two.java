package com.example.cruzer.lab04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ques_two extends AppCompatActivity {

    EditText num1,num2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_two);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        ans = findViewById(R.id.ans);
    }

    public void viewAnswer(View v){
        try{
            int a = Integer.parseInt(String.valueOf(num1.getText().toString()));
            int b = Integer.parseInt(String.valueOf(num2.getText().toString()));
            int c = a+b;
            ans.setText(String.valueOf(c));
        }
        catch(Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
