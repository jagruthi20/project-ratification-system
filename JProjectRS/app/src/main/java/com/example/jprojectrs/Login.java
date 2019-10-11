package com.example.jprojectrs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button stuSignUp,facSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        facSignUp = (Button) findViewById(R.id.button2);
        stuSignUp = (Button) findViewById(R.id.button3);

        stuSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, StudentSignUp.class);
                startActivity(i);

            }
        });

        facSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Faculty_Sign_Up.class);
                startActivity(i);

            }
        });
    }
}
