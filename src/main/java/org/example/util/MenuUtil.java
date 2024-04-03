package org.example.util;

import java.util.Scanner;

public class MenuUtil {
    public static void  showMenu() {
        System.out.println("Please select menu");
        MENU.showAllMenu();
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);

        int selectedMenuNumber = sc.nextInt();
       MENU selectedMenu= MENU.find(selectedMenuNumber);
      selectedMenu.process();
    }

    public static void processMenu(MENU menu) {
        menu.process();
    }

}
