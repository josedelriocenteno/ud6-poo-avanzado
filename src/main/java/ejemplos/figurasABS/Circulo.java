/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figurasABS;

/**
 *
 * @author delcenjo
 */
public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double radio, Punto centro){
        this.radio = radio;
        this.centro = centro;
    }


    public double getRadio() {
        return radio;
    }

    public void setAltura(double radio) {
        this.radio = radio;
    }
 
    @Override
    public String toString(){
        return super.toString() + ", radio=" + radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI * radio;
    }
    
    @Override
    public void dibujarFigura(){
        System.out.println("Se ha dibujado un Triángulo");
    }
}
