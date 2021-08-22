package com.dzyls.design.flyweight;

import com.dzyls.design.flyweight.impl.CircleShape;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/4 13:57
 * @Version 1.0.0
 * @Description:
 */
public class ShapeFactory {

    private static final Map<String,Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getShape(String color){
        Shape shape = CIRCLE_MAP.get(color);
        if (shape == null){
            shape = new CircleShape(color);
            CIRCLE_MAP.put(color,shape);
        }
        return shape;
    }
}
