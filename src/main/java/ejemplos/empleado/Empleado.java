/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.empleado;

/**
 *
 * @author delcenjo
 * 
 * Clase base que modela los empleados
 * con sus características básicas
 * y que tienen todos lo empleados
 * 
 */
public class Empleado {
    
    // Atrinutos
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private double salarioBase;
    protected static final double SMI = 1200;
    
    // Constructores
    
    public Empleado(){
        this .nombre = "";
        this.apellidos = "";
        this.salarioBase = SMI;
    }
            
    public Empleado(int idEmpleado, String nombre, String apellidos) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = SMI;
    }
    
    // getter y setter
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws Exception{
        if(salarioBase>=SMI) this.salarioBase = salarioBase;
        else throw new Exception("El salario base no puede ser inferior al SMI.");
    }
    
    // métodos

    @Override
    public String toString() {
        return "Empleado (" + " tipo >> " + this.getClass().getSimpleName() +"):\n\t" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salarioBase=" + salarioBase + ", ";
    }
    
    public double calcularSalario(){
        return this.salarioBase;
    }
    
}
