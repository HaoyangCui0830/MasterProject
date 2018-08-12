package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateCase extends AppCompatActivity {
    private Button mAddEvidenceButton;
    private Button mSubmitButton;
    private EditText crimeType;
    private EditText street;
    private EditText suburb;
    private EditText state;


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
    }
    public void submit(View view){
        String crimeTypeStr = crimeType.getText().toString().trim();
        String streetStr = street.getText().toString().trim();
        String suburbStr = suburb.getText().toString().trim();
        String stateStr = state.getText().toString().trim();
        Intent intent5 = new Intent(CreateCase.this,Submit_Successfully.class) ;
        startActivity(intent5);
        finish();
    }

}
