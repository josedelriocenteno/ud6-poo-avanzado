/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author delcenjo
 */
public class AppEmpleado {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Luis", "Perez");
        System.out.println(empleado1);
        System.out.println("Salario mes:" + empleado1.calcularSalario());
        try{
            empleado1.setSalarioBase(1000);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "App Empleados", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println();
        
        Junior junio1 = new Junior(3, "Macarena", "Cuenca", 500);
        junio1.setHoras(25);
        junio1.setPrecioHora(50);
        System.out.println(junio1);
        System.out.println("Salario mes:" + junio1.calcularSalario());
        System.out.println();

        Senior senior1 = new Senior(3, "Adriel", "Gomez", 500);
        senior1.setHoras(25);
        senior1.setPrecioHora(50);
        try {
            senior1.setDietas(500);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "App Empleados", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(senior1);
        System.out.println("Salario mes:" + senior1.calcularSalario());
    }
}
