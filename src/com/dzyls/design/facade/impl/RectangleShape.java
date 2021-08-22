package com.dzyls.design.facade.impl;

import com.dzyls.design.facade.Shape;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/21 15:13
 * @Version 1.0.0
 * @Description:
 */
public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle...");
    }
}
