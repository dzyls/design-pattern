package com.dzyls.design.optional;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/14 18:37
 * @Version 1.0.0
 * @Description:
 */
public class App {


    public static void main(String[] args) {
        Optional<String> abc = Optional.ofNullable("asd");
        abc.ifPresent(System.out::println);
    }




}
