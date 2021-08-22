package com.dzyls.design.proxy;

import com.dzyls.design.proxy.impl.ChromeProxy;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/25 14:46
 * @Version 1.0.0
 * @Description:
 */
public class MainApp {


    public static void main(String[] args) {
        Application proxy = new ChromeProxy("hao123.com");
        proxy.exec();
    }


}
