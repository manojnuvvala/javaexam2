/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Manoj Nuvvala
 */
public class drivercl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> objects = new ArrayList<>();

        loan loanObject = new loan("personal", "manoj", true);
        circle circleObject = new circle(12, 44.5, 55.5);
        String stringObj = "Manoj";
        Date dateObj = new Date();

        objects.add(loanObject);
        objects.add(circleObject);
        objects.add(stringObj);
        objects.add(dateObj);

        for (Object LCSD : objects) {
            System.out.println(LCSD);
        }
    }

}
