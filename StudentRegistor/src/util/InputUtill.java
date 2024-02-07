/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Behruz Tapdiqov
 */
public class InputUtill {

    public static String textal(String baslig) {
        Scanner sc = new Scanner(System.in);
        System.out.println(baslig + ":");
        String metn = sc.nextLine();
        return metn;
    }

    public static int ededal(String baslig) {
        Scanner sc = new Scanner(System.in);
        System.out.println(baslig + ":");
        int eded = sc.nextInt();
        return eded;
    }
}
