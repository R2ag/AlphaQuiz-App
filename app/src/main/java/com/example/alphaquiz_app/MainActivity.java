package com.example.alphaquiz_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.alphaquiz_app.Adapters.MetaAdapter;
import com.example.alphaquiz_app.Models.MetaModel;
import com.example.alphaquiz_app.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<MetaModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       // getSupportActionBar().hide();

        list = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.metasRecy.setLayoutManager(linearLayoutManager);

        list.add(new MetaModel("Meta - 1"));
        list.add(new MetaModel("Meta - 2"));
        list.add(new MetaModel("Meta - 3"));
        list.add(new MetaModel("Meta - 4"));

        MetaAdapter adapter = new MetaAdapter(this, list);
        binding.metasRecy.setAdapter(adapter);

    }
}