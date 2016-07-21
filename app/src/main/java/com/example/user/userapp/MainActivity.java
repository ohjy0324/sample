package com.example.user.userapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("LOGIN");
        setContentView(R.layout.loginlayout);

        btn =  (Button)findViewById(R.id.loginBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            public  void  onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PublicActivity.class);

                startActivity(intent);
            }
        });

    }
}
