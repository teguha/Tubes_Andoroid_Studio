package com.example.tubes;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tubes.Inspiratif.ListNovelInspiratif;

public class profile extends AppCompatActivity {
    ImageView btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btnHome = (ImageView) findViewById(R.id.backs);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(profile.this,MainActivity2.class));
            }
        });
    }
}
