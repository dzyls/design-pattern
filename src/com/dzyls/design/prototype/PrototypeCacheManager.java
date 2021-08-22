package com.dzyls.design.prototype;


import com.dzyls.design.prototype.bean.Computer;
import com.dzyls.design.prototype.bean.Keyboard;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020/12/23 16:28
 * @Version 1.0.0
 * @Description:
 */
public class PrototypeCacheManager {

    private static final ConcurrentHashMap<String, Computer> prototypeMap = new ConcurrentHashMap<>();

    static {
        prototypeMap.put("HP",new Computer("9100",new Keyboard("123","323"),"HTC"));
        prototypeMap.put("MAC",new Computer("386",new Keyboard("222","333"),"MAC"));
    }


    public static Computer getFromCache(String computerName){
        if (prototypeMap.containsKey(computerName)){
            return prototypeMap.get(computerName).clone();
        }
        return null;
    }
}
