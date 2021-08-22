package com.dzyls.design.decorator.impl;

import com.dzyls.design.decorator.Shape;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/21 14:25
 * @Version 1.0.0
 * @Description:
 */
public class CircleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle...");
    }

}
