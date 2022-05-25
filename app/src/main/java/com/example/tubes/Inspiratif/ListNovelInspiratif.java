package com.example.tubes.Inspiratif;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;
import com.example.tubes.Inspiratif.DataNovels;
import com.example.tubes.Inspiratif.ListNovelInspiratifAdapter;
import com.example.tubes.Inspiratif.InspiratifModels;

import java.util.ArrayList;

public class ListNovelInspiratif extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<InspiratifModels> models;
    SearchView searchView;
    ListNovelInspiratifAdapter AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiratif_novel);

        searchView = findViewById(R.id.searchview);
        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < com.example.tubes.Inspiratif.DataNovels.anggota.length; i++) {
            models.add(
                    new InspiratifModels(
                            com.example.tubes.Inspiratif.DataNovels.anggota[i],
                            com.example.tubes.Inspiratif.DataNovels.Keterangan[i],
                            DataNovels.profile[i]));
        }

        recylclerViewAdapter = new ListNovelInspiratifAdapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);



    }
}
