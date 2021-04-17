/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class identiacalOrNotIdentical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = scan.nextInt();
            }
        }

        boolean equalsOrNot = equals(m1, m2);
        if (equalsOrNot) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {

        if (m1.length == m2.length) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2.length; j++) {
                    if (!(m1[i][j] == m2[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

}
