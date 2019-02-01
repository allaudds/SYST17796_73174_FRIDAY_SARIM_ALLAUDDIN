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
public class TestShapes {
    
    public static void main(String[] args){
        Shape c1 = new Circle();
        Shape c2 = new Circle(4.5);
        
        Shape s1 = new Square();
        Shape s2 = new Square(3.5);
        
        Shape cyl1 = new Cylinder();
        Shape cyl2 = new Cylinder(6.6, 7.5);
        
        Shape cb1 = new Cube();
        Shape cb2 = new Cube(3.5);
        
        printShape(cyl1);
        printShape(cyl2);
        printShape(cb1);
        printShape(cb2);
        
        System.out.println(cyl1.equals(cyl2));
        System.out.println(cb1.equals(cb2));
        System.out.println(cyl2.equals(new Cylinder(4.5, 8.4)));
    }
    public static void printShape(Shape s){
        System.out.println(s);
    }
}
