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
public abstract class Shape {


    protected Shape() {   
    }
    
    public abstract double getArea();
    
    public abstract String toString();
    
    public abstract boolean equals(Shape s);
    
}
