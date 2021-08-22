package com.dzyls.design.adapter;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 17:42
 * @Version 1.0.0
 * @Description:
 */
public class App {

    public static void main(String[] args) {
        Mp4Player mp4Player = new Mp4PlayerAdapter();
        mp4Player.playMp4();
    }

}
