package com.allin.matrix.util;

import android.util.Log;

import com.allin.matrix.Config;

/**
 * Created by a on 2016/6/20.
 * Author: Allin
 */
public class LogUtil {
    private static final int N = -1;

    public static int v(String tag, String msg) {
        return Config.DEBUG ? N : Log.v(tag, msg);
    }

    public static int v(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? N : Log.v(tag, msg, tr);
    }

    public static int d(String tag, String msg) {
        return Config.DEBUG ? N : Log.d(tag, msg);
    }

    public static int d(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? N : Log.d(tag, msg, tr);
    }

    public static int i(String tag, String msg) {
        return Config.DEBUG ? N : Log.i(tag, msg);
    }

    public static int i(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? N : Log.i(tag, msg, tr);
    }

    public static int w(String tag, String msg) {
        return Config.DEBUG ? N : Log.w(tag, msg);
    }

    public static int w(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? N : Log.w(tag, msg, tr);
    }

    public static int w(String tag, Throwable tr) {
        return Config.DEBUG ? N : Log.w(tag, tr);
    }

    public static int e(String tag, String msg) {
        return Config.DEBUG ? N : Log.e(tag, msg);
    }

    public static int e(String tag, String msg, Throwable tr) {
        return Config.DEBUG ? N : Log.e(tag, msg, tr);
    }

}
