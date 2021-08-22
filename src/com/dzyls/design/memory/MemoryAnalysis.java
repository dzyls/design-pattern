package com.dzyls.design.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 10:14
 * @Version 1.0.0
 * @Description:
 */
public class MemoryAnalysis {

    // -Xmx10m --XX:+HeapDumpOnOutOfMemory
    public static void main(String[] args) {
        ArrayList<Integer> list = IntStream.of(1, 2, 3).filter(i -> i!=2).collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list.toString());
    }

}
