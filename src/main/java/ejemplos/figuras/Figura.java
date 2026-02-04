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
        this.p1 = new Punto(p.getX(), p.getY());
    }
    
    public double area(){
        return 0;
    }
    public double perimetro(){
        return 0;
    }
    
    public void moverPunto(double nuevaX, double nuevaY) {
        p1.setX(nuevaX);
        p1.setY(nuevaY);
    }
    
    @Override
    public String toString() {
        return "Figura (" + " tipo >> " + this.getClass().getSimpleName() +"):\n\t" + "x=" + p1.getX() + ", y=" + p1.getY();
    }
}
