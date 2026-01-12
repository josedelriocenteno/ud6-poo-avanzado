package A7_SOLID;

// I_SegregacionInterfaces.java
// Principio de Segregación de Interfaces (ISP)
// Las interfaces deben ser pequeñas y específicas para que las clases no implementen métodos que no necesitan

// ============================================================
// EJEMPLO MAL (rompe ISP)
// ============================================================

interface AnimalMAL {
    void comer();
    void volar();
    void nadar();
}

class PerroMAL implements AnimalMAL {
    @Override
    public void comer() {
        System.out.println("El perro come");
    }

    @Override
    public void volar() {
        // Problema: los perros no vuelan, rompe ISP
        throw new UnsupportedOperationException("Los perros no pueden volar");
    }

    @Override
    public void nadar() {
        System.out.println("El perro nada");
    }
}

// ============================================================
// EJEMPLO BIEN (cumple ISP)
// ============================================================

// Interfaces pequeñas y específicas
interface Comedor {
    void comer();
}

interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

// Clase concreta que solo come y nada
class Perro implements Comedor, Nadador {
    @Override
    public void comer() {
        System.out.println("El perro come");
    }

    @Override
    public void nadar() {
        System.out.println("El perro nada");
    }
}

// Clase concreta que solo vuela
class Golondrina1 implements Comedor, Volador {
    @Override
    public void comer() {
        System.out.println("La golondrina come insectos");
    }

    @Override
    public void volar() {
        System.out.println("La golondrina vuela");
    }
}

// Clase concreta que nada y come
class Delfin implements Comedor, Nadador {
    @Override
    public void comer() {
        System.out.println("El delfín come pescado");
    }

    @Override
    public void nadar() {
        System.out.println("El delfín nada rápido");
    }
}

// ============================================================
// USO DE LAS INTERFACES PEQUEÑAS
// ============================================================

public class I_SegregacionInterfaces {
    public static void main(String[] args) {
        Comedor perro = new Perro();
        perro.comer();

        Nadador delfin = new Delfin();
        delfin.nadar();

        Volador golondrina = new Golondrina1();
        golondrina.volar();
    }
}

// Beneficios de ISP:
// ✔ Cada clase implementa solo lo que necesita
// ✔ Evita métodos inútiles o excepciones inesperadas
// ✔ Mejora mantenibilidad y claridad del diseño
// ✔ Facilita extensiones y polimorfismo seguro