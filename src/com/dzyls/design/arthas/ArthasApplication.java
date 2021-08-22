package com.dzyls.design.arthas;

import java.util.Random;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/24 11:40
 * @Version 1.0.0
 * @Description:
 */
public class ArthasApplication {


    public static void main(String[] args) {

    }

    private int getRandom(int seed){
        return new Random(seed).nextInt(20);
    }

    public void sleep(){

    }

}
