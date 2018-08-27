package com.example.cruzer.lab05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class one extends AppCompatActivity {

    RadioGroup radiogp;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        radiogp = findViewById(R.id.radiogp);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radiogp.getCheckedRadioButtonId();

                switch (id){

                    case R.id.cs_it :
                        Toast.makeText(one.this, "CS/IT", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.etc :
                        Toast.makeText(one.this, "ETC", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mech :
                        Toast.makeText(one.this, "MECH", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.civil :
                        Toast.makeText(one.this, "CIVIL", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(one.this, "Select one from above", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
