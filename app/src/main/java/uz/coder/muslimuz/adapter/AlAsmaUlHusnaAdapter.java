package uz.coder.muslimuz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.coder.muslimuz.databinding.ItemAlBinding;
import uz.coder.muslimuz.model.AlAsmaAlHusnaModel;

public class AlAsmaUlHusnaAdapter extends  RecyclerView.Adapter<AlAsmaUlHusnaAdapter.VH>{
    private List<AlAsmaAlHusnaModel> alAsmaAlHusnaModelList;

    public AlAsmaUlHusnaAdapter(List<AlAsmaAlHusnaModel> alAsmaAlHusnaModelList) {
        this.alAsmaAlHusnaModelList = alAsmaAlHusnaModelList;
    }


    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemAlBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        int count = alAsmaAlHusnaModelList.get(position).getCount();
        holder.binding.count.setText(String.valueOf(count));
        holder.binding.name.setText(alAsmaAlHusnaModelList.get(position).getName());
        holder.binding.messegeTxt.setText(alAsmaAlHusnaModelList.get(position).getMessege());
    }

    @Override
    public int getItemCount() {
        return alAsmaAlHusnaModelList.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        private ItemAlBinding binding;
        public VH(@NonNull ItemAlBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
