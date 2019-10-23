package com.example.cardview2;



import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView name;
    public TextView description;

    //Responsavel por ligar os componentes do XML no JAVA
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.planetName);
        description = itemView.findViewById(R.id.planetDescription);
        image = itemView.findViewById(R.id.planetImage);
    }
}
