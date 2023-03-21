package com.example.reciclerviewgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Games> lstGames;

    RecyclerView idRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecycleView = findViewById(R.id.idListaGames);


        lstGames = new ArrayList<>();

        lstGames.add(
                new Games("God of War", "Simulador de Pai e Filho", "R$80,00", R.drawable.godofwar)
        );
        MyAdapter adapter = new MyAdapter(getApplicationContext(), lstGames);
        idRecycleView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecycleView.setHasFixedSize(true);
    }

}