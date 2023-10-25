package com.example.alphaquiz_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alphaquiz_app.Models.PerguntaModel;
import com.example.alphaquiz_app.R;
import com.example.alphaquiz_app.databinding.ItemPerguntaBinding;

import java.util.ArrayList;

public class PerguntaAdapter extends RecyclerView.Adapter<PerguntaAdapter.viewHolder>{

    Context context;

    ArrayList<PerguntaModel> list;

    public PerguntaAdapter(Context context, ArrayList<PerguntaModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pergunta, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final PerguntaModel model = list.get(position);
        holder.binding.perguntaName.setText(model.getPerguntaName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ItemPerguntaBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ItemPerguntaBinding.bind(itemView);
        }
    }
}
