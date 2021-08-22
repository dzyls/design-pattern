package com.dzyls.design.iterator;

import com.dzyls.design.iterator.impl.IntContainer;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/29 17:25
 * @Version 1.0.0
 * @Description:
 */
public class App {

    public static void main(String[] args) {

        IntContainer container = new IntContainer();
        Iterator<Integer> iterator = container.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
