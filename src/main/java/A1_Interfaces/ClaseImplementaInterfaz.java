package A1_Interfaces;

// ClaseImplementaInterfaz.java
// Ejemplo de clase que implementa la interfaz Reproductor con comentarios explicativos

public class ClaseImplementaInterfaz implements InterfazEjemplo {

    // Implementación obligatoria del método reproducir() definido en la interfaz
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo música...");
    }

    // Implementación obligatoria del método pausar() definido en la interfaz
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    // No es obligatorio sobrescribir el método 'default' detener() de la interfaz,
    // pero podemos hacerlo para modificar su comportamiento si queremos
    @Override
    public void detener() {
        System.out.println("Reproducción detenida en Musica.");
    }
}
