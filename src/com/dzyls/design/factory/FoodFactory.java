package com.dzyls.design.factory;

import com.dzyls.design.factory.impl.Milk;
import com.dzyls.design.factory.impl.Pork;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 15:28
 * @Version 1.0.0
 * @Description:
 */
public class FoodFactory {

    public Food createFood(FoodEnum foodEnum){
        switch (foodEnum){
            case Milk:
                return new Milk();
            case PORK:
                return new Pork();
            default:
                throw new RuntimeException();
        }
    }

    public enum FoodEnum {
        Milk,
        PORK;
    }

}
