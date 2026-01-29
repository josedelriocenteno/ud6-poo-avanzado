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
    
    protected double x;
    private double y;
    
    public Figura(Punto p){
        this.x = p.getX();
        this.y = p.getY();
    }
    
    public double area(){
        return 0;
    }
    public double perimetro(){
        return 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Figura (" + " tipo >> " + this.getClass().getSimpleName() +"):\n\t" + "x=" + x + ", y=" + y;
    }
}
