package com.dzyls.design.strategy.impl;

import com.dzyls.design.strategy.ExecuteStrategy;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/14 17:42
 * @Version 1.0.0
 * @Description:
 */
public class ParallelExecuteStrategy implements ExecuteStrategy {

    private Executor executor = Executors.newFixedThreadPool(5);

    @Override
    public void execute(List<Runnable> runnableList) {
        runnableList.parallelStream().forEach(runnable -> executor.execute(runnable));
    }
}
