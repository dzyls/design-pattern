package com.dzyls.design.strategy;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/14 17:40
 * @Version 1.0.0
 * @Description: 代替if-else
 */
public interface ExecuteStrategy {

    void execute(List<Runnable> runnableList);

}
