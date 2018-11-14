package com.example.sejal.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.password;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsername, etPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

       if (etUsername.getText().toString().equals("admin"))
              {
           Toast.makeText(LoginActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
           Intent intent = new Intent(LoginActivity.this, MainActivity.class);
           startActivity(intent);
       }
       else {
           Toast.makeText(LoginActivity.this,"Incorrect Username",Toast.LENGTH_LONG).show();
       }
    }


}


