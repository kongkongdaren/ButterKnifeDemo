package com.wen.asyl.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.wen.asyl.adapter.ButterKnifeAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ButterKnifeListActivity extends AppCompatActivity {
    @BindView(R.id.lv_list)
    public ListView mLvList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife_list);
        ButterKnife.bind(this);
        ButterKnifeAdapter adapter=new ButterKnifeAdapter(this);
        mLvList.setAdapter(adapter);
    }
}
