package com.dzyls.design.observer.impl;

import com.dzyls.design.observer.Observer;

/**
 *
 **/
public class NbaObserver implements Observer {

    @Override
    public void update() {
        System.err.println("Nba Observer execute...");
    }
}
