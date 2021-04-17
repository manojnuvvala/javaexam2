/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.Scanner;

/**
 *
 * @author Manoj Nuvvala
 */
public class pythonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Course Name : ");
        String name = scan.next();
        System.out.println("Enter the Course code : ");
        int code = scan.nextInt();
        System.out.println("Enter the course Credits : ");
        int credits = scan.nextInt();
        System.out.println("Enter course professor Name : ");
        String professor = scan.next();
        System.out.println("Enter the tool used : ");
        String tool = scan.next();
        Python pythonobj = new Python(credits, professor, name, code);

        System.out.println(pythonobj.toString());

    }

}
