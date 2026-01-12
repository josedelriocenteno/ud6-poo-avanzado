// ManejoExcepciones.java
// Ejemplos de uso de bloques try-catch-finally y lanzamiento de excepciones en Java

package A3_Excepciones;

public class ManejoExcepciones {
    public static void main(String[] args) {
        // Ejemplo 1: manejo simple de excepciones
        try {
            System.out.println("Intentamos realizar una división:");
            int resultado = 10 / 0; // Esto genera ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Se captura y maneja la excepción
            System.out.println("Error: División por cero.");
        } finally {
            // Esto siempre se ejecuta, haya o no excepción
            System.out.println("Fin del manejo de división.");
        }

        System.out.println("\n---\n");

        // Ejemplo 2: lanzamiento personalizado de excepción
        try {
            verificarValor(0);
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Excepción personalizada atrapada: " + e.getMessage());
        }

        System.out.println("\n---\n");

        // Ejemplo 3: manejo con múltiples catch y propagación
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Esto genera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada si el valor es cero
    public static void verificarValor(int valor) throws ExcepcionPersonalizada {
        if (valor == 0) {
            throw new ExcepcionPersonalizada("Valor no puede ser cero");
        }
        System.out.println("Valor válido: " + valor);
    }
}