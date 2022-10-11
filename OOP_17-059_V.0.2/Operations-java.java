/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoperations;

import java.util.Scanner;

/**
 *
 * @author 21 Technology
 */
class Operations {

    Scanner s = new Scanner(System.in);

    public void charat(String c) {
        System.out.print("\nEnter Index: ");
        int a = s.nextInt();
        System.out.println("Character at index " + a + " is: " + (c.charAt(a)));

    }

    public void pointat(String c) {
        System.out.print("\nEnter Index: ");
        int a = s.nextInt();
        System.out.println("point at index " + a + " is: " + (c.codePointAt(a)));
    }

    public void pointbefore(String c) {
        System.out.print("\nEnter Index: ");
        int a = s.nextInt();
        System.out.println("point before index " + a + " is: " + (c.codePointBefore(a)));
    }

    public void pointcount(String c) {
        System.out.print("\nEnter Begin Index: ");
        int a = s.nextInt();
        System.out.print("\nEnter End Index: ");
        int b = s.nextInt();
        System.out.println("count from index " + a + " to " + b + " is: " + (c.codePointCount(a, b)));
    }

    public void compare(String c) {
        System.out.print("\nEnter String to Compare: ");
        String g = s.nextLine();
        System.out.println("Result of Comparizm: " + (c.compareTo(g)));
    }

    public void compareingcase(String c) {
        System.out.print("\nEnter String to Compare: ");
        String g = s.nextLine();
        System.out.println("Result of Comparizm: " + (c.compareToIgnoreCase(g)));
    }

    public void concat(String c) {
        System.out.println("String after concatanation: " + (c.concat(c)));
    }

    public void contains(String c) {
        System.out.println("String contains: " + (c.contains(c)));
    }
}
