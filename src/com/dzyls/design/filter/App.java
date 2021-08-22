package com.dzyls.design.filter;

import com.dzyls.design.filter.impl.AndCriteria;
import com.dzyls.design.filter.impl.BoyCriteria;
import com.dzyls.design.filter.impl.OrCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 13:45
 * @Version 1.0.0
 * @Description:
 */
public class App {


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(Student.Gender.BOY,233.33d,"j",12));
        list.add(new Student(Student.Gender.BOY,234.33d,"k",12));
        list.add(new Student(Student.Gender.BOY,235.33d,"l",13));
        list.add(new Student(Student.Gender.BOY,236.33d,"u",14));
        list.add(new Student(Student.Gender.BOY,237.33d,"i",15));
        list.add(new Student(Student.Gender.GRIL,238.33d,"q",14));
        //List<Student> search = new BoyCriteria().search(list);
        //search.stream().forEach(s -> System.out.println(s.getName()));
        List<Student> result = new AndCriteria(new BoyCriteria(), students ->
            students.stream().filter(student -> student.getAge() > 12).collect(Collectors.toList())
        ).search(list);
        result.stream().forEach(s -> System.out.println(s.getName()));
    }


}
