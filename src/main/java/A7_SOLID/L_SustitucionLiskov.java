package A7_SOLID;

// L_SustitucionLiskov.java
// Principio de Sustitución de Liskov (LSP)
// Las subclases deben poder sustituir a la superclase sin romper la lógica del programa

// ============================================================
// EJEMPLO MAL (rompe LSP)
// ============================================================
class Ave {
    public void volar() {
        System.out.println("El ave vuela");
    }
}

class Pinguino extends Ave {
    @Override
    public void volar() {
        // Problema: los pingüinos no pueden volar, rompe LSP
        throw new UnsupportedOperationException("Los pingüinos no pueden volar");
    }
}

// Uso del código mal diseñado
class ZoologicoMAL {
    public static void main(String[] args) {
        Ave ave = new Pinguino();
        ave.volar(); // Lanza excepción, rompe el principio
    }
}

// ============================================================
// EJEMPLO BIEN (cumple LSP)
// ============================================================

// Interfaz más general para aves
interface AveGeneral {
    void comer();
}

// Interfaz separada para aves que pueden volar
interface AveVoladora extends AveGeneral {
    void volar();
}

// Clase concreta que vuela
class Golondrina implements AveVoladora {
    public void volar() {
        System.out.println("La golondrina vuela");
    }

    public void comer() {
        System.out.println("La golondrina come insectos");
    }
}

// Clase concreta que no vuela
class PinguinoBien implements AveGeneral {
    public void comer() {
        System.out.println("El pingüino come pescado");
    }
}

// Uso correcto respetando LSP
public class L_SustitucionLiskov {
    public static void main(String[] args) {
        // Polimorfismo seguro: cualquier AveGeneral puede comer
        AveGeneral ave1 = new Golondrina();
        AveGeneral ave2 = new PinguinoBien();

        ave1.comer(); // Funciona
        ave2.comer(); // Funciona

        // Polimorfismo de vuelo solo con aves que vuelan
        AveVoladora voladora = new Golondrina();
        voladora.volar(); // Correcto, no rompe lógica
    }
}

// Beneficios de LSP:
// ✔ Evita lanzar excepciones inesperadas al sustituir clases
// ✔ Permite usar herencia y polimorfismo de forma segura
// ✔ Mejora mantenibilidad y coherencia del diseño
// ✔ Obliga a pensar en interfaces y abstracciones adecuadas