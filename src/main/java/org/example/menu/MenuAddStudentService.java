package org.example.menu;


import org.example.bean.Config;
import org.example.bean.Student;
import org.example.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void proces() {
        System.out.println("enter Student name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter Student surname:");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.getInstance().appendStudents(s);
        System.out.println("Student added.");


        //Config.saveToFile();
    }
}
