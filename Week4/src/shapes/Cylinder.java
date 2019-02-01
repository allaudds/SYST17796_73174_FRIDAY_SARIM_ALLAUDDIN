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
public class Cylinder extends Circle implements ThreeD{
    
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return 2 * super.getArea() + 2 * Math.PI * super.getRadius() * height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder: height: " + this.height + " area: " + super.getArea()
                + " volume: " + this.getVolume();
    }
    
}
