package com.dzyls.design.command;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/22 9:50
 * @Version 1.0.0
 * @Description:
 */
public class Broker {

    private BlockingQueue<Command> queue = new ArrayBlockingQueue<>(10);
    private ExecuteThread executeThread = new ExecuteThread();

    public void putCmd(Command cmd){
        queue.offer(cmd);
    }

    public void execute(){
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(executeThread);
    }

    class ExecuteThread extends Thread{
        @Override
        public void run() {
            while (true){
                Command command = queue.poll();
                if (command!=null){
                    command.execute();
                }
            }
        }
    }
}
