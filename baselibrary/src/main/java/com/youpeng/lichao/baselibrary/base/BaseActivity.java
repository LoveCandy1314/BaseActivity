package com.youpeng.lichao.baselibrary.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 作者：Created by lichao on 2017/11/2 09:48
 * 邮箱：lichao@voole.com
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置布局layout
        setContentView();

        // 初始化头部
        initTitle();

        // 初始化界面
        initView();

        // 初始化数据
        initData();
    }

    /**
     * 设置布局文件
     */
    protected abstract void setContentView();

    /**
     * 初始化头部
     */
    protected abstract void initTitle();

    /**
     * 初始化view
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 跳转activity
     * @param clazz
     */
    protected void startActivity(Class<?> clazz){
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
    }

    /**
     * findViewByID
     * @param id
     * @param <T>
     * @return
     */
    protected  <T extends View> T ViewById(int id){
        return (T) findViewById(id);
    }
}
