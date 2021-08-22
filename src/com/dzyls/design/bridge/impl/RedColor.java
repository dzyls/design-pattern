package com.dzyls.design.bridge.impl;

import com.dzyls.design.bridge.Color;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 18:29
 * @Version 1.0.0
 * @Description:
 */
public class RedColor implements Color {
    @Override
    public String color() {
        return "red";
    }
}
