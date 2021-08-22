package com.dzyls.design.flyweight.impl;

import com.dzyls.design.flyweight.Shape;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/4 13:53
 * @Version 1.0.0
 * @Description:
 */
public class CircleShape implements Shape {

    private String color;
    private int radius;
    private int x;
    private int y;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CircleShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(color + " color circle...");
    }
}
