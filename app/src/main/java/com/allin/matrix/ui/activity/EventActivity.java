package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.allin.matrix.R;
import com.allin.matrix.support.event.Event;
import com.allin.matrix.base.ui.BaseActivity;
import com.allin.matrix.engine.EventEngine;
import com.allin.matrix.util.LogUtil;

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

    @Override
    public void onEvent(Event event) {
        super.onEvent(event);
    }
}
