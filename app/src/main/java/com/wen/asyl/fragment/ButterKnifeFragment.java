package com.wen.asyl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wen.asyl.butterknifedemo.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Description：xx <br/>
 * Copyright (c) 2019{<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2019-01-04
 *
 * @author jwj
 * @version : 1.0
 */
public class ButterKnifeFragment extends Fragment {

    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item, null);
        bind = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //解除绑定
        bind.unbind();
    }
}
