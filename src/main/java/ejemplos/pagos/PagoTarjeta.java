/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.pagos;

/**
 *
 * @author delcenjo
 */
public class PagoTarjeta implements MetodoPago {

    private String numeroTarjeta;
    private String titular;
    private String comprobante;

    public PagoTarjeta(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void pagar(double cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad debe ser mayor que cero.");
        }
        comprobante = "Pago con TARJETA de " + cantidad +
                      " EUR realizado a nombre de " + titular +
                      " (tarjeta ****" + numeroTarjeta.substring(numeroTarjeta.length() - 4) + ").";
        System.out.println("Procesando pago con tarjeta...");
    }

    @Override
    public String obtenerComprobante() {
        return comprobante;
    }
}