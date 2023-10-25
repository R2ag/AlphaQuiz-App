package com.example.alphaquiz_app.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.alphaquiz_app.Models.AulaModel;
import com.example.alphaquiz_app.Models.PerguntaModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ActivityHabilidadeBinding;


import java.util.ArrayList;

public class HabilidadeActivity extends AppCompatActivity {

    ActivityHabilidadeBinding binding;
    ArrayList<AulaModel> listAulas;
    ArrayList<PerguntaModel> listPerguntas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHabilidadeBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_habilidade);

        //getSupportActionBar().hide();

        listAulas = new ArrayList<>();
        listPerguntas = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.aulaRecy.setLayoutManager(linearLayoutManager);

        listAulas.add(new AulaModel("Aula 1"));
        listAulas.add(new AulaModel("Aula 2"));

        binding.perguntasRecy.setLayoutManager(linearLayoutManager);
        listPerguntas.add(new PerguntaModel("Pergunta 1"));
        listPerguntas.add(new PerguntaModel("Pergunta 2"));
        listPerguntas.add(new PerguntaModel("Pergunta 3"));
        listPerguntas.add(new PerguntaModel("Pergunta 4"));
    }
}