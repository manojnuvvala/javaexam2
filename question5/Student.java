/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Manoj Nuvvala
 */
public class Student extends Person {

    public static final String CLASS_STATUS = "Graduate";
    private final double grade;

    public Student(double grade, String name, String address,
            long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }
}
