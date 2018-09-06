package com.example.docktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Submit_Successfully extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit__successfully);
    }

    public void back(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(Submit_Successfully.this,MainActivity.class) ;
        startActivity(intent3);
        finish();
    }

}
