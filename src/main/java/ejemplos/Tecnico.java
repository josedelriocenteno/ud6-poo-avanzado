/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

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
        this.plusPeligrosidad = 100;
    }
    
    public Tecnico(int id, String nombre, String apellido, String especialidad, double plusPeligrosidad){
        super(id, nombre, apellido);
        this.especialidad = especialidad;
        this.plusPeligrosidad = plusPeligrosidad;
    }
        
    // getter y setter

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // métodos
    @Override    
    public String toString() {
        return super.toString() + "especialidad=" + this.especialidad;
    }
    
    @Override
    public double salario(){
        return SMI + plusPeligrosidad;
    }
}
