package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    ImageView gambar1;
    TextView text1 , text2 , text3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        getdata();
    }
    //membuat method
    private void getdata(){
        if(getIntent().hasExtra("gambar") && getIntent().hasExtra("keterangan") && getIntent().hasExtra("nama_novel") && getIntent().hasExtra("penulis") ){
            int gambar_novels = getIntent().getIntExtra("gambar",0);
            String nama_novels = getIntent().getStringExtra("nama_novel");
            String penulis = getIntent().getStringExtra("penulis");
            String keterangan_novels = getIntent().getStringExtra("keterangan");

            TextView text1 = findViewById(R.id.text1);
            TextView text2 = findViewById(R.id.text2);
            TextView text3 = findViewById(R.id.text3);
            ImageView gambar1 = findViewById(R.id.gambars);

            text1.setText(nama_novels);
            text2.setText(penulis);
            text3.setText(keterangan_novels);
            gambar1.setImageResource(gambar_novels);
        }
    }
}