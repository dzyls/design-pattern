package com.dzyls.design.observer;

/**
 *
 **/
public interface Subject {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObservers();
}
