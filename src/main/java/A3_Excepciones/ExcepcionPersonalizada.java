// ExcepcionPersonalizada.java
// Código de excepción propia con comentarios explicativos

package A3_Excepciones;

// Definimos una excepción personalizada que extiende Exception (es checked)
public class ExcepcionPersonalizada extends Exception {

    // Constructor sin parámetros
    public ExcepcionPersonalizada() {
        super(); // Llama al constructor padre Exception sin mensaje
    }

    // Constructor que recibe un mensaje personalizado
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje); // Pasa el mensaje al constructor padre Exception
    }

    // Constructor que recibe mensaje y causa de la excepción
    public ExcepcionPersonalizada(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    // Constructor que recibe únicamente la causa de la excepción
    public ExcepcionPersonalizada(Throwable causa) {
        super(causa);
    }
}