/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.empleado;

/**
 *
 * @author delcenjo
 */
public class Junior extends Programador{
    
    // atributos
    
    // constructores
    public Junior(){
        super();
    }

    public Junior(int id, String nombre, String apellido, double complemento){
        super(id, nombre, apellido, complemento);
    }
    
    // métodos
    @Override
    public String toString(){
        return super.toString();
    }
}
