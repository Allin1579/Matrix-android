package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.allin.matrix.R;
import com.allin.matrix.base.BaseActivity;
import com.allin.matrix.common.event.Event;
import com.allin.matrix.engine.EventEngine;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class EventActivity extends BaseActivity {
    private EventEngine mEventEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mEventEngine = new EventEngine();

        initView();
        initEvent();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEvent() {
        registerEvent();
    }

    public void postEvent(View view){
        mEventEngine.post();
    }

    @Override
    public void onEvent(Object event){
        Toast.makeText(this, event.toString(), Toast.LENGTH_SHORT).show();
    }

}
