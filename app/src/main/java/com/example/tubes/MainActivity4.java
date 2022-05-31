package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getdata();
    }
    private void getdata(){
        if(getIntent().hasExtra("gambar") && getIntent().hasExtra("keterangan") && getIntent().hasExtra("nama_novel")){
            int gambar_novels = getIntent().getIntExtra("gambar",0);
            String nama_novels = getIntent().getStringExtra("nama_novel");
            String keterangan_novels = getIntent().getStringExtra("keterangan");

            TextView text1 = findViewById(R.id.text1);
            TextView text2 = findViewById(R.id.text2);
            ImageView gambar1 = findViewById(R.id.gambars);

            text1.setText(nama_novels);
            text2.setText(keterangan_novels);
            gambar1.setImageResource(gambar_novels);
        }
    }
}