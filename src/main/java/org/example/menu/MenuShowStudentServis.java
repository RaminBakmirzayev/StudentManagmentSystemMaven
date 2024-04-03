package org.example.menu;


import org.example.bean.Config;
import org.example.bean.Student;
import org.example.inter.MenuShowStudentServiceInter;

public class MenuShowStudentServis implements MenuShowStudentServiceInter {
    @Override
    public void proces() {
        Student[] allStudents = Config.getInstance().getStudents();
 for (int i=0;i< allStudents.length;i++){
     System.out.println( "Info About Students :"+allStudents[i]);
 }
    }
}
