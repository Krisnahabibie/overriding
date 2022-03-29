/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overiding;

/**
 *
 * @author krisn
 */
public class persegipanjang extends bangundatar{
    float panjang,lebar;
    
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("luas persegi panjang = "+luas);
    }
   public void keliling(){
       float keliling=2*(panjang+lebar);
       System.out.println("keliling persegi panjang = "+ keliling);
   }
}
