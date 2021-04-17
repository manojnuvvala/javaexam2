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
public class Staff extends Employee {

    private String title;

    public Staff(String title, String office, double salary, Date dateHired, String name, String address, long phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person name from " + this.getClass().getName()
                + " is " + super.getName();

    }

}
