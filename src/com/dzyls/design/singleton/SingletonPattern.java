package com.dzyls.design.singleton;

/**
    饿汉式单例模式
 */
public class SingletonPattern {

    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
        //private constructor
    }

    public static SingletonPattern getInstance() {
        return instance;
    }

}


