package A5_Colecciones_API_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * EjemploMap.java
 *
 * Explicación de las colecciones Map en Java:
 *
 * Conceptos cubiertos:
 * - Map: estructura que almacena pares clave-valor
 * - HashMap vs TreeMap: diferencias principales
 * - Métodos básicos: put, get, remove, containsKey, containsValue, size
 * - Iterar sobre claves, valores y entradas
 */

public class EjemploMap {

    public static void main(String[] args) {

        // =========================================
        // 1. Crear un HashMap
        // HashMap: almacenamiento basado en hash, no garantiza orden
        // =========================================
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Juan", 25);
        hashMap.put("Ana", 30);
        hashMap.put("Luis", 35);
        hashMap.put("Ana", 32); // Sobrescribe el valor anterior de Ana

        System.out.println("HashMap: " + hashMap);

        // =========================================
        // 2. Acceso a valores por clave
        // =========================================
        System.out.println("Edad de Ana: " + hashMap.get("Ana")); // 32

        // =========================================
        // 3. Comprobar existencia de clave o valor
        // =========================================
        System.out.println("Contiene clave 'Juan'? " + hashMap.containsKey("Juan"));
        System.out.println("Contiene valor 35? " + hashMap.containsValue(35));

        // =========================================
        // 4. Eliminar un par clave-valor
        // =========================================
        hashMap.remove("Luis");
        System.out.println("HashMap tras eliminar 'Luis': " + hashMap);

        // =========================================
        // 5. Iterar sobre claves, valores y entradas
        // =========================================
        System.out.println("\nIterando sobre claves:");
        for (String clave : hashMap.keySet()) {
            System.out.println(clave);
        }

        System.out.println("\nIterando sobre valores:");
        for (Integer valor : hashMap.values()) {
            System.out.println(valor);
        }

        System.out.println("\nIterando sobre entradas (clave-valor):");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // =========================================
        // 6. Crear un TreeMap
        // TreeMap: mantiene las claves ordenadas de forma natural (alfabética, numérica)
        // =========================================
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Juan", 25);
        treeMap.put("Ana", 30);
        treeMap.put("Luis", 35);

        System.out.println("\nTreeMap (ordenado por clave): " + treeMap);

        // =========================================
        // 7. Notas importantes sobre Map
        // =========================================
        // - No permite claves duplicadas (si se repite, se sobrescribe el valor)
        // - Valores sí pueden repetirse
        // - HashMap → rápido, sin orden
        // - TreeMap → ordena por clave, un poco más lento que HashMap
        // - Siempre se recomienda usar Map<K, V> como tipo genérico
    }
}