package com.example.socialmediaquit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.MyViewHolder> {
    int list[];
    String list1[];

    public SliderAdapter(int[] list, String[] list1) {
        this.list = list;
        this.list1=list1;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.view.setBackgroundColor(list[position]);
        holder.text.setText(list1[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView text;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView.findViewById(R.id.view);
            text =(TextView) itemView.findViewById(R.id.text);
        }
    }
}
