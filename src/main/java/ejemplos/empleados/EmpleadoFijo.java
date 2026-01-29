/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.empleado;

import java.time.LocalDate;

/**
 *
 * @author pingendi
 */
public class EmpleadoFijo extends Empleado{
    
    //Atributos
    private int anioAlta;
    private int salarioBase;
    private static final double complemento=225;
    
    //Constructor

    public EmpleadoFijo() {
        super();
    }

    public EmpleadoFijo(int idEmpleado, String nombre, String apellido,int anioAlta, int salarioBase) {
        super(idEmpleado, nombre, apellido);
        this.anioAlta = anioAlta;
        this.salarioBase=salarioBase;
    }
    
    //Getters y Setters
    public int getAnioAlta() {
        return anioAlta;
    }

    public void setAnioAlta(int anioAlta) {
        this.anioAlta = anioAlta;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    } 
    
    private double anios(){
        return LocalDate.now().getYear() - anioAlta;
    }
    
    public double sueldoMes(){
        return salarioBase + (complemento * anios()) ;
    }
    
    
    @Override
    public String toString() {
        return "EmpleadoFijo >> " + " Año Alta= " + anioAlta ;
    }
    
    
}
