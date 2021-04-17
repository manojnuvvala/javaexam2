/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Manoj Nuvvala
 */
public class Triangle extends GeometricObject {

    private final double s1;
    private final double s2;
    private final double s3;
    private String filling;

    public Triangle(double s1, double s2, double s3, String filling, String objectName, String color) {
        super(objectName, color);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.filling = filling;
    }

    public double getTr1() {
        return s1;
    }

    public double getTr2() {
        return s2;
    }

    public double getTr3() {
        return s3;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public boolean isFilled() {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (filling.equals("filled")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double perimeterOfTriangle() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double perimeter = s1 + s2 + s3;
        return perimeter;
    }

    @Override
    public double areaOfTriangle() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double x = Math.sqrt(perimeterOfTriangle() * (perimeterOfTriangle() - s1) * (perimeterOfTriangle() - s2) * (perimeterOfTriangle() - s3));
        //double area = Math.sqrt(x);
        //return area;
        return x;
    }

    @Override
    public String toString() {
        return super.toString() + "\n    first side of a triangle is: " + s1 + "\n    second side of a triangle is: " + s2
                + "\n    third side of a triangle is: " + s3
                + "\n    whether the triangle is filled: " + isFilled()
                + "\n    Area of a triangle: " + areaOfTriangle()
                + "\n    Perimeter of the triangle: " + perimeterOfTriangle();
    }

}
