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
public class EmpleadoTemporal extends Empleado{
    
    //Atributos
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private double sueldo;
    
    //Constructor
    public EmpleadoTemporal() {
        super();
    }

    public EmpleadoTemporal(int idEmpleado, String nombre, String apellido,LocalDate fechaAlta, LocalDate fechaBaja, double sueldo) {
        super(idEmpleado, nombre, apellido);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.sueldo = sueldo;
    }
  
    //Getters y Setters
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
       
    public double sueldoMes(){
        return sueldo;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal >>" + " Fecha Alta=" + fechaAlta + " Fecha Baja=" + fechaBaja;
    }
    
    
}
