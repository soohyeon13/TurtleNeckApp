package com.example.turtleneck.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.turtleneck.R;

import java.util.List;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private List<String> mList;

    public CardViewAdapter(List<String> mList)  {
        this.mList = mList;
    }

    @NonNull
    @Override
    public CardViewAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row,viewGroup,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder viewHolder, int i) {
        String text = mList.get(i);
        viewHolder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.textview);
        }
    }
}
