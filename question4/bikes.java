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
public class bikes {

    private String category;
    private double price;

    public bikes(String category, double price) {
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "bikes{" + "category=" + category + ", price=" + price + '}';
    }

}
