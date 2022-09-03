package com.example.listasdinamicas;

import android.graphics.Color;
//import android.view.LayoutInflater;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private final ConstraintLayout container;
    private final TextView tvText;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        container = itemView.findViewById(R.id.clBackgound);
        tvText = itemView.findViewById(R.id.tvItem);
    }

    public void fillItem(String text, String color) {
        container.setBackgroundColor(Color.parseColor(color));
        tvText.setText(text);
    }

//   private static ItemViewHolder createHolder(ViewGroup parent) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_layout, parent, false);
//        return new ItemViewHolder(view);
//    }

}
