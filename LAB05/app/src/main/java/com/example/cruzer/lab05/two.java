package com.example.cruzer.lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class two extends AppCompatActivity {

    String userName[] = {

            "user1",
            "user2",
            "user3"

    };

    String userPass[] = {

            "pass1",
            "pass2",
            "pass3"
    };

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                auth();

            }
        });

    }

    private void auth() {

        String input_name, input_pass;
        input_name = username.getText().toString();
        input_pass = password.getText().toString();

        try{
            for(int i=0; i<userName.length; i++){
                if(input_name.equals(userName[i]) && input_pass.equals(userPass[i])){
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    break;
                }
                Toast.makeText(getApplicationContext(), "Login Unsuccesful", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
