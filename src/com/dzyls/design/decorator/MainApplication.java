package com.dzyls.design.decorator;

import com.dzyls.design.decorator.impl.BlueShapeDecorator;
import com.dzyls.design.decorator.impl.CircleShape;
import com.dzyls.design.decorator.impl.RedShapeDecorator;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/21 14:30
 * @Version 1.0.0
 * @Description:
 */
public class MainApplication {


    public static void main(String[] args) {
        CircleShape circle = new CircleShape();
        ShapeDecorator decorator = new RedShapeDecorator(circle);
        //decorator.draw();
        decorator = new BlueShapeDecorator(decorator);
        //decorator.draw();
        decorator = new RedShapeDecorator(decorator);
        decorator.draw();
    }

}
