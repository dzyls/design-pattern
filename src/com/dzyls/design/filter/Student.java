package com.dzyls.design.filter;

import java.util.Objects;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 13:48
 * @Version 1.0.0
 * @Description:
 */
public class Student {

    private Gender gender;

    private double score;

    private String name;

    private int age;

    public Student(Gender gender, double score, String name, int age) {
        this.gender = gender;
        this.score = score;
        this.name = name;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 && age == student.age && gender == student.gender && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, score, name, age);
    }

    public enum Gender{
        BOY,
        GRIL;
    }

}
