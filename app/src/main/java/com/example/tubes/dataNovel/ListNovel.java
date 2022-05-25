package com.example.tubes.dataNovel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tubes.R;

import java.util.ArrayList;

public class ListNovel extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<NovelModel> models;
    SearchView searchView;
    ListNovelAdapter AdapterecyleView;
    //RecyclerView.LayoutManager recylerViewLayoutManager;
    //ArrayList<KlmpkModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota_klmp);

        searchView = findViewById(R.id.menu);
        recyclerView = findViewById(R.id.rv_kelompok);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i <DataNovel.anggota.length; i++) {
            models.add(new NovelModel(
                    DataNovel.anggota[i],
                    DataNovel.Keterangan[i],
                    DataNovel.profile[i]));
        }

        recylclerViewAdapter = new ListNovelAdapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);

//            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//                @Override
//                public boolean onQueryTextSubmit(String query) {
//                    return false;
//                }
//
//                @Override
//                public boolean onQueryTextChange(String newText) {
//                    filter(newText);
//                    return true;
//                }
//            });

    }

//    private void filter(String newText){
//        List<KlmpkModel> filteredList = new ArrayList<>();
//        for (KlmpkModel item : models){
//            if(item.getName().toLowerCase().contains(newText.toLowerCase())){
//                filteredList.add(item);
//            }
//        }
//        AdapterecyleView.filterList((ArrayList<KlmpkModel>) filteredList);


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.search_menu, menu);
//        SearchView searchView = (SearchView) menu.findItem(R.id.menu).getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String nextText) {
//                nextText = nextText.toLowerCase();
//                ArrayList<KlmpkModel> itemFilter = new ArrayList<>();
//                for (KlmpkModel model : models) {
//                    String nama = model.getName().toLowerCase();
//                    if (nama.contains(nextText)) {
//                        itemFilter.add(model);
//                    }
//                }
//                AdapterecyleView.setFilter(itemFilter);
//                //AdapterecyleView.filterList(itemFilter);
//                return true;
//            }
//        });
//        //return true;
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.search_menu, menu);
//        final SearchView searchView = (SearchView) menu.findItem(R.id.menu).getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//
//                newText = newText.toLowerCase();
//                ArrayList<KlmpkModel> itemFilter = new ArrayList<>();
//                for (KlmpkModel model : models) {
//                    String nama = model.getDetail().toLowerCase();
//                    if (nama.contains(newText)) {
//                        itemFilter.add(model);
//                    }
//                }
//                AdapterecyleView.setFilter(itemFilter);
//                return true;
//            }
//        });
//
//        return super.onCreateOptionsMenu(menu);
//    }
}

