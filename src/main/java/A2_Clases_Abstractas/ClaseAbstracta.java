// ClaseAbstracta.java
// Código de clase abstracta con comentarios explicativos

package A2_Clases_Abstractas;

// Definición de clase abstracta Figura
public abstract class ClaseAbstracta {
    private String color;

    // Constructor para inicializar el color
    public ClaseAbstracta(String color) {
        this.color = color;
    }

    // Método concreto para obtener el color
    public String getColor() {
        return color;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract double calcularArea();
}