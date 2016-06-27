package com.allin.matrix.engine;

import com.allin.matrix.base.BaseEngine;

/**
 * Created by Allin on 2016/6/27.
 */
public class LaunchEngine extends BaseEngine {
    private static LaunchEngine INSTANCE = new LaunchEngine();

    private LaunchEngine(){

    }

    public static LaunchEngine getInstance(){
        return INSTANCE;
    }

    public String getLaunchImg(){
        return "http://n.sinaimg.cn/astro/transform/20151231/e6Ud-fxmykrf2689789.jpg";
    }

}
