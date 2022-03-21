package com.example.klasemensepakbola;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.support.v7.util.*;
import java.util.ArrayList;

public class listAdapterKlub extends RecyclerView.Adapter<listAdapterKlub.listViewHolder> {
    private ArrayList<Klub> listKlub;

    private listAdapterKlub(ArrayList<Klub> list){
        this.listKlub = list;
    }
    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.klasemen, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int index) {
        Klub klub = listKlub.get(index);
        holder.vNama.setText(klub.getNamaKlub());
        holder.vPoin.setText(klub.getPoin());


    }

    @Override
    public int getItemCount() {
        return listKlub.size();
    }

    class listViewHolder extends RecyclerView.ViewHolder{
        TextView vNama, vPoin;

        listViewHolder(View itemView) {
            super(itemView);
            vNama = itemView.findViewById(R.id.namaKlub);
            vPoin = itemView.findViewById(R.id.poin);

        }
    }

}
