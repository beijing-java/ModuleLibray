package com.rechao.modulelibray;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.whz.loading.lib.LoadingLayout;


/**
 * Created by 王鹏程 on 2018/11/29.
 * 类(LoadingActivity)解释:
 * 演示Loadding的使用方式
 */

public class LoadingActivity extends AppCompatActivity{
    LoadingLayout loadingLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadding);
        loadingLayout=findViewById(R.id.act_loading_loadinglayout);
        loadingLayout.setStatus(LoadingLayout.Loading);
        loadingLayout.setOnReloadListener(new LoadingLayout.OnReloadListener() {
            @Override
            public void onReload(View v) {
                loadingLayout.setStatus(LoadingLayout.Success);
            }
        });
    }
    public void showToast(){
        Toast.makeText(this,"kjlkj",Toast.LENGTH_SHORT).show();
    }
}
