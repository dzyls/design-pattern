package com.dzyls.design.abstract_factory;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 16:20
 * @Version 1.0.0
 * @Description:
 */
public interface AbstractFactory {

    PC makePC();
    Phone makePhone();

}
