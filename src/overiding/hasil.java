/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overiding;

/**
 *
 * @author krisn
 */
public class hasil{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bangundatar bangundatar=new bangundatar();
       
       persegi persegi=new persegi();
       persegi.sisi=8;
       
       persegipanjang perjang =new persegipanjang();
       perjang.lebar=11;
       perjang.panjang=2;
       
       bangundatar.luas();
       bangundatar.keliling();
       
       persegi.keliling();
       persegi.luas();
       
       perjang.keliling();
       perjang.luas();
    }
    
}
