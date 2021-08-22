package com.dzyls.design.composite;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/22 17:43
 * @Version 1.0.0
 * @Description:
 */
public class CompositeApp {


    public static void main(String[] args) {
        Employee boss = new Employee("张三", "董事会");
        Employee ceo = new Employee("李四", "总裁办");
        Employee employee = new Employee("王五", "销售部");
        boss.add(ceo);
        ceo.add(employee);
        StringBuilder sb = new StringBuilder();

    }



}
