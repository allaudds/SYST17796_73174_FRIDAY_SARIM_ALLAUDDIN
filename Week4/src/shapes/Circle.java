/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author Sarim
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI + Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: radius: " + radius + " area " + getArea();
    }

    @Override
    public boolean equals(Shape s) {
        //return this.getArea() == s.getArea();
        return radius == ((Circle)s).getRadius();
    }
    
    
}
