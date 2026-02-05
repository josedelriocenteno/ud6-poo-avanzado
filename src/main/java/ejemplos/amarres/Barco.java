/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.amarres;

/**
 *
 * @author delcenjo
 */
abstract public class Barco {
    
    protected String matricula;
    protected double eslora;
    protected int añoFabricacion;
    
    @Override
    public String toString(){
        return "Barco (" + " tipo >> " + this.getClass().getSimpleName() +"):\n\t" + "matricula=" + matricula
                + ", eslora=" + eslora + ", año de fabricacion=" + añoFabricacion;
    }
    
}
