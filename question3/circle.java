/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Manoj Nuvvala
 */
public class circle {

    private int radius;
    private double area;
    private double perimeter;

    public circle(int radius, double area, double perimeter) {
        this.radius = radius;
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", area=" + area + ", perimeter=" + perimeter + '}';
    }

}
