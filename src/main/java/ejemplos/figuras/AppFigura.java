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
        
        System.out.println("Círculo: " + c1);
        System.out.println("Área Círculo: " + c1.area());
        System.out.println("Perímetro Círculo: " + c1.perimetro());
        
        System.out.println("");
        
        System.out.println("Triángulo: " + t1);
        System.out.println("Área Triángulo: " + t1.area());
        System.out.println("Perímetro Triángulo: " + t1.perimetro());
        
        System.out.println("");
        
        System.out.println("Cuadrado: " + cd1);
        System.out.println("Área Cuadrado: " + cd1.area());
        System.out.println("Perímetro Cuadrado: " + cd1.perimetro());
        System.out.println("Diagonas Cuadrado: " + cd1.diagonal());
        
        System.out.println("");
        
        System.out.println("Rectángulo: " + r1);
        System.out.println("Área Rectángulo: " + r1.area());
        System.out.println("Perímetro Rectángulo: " + r1.perimetro());
        System.out.println("Diagonas Rectángulo: " + r1.diagonal());
        
    }
}
