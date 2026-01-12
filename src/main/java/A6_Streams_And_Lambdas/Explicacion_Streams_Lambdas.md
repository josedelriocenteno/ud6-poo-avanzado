# Explicacion_Streams_Lambdas.md

# Streams y Lambdas en Java – Apuntes claros

## 1. ¿Qué son los Streams?

Un **Stream** es una secuencia de elementos que permite procesar datos de forma **declarativa** y **funcional**.

- No almacenan datos por sí mismos, sino que operan sobre colecciones o arrays.
- Permiten operaciones como **filtrado**, **transformación**, **ordenación** y **reducción**.
- Facilitan el **procesamiento paralelo** de datos.

### Conceptos clave:

- Fuente de datos: lista, conjunto, array, etc.
- Operaciones intermedias: `filter()`, `map()`, `sorted()`
- Operaciones terminales: `forEach()`, `collect()`, `reduce()`

---

## 2. ¿Qué son las expresiones Lambda?

Las **expresiones lambda** son funciones anónimas que permiten escribir **código más conciso**.

**Sintaxis básica:**

```
(parametros) -> expresion
(parametros) -> { bloque de código }
```
- Permiten pasar comportamientos como parámetros a métodos.
- Facilitan implementar interfaces funcionales como Predicate, Function, Consumer.

---
# 3. Ejemplo práctico de Stream y Lambda
```java
import java.util.Arrays;
import java.util.List;

public class UsoStreams {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Manzana", "Banana", "Naranja", "Pera");

        // Recorrer e imprimir cada fruta usando Stream + Lambda
        frutas.stream()
              .forEach(fruta -> System.out.println(fruta));

        // Filtrar frutas que empiezan con 'B'
        frutas.stream()
              .filter(fruta -> fruta.startsWith("B"))
              .forEach(System.out::println);

        // Transformar a mayúsculas
        frutas.stream()
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}
```
---
# 4. Operaciones comunes en Streams
| Operación | Qué hace                                       |
| --------- | ---------------------------------------------- |
| `filter`  | Selecciona elementos que cumplen una condición |
| `map`     | Transforma elementos aplicando una función     |
| `sorted`  | Ordena los elementos                           |
| `collect` | Recoge los resultados en una colección         |
| `reduce`  | Combina elementos en un único valor            |

---
# 5. Referencias a métodos
Permiten usar métodos existentes sin escribir lambdas explícitas:
```java
frutas.stream()
      .forEach(System.out::println); // imprime cada fruta
```
---
# 6. Beneficios y resumen
- Procesamiento declarativo y funcional.
- Código más conciso y legible.
- Integración con interfaces funcionales (Predicate, Function, Consumer, Supplier).
- Ideal para manipular colecciones de manera eficiente.