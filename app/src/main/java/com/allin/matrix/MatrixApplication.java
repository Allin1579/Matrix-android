package com.allin.matrix;

import android.app.Application;

import com.allin.matrix.util.LogUtil;

/**
 * Created by Allin on 2016/6/20.
 */
public class MatrixApplication extends Application {
    private final String TAG = "MatrixApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.i(TAG, "onCreate");

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        LogUtil.i(TAG, "onLowMemory");
    }

}
