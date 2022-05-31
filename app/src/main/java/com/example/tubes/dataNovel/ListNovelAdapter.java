package com.example.tubes.dataNovel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes.Inspiratif.InspiratifModels;
import com.example.tubes.MainActivity3;
import com.example.tubes.R;

import java.util.ArrayList;
import java.util.List;

public class ListNovelAdapter extends RecyclerView.Adapter<ListNovelAdapter.ViewHolder> {
    private ArrayList<NovelModel> dataKlmp;
    private List<NovelModel> mServant;

    private Context context;

    public ListNovelAdapter(ArrayList<NovelModel>dataKlmp, Context context ){
        this.dataKlmp=dataKlmp;
        this.context = context;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_klp,parent,false);
        ViewHolder views = new ViewHolder(view);
        return views;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView textHead = holder.textHead;
        TextView penulis = holder.Penulis;
        TextView  textSubhead = holder.textSubhead;
        ImageView imageIcon =holder.gambar;

        textHead.setText(dataKlmp.get(position).getName());
        penulis.setText(dataKlmp.get(position).getPenulis());
        textSubhead.setText(dataKlmp.get(position).getDetail());
        imageIcon.setImageResource(dataKlmp.get(position).getImage());

        holder.gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName() , Toast.LENGTH_LONG).show();
                Toast.makeText(context,dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName() , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, MainActivity3.class);
                intent.putExtra("nama_novel",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName());
                intent.putExtra("penulis",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getPenulis());
                intent.putExtra("keterangan",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getDetail());
                intent.putExtra("gambar",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getImage());

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView Penulis;
        TextView textSubhead;
        ImageView gambar;

        public ViewHolder (@NonNull View item){
            super(item);
            textHead=item.findViewById(R.id.names);
            Penulis=item.findViewById(R.id.penulis);
            textSubhead=item.findViewById(R.id.keterangans);
            gambar=item.findViewById(R.id.profiles);
        }

    }

    @Override
    public int getItemCount() {
        return dataKlmp.size();
    }

    void setFilter(ArrayList<NovelModel> datag) {
        dataKlmp = new ArrayList<>();
        dataKlmp.addAll(datag);
        notifyDataSetChanged();
    }
}
