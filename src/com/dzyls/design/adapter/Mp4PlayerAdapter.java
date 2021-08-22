package com.dzyls.design.adapter;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/15 17:48
 * @Version 1.0.0
 * @Description:
 */
public class Mp4PlayerAdapter extends Mp4Player{

    private AviPlayer aviPlayer;

    public Mp4PlayerAdapter() {
        this.aviPlayer = new AviPlayer();
    }

    public void playAvi(){
        aviPlayer.playAvi();
    }
}
