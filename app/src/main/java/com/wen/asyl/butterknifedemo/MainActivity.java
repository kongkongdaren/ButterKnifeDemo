package com.wen.asyl.butterknifedemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wen.asyl.fragment.ButterKnifeFragment;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_result)
    public TextView mTvResult;
    @BindView(R.id.iv_photo)
    public ImageView mIvPhoto;
    @BindString(R.string.app_name)
    public String appName;
    @BindColor(R.color.colorAccent)
    int color;
    @BindDrawable(R.drawable.tupain)
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btn_butterKnife_view)
    public void gainTextView(View view){
        mTvResult.setText("我是ButterKnife");
    }
    @OnClick(R.id.btn_butterKnife_string)
    public void gainString(View view){
        mTvResult.setText(appName);
    }
    @OnClick(R.id.btn_butterKnife_color)
    public void gainColor(View view){
        mTvResult.setText("我是ButterKnife的颜色");
        mTvResult.setTextColor(color);
    }
    @OnClick(R.id.btn_butterKnife_drawable)
    public void gainPhoto(View view){
        mIvPhoto.setImageDrawable(drawable);
    }
    @OnClick(R.id.btn_butterKnife_fragment)
    public void intentFragment(View view){
       getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_content,new ButterKnifeFragment())
                .addToBackStack(null)
                .commit();
    }
    @OnClick(R.id.btn_butterKnife_listView)
    public void intentListView(View view){
       startActivity(new Intent(MainActivity.this,ButterKnifeListActivity.class));
    }
}
