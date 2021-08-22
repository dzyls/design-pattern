package com.dzyls.design.proxy.impl;

import com.dzyls.design.proxy.Application;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 15:30
 * @Version 1.0.0
 * @Description:
 */
public class Chrome implements Application {

    private String homeUrl;

    public Chrome(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    @Override
    public void exec() {
        System.out.println("redirect ------> "+homeUrl);
    }
}
