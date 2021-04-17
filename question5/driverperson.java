/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Date;

/**
 *
 * @author Manoj Nuvvala
 */
public class driverperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date D = new Date();
        Person person1 = new Person("Manoj", "Maryville",
                224528386, "man@gmail.com");
        Student student1 = new Student(9.4, "Rakesh", "Maryville",
                999999999, "racks@gmail.com");
        Employee employee1 = new Employee("Northwest", 20000, D, "Ajay Bandi",
                "Maryville", 111111, "ab@gmail.com");
        Staff staff1 = new Staff("Assistant", "Assisatance", 4000, D,
                "Prudhvi", "MAryville", 191919191, "r@gmail.com");
        Faculty faculty1 = new Faculty(12, 3, "Colden Hall", 100000, D,
                "Dr Hoot", "Northwest", 979797979, "bb@gmail.com");

        System.out.println(person1);
        System.out.println("**************************");
        System.out.println(student1);
        System.out.println("**************************");
        System.out.println(employee1);
        System.out.println("**************************");
        System.out.println(staff1);
        System.out.println("**************************");
        System.out.println(faculty1);

    }

}
