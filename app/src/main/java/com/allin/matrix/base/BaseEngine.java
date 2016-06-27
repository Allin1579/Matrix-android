package com.allin.matrix.base;

/**
 * Created by Allin on 2016/6/25.
 */
public abstract class BaseEngine {
    protected final String TAG = getTAG();

    private String getTAG(){
        Class clazz = this.getClass();
        return clazz.getSimpleName();
    }

}
