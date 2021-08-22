package com.dzyls.design.observer.impl;

import com.dzyls.design.observer.Observer;
import com.dzyls.design.observer.Subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 **/
public class NbaSubject implements Subject {

    private static List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(observer)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update();
        }
    }


}
