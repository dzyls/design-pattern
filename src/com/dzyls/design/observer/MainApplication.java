package com.dzyls.design.observer;

import com.dzyls.design.observer.impl.CbaObserver;
import com.dzyls.design.observer.impl.NbaObserver;
import com.dzyls.design.observer.impl.NbaSubject;

/**
 * 观察者模式属于行为模式
 * 当一个对象的状态发生改变时，所有依赖他的对象都要更新
 * 将观察者放入集合中，等到状态发生改变时，被观察者遍历通知观察者执行操作
 * 优点：观察者和被观察者是耦合的，可以及时的通知
 * 缺点：如果一个被观察者的观察对象太多，调用链很长，并且如果某一个观察对象错误，将会导致整个调用链卡主（可以采用异步）
 * 与生产者和消费者的区别是，观察者模式是在一个线程中的。
 **/
public class MainApplication {


    public static void main(String[] args) {
        Subject subject = new NbaSubject();
        NbaObserver nbaObserver = new NbaObserver();
        subject.attach(nbaObserver);
        subject.attach(new CbaObserver());
        subject.notifyObservers();
        System.out.println();
        subject.detach(nbaObserver);
        subject.notifyObservers();
    }


}
