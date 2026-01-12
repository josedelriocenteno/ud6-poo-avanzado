package A5_Colecciones_API_Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * EjemploSet.java
 *
 * Explicación paso a paso de cómo funcionan los Set en Java.
 *
 * Conceptos cubiertos:
 * - Set: colección que NO permite elementos duplicados
 * - HashSet, LinkedHashSet, TreeSet: diferencias
 * - Métodos básicos: add, remove, contains, size
 * - Recorrer un Set
 */

public class EjemploSet {

    public static void main(String[] args) {

        // =========================================
        // 1. Crear un HashSet
        // HashSet: no mantiene orden, rápido
        // =========================================
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Ana");
        hashSet.add("Luis");
        hashSet.add("Juan");
        hashSet.add("Ana"); // No se añadirá porque ya existe

        System.out.println("HashSet: " + hashSet);

        // =========================================
        // 2. Crear un LinkedHashSet
        // LinkedHashSet: mantiene orden de inserción
        // =========================================
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Ana");
        linkedSet.add("Luis");
        linkedSet.add("Juan");
        linkedSet.add("Ana"); // No se añade duplicado

        System.out.println("LinkedHashSet (orden inserción): " + linkedSet);

        // =========================================
        // 3. Crear un TreeSet
        // TreeSet: mantiene orden natural (alfabético/numerico)
        // =========================================
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ana");
        treeSet.add("Luis");
        treeSet.add("Juan");
        treeSet.add("Ana"); // No se añade duplicado

        System.out.println("TreeSet (orden natural): " + treeSet);

        // =========================================
        // 4. Comprobar tamaño y existencia
        // =========================================
        System.out.println("Tamaño hashSet: " + hashSet.size());
        System.out.println("Contiene 'Luis'? " + hashSet.contains("Luis"));

        // =========================================
        // 5. Eliminar elementos
        // =========================================
        hashSet.remove("Juan");
        System.out.println("HashSet tras eliminar 'Juan': " + hashSet);

        // =========================================
        // 6. Recorrer un Set con for-each
        // =========================================
        System.out.println("\nRecorrido LinkedHashSet:");
        for (String nombre : linkedSet) {
            System.out.println(nombre);
        }

        // =========================================
        // 7. Notas importantes sobre Set
        // =========================================
        // - No permite duplicados
        // - No se puede acceder por índice
        // - HashSet → rápido pero sin orden
        // - LinkedHashSet → mantiene orden de inserción
        // - TreeSet → mantiene orden natural
    }
}