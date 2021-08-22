package com.dzyls.design.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/1/18 16:28
 * @Version 1.0.0
 * @Description:
 */
public class Employee {

    private String name;
    private String dept;
    private List<Employee> employees;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Employee> getEmployees() {
        ArrayList<Employee> result = new ArrayList<>();
        result.addAll(employees);
        return result;
    }

    public static void traverseEmployees(StringBuilder sb, Employee employee) {
        if (sb == null) {
            return;
        }
        sb.append("[" + employee.getName() + "]");
        if (employee.getEmployees().isEmpty()) {
            return;
        }
        for (Employee employeeEmployee : employee.getEmployees()) {
            traverseEmployees(sb, employeeEmployee);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", employees=" + employees +
                '}';
    }
}
