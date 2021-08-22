package com.dzyls.design.decorator.impl;

import com.dzyls.design.decorator.Shape;
import com.dzyls.design.decorator.ShapeDecorator;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/22 16:34
 * @Version 1.0.0
 * @Description:
 */
public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        before();
        super.draw();
        after();
    }

    public void before(){
        System.out.println("blue before...");
    }

    public void after(){
        System.out.println("blue after...");
    }



}
