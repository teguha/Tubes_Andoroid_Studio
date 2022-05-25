package com.example.tubes.komediNovel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;
import com.example.tubes.komediNovel.DataKomedi;
import com.example.tubes.komediNovel.ListNovelKomediAdapter;
import com.example.tubes.komediNovel.KomediModels;

import java.util.ArrayList;

public class ListKomedi extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<KomediModels> models;
    SearchView searchView;
    ListNovelKomediAdapter AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komedi_novel);

        //searchView = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < DataKomedi.judul.length; i++) {
            models.add(
                    new KomediModels(
                            DataKomedi.judul[i],
                            DataKomedi.keterangan[i],
                            DataKomedi.gambar[i]));
        }

        recylclerViewAdapter = new ListNovelKomediAdapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);

    }
}
