package A6_Streams_And_Lambdas;

// UsoLambdas.java
// Ejemplo básico de expresiones lambda en Java con explicaciones
// Aprenderás: forEach, referencia a métodos, lambda en múltiples líneas, comparadores

import java.util.ArrayList;
import java.util.Collections;

public class UsoLambdas {

    public static void main(String[] args) {

        // ===============================================================
        // 1. Crear lista de números enteros
        // ===============================================================
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(9);
        numeros.add(3);
        numeros.add(7);

        // ===============================================================
        // 2. Imprimir elementos usando lambda
        // ===============================================================
        System.out.println("Imprimiendo números con lambda:");
        numeros.forEach(n -> System.out.println(n));  // Lambda simple

        // ===============================================================
        // 3. Imprimir usando referencia a método (forma simplificada)
        // ===============================================================
        System.out.println("\nImprimiendo números usando referencia a método:");
        numeros.forEach(System.out::println);

        // ===============================================================
        // 4. Ordenar lista usando lambda como comparador
        // ===============================================================
        // Orden ascendente: (a, b) -> a - b
        Collections.sort(numeros, (a, b) -> a - b);
        System.out.println("\nNúmeros ordenados ascendente:");
        numeros.forEach(System.out::println);

        // ===============================================================
        // 5. Lambda con múltiples líneas de código
        // ===============================================================
        System.out.println("\nEjemplo lambda con múltiples instrucciones:");
        numeros.forEach(n -> {
            int cuadrado = n * n;                  // Calculamos el cuadrado
            System.out.println("Número: " + n + " - Cuadrado: " + cuadrado);
        });

        // ===============================================================
        // 6. Observaciones importantes sobre lambdas
        // ===============================================================
        // - Son funciones anónimas, concisas y legibles
        // - Pueden reemplazar clases anónimas para interfaces funcionales
        // - Permiten operaciones en colecciones de forma más declarativa
        // - Se pueden usar con Streams, comparadores, event handlers, etc.
    }
}