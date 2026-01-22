/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author delcenjo
 */
public class AppEmpleado {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Luis", "Perez");
        empleado1.setSalarioBase(1200);
        System.out.println(empleado1);
        
        Empleado empleado2 = new Empleado();
        System.out.println(empleado2);
        
        Programador programador1 = new Programador(3, "Macarena", "Cuenca", 500);
        programador1.setHoras(25);
        programador1.setPrecioHora(50);
        System.out.println(programador1.toString());
        
        Tecnico tecnico1 = new Tecnico();
        tecnico1.setEspecialidad("Redes 5.0");
        System.out.println(tecnico1);
    }
}
