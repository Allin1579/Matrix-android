package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.allin.matrix.R;
import com.allin.matrix.core.ui.BaseActivity;
import com.allin.matrix.engine.EventEngine;
import com.allin.matrix.util.LogUtil;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class EventActivity extends BaseActivity {
    private EventEngine mEventEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initVariables(Bundle savedInstanceState) {
        mEventEngine = new EventEngine();
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        LogUtil.i(TAG, "initView");
        setContentView(R.layout.activity_event);
    }

    @Override
    protected boolean initEvent() {
        LogUtil.i(TAG, "initEvent");
        return true;
    }

    public void postEvent(View view){
        mEventEngine.post();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMsgEvent(String msg){
        LogUtil.i(TAG, msg);
    }

}
