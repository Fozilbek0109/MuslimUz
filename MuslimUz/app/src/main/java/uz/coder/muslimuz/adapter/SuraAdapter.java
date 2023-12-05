package uz.coder.muslimuz.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.coder.muslimuz.databinding.ItemSuraBinding;
import uz.coder.muslimuz.model.VersesItem;

public class SuraAdapter extends RecyclerView.Adapter<SuraAdapter.VH>{

    private List<VersesItem> versesItemList;

    public SuraAdapter(List<VersesItem> versesItemList) {
        this.versesItemList = versesItemList;
    }



    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemSuraBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.binding.arabTxt.setText(versesItemList.get(position).getText());
        holder.binding.id.setText(String.valueOf(versesItemList.get(position).getId()));
        holder.binding.translatsia.setText(versesItemList.get(position).getTranslation());
    }

    @Override
    public int getItemCount() {
        return versesItemList.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        ItemSuraBinding binding;
        public VH(@NonNull ItemSuraBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
