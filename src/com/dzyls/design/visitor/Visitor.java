package com.dzyls.design.visitor;

import com.dzyls.design.visitor.impl.BTCoin;
import com.dzyls.design.visitor.impl.ETCoin;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 14:55
 * @Version 1.0.0
 * @Description:
 */
public interface Visitor {

    void visit(BTCoin coin);
    void visit(ETCoin coin);

}
