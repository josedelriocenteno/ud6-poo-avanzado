/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figuras;

/**
 *
 * @author delcenjo
 */
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(Punto p, double base, double altura){
        super(p, base, altura);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
