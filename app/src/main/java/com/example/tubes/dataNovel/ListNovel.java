package com.example.tubes.dataNovel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tubes.R;
import com.example.tubes.hororNovel.DataNovels;

import java.util.ArrayList;

public class ListNovel extends AppCompatActivity {

    RecyclerView recyclerView;
//    RecyclerView.Adapter recylclerViewAdapter;
//    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<NovelModel> models;
    SearchView searchView;
    ListNovelAdapter AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasy_novel);
        searchView = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.rv_kelompok);
        recyclerView.setHasFixedSize(true);
//        recyleViewLayaoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < DataNovel.nama.length; i++) {
            models.add(
                    new NovelModel(
                            DataNovel.nama[i],
                            DataNovels.Penulis[i],
                            DataNovels.Keterangan[i],
                            DataNovels.profile[i]));
        }

        showList();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.menuList){
            showList();
        }else{
            showGrid();
        }
        return  super.onOptionsItemSelected(item);

    }
    private void showGrid(){
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        GridNovelAdapter gridNovelAdapter= new GridNovelAdapter(models,this);
        recyclerView.setAdapter(gridNovelAdapter);
    }

    private void showList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListNovelAdapter listNovelAdapter= new ListNovelAdapter(models,this);
        recyclerView.setAdapter(listNovelAdapter);
    }

}