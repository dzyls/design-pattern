package com.dzyls.design.strategy;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/14 17:53
 * @Version 1.0.0
 * @Description:
 */
public class ExecuteController {

    private ExecuteStrategy executeStrategy;

    public ExecuteController(ExecuteStrategy executeStrategy) {
        this.executeStrategy = executeStrategy;
    }

    public void execute(List<Runnable> runnableList){
        executeStrategy.execute(runnableList);
    }

}
