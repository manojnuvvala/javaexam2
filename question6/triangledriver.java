/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class triangledriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs = new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        double s1 = nacs.nextDouble();
        System.out.print("Enter the second side of triangle: ");
        double s2 = nacs.nextDouble();
        System.out.print("Enter the third side of triangle: ");
        double s3 = nacs.nextDouble();
        System.out.print("Enter whether filled or not: ");
        String filling = nacs.next();

        GeometricObject geoOb = new Triangle(s1, s2, s3, filling, "Triangle", "Black");
        System.out.println(geoOb.toString());

    }

}
