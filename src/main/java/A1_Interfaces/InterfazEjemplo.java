package A1_Interfaces;

// InterfazEjemplo.java
// Ejemplo de definición de una interfaz en Java con métodos abstractos y default

public interface InterfazEjemplo {

    // Método abstracto que debe implementar cualquier clase que implemente esta interfaz
    void reproducir();

    // Método abstracto que debe implementar cualquier clase que implemente esta interfaz
    void pausar();

    // Método 'default' con implementación que puede ser usado o sobrescrito por las clases implementadoras
    default void detener() {
        System.out.println("Deteniendo reproducción desde la interfaz.");
    }
}
