# Explicacion_Genericos.md

# Introducción y ejemplos conceptuales de genéricos en Java

## ¿Qué son los genéricos?

Los **genéricos** en Java permiten definir clases, interfaces y métodos que operan sobre tipos de datos parametrizados, es decir, que funcionan con diferentes tipos sin necesidad de definir un tipo específico en el momento de escribir el código.

- Los genéricos ayudan a escribir código **más flexible**, **reutilizable** y con **seguridad de tipo** en tiempo de compilación.
- Evitan errores comunes al eliminar la necesidad de casteos explícitos.
- Se usan en muchas librerías, como las colecciones (`ArrayList<T>`, `HashMap<K,V>`, etc.).

---

## Definición de clase genérica

Se declara una clase genérica con un parámetro de tipo entre los símbolos `<T>`, donde `T` es una convención que indica un tipo genérico (puede usarse cualquier letra).

```java
// Clase genérica simple con un parámetro de tipo T
public class ClaseGenerica<T> {
    private T objeto; // Atributo de tipo genérico
    
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
```
---

## Usando una clase genérica
```java
public class UsoGenericos {
    public static void main(String[] args) {
        // Instancia con tipo String
        ClaseGenerica<String> cadena = new ClaseGenerica<>("Hola mundo");
        System.out.println(cadena.getObjeto());
        
        // Instancia con tipo Integer
        ClaseGenerica<Integer> numero = new ClaseGenerica<>(100);
        System.out.println(numero.getObjeto());
    }
}
```
---

## Colecciones genéricas

Las colecciones en Java usan extensivamente genéricos para especificar el tipo de elementos que almacenan, facilitando el manejo seguro de datos.

```java
import java.util.ArrayList;

public class ColeccionGenerica {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        
        // No es necesario realizar cast explícito
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
}
```
---

## Resumen:

- Los genéricos aumentan la flexibilidad del código permitiendo operar con diferentes tipos.
- Mejoran la seguridad y legibilidad evitando casteos innecesarios.
- Se aplican a clases, interfaces y métodos.
- Facilitan el trabajo con colecciones y estructuras de datos.

---