package com.example.alphaquiz_app.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.alphaquiz_app.Models.HabilidadeModel;
import com.example.alphaquiz_app.databinding.ActivityMetaBinding;

import java.util.ArrayList;

public class MetaActivity extends AppCompatActivity {

    ActivityMetaBinding binding;
    ArrayList<HabilidadeModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMetaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // getSupportActionBar().hide();

        list = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.habilidadesRecy.setLayoutManager(linearLayoutManager);

        list.add(new HabilidadeModel("Habilidade 1"));
        list.add(new HabilidadeModel("Habilidade 2"));
        list.add(new HabilidadeModel("Habilidade 3"));
        list.add(new HabilidadeModel("Habilidade 4"));
        list.add(new HabilidadeModel("Habilidade 5"));
        list.add(new HabilidadeModel("Habilidade 6"));
        list.add(new HabilidadeModel("Habilidade 7"));
        list.add(new HabilidadeModel("Habilidade 8"));
    }
}