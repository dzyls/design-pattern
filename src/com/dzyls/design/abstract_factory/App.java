package com.dzyls.design.abstract_factory;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 16:07
 * @Version 1.0.0
 * @Description:
 */
public class App {

    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        factory.makePC().playPC();
        factory.makePhone().playPhone();
    }

}
