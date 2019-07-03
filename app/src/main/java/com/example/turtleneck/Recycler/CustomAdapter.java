package com.example.turtleneck.Recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.turtleneck.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private ArrayList<TutorialList> mList;

    public CustomAdapter(ArrayList<TutorialList> mList)  {
        this.mList = mList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row,viewGroup,false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewHolder, int i) {
        viewHolder.textView.setText(mList.get(i).getId());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview);
        }
    }
}
