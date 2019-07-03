package com.example.turtleneck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.turtleneck.Recycler.CardViewAdapter;
import com.example.turtleneck.Recycler.TutorialList;

public class TutorialRecyclerActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private CardViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setRecyclerView();
    }

    private void setRecyclerView() {
        mRecyclerView = findViewById(R.id.recycler);
        mLinearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mAdapter = new CardViewAdapter(TutorialList.tutorialList());
        mRecyclerView.setAdapter(mAdapter);
    }
}
