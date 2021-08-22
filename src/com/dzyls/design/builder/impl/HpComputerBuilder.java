package com.dzyls.design.builder.impl;

import com.dzyls.design.builder.AbstractComputerBuilder;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 15:46
 * @Version 1.0.0
 * @Description:
 */
public class HpComputerBuilder extends AbstractComputerBuilder {
    @Override
    public AbstractComputerBuilder buildCpu() {
        computer.setCpu("9100");
        return this;
    }

    @Override
    public AbstractComputerBuilder buildUsb() {
        computer.setUsbCount(2);
        return this;
    }

    @Override
    public AbstractComputerBuilder buildKeyboard() {
        computer.setKeyboard("雷蛇");
        return this;
    }
}
