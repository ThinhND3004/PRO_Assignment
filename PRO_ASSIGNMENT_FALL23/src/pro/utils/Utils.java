/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.utils;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Utils {

    private static Scanner sc;

    public static String getString(String welcome) {
        String result = "";
        sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.length() > 0) {
                check = false;
            }
        } while (check);
        return result;
    }

    public static int getNumber(String welcome, int min, int max) {
        int result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                result = sc.nextInt();
                if (result >= min && result <= max) {
                    check = false;
                }
            } catch (Exception e) {
            }
        } while (check);
        return result;
    }

    public static double getNumber(String welcome, double min, double max) {
        double result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                result = sc.nextDouble();
                if (result >= min && result <= max) {
                    check = false;
                }
            } catch (Exception e) {
            }
        } while (check);
        return result;
    }

    public static String updateString(String welcome, String oldValue) {
        String result = "";
        System.out.print(welcome);
        sc = new Scanner(System.in);
        result = sc.nextLine();
        if (result.length() == 0) {
            result = oldValue;
        }

        return result;
    }

    public static int updateNumber(String welcome, int min, int max, int oldValue) {
        int result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String str = sc.nextLine();
                if (str.length() == 0) {
                    result = oldValue;
                    check = false;
                } else {
                    result = Integer.parseInt(str);
                    if (result > min && result < max) {
                        check = false;
                    }
                }

            } catch (Exception e) {
            }
        } while (check);
        return result;
    }

    
    public static double updateNumber(String welcome, double min, double max, double oldValue) {
        double result = 0;
        boolean check = true;
        sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                String str = sc.nextLine();
                if (str.length() == 0) {
                    result = oldValue;
                    check = false;
                } else {
                    result = Integer.parseInt(str);
                    if (result > min && result < max) {
                        check = false;
                    }
                }

            } catch (Exception e) {
            }
        } while (check);
        return result;
    }
    

    public static boolean getBoolean(String welcome) {
        boolean check = false;
        System.out.print(welcome);
        sc = new Scanner(System.in);
        String str = sc.nextLine();
        if ("y".equalsIgnoreCase(str)) {
            check = true;
        }
        return check;
    }

    
    public static void showMenu()
    {
        System.out.println("===========================================");
        System.out.println("| Welcome to Do Co management made by me  |");
        System.out.println("|           Select your menu              |");
        System.out.println("|           1. Add items                  |");
        System.out.println("|           2. Update items               |");
        System.out.println("|           3. Display items               |");
        System.out.println("|           4. Search                     |");
        System.out.println("|           5. Remove                     |");
        System.out.println("|           6. Quit                       |");
        System.out.println("===========================================");
        
    }    
    
    public static void showSubMenu()
    {
        System.out.println("===========================================");
        System.out.println("| Welcome to Do Co management made by me  |");
        System.out.println("|           Select the kind of item       |");
        System.out.println("|           1. Add Painting               |");
        System.out.println("|           2. Add Vase                   |");
        System.out.println("|           3. Add Statue                 |");
        System.out.println("===========================================");
    }
    
}    
    
    
    
    

