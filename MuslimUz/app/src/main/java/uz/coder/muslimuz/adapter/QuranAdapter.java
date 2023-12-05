package uz.coder.muslimuz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.coder.muslimuz.databinding.ItemQuranLayoutBinding;
import uz.coder.muslimuz.model.QuranModel;

public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.VH> {
private List<QuranModel> quranModelList;
private OnItemClik onItemClik;

    public QuranAdapter(List<QuranModel> quranModelList, OnItemClik onItemClik) {
        this.quranModelList = quranModelList;
        this.onItemClik = onItemClik;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemQuranLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.binding.count.setText(String.valueOf(quranModelList.get(position).getId()));
        holder.binding.name.setText(quranModelList.get(position).getTransliteration());
        holder.binding.message.setText(quranModelList.get(position).getTranslation());
        holder.binding.arabTxt.setText(quranModelList.get(position).getName());
        holder.itemView.setOnClickListener(v -> onItemClik.onClik(quranModelList.get(position),position));
    }

    @Override
    public int getItemCount() {
        return quranModelList.size();
    }

    public static class VH extends RecyclerView.ViewHolder{
        ItemQuranLayoutBinding binding;
        public VH(@NonNull ItemQuranLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    public interface OnItemClik{
        void onClik(QuranModel quranModel,int position);
    }
}
