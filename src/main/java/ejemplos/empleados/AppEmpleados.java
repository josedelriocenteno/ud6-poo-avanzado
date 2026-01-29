/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.empleado;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Dixx
 */
public class AppEmpleados {
    public static void main(String[] args) {
        EmpleadoFijo emplfij = new EmpleadoFijo(1, "Juan", "Gomez", 1999, 2000);
        System.out.println(emplfij.toString());
        System.out.println(emplfij.sueldoMes()); //7850
        
        
        EmpleadoHoras emplhr = new EmpleadoHoras(2, "Alberto", "Fernandez", 160);
        System.out.println(emplhr.toString());
        System.out.println(emplhr.sueldoMes()); //1600
        System.out.println();
        
        LocalDate emplAlta= LocalDate.of(2026, Month.JANUARY, 1);
        LocalDate emplBaja=LocalDate.of(2026, Month.JANUARY, 15);
        EmpleadoTemporal empltemp = new EmpleadoTemporal(3, "David", "Garcia", emplAlta, emplBaja , 1500);
        System.out.println(empltemp.sueldoMes()); //1500
        System.out.println(empltemp.toString());
    }
}
