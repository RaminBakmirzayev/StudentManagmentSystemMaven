package org.example.util;


import org.example.bean.Config;
import org.example.inter.ProcesService;
import org.example.menu.*;

public enum MENU {
    LOGIN(1,"login", new MenuLoginService()),
    REGISTER(2,"register", new MenuRegisterService()),
    ADD_TEACHER(3,"add teacher",new MenuAddTeacherService()),
    ADD_STUDENT(4,"add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHERS(5,"Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6,"Show all students", new MenuShowStudentServis()),
    UNKNOWN;



    private int number;
    private String label;

    private ProcesService service;
MENU(){}
    MENU(int number,String label, ProcesService service) {
        this.label = label;
        this.service = service;
        this.number=number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {

    return number+"."+label;
    }

    public void process() {
        service.procesLogic();
        MenuUtil.showMenu();
    }


    public int getNumber(){
        return this.number;
    }




    public static MENU find(int number){
        MENU[] menus = MENU.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return MENU.UNKNOWN;
    }

    public static void showAllMenu(){
        MENU[] menus = MENU.values();
        for (int i = 0; i < menus.length; i++) {

            if (menus[i]!=UNKNOWN){
                if (menus[i]==LOGIN||menus[i]==REGISTER){
                    if (!Config.getLoogedIn()){
                    System.out.println(menus[i]);
                    }
                } else if (Config.getLoogedIn()) {
                    System.out.println(menus[i]);
                    
                }
            }
        }
    }
}
