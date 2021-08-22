package com.dzyls.design.chain;

import com.dzyls.design.chain.impl.BlueBallFilter;
import com.dzyls.design.chain.impl.FilterChain;
import com.dzyls.design.chain.impl.RedBallFilter;

import java.util.ArrayList;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/4 14:05
 * @Version 1.0.0
 * @Description:
 */
public class MainApplication {

    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(Ball.BallColor.BLACK,"black"));
        balls.add(new Ball(Ball.BallColor.RED,"RED"));
        balls.add(new Ball(Ball.BallColor.BLUE,"BLUE"));
        balls.add(new Ball(Ball.BallColor.WHITE,"WHITE"));
        balls.add(new Ball(Ball.BallColor.YELLOW,"YELLOW"));

        ArrayList<Filter> filters = new ArrayList<>();
        filters.add(new RedBallFilter());
        filters.add(new BlueBallFilter());
        Filter filterChain = new FilterChain(filters);
        filterChain.doFilter(balls);
    }

}
