package org.example.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher extends Person {
    private String schoolName;
    private double salary;

    private Student[] students;


    public String toString() {
        return super.toString() + "\nSalary:" + getSalary();
    }
}
