/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 21 Technology
 */
public class Calculations {

    void sum(double a, double b) {
        System.out.println("Summation of " + a + " and " + b + " is: " + (a + b));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void sub(double a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void mult(double a, double b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void div(double a, double b) {
        System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void mod(double a, double b) {
        System.out.println("Modulas of " + a + " and " + b + " is: " + (a % b));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void root(double a) {
        System.out.println("Root value of " + a + " is: " + (Math.sqrt(a)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void max(double a, double b) {
        System.out.println("Maximum value between " + a + " and " + b + " is: " + (Math.max(a, b)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void min(double a, double b) {
        System.out.println("Minimum value between " + a + " and " + b + " is: " + (Math.min(a, b)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void sin(double a) {
        double x = Math.toRadians(a);
        System.out.println("sin" + a + " is: " + (Math.sin(x)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

    void cos(double a) {
        double x = Math.toRadians(a);
        System.out.println("cos" + a + " is: " + (Math.cos(x)));
        System.out.println("\n\n--------------------------------------------------------------\n\n");
    }

}
