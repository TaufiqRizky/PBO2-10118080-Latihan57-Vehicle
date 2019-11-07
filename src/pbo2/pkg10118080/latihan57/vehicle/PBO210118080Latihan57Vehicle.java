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
public class PBO210118080Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        b.setMyBrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        
        System.out.println("Brand\t\t: "+b.getMyBrand());
        System.out.println("Model\t\t: "+b.getMyModel());
        System.out.println("Jumlah Gear\t: "+b.getMyGearCount());
        
        System.out.println("");
        Skateboard s = new Skateboard();
        s.setMyBoardLength(54.5);
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        System.out.println("Brand\t: "+s.getMyBrand());
        System.out.println("Model\t: "+s.getMyModel());
        System.out.println("Panjangnya Board : "+s.getMyBoardLength());
        
        
    }
    
}
