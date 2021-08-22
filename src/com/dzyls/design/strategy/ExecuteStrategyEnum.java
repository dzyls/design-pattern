package com.dzyls.design.strategy;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/14 18:30
 * @Version 1.0.0
 * @Description:
 */
public enum ExecuteStrategyEnum {

    PARALLEL{
        @Override
        void execute(List<Runnable> runnables) {
            runnables.parallelStream().forEach(Runnable::run);
        }
    },
    SERIAL{
        @Override
        void execute(List<Runnable> runnables) {
            runnables.forEach(Runnable::run);
        }
    };

    abstract void execute(List<Runnable> runnables);

}
