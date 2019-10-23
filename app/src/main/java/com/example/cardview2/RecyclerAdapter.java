package com.example.cardview2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<Clubs> list;

    public RecyclerAdapter(List<Clubs> list) {
        this.list = list;
    }


    //Vai carregar o layout_cardview (inflar na memoria)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cardview,parent,false);

        return new ViewHolder(view);
    }


    //Colocar cada elemento na lista do Recyclerview, carregando as informações.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Clubs club = list.get(position);

        holder.name.setText(club.getClub_name());
        holder.description.setText(club.getClub_description());
        holder.image.setImageResource(club.getClube_image());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
