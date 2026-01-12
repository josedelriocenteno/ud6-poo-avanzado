// UsoGenericos.java
// Uso práctico de la clase genérica con diferentes tipos de datos

package A4_Genericos;

public class UsoGenericos {
    public static void main(String[] args) {
        // Instancia con tipo String
        ClaseGenerica<String> miCadena = new ClaseGenerica<>("Hola, genéricos");
        miCadena.mostrarTipo(); // Muestra el tipo String
        System.out.println("Contenido: " + miCadena.getObjeto());

        // Instancia con tipo Integer
        ClaseGenerica<Integer> miNumero = new ClaseGenerica<>(2025);
        miNumero.mostrarTipo(); // Muestra el tipo Integer
        System.out.println("Contenido: " + miNumero.getObjeto());

        // Instancia con tipo Double
        ClaseGenerica<Double> miDecimal = new ClaseGenerica<>(3.1416);
        miDecimal.mostrarTipo(); // Muestra el tipo Double
        System.out.println("Contenido: " + miDecimal.getObjeto());

        // Cambiar el valor usando setObjeto
        miDecimal.setObjeto(2.718);
        System.out.println("Nuevo contenido decimal: " + miDecimal.getObjeto());
    }
}