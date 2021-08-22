package com.dzyls.design.filter.impl;

import com.dzyls.design.filter.Criteria;
import com.dzyls.design.filter.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 13:51
 * @Version 1.0.0
 * @Description:
 */
public class BoyCriteria implements Criteria {


    @Override
    public List<Student> search(List<Student> students) {
        return students.parallelStream().filter(student -> {return student.getGender()== Student.Gender.BOY;}).collect(Collectors.toList());
    }
}
