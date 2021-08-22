package com.dzyls.design.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/28 11:04
 * @Version 1.0.0
 * @Description:
 */
public class TaskPool {


    public static void main(String[] args) {
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ExecutorService service = new ThreadPoolExecutor(1,1,1L,TimeUnit.SECONDS,queue);
        service.execute(new Printer());
        service.shutdown();
        try {
            while (true){
                service.execute(new OOMRunner());
            }
        } catch (Throwable r){
            r.printStackTrace();
            service.execute(new OOMRunner());
        }

    }


    static class OOMRunner implements Runnable{
        @Override
        public void run() {
            while (true){
            }
        }
    }

    static class Printer implements Runnable{

        @Override
        public void run() {
            while (true){
                System.out.println("-----------run----------");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
