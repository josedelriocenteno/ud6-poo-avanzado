/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figuras;

/**
 *
 * @author delcenjo
 */
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    
    public Triangulo(Punto p, double base, double altura){
        super(p);
        this.base = base;
        this.altura = altura;
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", base=" + base + ", altura=" + altura;
    }
    
    @Override
    public double area(){
        return (base * altura) / 2;
    }
    
    @Override
    public double perimetro(){
        double lado = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return base + (2 * lado);
    }
}
