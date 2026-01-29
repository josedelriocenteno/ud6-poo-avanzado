/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figuras;

/**
 *
 * @author delcenjo
 */
public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(Punto p, double radio){
        super(p);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", radio=" + radio;
    }
    
    @Override
    public double area(){
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    @Override
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
