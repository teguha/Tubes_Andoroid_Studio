package com.example.tubes.RomanticNovel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;

import java.util.ArrayList;

public class ListNovelR extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<NovelModel>models;
    SearchView searchView;
    ListNovelR AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic_novel);

        searchView = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        models = new ArrayList<>();
        for (int i=0; i < DataNovels.anggota.length; i++){
            models.add(new NovelModel(
                    DataNovels.anggota[i],
                    DataNovels.Keterangan[i],
                    DataNovels.profile[i]));
        }

        recylclerViewAdapter = new ListNovelAdapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);
    }
}
