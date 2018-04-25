package com.example.yuanyuanzhou.weball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login_page extends AppCompatActivity {

    public void loginButton(View view) {
        EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
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
        setContentView(R.layout.activity_login_page);
    }


}
