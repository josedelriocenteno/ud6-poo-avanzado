/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.empleado;

/**
 *
 * @author delcenjo
 */
public class Senior extends Programador{
    
    // atributos
    private double dietas;
    
    // constructores
    public Senior(){
        super();
    }

    public Senior(int id, String nombre, String apellido, double complemento){
        super(id, nombre, apellido, complemento);
    }
   
    // métodos
    public double getDietas(){
        return dietas;
    }
    
    public void setDietas(double dietas) throws Exception{   
        if(dietas != calcularDietas()) throw new Exception("Las dietas no corresponden a las horas trabajadas");
        this.dietas = dietas;
    }

    @Override
    public String toString() {
        return super.toString() + "Dietas=" + this.dietas;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + calcularDietas();
    }
    
    private double calcularDietas(){
        if(this.horas >= 200) return 1000;
        else return 300;
    }
}
