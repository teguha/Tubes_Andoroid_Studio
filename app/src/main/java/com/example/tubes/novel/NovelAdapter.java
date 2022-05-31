package com.example.tubes.novel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tubes.MainActivity3;
import com.example.tubes.R;

import java.util.ArrayList;

//langka2 membuat kelas recyleview adapter untuk dapat menampilkan semua data dalam bentuk list
public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.ViewHolder>{

    //langkah 3 membuat array list dan recyleview adapter
    private ArrayList<String> foto_novel = new ArrayList<>();
    private ArrayList<String> nama=  new ArrayList<>();
    private ArrayList<String> keterangan = new ArrayList<>();
    private Context context;
    private int position;

    public NovelAdapter(ArrayList<String> gambar_novel, ArrayList<String> foto_novel, ArrayList<String> nama, Context context){
        this.foto_novel= foto_novel;
        this.nama = nama;
        this.context=context;
        this.keterangan= keterangan;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_novel,parent,false);
        //layout inflater digunakan untuk memindahkan item_row_novel_ke akktivity yang di inginkan
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position) {
         //this.position = position;
        //proses memasukan data untuk setiap item dengan menggunakan postion
        Glide.with(context).asBitmap().load(foto_novel.get(position)).into(holder.gambar_novel);
        holder.nama.setText(nama.get(position));
        holder.keterangan.setText((keterangan.get(position)));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity3.class);
                intent.putExtra("nama",nama.get(holder.getOldPosition()));
                intent.putExtra("keterangan",keterangan.get(holder.getOldPosition()));
                intent.putExtra("gambar",foto_novel.get(holder.getOldPosition()));

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.size(); //untuk mereturnn urutan list
    }

    //    membuat kelas view holder yang digunakan untuk menampilkan data dengan mengambil id masing masing dng menggunakan
//    kelas viewhoder yang mewarisi dari recyleview langkah 1
    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gambar_novel;
        TextView nama , keterangan;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar_novel = itemView.findViewById(R.id.gambars);
            nama = itemView.findViewById(R.id.name);
            keterangan = itemView.findViewById(R.id.keterangan);
        }
    }
}
