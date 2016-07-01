package com.allin.matrix.engine;

import com.allin.matrix.core.engine.BaseEngine;
import com.allin.matrix.core.event.EventManager;

/**
 * Created by Allin on 2016/6/30.
 */
public class EventEngine extends BaseEngine {

    public void post(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    EventManager.postEvent("sleep over");
                }
            }
        }).start();

    }

}
