/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author 21 Technology
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b;
        Calculations c = new Calculations();
        while (true) {
            System.out.println("Operations:");
            System.out.print("\n1.Summation\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulas");
            System.out.print("\n6.Root\n7.Max value\n8.Min value\n9.Sine OP\n10.Cosine OP\n11.Exit");

            System.out.print("\n\nEnter your choice: ");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.sum(a, b);
                    break;
                case 2:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.sub(a, b);
                    break;
                case 3:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.mult(a, b);
                    break;
                case 4:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.div(a, b);
                    break;
                case 5:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.mod(a, b);
                    break;
                case 6:
                    System.out.print("\nEnter value: ");
                    a = s.nextDouble();
                    c.root(a);
                    break;
                case 7:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.max(a, b);
                    break;
                case 8:
                    System.out.print("\nEnter value of a: ");
                    a = s.nextDouble();
                    System.out.print("\nEnter value of b: ");
                    b = s.nextDouble();
                    c.min(a, b);
                    break;
                case 9:
                    System.out.print("\nEnter value: ");
                    a = s.nextDouble();
                    c.sin(a);
                    break;
                case 10:
                    System.out.print("\nEnter value: ");
                    a = s.nextDouble();
                    c.cos(a);
                    break;
                case 11:
                    exit(0);
            }

        }
    }
    // TODO code application logic here
}
