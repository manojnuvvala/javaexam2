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
public class bullet extends bikes {

    private String model;

    public bullet(String model, String category, double price) {
        super(category, price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "bullet{" + "model=" + model + '}';
    }

}
