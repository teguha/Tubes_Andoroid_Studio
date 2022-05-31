package com.example.tubes.Inspiratif;

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

import com.example.tubes.MainActivity3;
import com.example.tubes.R;
import com.example.tubes.Inspiratif.ListNovelInspiratifAdapter;
import com.example.tubes.Inspiratif.InspiratifModels;
import com.example.tubes.hororNovel.ListNovelHororAdapter;

import java.util.ArrayList;
import java.util.Locale;

public class ListNovelInspiratifAdapter  extends RecyclerView.Adapter<ListNovelInspiratifAdapter.ViewHolder> implements Filterable {
    private ArrayList<InspiratifModels> dataKlmp;
    private ArrayList<InspiratifModels> getUserModelListFiltered;
    private Context context;


    public ListNovelInspiratifAdapter(ArrayList<InspiratifModels>dataKlmp, Context context ){
        this.dataKlmp=dataKlmp;
        this.context = context;
        this.getUserModelListFiltered = dataKlmp;
        //this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override

    public ListNovelInspiratifAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_klp ,parent,false);
        ViewHolder views = new ViewHolder(view);
        return views;
    }

    @Override
    public void onBindViewHolder(@NonNull ListNovelInspiratifAdapter.ViewHolder holder, int position){
        TextView textHead = holder.textHead;
        TextView  textSubhead = holder.textSubhead;
        ImageView imageIcon =holder.gambar;

        textHead.setText(dataKlmp.get(position).getName());
        textSubhead.setText(dataKlmp.get(position).getDetail());
        imageIcon.setImageResource(dataKlmp.get(position).getImage());

        holder.gambar.setOnClickListener(new View.OnClickListener(){
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

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                FilterResults filterResults = new FilterResults();

                if(charSequence == null | charSequence.length() == 0){
                    filterResults.count = getUserModelListFiltered.size();
                    filterResults.values = getUserModelListFiltered;


                }else{
                    String searchChr = charSequence.toString().toLowerCase();
                    ArrayList<InspiratifModels> resultData = new ArrayList<>();

                    for(InspiratifModels inspiratifModels: getUserModelListFiltered){
                        if(inspiratifModels.getName().toLowerCase().contains(searchChr)){
                            resultData.add(inspiratifModels);
                        }
                    }
                    filterResults.count = resultData.size();
                    filterResults.values = resultData;
                }
                return null;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

            }
        };
        return filter;
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



}
