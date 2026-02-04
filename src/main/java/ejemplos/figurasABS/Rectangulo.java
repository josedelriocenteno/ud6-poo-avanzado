/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figurasABS;

/**
 *
 * @author delcenjo
 */
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double base, double altura, Punto centro){
        this.lado1 = base;
        this.lado2 = altura;
        this.centro = centro;
    }

    @Override
    public double calcularDiagonal() {
        return Math.sqrt(lado1*lado1 + lado2*lado2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*lado1 + 2*lado2;
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Se ha dibujado un Rectángulo");
    }
}
