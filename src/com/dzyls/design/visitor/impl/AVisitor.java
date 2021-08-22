package com.dzyls.design.visitor.impl;

import com.dzyls.design.visitor.Visitor;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 15:00
 * @Version 1.0.0
 * @Description:
 */
public class AVisitor implements Visitor {

    @Override
    public void visit(BTCoin coin) {
        System.out.println("A -> Btc...");
    }

    @Override
    public void visit(ETCoin coin) {
        System.out.println("A -> Etc...");
    }
}
