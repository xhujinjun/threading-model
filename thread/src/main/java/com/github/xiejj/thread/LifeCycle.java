package com.github.xiejj.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author xiejinjun
 * @version 1.0 2018/4/13
 */
@Slf4j
public class LifeCycle {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(()-> {
            log.info("子线程！");
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        log.info("new Thread()的状态:{}", thread.getState());

        thread.start();
        log.info("start的状态:{}", thread.getState());

        thread.join();
        log.info("end的状态:{}", thread.getState());
    }
}
