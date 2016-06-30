package com.allin.matrix.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.allin.matrix.common.event.Event;
import com.allin.matrix.common.event.EventManager;
import com.allin.matrix.util.LogUtil;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by Allin on 2016/4/29.
 */
 public abstract class BaseActivity extends FragmentActivity {

    protected final String TAG = getTAG();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.i(TAG, "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.i(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.i(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.i(TAG, "onDestroy");
        unregisterEvent();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        LogUtil.i(TAG, "onLowMemory");
    }

    protected abstract void initView();

    /**
     *
     * @return 返回值表示是否注册Event
     */
    protected abstract void initEvent();

    protected void registerEvent(){
        EventManager.register(this);
    }

    protected void unregisterEvent(){
        EventManager.unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(Object event){

    }

    private String getTAG(){
        Class clazz = this.getClass();
        return clazz.getSimpleName();
    }

}
