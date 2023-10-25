package com.example.alphaquiz_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alphaquiz_app.Models.HabilidadeModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ItemHabilidadeBinding;

import java.util.ArrayList;

public class HabilidadeAdapter extends RecyclerView.Adapter<HabilidadeAdapter.viewHolder> {

    Context context;
    ArrayList<HabilidadeModel> list;

    public HabilidadeAdapter(Context context, ArrayList<HabilidadeModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_habilidade, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final HabilidadeModel model = list.get(position);

        holder.binding.habilidadeName.setText(model.getHabilidadeName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ItemHabilidadeBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemHabilidadeBinding.bind(itemView);
        }
    }

}
