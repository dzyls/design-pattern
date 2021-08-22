package com.dzyls.design.filter.impl;

import com.dzyls.design.filter.Criteria;
import com.dzyls.design.filter.Student;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 13:54
 * @Version 1.0.0
 * @Description:
 */
public class AndCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria secondCriteria;


    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Student> search(List<Student> students) {
        List<Student> studentList = firstCriteria.search(students);
        return secondCriteria.search(studentList);
    }
}
