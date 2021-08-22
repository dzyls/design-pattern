package com.dzyls.design.builder.impl;

import com.dzyls.design.builder.AbstractComputerBuilder;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 15:38
 * @Version 1.0.0
 * @Description:
 */
public class MacComputerBuilder extends AbstractComputerBuilder {


    @Override
    public AbstractComputerBuilder buildCpu() {
        computer.setCpu("386");
        return this;
    }

    @Override
    public AbstractComputerBuilder buildUsb() {
        computer.setUsbCount(5);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildKeyboard() {
        computer.setKeyboard("双飞燕");
        return this;
    }
}
