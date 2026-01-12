package A6_Streams_And_Lambdas;

// UsoStreams.java
// Ejemplo de uso de Streams en Java mostrando operaciones básicas:
// map, filter, count, forEach
// Formato de apuntes con explicación paso a paso

import java.util.Arrays;
import java.util.List;

public class UsoStreams {

    public static void main(String[] args) {

        // ===============================================================
        // 1. Creamos una lista de frutas
        // ===============================================================
        List<String> frutas = Arrays.asList("Manzana", "Banana", "Naranja", "Pera");

        // ===============================================================
        // 2. Iterar e imprimir todos los elementos usando Stream + Lambda
        // ===============================================================
        System.out.println("Listar todas las frutas:");
        frutas.stream()                // Creamos un stream desde la lista
                .forEach(fruta -> System.out.println(fruta)); // Operación terminal: imprimir

        // ===============================================================
        // 3. Filtrar elementos que cumplan una condición (empiecen con 'B')
        // ===============================================================
        System.out.println("\nFrutas que empiezan con la letra 'B':");
        frutas.stream()                 // Stream intermedio
                .filter(fruta -> fruta.startsWith("B"))  // Operación intermedia: filtrar
                .forEach(System.out::println);          // Operación terminal: imprimir

        // ===============================================================
        // 4. Contar elementos que cumplan cierta condición
        // ===============================================================
        long cantidad = frutas.stream()
                .filter(fruta -> fruta.length() > 5) // Filtramos nombres > 5 letras
                .count();                            // Contamos elementos

        System.out.println("\nCantidad de frutas con nombre mayor a 5 letras: " + cantidad);

        // ===============================================================
        // 5. Ejemplo de transformación con map
        // ===============================================================
        System.out.println("\nConvertir todos los nombres de frutas a mayúsculas:");
        frutas.stream()
                .map(String::toUpperCase)  // Transformamos cada elemento
                .forEach(System.out::println);

        // ===============================================================
        // 6. Ejemplo combinado: filtrar + map + forEach
        // ===============================================================
        System.out.println("\nFrutas con más de 5 letras en mayúsculas:");
        frutas.stream()
                .filter(f -> f.length() > 5)   // Filtrar por longitud
                .map(String::toUpperCase)      // Transformar a mayúsculas
                .forEach(System.out::println); // Imprimir
    }
}