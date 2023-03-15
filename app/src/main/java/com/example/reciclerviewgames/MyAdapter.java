package com.example.reciclerviewgames;

import android.content.Context;
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

    private Context Mcontext;
    private List<Games> ListGames;

    public MyAdapter(Context mcontext, List<Games> listGames) {
        Mcontext = mcontext;
        ListGames = listGames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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

}
