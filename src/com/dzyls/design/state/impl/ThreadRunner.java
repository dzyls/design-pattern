package com.dzyls.design.state.impl;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/26 10:25
 * @Version 1.0.0
 * @Description:
 */
public class ThreadRunner{

    private ThreadState state;

    public ThreadRunner() {
        state = ThreadState.RUNNABLE;
    }

    public void run() {
        state.run(this);
    }

    public void stop() {
        state.stop(this);
    }

    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }
}
