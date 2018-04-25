package com.example.yuanyuanzhou.weball;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class welcome_page2 extends Activity {

    public void LogInButton(View view) {
        @SuppressLint("WrongViewCast") EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        @SuppressLint("WrongViewCast") EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        if (emailEditText.getText().toString() == "" || passwordEditText.getText().toString() == "") {
            Toast.makeText(this, "A email address and password are required!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent (this, home_page.class);
            startActivity(intent);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_welcome_page2);
    }

    public void SighUpButton (View view){
        Intent intent = new Intent (this, registration_page.class);
        startActivity(intent);
    }

}
