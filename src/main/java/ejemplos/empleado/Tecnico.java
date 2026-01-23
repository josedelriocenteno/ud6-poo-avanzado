/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.empleado;

/**
 *
 * @author delcenjo
 */
public class Tecnico extends Empleado{
    
    // atributos
    private double plusPeligrosidad;
    private String especialidad;
    
    // constructores
    
    public Tecnico(){
        super();
        this.especialidad = "";
        this.plusPeligrosidad = 0;
    }
    
    public Tecnico(int id, String nombre, String apellido, String especialidad){
        super(id, nombre, apellido);
        this.especialidad = especialidad;
        this.plusPeligrosidad = 0;
    }
        
    // getter y setter

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPlusPeligrosidad() {
        return plusPeligrosidad;
    }

    public void setPlusPeligrosidad(double plusPeligrosidad) {
        this.plusPeligrosidad = plusPeligrosidad;
    }
    
    // métodos
    @Override    
    public String toString() {
        return super.toString() + "especialidad=" + this.especialidad + ", plus de peligrosidad=" + this.plusPeligrosidad;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + this.plusPeligrosidad;
    }
}
