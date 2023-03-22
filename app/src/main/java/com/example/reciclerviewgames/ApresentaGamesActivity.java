package com.example.reciclerviewgames;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ApresentaGamesActivity extends AppCompatActivity {

    TextView mTitulo, mDescricao, mJogadores, mPreco, mNota;

    ImageView mImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_games_layout);

        mTitulo = findViewById(R.id.idTituloView);
        mDescricao = findViewById(R.id.idDescricao);
        mJogadores = findViewById(R.id.idJogadores);
        mPreco = findViewById(R.id.idPreco);
        mNota = findViewById(R.id.idNota);

        Intent intent = getIntent();

        String titulo, descricao, jogadores, preco, nota;
        int imagemGame;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descrição");
        jogadores = intent.getExtras().getString("Jogadores");
        preco = intent.getExtras().getString("Preço");
        nota = intent.getExtras().getString("Nota");
        imagemGame = intent.getExtras().getInt("ImagemGame");


        mTitulo.setText(titulo);
        mDescricao.setText(descricao);
        mJogadores.setText(jogadores);
        mPreco.setText(preco);
        mNota.setText(nota);
        mImage.setImageResource(imagemGame);

    }
}