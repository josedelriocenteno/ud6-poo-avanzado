// ColeccionGenerica.java
// Ejemplo de uso de colección genérica ArrayList y explicación detallada

package A4_Genericos;

import java.util.ArrayList;

public class ColeccionGenerica {
    public static void main(String[] args) {
        // Creamos una lista genérica que solo acepta String
        ArrayList<String> listaDeFrutas = new ArrayList<>();

        // Agregamos varios elementos a la lista
        listaDeFrutas.add("Manzana");
        listaDeFrutas.add("Plátano");
        listaDeFrutas.add("Naranja");
        listaDeFrutas.add("Pera");

        // Mostramos el contenido completo de la lista
        System.out.println("Lista de frutas: " + listaDeFrutas);

        // Usamos un bucle for-each para iterar y mostrar los elementos
        for (String fruta : listaDeFrutas) {
            System.out.println("Fruta: " + fruta);
        }

        // Accedemos a un elemento por índice (posición)
        System.out.println("Elemento en la posición 2: " + listaDeFrutas.get(2)); // "Naranja"

        // Eliminamos un elemento específico (por valor)
        listaDeFrutas.remove("Plátano");
        System.out.println("Lista después de eliminar Plátano: " + listaDeFrutas);

        // Comprobamos si la lista contiene un determinado elemento
        if (listaDeFrutas.contains("Manzana")) {
            System.out.println("La lista contiene Manzana.");
        }

        // Tamaño actual de la lista
        System.out.println("Número de frutas en la lista: " + listaDeFrutas.size());
    }
}