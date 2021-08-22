package com.dzyls.design.chain;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 15:43
 * @Version 1.0.0
 * @Description:
 */
public class Ball {

    private BallColor ballColor;
    private String name;

    public Ball(BallColor ballColor, String name) {
        this.ballColor = ballColor;
        this.name = name;
    }

    public BallColor getBallColor() {
        return ballColor;
    }

    public void setBallColor(BallColor ballColor) {
        this.ballColor = ballColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ballColor=" + ballColor +
                ", name='" + name + '\'' +
                '}';
    }

    public enum BallColor{
        RED,
        BLUE,
        YELLOW,
        PINK,
        WHITE,
        BLACK
    }
}
