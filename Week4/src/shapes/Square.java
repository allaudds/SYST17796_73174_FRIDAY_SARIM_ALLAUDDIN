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
public class Square extends Shape {
    
    private double side;
    
    public Square(){
        
        side = 1.0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square: side: " + side + " area: " + getArea();
    }

    @Override
    public boolean equals(Shape s) {
        return this.getArea() == s.getArea();
    }
    
    
}
