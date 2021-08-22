package com.dzyls.design.iterator;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020-12-10 16:03
 * @Version 1.0.0
 * @Description:
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

}
