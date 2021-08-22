package com.dzyls.design.bridge;

import com.dzyls.design.bridge.impl.Circle;
import com.dzyls.design.bridge.impl.RedColor;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 18:26
 * @Version 1.0.0
 * @Description:
 */
public class App {

    public static void main(String[] args) {
        AbstractShape circle = new Circle(new RedColor());
        circle.draw();
    }

}
