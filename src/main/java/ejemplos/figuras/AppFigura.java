/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figuras;

/**
 *
 * @author delcenjo
 */
public class AppFigura {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto(10, 10);
        Circulo c1 = new Circulo(p1, 30.15);
        Triangulo t1 = new Triangulo(p1, 10, 10);
        Cuadrado cd1 = new Cuadrado(p1, 40, 50);
        Rectangulo r1 = new Rectangulo(p1, 50, 100);
        
        System.out.println("p1: " + p1);
        System.out.println("c1: " + c1);
        System.out.println("Área c1: " + c1.area());
        System.out.println("Perímetro c1: " + c1.perimetro());
        
        
    }
}
