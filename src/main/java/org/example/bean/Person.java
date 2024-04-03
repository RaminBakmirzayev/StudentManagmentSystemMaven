package org.example.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public abstract class Person implements Serializable {
    private String name;
    private String surname;
    private int age;


    Person() {

    }

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public String toString() {
        return "_______________________________" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "______________________________";
    }


}