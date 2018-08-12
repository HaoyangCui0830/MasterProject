package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private EditText mAccount;
    private EditText mPwd;
    private EditText mPwdCheck;
    private Button mSureButton;
    private Button mCancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAccount = (EditText) findViewById(R.id.resetpwd_edit_name);
        mPwd = (EditText) findViewById(R.id.resetpwd_edit_pwd_old);
        mPwdCheck = (EditText) findViewById(R.id.resetpwd_edit_pwd_new);

        mSureButton = (Button) findViewById(R.id.register_btn_sure);
        mCancelButton = (Button) findViewById(R.id.register_btn_cancel);
    }

    public void finish_register(View view){
        Toast.makeText(Register.this, "Register Successfully",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Register.this,Login.class) ;
        startActivity(intent);
        finish();
    }

    public void cancel_register(View view){
        Toast.makeText(Register.this, "Cancel Register",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Register.this,Login.class) ;
        startActivity(intent);
        finish();
    }
}
