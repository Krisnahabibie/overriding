/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overiding;

/**
 *
 * @author krisn
 */
public class persegi extends bangundatar {
    float sisi;
    
    public void luas(){
        float luas=sisi*sisi;
        System.out.println("luas persegi = "+ luas);
        
    }
    public void keliling(){
        float keliling=4*sisi;
        System.out.println("keliling persegi = " + keliling);
    }
}
