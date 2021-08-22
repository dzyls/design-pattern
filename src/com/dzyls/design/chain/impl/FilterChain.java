package com.dzyls.design.chain.impl;

import com.dzyls.design.chain.Ball;
import com.dzyls.design.chain.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 16:39
 * @Version 1.0.0
 * @Description:
 */
public class FilterChain implements Filter {

    private List<Filter> filterList;

    public FilterChain(List<Filter> filterList) {
        this.filterList = filterList;
    }

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    @Override
    public void doFilter(List<Ball> ballList) {
        filterList.stream().forEach(filter -> {filter.doFilter(ballList);});
    }

}
