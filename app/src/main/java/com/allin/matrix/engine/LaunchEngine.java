package com.allin.matrix.engine;

import com.allin.matrix.core.engine.BaseEngine;

/**
 * Created by Allin on 2016/6/27.
 */
public class LaunchEngine extends BaseEngine {

    public static LaunchEngine createInstance(){
        return new LaunchEngine();
    }

    public String getLaunchImg(){
        return "http://n.sinaimg.cn/astro/transform/20151231/e6Ud-fxmykrf2689789.jpg";
    }

}
