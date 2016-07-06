package com.allin.matrix.net.protocol;

/**
 * Created by Allin on 2016/6/29.
 */
public class Server {
    public static String BaseUrl = null;

    private static final String BaseUrl_Test = "https://api.github.com/";
    private static final String BaseUrl_Maintain = "https://api.github.com/";
    private static final String BaseUrl_Produce = "https://api.github.com/";

    private static ServerType serverType = ServerType.TEST;

    private enum ServerType{
        TEST,       //测试
        MAINTAIN,   //运维
        PRODUCE     //生产
    }

    static {
        switch (serverType){
            case TEST:
                BaseUrl = BaseUrl_Test;
                break;
            case MAINTAIN:
                BaseUrl = BaseUrl_Maintain;
                break;
            case PRODUCE:
                BaseUrl = BaseUrl_Produce;
                break;
        }
    }

}
