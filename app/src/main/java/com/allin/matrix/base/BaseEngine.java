package com.allin.matrix.base;

/**
 * Created by a on 2016/6/25.
 * Author: Allin
 */
public class BaseEngine {
    protected final String TAG = getTAG();

    private String getTAG(){
        Class clazz = this.getClass();
        return clazz.getSimpleName();
    }

}
