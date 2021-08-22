package com.dzyls.design.filter;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 13:48
 * @Version 1.0.0
 * @Description:
 */
public interface Criteria {

    List<Student> search(List<Student> students);

}
