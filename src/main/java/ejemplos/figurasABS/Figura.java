/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figurasABS;

/**
 *
 * @author delcenjo
 */
abstract public class Figura {
    
    protected Punto centro;
    
    abstract public double calcularArea();
    abstract public double calcularPerimetro();
    abstract public void dibujarFigura();

    @Override
    public String toString() {
        return "Figura (" + " tipo >> " + this.getClass().getSimpleName() +"):\n\t" + "centro=" + centro.toString();
    }
}
