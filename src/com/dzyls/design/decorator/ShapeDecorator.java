package com.dzyls.design.decorator;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/21 14:27
 * @Version 1.0.0
 * @Description:
 */
public abstract class ShapeDecorator implements Shape{

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
    }

}
