package com.example.ganesh.demologinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText etEmail,etPhone,etPassword,etConformPass;
    TextView Login;
    Button bRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setUpUIViews();
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(RegisterActivity.this,MainActivity.class));
    }
});
    }

    private  void setUpUIViews()
    {
        etEmail=(EditText)findViewById(R.id.edtUserEmail);
        etPhone=(EditText)findViewById(R.id.edtUserPhone);
        etPassword=(EditText)findViewById(R.id.edtUserPassword);
        etConformPass=(EditText)findViewById(R.id.edtCPassword);
        Login=(TextView) findViewById(R.id.tvLogin);
        bRegister=(Button) findViewById(R.id.btnRegister);
    }

    private boolean Validate()
    {
        boolean result=false;
        return result;
    }


}
