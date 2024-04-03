package org.example.menu;



import org.example.bean.Config;
import org.example.inter.MenuLoginServiceInter;

import java.util.Scanner;





public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void proces() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Password");
        String password = sc2.nextLine();
        if (!(username.equals("ramin") && password.equals("2002"))) {
            throw new IllegalArgumentException("user or password is not corect");
        }
        Config.setLoogedIn(true
        );
    }
}
