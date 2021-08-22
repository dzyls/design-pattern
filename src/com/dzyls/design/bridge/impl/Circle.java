package com.dzyls.design.bridge.impl;

import com.dzyls.design.bridge.AbstractShape;
import com.dzyls.design.bridge.Color;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 18:31
 * @Version 1.0.0
 * @Description:
 */
public class Circle extends AbstractShape {


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw "+color.color() + "Circle...");
    }
}
