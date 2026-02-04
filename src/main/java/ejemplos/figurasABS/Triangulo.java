/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figurasABS;

/**
 *
 * @author delcenjo
 */
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura, Punto centro){
        this.base = base;
        this.altura = altura;
        this.centro = centro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    @Override
    public String toString(){
        return super.toString() + ", base=" + base + ", altura=" + altura;
    }
    
    @Override
    public double calcularArea(){
        return(this.base*this.altura);
    }
    
    @Override
    public double calcularPerimetro(){
        return this.base * 3;
    }
    
    @Override
    public void dibujarFigura(){
        System.out.println("Se ha dibujado un Triángulo");
    }
}
