package com.example.reciclerviewgames;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context Mcontexto;
    private List<Games> LstGames;

    public MyAdapter(Context Mcontexto, List<Games> lstGames) {
        this.Mcontexto = Mcontexto;
        this.LstGames = lstGames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



    View view;

    LayoutInflater inflater = LayoutInflater.from(Mcontexto);
    view=inflater.inflate(R.layout.modelogames,parent,false);

        return new ViewHolder(view);


}
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTitulo.setText(LstGames.get(position).getTitulo());
        holder.idImgGames.setImageResource(LstGames.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return LstGames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo;
        ImageView idImgGames;
        CardView idCardGames;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.idTituloGame);
            idImgGames = itemView.findViewById(R.id.idImgGames);
            idCardGames = itemView.findViewById(R.id.idCardGames);
        }
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Mcontexto, ApresentaGamesActivity, Class);
        Intent.putExtra
    }

 }

