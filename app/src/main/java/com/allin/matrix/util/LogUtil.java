package com.allin.matrix.util;

import android.util.Log;

import com.allin.matrix.Config;

/**
 * Created by Allin on 2016/6/20.
 */
public class LogUtil {
    private static final int N = 0;

    public static int v(String tag, String msg) {
        return Config.DEBUG ? Log.v(tag, msg) : N;
    }

    public static int v(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? Log.v(tag, msg, tr) : N;
    }

    public static int d(String tag, String msg) {
        return Config.DEBUG ? Log.d(tag, msg) : N;
    }

    public static int d(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? Log.d(tag, msg, tr) : N;
    }

    public static int i(String tag, String msg) {
        return Config.DEBUG ? Log.i(tag, msg) : N;
    }

    public static int i(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? Log.i(tag, msg, tr) : N;
    }

    public static int w(String tag, String msg) {
        return Config.DEBUG ? Log.w(tag, msg) : N;
    }

    public static int w(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? Log.w(tag, msg, tr) : N;
    }

    public static int w(String tag, Throwable tr) {
        return Config.DEBUG ? Log.w(tag, tr) : N;
    }

    public static int e(String tag, String msg) {
        return Config.DEBUG ? Log.e(tag, msg) : N;
    }

    public static int e(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? Log.e(tag, msg, tr) : N;
    }

}
