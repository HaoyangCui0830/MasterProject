package com.example.docktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CreateCase extends AppCompatActivity {
    private Button mAddEvidenceButton;
    private Button mSubmitButton;
    private EditText crimeType;
    private EditText street;
    private EditText suburb;
    private EditText state;
    private Switch mAnonymous;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_case);
        mAddEvidenceButton = (Button)findViewById(R.id.add_evidence);
        mSubmitButton = (Button) findViewById(R.id.submit);
        crimeType = (EditText) findViewById(R.id.crime_type);
        street = (EditText) findViewById(R.id.street);
        suburb = (EditText) findViewById(R.id.suburb);
        state = (EditText) findViewById(R.id.state);
        mAnonymous = (Switch)findViewById(R.id.anonymous);
        mAnonymous.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if (isChecked) {
                    Toast.makeText(CreateCase.this, "You will not submit your personal information",
                            Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(CreateCase.this, "This case will be submitted together with your personal information",
                            Toast.LENGTH_SHORT).show();

                }
            }});
    }
    public void submit(View view){
        //String crimeTypeStr = crimeType.getText().toString().trim();
        //String streetStr = street.getText().toString().trim();
        //String suburbStr = suburb.getText().toString().trim();
        //String stateStr = state.getText().toString().trim();
        sendRequestWithHttpURLConnection();
        Intent intent5 = new Intent(CreateCase.this,Submit_Successfully.class);
        startActivity(intent5);
        finish();
    }

    public void addEvidence(View view){
        //String crimeTypeStr = crimeType.getText().toString().trim();
        //String streetStr = street.getText().toString().trim();
        //String suburbStr = suburb.getText().toString().trim();
        //String stateStr = state.getText().toString().trim();
        sendRequestWithHttpURLConnection();
        Intent intent5 = new Intent(CreateCase.this,Select_Photo.class);
        startActivity(intent5);
        finish();
    }


    private void sendRequestWithHttpURLConnection() {}

}

