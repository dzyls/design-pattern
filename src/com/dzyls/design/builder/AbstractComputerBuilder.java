package com.dzyls.design.builder;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 14:48
 * @Version 1.0.0
 * @Description:
 */
public abstract class AbstractComputerBuilder {

    protected Computer computer = new Computer();

    public abstract AbstractComputerBuilder buildCpu();
    public abstract AbstractComputerBuilder buildUsb();
    public abstract AbstractComputerBuilder buildKeyboard();

    public Computer getComputer(){
        return computer;
    }

}
