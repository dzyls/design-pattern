package com.dzyls.design.prototype.bean;

import java.util.Objects;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 16:14
 * @Version 1.0.0
 * @Description:
 */
public class Keyboard implements Cloneable {

    private String name;
    private String type;


    public Keyboard(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard = (Keyboard) o;
        return Objects.equals(name, keyboard.name) && Objects.equals(type, keyboard.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
