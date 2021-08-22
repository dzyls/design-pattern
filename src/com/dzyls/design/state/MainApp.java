package com.dzyls.design.state;

import com.dzyls.design.state.impl.ThreadRunner;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/26 9:25
 * @Version 1.0.0
 * @Description:
 */
public class MainApp {

    public static void main(String[] args) {
        ThreadRunner runner = new ThreadRunner();
        System.out.println(runner.getState());
        runner.stop();
        System.out.println(runner.getState());
        runner.run();
        System.out.println(runner.getState());
        runner.run();
        System.out.println(runner.getState());
        runner.stop();
        System.out.println(runner.getState());
        runner.stop();
        System.out.println(runner.getState());
    }

}
