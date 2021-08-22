package com.dzyls.design.facade;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/21 15:15
 * @Version 1.0.0
 * @Description:
 */
public class MainApplication {


    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();
        maker.draw(ShapeMaker.ShapeType.CIRCLE);
    }

}
