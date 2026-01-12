package A7_SOLID;

// D_InversionDependencias.java
// Principio de Inversión de Dependencias (DIP)
// Las clases de alto nivel no deben depender de clases de bajo nivel, sino de abstracciones (interfaces)

// ============================================================
// EJEMPLO MAL (dependencia directa)
// ============================================================

class MotorGasolinaMAL {
    public void arrancar() {
        System.out.println("Motor de gasolina arrancando...");
    }
}

class CocheMAL {
    private MotorGasolinaMAL motor;

    public CocheMAL() {
        motor = new MotorGasolinaMAL(); // Dependencia directa (mala práctica)
    }

    public void conducir() {
        motor.arrancar();
        System.out.println("Conduciendo coche");
    }
}

// Problema:
// ✔ CocheMAL depende directamente de MotorGasolinaMAL
// ✔ Difícil cambiar motor por eléctrico u otra tecnología
// ✔ Rompe DIP

// ============================================================
// EJEMPLO BIEN (cumple DIP con interfaces)
// ============================================================

// Definimos abstracción (interfaz)
interface Motor {
    void arrancar();
}

// Implementación concreta 1
class MotorGasolina implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor de gasolina arrancando...");
    }
}

// Implementación concreta 2
class MotorElectrico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor eléctrico arrancando silenciosamente...");
    }
}

// Clase de alto nivel depende solo de la abstracción Motor
class Coche {
    private Motor motor;

    // Inyección de dependencias vía constructor
    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void conducir() {
        motor.arrancar(); // usa la abstracción
        System.out.println("Conduciendo coche");
    }
}

// ============================================================
// USO REAL
// ============================================================

public class D_InversionDependencias {
    public static void main(String[] args) {
        // Inyección de motor de gasolina
        Motor motorGasolina = new MotorGasolina();
        Coche cocheGasolina = new Coche(motorGasolina);
        cocheGasolina.conducir();

        System.out.println();

        // Inyección de motor eléctrico
        Motor motorElectrico = new MotorElectrico();
        Coche cocheElectrico = new Coche(motorElectrico);
        cocheElectrico.conducir();
    }
}

// Beneficios profesionales:
// ✔ Coche depende de la abstracción Motor, no de implementaciones concretas
// ✔ Fácil cambiar o extender motores sin modificar Coche
// ✔ Permite pruebas unitarias con mocks o stubs
// ✔ Cumple SOLID y mejora mantenibilidad