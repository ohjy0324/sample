package com.example.user.userapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.loginlayout);

            btn =  (Button)findViewById(R.id.loginBtn);

            btn.setOnClickListener(new View.OnClickListener() {
                public  void  onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, PublicActivity.class);

                    startActivity(intent);
                }
            });

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
            toolbar.setTitle("ohjiyoung");
            toolbar.setTitleTextColor(Color.WHITE);
            setSupportActionBar(toolbar);

    }
}
