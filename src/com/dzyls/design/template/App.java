package com.dzyls.design.template;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 9:57
 * @Version 1.0.0
 * @Description:
 */
public class App {


    public static void main(String[] args) {
        AbstractAnimal animal = new Rabbit();
        animal.execute();
    }


}
