package com.dzyls.design.filter.impl;

import com.dzyls.design.filter.Criteria;
import com.dzyls.design.filter.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 13:57
 * @Version 1.0.0
 * @Description:
 */
public class OrCriteria implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Student> search(List<Student> students) {
        List<Student> studentList1 = firstCriteria.search(students);
        List<Student> studentList2 = secondCriteria.search(students);
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.addAll(studentList1);
        hashSet.addAll(studentList2);
        return new ArrayList<>(hashSet);
    }
}
