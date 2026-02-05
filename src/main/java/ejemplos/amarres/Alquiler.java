/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.amarres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author delcenjo
 */
public class Alquiler {
    
    private String nombre;
    private Dni dniCliente;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombre, Dni dniCliente, LocalDate fechaInicial, LocalDate fechaFinal, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dni getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Dni dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularPeriodo() throws FechaException {
        if (fechaInicial.isAfter(fechaFinal)) {
            throw new FechaException("La fecha final debe ser posterior a la inicial");
        }
        long dias = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        return (double) dias;
}
    public double calcularAlquiler() {
        double diasDeOcupacionDouble = 0;
        try{
            diasDeOcupacionDouble = calcularPeriodo();
        } catch (FechaException ex) {
            System.out.println(ex.getMessage());
        }
        double moduloFuncion = this.barco.eslora * 20;
        return  moduloFuncion * diasDeOcupacionDouble;
    }

    
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dniCliente=" + dniCliente + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
}
