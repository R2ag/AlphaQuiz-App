package com.example.alphaquiz_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alphaquiz_app.Models.MetaModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ItemMetaBinding;

import java.util.ArrayList;

public class MetaAdapter extends RecyclerView.Adapter<MetaAdapter.viewHolder>{

    Context context;
    ArrayList<MetaModel> list;

    public MetaAdapter(Context context, ArrayList<MetaModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_meta, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final MetaModel model = list.get(position);

        holder.binding.metaName.setText(model.getMetaName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ItemMetaBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ItemMetaBinding.bind(itemView);
        }
    }
}
