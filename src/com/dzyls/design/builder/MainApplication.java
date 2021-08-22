package com.dzyls.design.builder;

import com.dzyls.design.builder.impl.HpComputerBuilder;
import com.dzyls.design.builder.impl.MacComputerBuilder;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 14:39
 * @Version 1.0.0
 * @Description:
 */
public class MainApplication {


    public static void main(String[] args) {
        AbstractComputerBuilder builder = new MacComputerBuilder();
        Director director = new Director(builder);
        Computer computer = director.buildComputer();
        System.err.println(computer);
    }



}
