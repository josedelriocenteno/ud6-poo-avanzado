/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejemplos.barco;

/**
 *
 * @author delcenjo
 */
public class AppBarco {
    
    public static void naufragio(Barco barco){
        barco.alarma();
    }
    
    public static void main(String[] args) {
        
        Velero velero = new Velero();
        Yate yate = new Yate();
        Barco barco = new Barco();
        
        barco = velero;
        barco.alarma();
        
        barco = yate;
        barco.alarma();
    }
}
