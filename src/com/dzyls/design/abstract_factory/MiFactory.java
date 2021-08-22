package com.dzyls.design.abstract_factory;

import com.dzyls.design.abstract_factory.impl.MiPC;
import com.dzyls.design.abstract_factory.impl.MiPhone;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 16:11
 * @Version 1.0.0
 * @Description:
 */
public class MiFactory implements AbstractFactory{

    @Override
    public PC makePC() {
        return new MiPC();
    }

    @Override
    public Phone makePhone() {
        return new MiPhone();
    }


}
