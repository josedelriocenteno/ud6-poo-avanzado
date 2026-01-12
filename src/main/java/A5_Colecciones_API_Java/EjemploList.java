package A5_Colecciones_API_Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * EjemploList.java
 *
 * Explicación de las colecciones List en Java:
 *
 * Conceptos cubiertos:
 * - List: colección ordenada que permite elementos duplicados
 * - ArrayList vs LinkedList: diferencias de rendimiento y uso
 * - Métodos básicos: add, get, remove, set, size, contains
 * - Recorrer una lista
 */

public class EjemploList {

    public static void main(String[] args) {

        // =========================================
        // 1. Crear un ArrayList
        // ArrayList: almacenamiento en array dinámico, acceso rápido por índice
        // =========================================
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Juan");
        arrayList.add("Ana");
        arrayList.add("Luis");
        arrayList.add("Ana"); // ArrayList permite duplicados

        System.out.println("ArrayList: " + arrayList);

        // Acceso por índice
        System.out.println("Elemento en posición 1: " + arrayList.get(1));

        // =========================================
        // 2. Modificar un elemento
        // =========================================
        arrayList.set(0, "Carlos"); // Reemplaza "Juan" por "Carlos"
        System.out.println("ArrayList tras modificar posición 0: " + arrayList);

        // =========================================
        // 3. Eliminar elementos
        // =========================================
        arrayList.remove("Ana"); // Elimina la primera ocurrencia
        System.out.println("ArrayList tras eliminar 'Ana': " + arrayList);

        // =========================================
        // 4. Tamaño y existencia
        // =========================================
        System.out.println("Tamaño ArrayList: " + arrayList.size());
        System.out.println("Contiene 'Luis'? " + arrayList.contains("Luis"));

        // =========================================
        // 5. Recorrer con for-each
        // =========================================
        System.out.println("\nRecorrido ArrayList:");
        for (String nombre : arrayList) {
            System.out.println(nombre);
        }

        // =========================================
        // 6. Crear un LinkedList
        // LinkedList: basado en nodos, ideal para inserciones/eliminaciones frecuentes
        // =========================================
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Juan");
        linkedList.add("Ana");
        linkedList.add("Luis");
        linkedList.add("Ana"); // Duplicados permitidos

        System.out.println("\nLinkedList: " + linkedList);

        // Acceso por índice
        System.out.println("Elemento en posición 2: " + linkedList.get(2));

        // Recorrido con for-each
        System.out.println("\nRecorrido LinkedList:");
        for (String nombre : linkedList) {
            System.out.println(nombre);
        }

        // =========================================
        // 7. Notas importantes sobre List
        // =========================================
        // - Permite elementos duplicados
        // - Mantiene el orden de inserción
        // - ArrayList → acceso rápido por índice, lento al insertar/eliminar en medio
        // - LinkedList → acceso más lento por índice, rápido al insertar/eliminar
        // - Se puede usar List<String> lista = new ArrayList<>(); para programación genérica
    }
}