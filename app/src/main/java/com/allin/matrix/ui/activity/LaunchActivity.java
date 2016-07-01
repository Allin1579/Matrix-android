package com.allin.matrix.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.allin.matrix.R;
import com.allin.matrix.core.ui.BaseActivity;
import com.allin.matrix.core.cache.ImageLoader;
import com.allin.matrix.engine.LaunchEngine;

/**
 * Created by Allin on 2016/6/20.
 */
public class LaunchActivity extends BaseActivity {
    private ImageView iv_launch;
    private LaunchEngine mLaunchEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    @Override
    protected void initVariables() {
        mLaunchEngine = LaunchEngine.createInstance();
    }

    @Override
    protected void initView(){
        iv_launch = (ImageView) findViewById(R.id.iv_launch);
        String url = mLaunchEngine.getLaunchImg();
        ImageLoader.load(this, url, iv_launch);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.launch);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        iv_launch.startAnimation(animation);
    }

    @Override
    protected boolean initEvent(){
        return false;
    }

}
