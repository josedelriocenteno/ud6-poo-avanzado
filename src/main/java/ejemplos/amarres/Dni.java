/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.amarres;

/**
 *
 * @author delcenjo
 */
public class Dni {
    
    private String dni;
    
    public Dni(String dni){
        if(validarDni(dni)) this.dni = dni;
        else System.out.println("Dni inválido.");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public static boolean validarDni(String dni){
        if (dni.matches("^[0-9]{8}[A-Z]$")) return true;
        else return false;
    }
}
