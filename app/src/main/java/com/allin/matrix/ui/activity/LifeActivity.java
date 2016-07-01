package com.allin.matrix.ui.activity;

import android.os.Bundle;

import com.allin.matrix.R;
import com.allin.matrix.core.ui.BaseActivity;
import com.allin.matrix.util.LogUtil;

/**
 * Created by Allin on 2016/6/30.
 */
public class LifeActivity extends BaseActivity {
    @Override
    protected void initVariables(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_life);
    }

    /**
     * 初始化事件
     *
     * @return 返回值标示是否注册Event
     */
    @Override
    protected boolean initEvent() {
        return true;
    }

    @Override
    public void onEvent(Object event) {
        super.onEvent(event);
        LogUtil.i(TAG, "onEvent");
    }

}
