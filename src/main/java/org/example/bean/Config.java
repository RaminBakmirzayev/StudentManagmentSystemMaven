package org.example.bean;


import lombok.Getter;
import lombok.Setter;
import org.example.util.FileUtilty;

import java.io.Serializable;

@Setter
@Getter
public class Config implements Serializable {
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];

    private static Config instance = new Config();    // usage for Singleton Pattern
    private static final String filename = "app.obj";
    private static Boolean loogedIn = false;

    private Config() {

    }

    public static Config getInstance() {
        return instance;  //Singleton Pattern
    }

    public static void initalize() {
        Object obj = FileUtilty.deserialisation(filename);
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            instance = (Config) obj;

        }

    }

    public static void saveToFile() {
        FileUtilty.serialisation(Config.getInstance(), filename);
    }


    public void appendStudents(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = s;
        students = newStudents;
    }


    public void appendTeacher(Teacher t) {                         //
        Teacher[] newTeachers = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }
        newTeachers[newTeachers.length - 1] = t;
        teachers = newTeachers;
    }

    public static Boolean getLoogedIn() {
        return loogedIn;
    }

    public static void setLoogedIn(Boolean loogedIn) {
        Config.loogedIn = loogedIn;
    }
}
