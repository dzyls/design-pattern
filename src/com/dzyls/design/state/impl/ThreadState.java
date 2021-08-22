package com.dzyls.design.state.impl;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/26 10:27
 * @Version 1.0.0
 * @Description:
 */
public enum ThreadState {

    RUNNABLE{
        @Override
        public void run(ThreadRunner threadRunner) {
            System.out.println("running");
            threadRunner.setState(ThreadState.RUNNING);
        }

        @Override
        public void stop(ThreadRunner threadRunner) {
            System.out.println("can't stop. not running yet");
        }
    },
    RUNNING{
        @Override
        public void run(ThreadRunner threadRunner) {
            System.out.println("already running...");
        }

        @Override
        public void stop(ThreadRunner threadRunner) {
            System.out.println("stopping");
            threadRunner.setState(ThreadState.STOP);
        }
    },
    STOP {
        @Override
        public void run(ThreadRunner threadRunner) {
            System.out.println("already stopped,can't be running again");
        }

        @Override
        public void stop(ThreadRunner threadRunner) {
            System.out.println("already stopped");
        }
    };

    public abstract void run(ThreadRunner threadRunner);

    public abstract void stop(ThreadRunner threadRunner);
}
