package com.dzyls.design.facade;

import com.dzyls.design.facade.impl.CircleShape;
import com.dzyls.design.facade.impl.RectangleShape;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/21 15:10
 * @Version 1.0.0
 * @Description:
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new CircleShape();
        this.rectangle = new RectangleShape();
    }

    public Shape makeShape(ShapeType type){
        switch (type){
            case CIRCLE:
                return circle;
            case Rectangle:
                return rectangle;
            default:
                throw new RuntimeException();
        }
    }

    public void draw(ShapeType type){
        makeShape(type).draw();
    }

    enum ShapeType{
        CIRCLE,
        Rectangle
    }

}
