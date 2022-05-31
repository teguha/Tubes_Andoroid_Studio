package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tubes.Inspiratif.ListNovelInspiratif;
import com.example.tubes.RomanticNovel.ListNovelR;
import com.example.tubes.Sejarah.ListNovels;
import com.example.tubes.dataNovel.ListNovel;
import com.example.tubes.hororNovel.ListNovelHoror;
import com.example.tubes.komediNovel.ListKomedi;

public class MainActivity2 extends AppCompatActivity {
    ImageView buku,buku2,buku3,buku4,profile,keluar;

    LinearLayout data1,data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains2);
        buku = (ImageView) findViewById(R.id.img1);
        buku2 = (ImageView) findViewById(R.id.img2);
        buku3 = (ImageView) findViewById(R.id.img3);
        buku4 = (ImageView) findViewById(R.id.img4);
        profile = (ImageView) findViewById(R.id.profiles);
        keluar =(ImageView) findViewById(R.id.keluar);

        buku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, ListNovelHoror.class));
            }
        });

        buku2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, ListNovelR.class));
            }
        });

        buku3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, ListNovel.class));
            }
        });

        buku4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, ListKomedi.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,Profiles.class));
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });



    }

}