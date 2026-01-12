// ClaseConcreta.java
// Implementación concreta explicada de la clase abstracta ClaseAbstracta

package A2_Clases_Abstractas;

// Clase concreta Circulo que extiende ClaseAbstracta
public class ClaseConcreta extends ClaseAbstracta {
    private double radio;

    // Constructor que llama al constructor de la clase abstracta para inicializar el color
    public ClaseConcreta(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Implementación concreta del método abstracto calcularArea definido en ClaseAbstracta
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}