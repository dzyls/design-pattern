package com.dzyls.design.builder;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 14:38
 * @Version 1.0.0
 * @Description:
 */
public class Director {


    private AbstractComputerBuilder builder;

    public Director(AbstractComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildComputer(){
        builder.buildCpu();
        builder.buildUsb();
        builder.buildKeyboard();
        return builder.getComputer();
    }

}
