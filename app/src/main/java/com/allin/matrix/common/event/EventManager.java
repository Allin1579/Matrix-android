package com.allin.matrix.common.event;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Allin on 2016/6/30.
 */
public class EventManager {

    public static void register(Object subscriber){
        EventBus.getDefault().register(subscriber);
    }

    public static void unregister(Object subscriber){
        if(isRegistered(subscriber)){
            EventBus.getDefault().unregister(subscriber);
        }
    }

    public static boolean isRegistered(Object subscriber){
        return EventBus.getDefault().isRegistered(subscriber);
    }

    public static void postEvent(Object event){
        EventBus.getDefault().post(event);
    }

}
