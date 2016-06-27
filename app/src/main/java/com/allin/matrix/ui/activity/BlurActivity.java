package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.allin.matrix.R;
import com.allin.matrix.base.BaseActivity;

public class BlurActivity extends BaseActivity {
    private ImageView iv_blur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blur);

        initView();
        initEvent();
    }

    private void initView(){
        iv_blur = (ImageView) findViewById(R.id.iv_blur);
    }

    private void initEvent(){

    }

}
