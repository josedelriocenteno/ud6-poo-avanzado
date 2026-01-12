package A5_Colecciones_API_Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * EjemploList.java
 *
 * Explicación paso a paso de cómo funcionan las List en Java.
 *
 * Conceptos cubiertos:
 * - List: colección ordenada, permite duplicados
 * - ArrayList vs LinkedList
 * - Métodos básicos: add, get, remove, size, contains
 * - Recorrer listas con for-each y for tradicional
 */

public class Explicacion_Colecciones {

    public static void main(String[] args) {

        // =========================================
        // 1. Crear una lista de tipo ArrayList
        // =========================================
        List<String> nombres = new ArrayList<>();
        System.out.println("Lista inicial: " + nombres);

        // =========================================
        // 2. Añadir elementos a la lista
        // =========================================
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Juan");
        nombres.add("Ana"); // List permite duplicados

        System.out.println("Lista después de agregar elementos: " + nombres);

        // =========================================
        // 3. Acceder a elementos por índice
        // =========================================
        System.out.println("Elemento en índice 1: " + nombres.get(1)); // Luis

        // =========================================
        // 4. Modificar un elemento
        // =========================================
        nombres.set(2, "Carlos"); // Reemplaza "Juan" por "Carlos"
        System.out.println("Lista después de modificar índice 2: " + nombres);

        // =========================================
        // 5. Eliminar un elemento
        // =========================================
        nombres.remove("Ana"); // Elimina la primera aparición
        nombres.remove(1);     // Elimina el elemento en índice 1
        System.out.println("Lista después de eliminar elementos: " + nombres);

        // =========================================
        // 6. Tamaño y existencia de elementos
        // =========================================
        System.out.println("Tamaño de la lista: " + nombres.size());
        System.out.println("¿Contiene 'Carlos'? " + nombres.contains("Carlos"));

        // =========================================
        // 7. Recorrer la lista con for-each
        // =========================================
        System.out.println("\nRecorrido con for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // =========================================
        // 8. Recorrer la lista con for tradicional
        // =========================================
        System.out.println("\nRecorrido con for tradicional:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Índice " + i + ": " + nombres.get(i));
        }

        // =========================================
        // 9. Diferencias básicas ArrayList vs LinkedList
        // =========================================
        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("Elemento1");
        listaLinked.add("Elemento2");
        // ArrayList → acceso rápido por índice, lento al insertar en medio
        // LinkedList → acceso más lento por índice, rápido al insertar/eliminar en medio
    }
}