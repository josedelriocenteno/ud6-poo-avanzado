/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figuras;

/**
 *
 * @author delcenjo
 */
public class Cuadrilatero extends Figura{
    
    private double base;
    private double altura;
    
    public Cuadrilatero(Punto p, double base, double altura){
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
    
    public double diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    @Override
    public String toString(){
        return super.toString() + ", base=" + base + ", altura=" + altura;
    }
    
    @Override
    public double area(){
        return base * altura;
    }
    
    @Override
    public double perimetro(){
        return base * 2 + altura * 2;
    }
}
