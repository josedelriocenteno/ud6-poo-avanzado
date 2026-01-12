package A7_SOLID;

// O_AbiertoCerrado.java
// Ejemplo del Principio Abierto/Cerrado (OCP)
// Extender sin modificar código existente

import java.util.ArrayList;
import java.util.List;

// ============================================================
// MAL: Clase cerrada para cambios, rompe OCP
// ============================================================
class CalculadoraDescuentosMAL {

    // Método para calcular descuentos según tipo
    public double calcularDescuento(String tipoCliente, double precio) {
        if (tipoCliente.equals("VIP")) {
            return precio * 0.20; // 20% de descuento
        } else if (tipoCliente.equals("NORMAL")) {
            return precio * 0.10; // 10% de descuento
        } else {
            return 0; // sin descuento
        }
    }
}

// Problemas:
// - Cada vez que se agregue un nuevo tipo de cliente, debemos modificar esta clase
// - Rompe OCP: la clase no está cerrada para cambios
// - Riesgo de introducir errores al modificarla

// ============================================================
// BIEN: Aplicando OCP con interfaces y polimorfismo
// ============================================================

// Interfaz que define el comportamiento de un descuento
interface Descuento {
    double aplicarDescuento(double precio);
}

// Clase concreta para cliente VIP
class DescuentoVIP implements Descuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.20;
    }
}

// Clase concreta para cliente Normal
class DescuentoNormal implements Descuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.10;
    }
}

// Clase concreta para cliente sin descuento
class SinDescuento implements Descuento {
    public double aplicarDescuento(double precio) {
        return 0;
    }
}

// Gestor que calcula descuento usando polimorfismo
class CalculadoraDescuentos {
    public double calcular(Descuento descuento, double precio) {
        return descuento.aplicarDescuento(precio);
    }
}

// ============================================================
// USO REAL
// ============================================================
public class O_AbiertoCerrado {
    public static void main(String[] args) {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        double precio = 1000.0;

        // VIP
        Descuento vip = new DescuentoVIP();
        System.out.println("Descuento VIP: " + calc.calcular(vip, precio));

        // Normal
        Descuento normal = new DescuentoNormal();
        System.out.println("Descuento Normal: " + calc.calcular(normal, precio));

        // Sin descuento
        Descuento ninguno = new SinDescuento();
        System.out.println("Sin descuento: " + calc.calcular(ninguno, precio));

        // NUEVO tipo de cliente se puede añadir sin tocar ninguna clase existente
        // Solo creamos nueva clase que implemente Descuento
    }
}

// Beneficios de OCP:
// ✔ Podemos añadir nuevas clases sin modificar las existentes
// ✔ Reduce errores al cambiar código ya probado
// ✔ Código más flexible y mantenible
// ✔ Aprovecha polimorfismo y herencia para extender funcionalidad