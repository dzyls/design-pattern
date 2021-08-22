package com.dzyls.design.observer.impl;

import com.dzyls.design.observer.Observer;

/**
 *
 **/
public class CbaObserver implements Observer {
    @Override
    public void update() {
        System.err.println("cba Observer");
    }
}
