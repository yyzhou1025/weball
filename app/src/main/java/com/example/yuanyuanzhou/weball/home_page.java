package com.example.yuanyuanzhou.weball;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_page extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void logoutButton (View view){
        Intent intent = new Intent (this, login_page.class);
        startActivity(intent);
    }

    public void meButton (View view) {
        Intent intent = new Intent (this, me_page.class);
        startActivity(intent);
    }
}
