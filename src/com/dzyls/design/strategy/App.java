package com.dzyls.design.strategy;

import com.dzyls.design.strategy.impl.ParallelExecuteStrategy;
import com.dzyls.design.strategy.impl.SerialExecuteStrategy;

import java.util.*;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/14 17:39
 * @Version 1.0.0
 * @Description:
 */
public class App {

    private static final Map<ExecuteStrategyEnum, ExecuteStrategy> map = new HashMap<>();

    public static void init(){
        map.put(ExecuteStrategyEnum.PARALLEL,new ParallelExecuteStrategy());
        map.put(ExecuteStrategyEnum.SERIAL,new SerialExecuteStrategy());
    }

    public static void execute(ExecuteStrategyEnum type,List<Runnable> runnables){
        Optional.ofNullable(map.get(type)).ifPresent(e ->{e.execute(runnables);});
    }

    public static void main(String[] args) {
        init();
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            runnables.add(new Runner(i));
        }
        App.execute(ExecuteStrategyEnum.SERIAL,runnables);
        //ExecuteStrategyEnum.SERIAL.execute(runnables);

        //Map<String, ExecuteStrategy> map = new HashMap<>();
        //map.put("executeStrategy",new ParallelExecuteStrategy());
        //ExecuteStrategy strategy = map.get("executeStrategy");
        //Optional.ofNullable(strategy).ifPresent(s ->{s.execute(runnables);});
    }

    static class Runner implements Runnable{

        private int i;

        public Runner(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(i);
        }
    }
}
