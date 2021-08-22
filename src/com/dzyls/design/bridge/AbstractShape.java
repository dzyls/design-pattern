package com.dzyls.design.bridge;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 18:30
 * @Version 1.0.0
 * @Description:
 */
public abstract class AbstractShape {

    protected Color color;

    public abstract void draw();

    public AbstractShape(Color color) {
        this.color = color;
    }
}
