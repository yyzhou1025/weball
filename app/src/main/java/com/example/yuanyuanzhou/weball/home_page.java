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
<<<<<<< HEAD

    public void meButton (View view) {
        Intent intent = new Intent (this, me_page.class);
=======
    public void buttonCreate (View view){
        Intent intent = new Intent (this, Create1Activity.class);
>>>>>>> 4767df5b4f236805acae35f0a507d4fe8f967837
        startActivity(intent);
    }
}
