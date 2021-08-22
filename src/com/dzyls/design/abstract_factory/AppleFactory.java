package com.dzyls.design.abstract_factory;

import com.dzyls.design.abstract_factory.impl.Iphone;
import com.dzyls.design.abstract_factory.impl.Mac;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 16:28
 * @Version 1.0.0
 * @Description:
 */
public class AppleFactory implements AbstractFactory{
    @Override
    public PC makePC() {
        return new Mac();
    }

    @Override
    public Phone makePhone() {
        return new Iphone();
    }
}
