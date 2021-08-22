package com.dzyls.design.iterator.impl;

import com.dzyls.design.iterator.Iterable;
import com.dzyls.design.iterator.Iterator;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/29 17:21
 * @Version 1.0.0
 * @Description:
 */
public class IntContainer implements Iterable<Integer> {
    private int []arrays = {1,2,3,4,5,6,7,8};
    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer>{

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < arrays.length;
        }

        @Override
        public Integer next() {
            return arrays[index++];
        }
    }
}
