package com.example.alphaquiz_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alphaquiz_app.Models.SkillModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ItemSkillBinding;

import java.util.ArrayList;

public class SkillAdapter extends RecyclerView.Adapter<SkillAdapter.viewHolder> {

    Context context;
    ArrayList<SkillModel> list;

    public SkillAdapter(Context context, ArrayList<SkillModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_skill, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final SkillModel model = list.get(position);

        holder.binding.skillName.setText(model.getSkillName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ItemSkillBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemSkillBinding.bind(itemView);
        }
    }

}
