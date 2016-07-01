package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.allin.matrix.R;
import com.allin.matrix.core.ui.BaseActivity;
import com.allin.matrix.engine.RetrofitEngine;

public class RerofitActivity extends BaseActivity {
    private TextView tv;

    private RetrofitEngine mRetrofitEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initVariables(Bundle savedInstanceState) {
        mRetrofitEngine = new RetrofitEngine();
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_rerofit);
        tv = (TextView) findViewById(R.id.text);
    }

    @Override
    protected boolean initEvent() {
        return false;
    }

    public void get(View view){
        mRetrofitEngine.getRepos();
    }

    public void post(View view){

    }

}
