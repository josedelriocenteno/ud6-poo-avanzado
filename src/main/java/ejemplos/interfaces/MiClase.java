/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.interfaces;

/**
 *
 * @author delcenjo
 */
public class MiClase implements MiInterfaz{
    
    private int atributo1;
    private String atributo2;
    
    public MiClase(int atributo1, String atributo2){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    @Override
    public void meotodo1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void metodo2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
