package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.allin.matrix.R;
import com.allin.matrix.core.ui.BaseActivity;
import com.allin.matrix.engine.EventEngine;
import com.allin.matrix.util.LogUtil;

public class EventActivity extends BaseActivity {
    private EventEngine mEventEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    @Override
    protected void initVariables() {
        mEventEngine = new EventEngine();
    }

    @Override
    protected void initView() {
        LogUtil.i(TAG, "initView");
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
    public void onEvent(Object event){
        Toast.makeText(this, event.toString(), Toast.LENGTH_SHORT).show();
    }

}
