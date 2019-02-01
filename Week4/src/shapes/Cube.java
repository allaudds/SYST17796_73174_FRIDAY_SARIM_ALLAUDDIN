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
public class Cube extends Square implements ThreeD{

    public Cube() {
    }
    
    public Cube(double side){
        super(side);
    }
    
    @Override
    public double getArea(){
        return 6 * super.getArea();
    }

    @Override
    public double getVolume() {
        return Math.pow(super.getSide(), 3);
    }
    
    @Override
    public String toString(){
        return "Cube: side: " + super.getSide() + " area: " + this.getArea()
            + " volume: " + this.getVolume();
    }
    
    
}
