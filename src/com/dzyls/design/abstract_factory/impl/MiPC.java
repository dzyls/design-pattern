package com.dzyls.design.abstract_factory.impl;

import com.dzyls.design.abstract_factory.PC;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 16:18
 * @Version 1.0.0
 * @Description:
 */
public class MiPC implements PC {

    @Override
    public void playPC() {
        System.out.println("play MiPC...");
    }
}
