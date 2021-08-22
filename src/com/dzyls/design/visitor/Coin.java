package com.dzyls.design.visitor;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 13:56
 * @Version 1.0.0
 * @Description:
 */
public interface Coin {

    void accept(Visitor visitor);

}
