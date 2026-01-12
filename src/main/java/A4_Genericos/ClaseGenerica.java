// ClaseGenerica.java
// Clase genérica con comentarios explicativos para entender su uso básico

package A4_Genericos;

// Definimos una clase genérica parametrizada con <T>
public class ClaseGenerica<T> {

    // Atributo del tipo genérico T, puede ser cualquier tipo
    private T objeto;

    // Constructor que recibe un objeto de tipo T
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    // Método que devuelve el objeto almacenado
    public T getObjeto() {
        return objeto;
    }

    // Método que permite cambiar el objeto almacenado
    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    // Método para mostrar el tipo del objeto
    public void mostrarTipo() {
        System.out.println("El tipo de T es: " + objeto.getClass().getName());
    }
}