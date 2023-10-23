package com.example.alphaquiz_app.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.alphaquiz_app.Models.SkillModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ActivityMetaBinding;

import java.util.ArrayList;

public class MetaActivity extends AppCompatActivity {

    ActivityMetaBinding binding;
    ArrayList<SkillModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMetaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // getSupportActionBar().hide();

        list = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.skillsRecy.setLayoutManager(linearLayoutManager);

        list.add(new SkillModel("Skill 1"));
        list.add(new SkillModel("Skill 2"));
        list.add(new SkillModel("Skill 3"));
        list.add(new SkillModel("Skill 4"));
        list.add(new SkillModel("Skill 5"));
        list.add(new SkillModel("Skill 6"));
        list.add(new SkillModel("Skill 7"));
        list.add(new SkillModel("Skill 8"));
    }
}