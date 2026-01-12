// UsoAbstractas.java
// Programa ejemplo con explicación paso a paso del uso de clases abstractas y polimorfismo

package A2_Clases_Abstractas;

public class UsoAbstractas {
    public static void main(String[] args) {
        // No se puede instanciar ClaseAbstracta directamente, esta línea daría error:
        // ClaseAbstracta figura = new ClaseAbstracta("Rojo");

        // Creamos objetos concretos usando clases que extienden la clase abstracta
        ClaseAbstracta circulo = new ClaseConcreta("Rojo", 5);
        ClaseAbstracta rectangulo = new Rectangulo("Azul", 4, 7);

        // Mostramos el área y el color del círculo
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Color del círculo: " + circulo.getColor());

        // Mostramos el área y el color del rectángulo
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Color del rectángulo: " + rectangulo.getColor());
    }
}

// Clase Rectangulo es otra implementación concreta que extiende ClaseAbstracta

class Rectangulo extends ClaseAbstracta {
    private double ancho;
    private double alto;

    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementamos el método abstracto calcularArea
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}