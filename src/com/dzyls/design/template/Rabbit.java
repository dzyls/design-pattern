package com.dzyls.design.template;

public class Rabbit extends AbstractAnimal{

    @Override
    void run() {
        System.out.println("rabbit run...");
    }

    @Override
    void eat() {
        System.out.println("rabbit eat...");
    }

    @Override
    void sleep() {
        System.out.println("rabbit sleep");
    }
}