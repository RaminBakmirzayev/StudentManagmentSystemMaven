package org.example.menu;


import org.example.bean.Config;
import org.example.bean.Teacher;
import org.example.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void proces() {
        Teacher[] allTeachers= Config.getInstance().getTeachers();
        for (int i=0;i< allTeachers.length ;i++){
            System.out.println( "Info About Teacher: "+allTeachers[i]);

        }
    }
}
