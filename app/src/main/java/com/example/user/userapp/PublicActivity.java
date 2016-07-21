package com.example.user.userapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PublicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("경비관리");
        setContentView(R.layout.publiclayout);
    }

}
