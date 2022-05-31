package com.example.tubes.komediNovel;

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
import com.example.tubes.hororNovel.GridNovelHororAdapter;
import com.example.tubes.hororNovel.ListNovelHororAdapter;
import com.example.tubes.komediNovel.DataKomedi;
import com.example.tubes.komediNovel.ListNovelKomediAdapter;
import com.example.tubes.komediNovel.KomediModels;

import java.util.ArrayList;

public class ListKomedi extends AppCompatActivity {
    RecyclerView recyclerView;
//    RecyclerView.Adapter recylclerViewAdapter;
//    RecyclerView.LayoutManager recyleViewLayaoutManager;
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
//        recyleViewLayaoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < DataKomedi.judul.length; i++) {
            models.add(
                    new KomediModels(
                            DataKomedi.judul[i],
                            DataKomedi.Penulis[i],
                            DataKomedi.keterangan[i],
                            DataKomedi.gambar[i]));
        }
        showList();

//        recylclerViewAdapter = new ListNovelKomediAdapter(models, this);
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
        GridNovelKomediAdapter gridNovelKomediAdapter= new GridNovelKomediAdapter(models,this);
        recyclerView.setAdapter(gridNovelKomediAdapter);
    }

    private void showList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListNovelKomediAdapter listNovelKomediAdapter= new ListNovelKomediAdapter(models,this);
        recyclerView.setAdapter(listNovelKomediAdapter);
    }
}
