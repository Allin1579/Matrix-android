package com.allin.matrix;

import android.app.Application;

import com.allin.matrix.util.LogUtil;

/**
 * Created by a on 2016/4/29.
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
