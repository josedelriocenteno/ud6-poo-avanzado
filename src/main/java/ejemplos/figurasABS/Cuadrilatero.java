/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.figurasABS;

/**
 *
 * @author delcenjo
 */

abstract public class Cuadrilatero extends Figura{
    
    protected double lado1;
    protected double lado2;
    
    abstract public double calcularDiagonal();
    
    @Override
    public double calcularArea(){
        return lado1 * lado2;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", lodo1=" + lado1 + ", lado2=" + lado2;
    }
}
