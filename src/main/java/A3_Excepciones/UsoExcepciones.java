// UsoExcepciones.java
// Ejercicio práctico con manejo de excepciones en Java

package A3_Excepciones;

public class UsoExcepciones {
    public static void main(String[] args) {
        System.out.println("Ejemplo 1: Manejo simple con try-catch-finally");
        // Intenta dividir por cero para generar excepción
        try {
            int resultado = 10 / 0; // Genera ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡Cuidado! División por cero atrapada: " + e.getMessage());
        } finally {
            System.out.println("Este bloque finally siempre se ejecuta");
        }

        System.out.println("\nEjemplo 2: Lanzar y capturar excepción personalizada");
        try {
            verificarValor(0); // Pasar valor que generará excepción personalizada
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Excepción personalizada atrapada: " + e.getMessage());
        }

        System.out.println("\nEjemplo 3: Múltiples catch para diferentes excepciones");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("Accediendo a posición inválida:");
            System.out.println(numeros[5]); // Error: ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada si el valor es cero
    public static void verificarValor(int valor) throws ExcepcionPersonalizada {
        if (valor == 0) {
            throw new ExcepcionPersonalizada("El valor no puede ser cero");
        }
        System.out.println("Valor válido: " + valor);
    }
}