package com.dzyls.design.visitor;

import com.dzyls.design.visitor.impl.AVisitor;
import com.dzyls.design.visitor.impl.BTCoin;
import com.dzyls.design.visitor.impl.BVisitor;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 10:10
 * @Version 1.0.0
 * @Description:
 */
public class App {

    public static void main(String[] args) {
        Coin btCoin = new BTCoin();
        btCoin.accept(new BVisitor());
    }

}
