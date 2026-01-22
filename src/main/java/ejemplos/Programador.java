/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author delcenjo
 * 
 * Tipos de Empleado
 * 
 */
public class Programador extends Empleado{
    
    // atributos
    private double complemento;
    private double horas;
    private double precioHora;
    
    // constructores
    
    public Programador(){
        super();
        this.complemento = 100;
    }

    public Programador(int id, String nombre, String apellido, double complemento){
        super(id, nombre, apellido);
        this.complemento = complemento;
    }
        
    // getters y setters

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    // métodos

    @Override
    public String toString() {
        return super.toString() + "complemento=" + complemento + ", horas=" + horas + ", precioHora=" + precioHora;
    }
    
    @Override
    public double salario(){
        return this.horas * this.precioHora;
    }
    
}
