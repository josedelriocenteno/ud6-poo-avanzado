package A6_Streams_And_Lambdas;

// OperacionesStreams.java
// Ejemplos avanzados comentados con Streams en Java para operaciones funcionales
// Aprenderás: filter, map, collect, findFirst, allMatch, count, joining, reduce

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperacionesStreams {

    public static void main(String[] args) {

        // ===============================================================
        // 1. Crear lista de nombres
        // ===============================================================
        List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro", "Maria", "Jorge", "Alba");

        // ===============================================================
        // 2. Filtrar nombres que empiezan con 'J' y convertirlos a mayúsculas
        // ===============================================================
        List<String> filtrados = nombres.stream()
                .filter(nombre -> nombre.startsWith("J"))     // Operación intermedia: filtrar
                .map(String::toUpperCase)                      // Operación intermedia: transformar
                .collect(Collectors.toList());                 // Operación terminal: recolectar en lista
        System.out.println("Nombres filtrados y en mayúsculas: " + filtrados);

        // ===============================================================
        // 3. Encontrar el primer nombre que contiene la letra 'a'
        // ===============================================================
        Optional<String> primerConA = nombres.stream()
                .filter(nombre -> nombre.contains("a"))       // Filtramos por nombres que contengan 'a'
                .findFirst();                                  // Terminal: devuelve Optional
        primerConA.ifPresent(nombre -> System.out.println("Primer nombre con 'a': " + nombre));

        // ===============================================================
        // 4. Comprobar si todos los nombres tienen más de 3 letras
        // ===============================================================
        boolean todosLargos = nombres.stream()
                .allMatch(nombre -> nombre.length() > 3);     // allMatch devuelve true si todos cumplen
        System.out.println("¿Todos los nombres tienen más de 3 letras? " + todosLargos);

        // ===============================================================
        // 5. Contar nombres que terminan con 'a'
        // ===============================================================
        long cuenta = nombres.stream()
                .filter(nombre -> nombre.endsWith("a"))      // Filtramos nombres terminados en 'a'
                .count();                                     // Terminal: cuenta elementos
        System.out.println("Cantidad de nombres que terminan con 'a': " + cuenta);

        // ===============================================================
        // 6. Convertir la lista en una cadena separada por coma
        // ===============================================================
        String cadenaNombres = nombres.stream()
                .collect(Collectors.joining(", "));          // collect + joining concatena elementos
        System.out.println("Nombres concatenados: " + cadenaNombres);

        // ===============================================================
        // 7. Usar reduce para concatenar nombres con guiones
        // ===============================================================
        String todosLosNombres = nombres.stream()
                .reduce((a, b) -> a + "-" + b)               // reduce combina elementos en uno solo
                .orElse("Lista vacía");                      // si la lista está vacía
        System.out.println("Nombres con reduce: " + todosLosNombres);

        // ===============================================================
        // Observaciones clave sobre Streams avanzados
        // ===============================================================
        // - Las operaciones intermedias (filter, map) son lazy y no ejecutan nada hasta la operación terminal
        // - Las operaciones terminales (collect, findFirst, count, reduce) disparan la ejecución
        // - Se puede combinar varias operaciones para procesar datos de forma declarativa
        // - Optional ayuda a manejar posibles resultados vacíos sin NullPointerException
    }
}