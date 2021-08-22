package com.dzyls.design.template;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 10:01
 * @Version 1.0.0
 * @Description:
 */
public abstract class AbstractAnimal {

    abstract void run();

    abstract void eat();

    abstract void sleep();

    public void execute(){
        run();
        eat();
        sleep();
    }

}

