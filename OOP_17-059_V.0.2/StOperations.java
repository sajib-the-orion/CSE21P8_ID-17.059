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
public class StOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String to perform operations on: ");
        String c = s.nextLine();
        Operations o = new Operations();
        while (true) {
            System.out.println("\nStored String is: " + c);
            System.out.print("\n\tList of Operations\n");
            System.out.print("1.Charecter at Index\t2.Point At\t3.Point before\t4.Index Count\t5.Compare string\n");
            System.out.print("6.Compare ingoring case\t7.Concatanation\t8.");
            System.out.print("\nEnter your choice: ");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    o.charat(c);
                    break;
                case 2:
                    o.pointat(c);
                    break;
                case 3:
                    o.pointbefore(c);
                    break;
                case 4:
                    o.pointcount(c);
                    break;
                case 5:
                    o.compare(c);
                    break;
                case 6:
                    o.compareingcase(c);
                    break;
                case 7:
                    o.concat(c);
                    break;
                case 8:
                    o.contains(c);
                    

            }
        }

        // TODO code application logic here
    }

}
