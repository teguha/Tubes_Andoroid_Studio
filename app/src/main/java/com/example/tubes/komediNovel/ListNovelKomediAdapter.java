package com.example.tubes.komediNovel;

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
import com.example.tubes.hororNovel.ListNovelHororAdapter;
import com.example.tubes.komediNovel.ListNovelKomediAdapter;
import com.example.tubes.komediNovel.KomediModels;

import java.util.ArrayList;

public class ListNovelKomediAdapter extends RecyclerView.Adapter<ListNovelKomediAdapter.ViewHolder> {
    private ArrayList<KomediModels> dataKlmp;
    private Context context;

    ListNovelKomediAdapter(ArrayList<KomediModels>dataKlmp, Context context ){
        this.dataKlmp=dataKlmp;
        this.context = context;
        //this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override

    public ListNovelKomediAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_klp ,parent,false);
        ListNovelKomediAdapter.ViewHolder views = new ViewHolder(view);
        return views;
    }


    @Override
    public void onBindViewHolder(@NonNull ListNovelKomediAdapter.ViewHolder holder, int position) {
        TextView textHead = holder.textHead;
        TextView  textSubhead = holder.textSubhead;
        ImageView imageIcon =holder.gambar;

        textHead.setText(dataKlmp.get(position).getName());
        textSubhead.setText(dataKlmp.get(position).getDetail());
        imageIcon.setImageResource(dataKlmp.get(position).getImage());

        holder.gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName() , Toast.LENGTH_LONG).show();
                Toast.makeText(context,dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName() , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, MainActivity3.class);
                intent.putExtra("nama_novel",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getName());
                intent.putExtra("keterangan",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getDetail());
                intent.putExtra("gambar",dataKlmp.get(holder.getAbsoluteAdapterPosition()).getImage());

                context.startActivities(new Intent[]{intent});
            }
        });
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        ImageView gambar;

        public ViewHolder (@NonNull View item){
            super(item);
            textHead=item.findViewById(R.id.names);
            textSubhead=item.findViewById(R.id.keterangans);
            gambar=item.findViewById(R.id.profiles);

        }

    }


    @Override
    public int getItemCount() {
        return dataKlmp.size();
    }

    void setFilter(ArrayList<KomediModels> filterModel) {
        dataKlmp = new ArrayList<>();
        dataKlmp.addAll(filterModel);
        notifyDataSetChanged();
    }


}
