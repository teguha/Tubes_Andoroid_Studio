package com.example.tubes.Sejarah;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;
import com.example.tubes.Sejarah.DataNovels;
import com.example.tubes.Sejarah.ListNovelSejarahAdapter;
import com.example.tubes.Sejarah.NovelModels;

import java.util.ArrayList;

public class ListNovels  extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<NovelModels> models;
    SearchView searchView;
    com.example.tubes.Sejarah.ListNovels AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_novel);

        searchView = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        models = new ArrayList<>();
        for (int i = 0; i < com.example.tubes.RomanticNovel.DataNovels.anggota.length; i++){
            models.add(new NovelModels(
                    com.example.tubes.RomanticNovel.DataNovels.anggota[i],
                    com.example.tubes.RomanticNovel.DataNovels.Keterangan[i],
                    DataNovels.profile[i]));
        }

        recylclerViewAdapter = new ListNovelSejarahAdapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);
    }
}
