package com.wen.asyl.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wen.asyl.butterknifedemo.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Description：xx <br/>
 * Copyright (c) 2019{<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2019-01-04
 *
 * @author jwj
 * @version : 1.0
 */
public class ButterKnifeAdapter extends BaseAdapter {
    private Context context;
    private List<String>  mDatas=new ArrayList<>();

    public ButterKnifeAdapter(Context context) {
        this.context = context;
        for (int i=0;i<31;i++){
            mDatas.add("我是ButterKnife"+i);
        }
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh=null;
        if (convertView==null){
            convertView=  View.inflate(context,R.layout.activity_item,null);
            vh=new ViewHolder(convertView);
            convertView.setTag(vh);
        }else{
          vh= (ViewHolder) convertView.getTag();
        }
        vh.mIvPhoto.setImageResource(R.drawable.tupain);
        vh.mTvResult.setText(mDatas.get(position));
        return convertView;
    }

    class ViewHolder{
        @BindView(R.id.iv_photo)
         ImageView mIvPhoto;
        @BindView(R.id.tv_result)
         TextView mTvResult;
        public ViewHolder(View view) {
            ButterKnife.bind(this,view);
        }
    }
}
