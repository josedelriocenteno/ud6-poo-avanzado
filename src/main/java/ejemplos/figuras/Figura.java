/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figuras;

/**
 *
 * @author delcenjo
 */
public class Figura {
    
    private Punto p1;
    
    public Figura(Punto p){
        this.p1 = p;
    }
    
    public double area(){
        return 0;
    }
    public double perimetro(){
        return 0;
    }

    @Override
    public String toString() {
        return "Figura (" + " tipo >> " + this.getClass().getSimpleName() +"):\n\t" + "x=" + p1.getX() + ", y=" + p1.getY();
    }
}
