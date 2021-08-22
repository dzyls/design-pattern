package com.dzyls.design.deadlock;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 16:57
 * @Version 1.0.0
 * @Description:
 */
public class DeadLockApplication {

    private static final Object AObject = new Object();
    private static final Object BObject = new Object();


    private static Runnable runnerA = ()->{
        synchronized (AObject){
        try {
            Thread.sleep(1000);
            synchronized (BObject){
                System.err.println("Get lock A");
            }
        } catch (InterruptedException e) {

        }
    }};

    private static Runnable runnerB = () ->{
        synchronized (BObject){
            try {
                Thread.sleep(1000);
                synchronized (AObject){
                    System.err.println("Get Lock B");
                }
            } catch (InterruptedException e) {

            }
        }
    };


    public static void main(String[] args) {
        Thread threadA = new Thread(runnerA);
        Thread threadB = new Thread(runnerB);
        threadA.start();
        threadB.start();
    }

}
