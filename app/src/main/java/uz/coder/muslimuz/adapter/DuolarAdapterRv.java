package uz.coder.muslimuz.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.coder.muslimuz.databinding.ItemDuolarBinding;
import uz.coder.muslimuz.model.DuolarModel;

public class DuolarAdapterRv extends RecyclerView.Adapter<DuolarAdapterRv.MyViewHolder> {
    private List<DuolarModel> duolarModelList;

    public DuolarAdapterRv(List<DuolarModel> duolarModelList) {
        this.duolarModelList = duolarModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDuolarBinding binding = ItemDuolarBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(binding);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.binding.uzbTxt.setText(duolarModelList.get(position).getName());
    holder.binding.messegeTxt.setText(duolarModelList.get(position).getMessege());
    holder.binding.arabTxt.setText(duolarModelList.get(position).getArabName());
    }

    @Override
    public int getItemCount() {
        return duolarModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
      ItemDuolarBinding binding;
        public MyViewHolder(@NonNull ItemDuolarBinding binding) {
            super(binding.getRoot());
            this.binding= binding;
        }
    }
}
