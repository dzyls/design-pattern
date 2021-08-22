package com.dzyls.design.chain;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 16:40
 * @Version 1.0.0
 * @Description:
 */
public interface Filter {

    void doFilter(List<Ball> ballList);

}
