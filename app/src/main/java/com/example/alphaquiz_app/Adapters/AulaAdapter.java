package com.example.alphaquiz_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alphaquiz_app.Models.AulaModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ItemSetsBinding;

import java.util.ArrayList;

public class AulaAdapter extends RecyclerView.Adapter<AulaAdapter.viewHolder> {

    Context context;
    ArrayList<AulaModel> list;

    public AulaAdapter(Context context, ArrayList<AulaModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_aula, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final AulaModel model = list.get(position);
        holder.binding.setName.setText(model.getAulaName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder{

        ItemSetsBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ItemSetsBinding.bind(itemView);
        }
    }

}
