/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.empleado;

/**
 *
 * @author pingendi
 */
public class EmpleadoHoras extends Empleado{
    
    //Atributos
    private static final double precioHora=10.0;
    private int horasTrabajadas;

    //Constructor
    public EmpleadoHoras() {
        super();
    }

    public EmpleadoHoras(int idEmpleado, String nombre, String apellido, int horasTrabajadas ) {
        super(idEmpleado, nombre, apellido);       
        this.horasTrabajadas = horasTrabajadas;
    }

    //Getters y Setters
    public double getPrecioHora() {
        return precioHora;
    }   

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double sueldoMes(){
        return precioHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadoHoras >> " + " Precio Hora=" + precioHora + ", Horas Trabajadas=" + horasTrabajadas ;
    }
    
}
