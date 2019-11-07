/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan57.vehicle;

/**
 *
 * @author USER
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }

    public Bicycle() {
        System.out.println("Bicycle");
    }
    
}
