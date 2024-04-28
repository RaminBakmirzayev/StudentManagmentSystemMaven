package org.example.main;

import org.example.bean.Config;
import org.example.inter.MenuAddStudentServiceInter;
import org.example.menu.MenuAddStudentService;
import org.example.util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Config.initalize();
        MenuUtil.showMenu();


    }
}