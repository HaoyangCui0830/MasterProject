package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Login extends AppCompatActivity{

    private EditText mAccount;
    private EditText mPwd;
    private Button mRegisterButton;
    private Button mLoginButton;
    private Button mCancleButton;
    private CheckBox mRememberCheck;
    private Switch mLEAStaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAccount = (EditText) findViewById(R.id.login_edit_account);
        mPwd = (EditText) findViewById(R.id.login_edit_pwd);
        mRegisterButton = (Button) findViewById(R.id.login_btn_register);
        mLoginButton = (Button) findViewById(R.id.login_btn_login);
        mCancleButton = (Button) findViewById(R.id.login_btn_cancle);
        mRememberCheck = (CheckBox) findViewById(R.id.Login_Remember);
        mLEAStaff = (Switch)findViewById(R.id.LEA_staff);
        mLEAStaff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if (isChecked) {

                } else {

                }
            }

        });
    }

    public void finish_login(View view){
        Toast.makeText(Login.this, "Login Successfully",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Login.this,MainActivity.class) ;
        startActivity(intent);
        finish();
    }
    public void resetpwd(View view){
        Intent intent = new Intent(Login.this,Register.class) ;
        startActivity(intent);
        finish();
    }
    public void cancel_login(View view){
        Toast.makeText(Login.this, "Cancel",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Login.this,MainActivity.class) ;
        startActivity(intent);
        finish();
    }
}
