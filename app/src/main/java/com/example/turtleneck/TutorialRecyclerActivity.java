package com.example.turtleneck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.turtleneck.Recycler.CustomAdapter;
import com.example.turtleneck.Recycler.TutorialList;

import java.util.ArrayList;

public class TutorialRecyclerActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private ArrayList<TutorialList> mList;
    private CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        mRecyclerView = findViewById(R.id.recycler);
        mLinearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mList = new ArrayList<>();

        mAdapter = new CustomAdapter(mList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
