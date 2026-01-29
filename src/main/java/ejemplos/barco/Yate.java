/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.barco;

/**
 *
 * @author delcenjo
 */
public class Yate extends Barco{
    
    public Yate(){
        System.out.println("Se a creado un yate");
    }
    
    @Override
    public void alarma(){
        System.out.println("SOS desde un yate");
    }    
}
