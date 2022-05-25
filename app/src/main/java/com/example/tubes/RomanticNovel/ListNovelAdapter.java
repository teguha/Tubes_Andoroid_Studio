package com.example.tubes.RomanticNovel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.MainActivity3;
import com.example.tubes.R;

import java.util.ArrayList;

public class ListNovelAdapter extends RecyclerView.Adapter<ListNovelAdapter.ViewHolder> {
    private ArrayList<NovelModel>dataNovel;
    private Context contextNovel;

    ListNovelAdapter(ArrayList<NovelModel>dataNovel, Context contextNovel){
        this.dataNovel= dataNovel;
        this.contextNovel=contextNovel;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_klp,parent,false);
        ListNovelAdapter.ViewHolder tampilan = new ListNovelAdapter.ViewHolder(view);
        return tampilan;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textHead;
        ImageView gambar;
        TextView subHead;

        public ViewHolder(View item) {
            super(item);
            textHead = item.findViewById(R.id.names);
            subHead = item.findViewById(R.id.keterangans);
            gambar = item.findViewById(R.id.profiles);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ListNovelAdapter.ViewHolder holder, int position) {
        TextView textHead = holder.textHead;
        TextView textSubHead= holder.subHead;
        ImageView gambar =holder.gambar;

        textHead.setText(dataNovel.get(position).getNama_novel());
        textSubHead.setText(dataNovel.get(position).getKeterangan());
        gambar.setImageResource(dataNovel.get(position).getGambar_novel());

        holder.gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName() , Toast.LENGTH_LONG).show();
                Toast.makeText(contextNovel,dataNovel.get(holder.getAbsoluteAdapterPosition()).getNama_novel() , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(contextNovel, MainActivity3.class);
                intent.putExtra("nama_novel",dataNovel.get(holder.getAbsoluteAdapterPosition()).getNama_novel());
                intent.putExtra("keterangan",dataNovel.get(holder.getAbsoluteAdapterPosition()).getKeterangan());
                intent.putExtra("gambar",dataNovel.get(holder.getAbsoluteAdapterPosition()).getGambar_novel());

                contextNovel.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataNovel.size();
    }


}
