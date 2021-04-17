/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class tryToRemoveDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> manojArray = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            manojArray.add(scan.nextInt());
        }
        removeDuplicate(manojArray);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (Integer number : list) {
            if (!(resultArray.contains(number))) {
                resultArray.add(number);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer distinct : resultArray) {
            System.out.print(distinct + " ");

        }
        System.out.println();
    }
}
