package com.example.alphaquiz_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.alphaquiz_app.Adapters.SetAdapter;
import com.example.alphaquiz_app.Models.SetModel;
import com.example.alphaquiz_app.databinding.ActivityMainBinding;
import com.example.alphaquiz_app.databinding.ItemSetsBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<SetModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       // getSupportActionBar().hide();

        list = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.setsRecy.setLayoutManager(linearLayoutManager);

        list.add(new SetModel("Meta - 1"));
        list.add(new SetModel("Meta - 2"));
        list.add(new SetModel("Meta - 3"));
        list.add(new SetModel("Meta - 4"));

        SetAdapter adapter = new SetAdapter(this, list);
        binding.setsRecy.setAdapter(adapter);

    }
}