package com.example.tubes.hororNovel;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.R;

import java.util.ArrayList;

public class ListNovelHoror extends AppCompatActivity {
    RecyclerView recyclerView;
//    RecyclerView.Adapter recylclerViewAdapter;
//    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<NovelHororModel> models;
    SearchView searchView;
    ListNovelHororAdapter AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horor_novel);

        //searchView = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);
//        recyleViewLayaoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < DataNovels.anggota.length; i++) {
            models.add(
                    new NovelHororModel(
                    DataNovels.anggota[i],
                    DataNovels.Keterangan[i],
                    DataNovels.profile[i]));
        }
        showList();

//        recylclerViewAdapter = new ListNovelHororAdapter(models, this);
//        recyclerView.setAdapter(recylclerViewAdapter);

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
        GridNovelHororAdapter gridNovelHororAdapter= new GridNovelHororAdapter(models,this);
        recyclerView.setAdapter(gridNovelHororAdapter);
    }

    private void showList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListNovelHororAdapter listNovelHororAdapter= new ListNovelHororAdapter(models,this);
        recyclerView.setAdapter(listNovelHororAdapter);
    }

}
