package org.example.menu;


import org.example.bean.Config;
import org.example.bean.Teacher;
import org.example.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void proces() {
        System.out.println("enter Teacher name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter Teacher Surname:");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc.nextLine();
        System.out.println("Enter age:");
        Scanner sc3=new Scanner(System.in);
        int age= sc3.nextInt();
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);

        Config.getInstance().appendTeacher(t);
        System.out.println("Teacher added");

     // Config.saveToFile();



    }
}
