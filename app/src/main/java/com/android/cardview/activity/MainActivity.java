package com.android.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.cardview.R;
import com.android.cardview.adapter.PostagemAdapter;
import com.android.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        // Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // Definir adapter
        this.configurarPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerView.setAdapter(adapter);
    }
    // Configurar as postagens
    public void configurarPostagens(){
        Postagem postagem = new Postagem("Postagens", "#tbt viagem", R.drawable.imagem1);
        postagens.add(postagem);
        postagem = new Postagem("Hotel JM", "Viaje, aproveite nossos descontos", R.drawable.imagem2);
        postagens.add(postagem);
        postagem = new Postagem("Paris", "Torre Eifel", R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Montanha", "Aventura radical", R.drawable.imagem4);
        postagens.add(postagem);
    }
}