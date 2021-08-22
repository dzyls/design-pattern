package com.dzyls.design.chain.impl;

import com.dzyls.design.chain.Ball;
import com.dzyls.design.chain.Filter;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 16:37
 * @Version 1.0.0
 * @Description:
 */
public class BlueBallFilter implements Filter {
    @Override
    public void doFilter(List<Ball> ballList) {
        ballList.stream().filter(ball -> ball.getBallColor() == Ball.BallColor.BLUE).forEach(System.err::println);
    }
}
