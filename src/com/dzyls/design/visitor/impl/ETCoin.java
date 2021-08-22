package com.dzyls.design.visitor.impl;

import com.dzyls.design.visitor.Coin;
import com.dzyls.design.visitor.Visitor;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 14:55
 * @Version 1.0.0
 * @Description:
 */
public class ETCoin implements Coin {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
