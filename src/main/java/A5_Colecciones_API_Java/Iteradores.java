package A5_Colecciones_API_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Iteradores.java
 *
 * Explicación de iteradores en Java:
 *
 * Conceptos cubiertos:
 * - Iterator: recorrido secuencial y seguro de colecciones
 * - ListIterator: permite recorrer listas en ambos sentidos y modificar elementos
 * - Métodos importantes: hasNext(), next(), remove(), hasPrevious(), previous(), set(), add()
 */

public class Iteradores {

    public static void main(String[] args) {

        // =========================================
        // 1. Crear una lista de ejemplo
        // =========================================
        List<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Ana");
        lista.add("Luis");
        lista.add("María");

        System.out.println("Lista inicial: " + lista);

        // =========================================
        // 2. Usar Iterator para recorrer y eliminar elementos
        // =========================================
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) { // Mientras haya siguiente elemento
            String nombre = it.next(); // Obtiene el siguiente elemento
            if (nombre.startsWith("L")) { // Si empieza por L, lo eliminamos
                it.remove();
            }
        }
        System.out.println("Lista tras eliminar nombres que empiezan con 'L': " + lista);

        // =========================================
        // 3. Usar ListIterator para recorrer en ambos sentidos
        // =========================================
        ListIterator<String> listIt = lista.listIterator();

        // Recorrer hacia adelante
        System.out.println("\nRecorrido hacia adelante:");
        while (listIt.hasNext()) {
            String nombre = listIt.next();
            System.out.println(nombre);
        }

        // Recorrer hacia atrás
        System.out.println("\nRecorrido hacia atrás:");
        while (listIt.hasPrevious()) {
            String nombre = listIt.previous();
            System.out.println(nombre);
        }

        // =========================================
        // 4. Modificar elementos usando ListIterator
        // =========================================
        listIt = lista.listIterator();
        while (listIt.hasNext()) {
            String nombre = listIt.next();
            if (nombre.equals("Ana")) {
                listIt.set("Ana Modificada"); // Cambia el valor actual
            }
        }
        System.out.println("\nLista tras modificar 'Ana': " + lista);

        // =========================================
        // 5. Insertar elementos usando ListIterator
        // =========================================
        listIt.add("Nuevo Nombre"); // Añade al final de la lista en la posición actual
        System.out.println("Lista tras añadir 'Nuevo Nombre': " + lista);

        // =========================================
        // 6. Notas importantes
        // =========================================
        // - Iterator funciona para todas las colecciones (List, Set, Map via entrySet)
        // - ListIterator solo funciona con List y permite:
        //      * Recorrer hacia adelante y atrás
        //      * Modificar elementos (set)
        //      * Insertar elementos (add)
        // - No se debe modificar la colección directamente mientras se usa un Iterator
        //   (con excepción de métodos del Iterator) → causa ConcurrentModificationException
    }
}