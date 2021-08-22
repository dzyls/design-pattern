package com.dzyls.design.prototype.bean;

import java.util.Objects;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 16:14
 * @Version 1.0.0
 * @Description:
 */
public class Computer implements Cloneable{

    private String cpu;
    private Keyboard keyboard;
    private String monitor;

    public Computer(String cpu, Keyboard keyboard, String monitor) {
        this.cpu = cpu;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(cpu, computer.cpu) && Objects.equals(keyboard, computer.keyboard) && Objects.equals(monitor, computer.monitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, keyboard, monitor);
    }

    @Override
    public Computer clone() {
        try {
            Computer clone = (Computer) super.clone();
            Keyboard keyboardClone = (Keyboard)clone.getKeyboard().clone();
            clone.setKeyboard(keyboardClone);
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
