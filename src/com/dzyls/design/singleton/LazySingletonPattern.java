package com.dzyls.design.singleton;

/**
    双重检查单例模式
 */
public class LazySingletonPattern {

    private static LazySingletonPattern instance;

    private LazySingletonPattern(){
        // private constructor
    }

    public static LazySingletonPattern getInstance(){
        if (instance == null){
            synchronized (LazySingletonPattern.class){
                if (instance == null){
                    instance = new LazySingletonPattern();
                }
            }
        }
        return instance;
    }

}
