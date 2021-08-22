package com.dzyls.design.abstract_factory.impl;

import com.dzyls.design.abstract_factory.Phone;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 16:20
 * @Version 1.0.0
 * @Description:
 */
public class Iphone implements Phone {

    @Override
    public void playPhone() {
        System.out.println("play iphone...");
    }
}
