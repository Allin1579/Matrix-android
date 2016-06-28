package com.allin.matrix.ui.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.allin.matrix.R;
import com.allin.matrix.base.BaseActivity;
import com.allin.matrix.util.BlurUtil;

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
        BlurUtil blurUtil = new BlurUtil.BlurBuilder()
                .setRadius(20)
                .setCanReuseInBitmap(true)
                .build();
        Bitmap bitmap = iv_blur.getDrawingCache();
        blurUtil.blur(this, bitmap, iv_blur);
    }

    private void initEvent(){

    }

}
