/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Manoj Nuvvala
 */
public class bikesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bikes bullet = new bikes("Classic 350", 120000);
        bikes yamaharx100 = new bikes("cc100", 200000);
        System.out.println(bullet);
        System.out.println(yamaharx100);
    }

}
