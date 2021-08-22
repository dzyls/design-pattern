package com.dzyls.design.proxy.impl;

import com.dzyls.design.proxy.Application;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 15:31
 * @Version 1.0.0
 * @Description:
 */
public class ChromeProxy implements Application {

    private Chrome chrome;
    private String homeUrl;

    public ChromeProxy(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    @Override
    public void exec() {
        if (chrome == null){
            chrome = new Chrome(homeUrl);
        }
        chrome.exec();
    }
}
