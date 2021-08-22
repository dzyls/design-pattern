package com.dzyls.design.prototype;

import com.dzyls.design.prototype.bean.Computer;
import com.dzyls.design.prototype.bean.Keyboard;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 16:07
 * @Version 1.0.0
 * @Description: 单例模式
 */
public class MainApplication {

    public static void main(String[] args) {
        Computer hp = PrototypeCacheManager.getFromCache("HP");
        Computer clone = hp.clone();
        System.err.println(hp == clone);
        System.err.println(hp.equals(clone));
        System.err.println(hp.getKeyboard()==clone.getKeyboard());

    }

}
