package com.allin.matrix.ui.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import com.allin.matrix.R;
import com.allin.matrix.core.ui.BaseActivity;
import com.allin.matrix.util.BlurUtil;

public class BlurActivity extends BaseActivity {
    private ImageView iv_blur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blur);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initView(){
        iv_blur = (ImageView) findViewById(R.id.iv_blur);
        applyBlur(iv_blur);
    }

    @Override
    protected boolean initEvent(){
        return false;
    }

    private void applyBlur(final View view){
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                view.buildDrawingCache();
                Bitmap bitmap = view.getDrawingCache();

                BlurUtil blurUtil = new BlurUtil.BlurBuilder()
                    .setRadius(20)
                    .setCanReuseInBitmap(true)
                    .build();
                blurUtil.blur(BlurActivity.this, bitmap, iv_blur);
                return true;
            }
        });
    }

}
