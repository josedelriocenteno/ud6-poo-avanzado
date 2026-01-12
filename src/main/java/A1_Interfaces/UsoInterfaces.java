package A1_Interfaces;

// UsoInterfaces.java
// Programa que demuestra el uso de interfaces con polimorfismo en Java

public class UsoInterfaces {
    public static void main(String[] args) {
        // Creando un objeto de tipo interfaz InterfazEjemplo usando una clase concreta ClaseImplementaInterfaz
        InterfazEjemplo reproductorMusica = new ClaseImplementaInterfaz();

        // Ejecutando métodos específicos a través de una referencia a interfaz
        reproductorMusica.reproducir();
        reproductorMusica.pausar();

        // También, gracias a polimorfismo, podríamos usar otras clases que implementen InterfazEjemplo
        // Aquí puedes crear otra clase que implemente InterfazEjemplo, por ejemplo Radio
        // InterfazEjemplo otroReproductor = new Radio();
        // otroReproductor.reproducir();
        // otroReproductor.pausar();

        // Llamada a método default (puede ser sobrescrito en la clase implementadora)
        reproductorMusica.detener();
        // otroReproductor.detener();
    }
}