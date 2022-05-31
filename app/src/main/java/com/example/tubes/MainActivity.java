package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username , password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String usernameKey= username.getText().toString();
                String passwordKey= password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin")){
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }else{
                    Toast.makeText(MainActivity.this, "username and password failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}