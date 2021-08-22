package com.dzyls.design.flyweight;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/4 13:46
 * @Version 1.0.0
 * @Description: 享元模式 ： 池化
 * 将对象存入池中，使用时从池中取出
 * 优点：减少对象的创造，节约资源
 * 缺点：系统更复杂了，需要分离出内部状态外部状态，线程安全问题
 */
public class MainApplication {


    public static void main(String[] args) {
        Shape red = ShapeFactory.getShape("red");
        Shape blue = ShapeFactory.getShape("blue");
        red.draw();
        blue.draw();
        Shape red1 = ShapeFactory.getShape("red");
        System.out.println(red == red1);
    }

}
