package com.example.ganesh.demologinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText Email,Password;
    private TextView Register,Info;
    private Button bLogin;
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email=(EditText)findViewById(R.id.edtEmail);
        Password=(EditText)findViewById(R.id.edtPassword);
        Register=(TextView) findViewById(R.id.tvRegister);
        bLogin=(Button) findViewById(R.id.btnLogin);
        Info=(TextView)findViewById(R.id.tvInfo);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=Email.getText().toString();
                String pass=Password.getText().toString();
                validate(uname,pass);
                Email.setText("");
                Password.setText("");
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });
    }

    private void validate(String uname1,String pass1)
    {
       // String uname=Email.getText().toString();
       // String pass=Password.getText().toString();
        if(uname1.equals("ganesh@gmail.com")&&pass1.equals("1234"))
        {
            Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Login Details are incorrect",Toast.LENGTH_SHORT).show();
            counter--;
            Info.setText("No. of remaining Attempts"+String.valueOf(counter));
            if(counter==0)
                bLogin.setEnabled(false);
        }
    }


}
