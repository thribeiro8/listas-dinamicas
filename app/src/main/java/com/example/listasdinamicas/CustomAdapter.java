package com.example.listasdinamicas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private final ArrayList<String> localDataSet;
    private final String[] colors;

    public CustomAdapter(ArrayList<String> localDataSet, String[] colors) {
        this.localDataSet = localDataSet;
        this.colors = colors;
    }

//    public void setLocalDataSet(ArrayList<String> localDataSet) {
//        this.localDataSet = localDataSet;
//    }

//    private String getColor(int position) {
//        return colors[position];
//    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.fillItem(localDataSet.get(position), colors[position]);
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

}
