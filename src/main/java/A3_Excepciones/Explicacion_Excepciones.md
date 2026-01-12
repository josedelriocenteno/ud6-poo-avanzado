# Explicacion_Excepciones.md

# Explicación de jerarquía y manejo de excepciones en Java

## ¿Qué es una excepción?

Una **excepción** es una condición anómala que ocurre durante la ejecución de un programa y que interrumpe el flujo normal de instrucciones.

- Cuando se produce una excepción, el programa “lanza” un objeto que representa dicho evento.
- El manejo adecuado de excepciones es fundamental para que el programa pueda recuperarse o finalizar ordenadamente.

---

## Jerarquía de excepciones en Java

En Java, todas las excepciones derivan de la clase base `Throwable`.

De esta clase heredan dos subclases principales:

- **Error:** Representa errores graves que generalmente no deben ser capturados, como errores de hardware o fallo de la JVM.
- **Exception:** Representa condiciones excepcionales que un programa puede manejar.

Dentro de `Exception` hay dos categorías:

1. **Excepciones comprobadas (checked exceptions):** Deben ser declaradas o capturadas (por ejemplo, `IOException`).
2. **Excepciones no comprobadas (unchecked exceptions):** Son subclases de `RuntimeException` y no es obligatorio capturarlas (por ejemplo, `NullPointerException`).

---

## Manejo básico de excepciones

La estructura típica de manejo de excepciones usa las palabras clave:

- `try`: Bloque de código donde se puede generar una excepción.
- `catch`: Bloque que captura y maneja una o más excepciones.
- `finally`: Bloque opcional que siempre se ejecuta, haya o no excepción.

```java
try {
    // Código que puede lanzar una excepción
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
} finally {
    System.out.println("Bloque finally siempre se ejecuta");
}
```
---

## Propagación y lanzamiento de excepciones

- Una excepción puede ser “lanzada” explícitamente con `throw`.
- Puede ser “propagada” usando la cláusula `throws` en la firma del método para indicar que debe manejarlas el código que la llame.

```java
public void metodo() throws IOException {
    // Código que puede lanzar IOException
    throw new IOException("Error de archivo");
}
```

---

## Resumen:

- Las excepciones permiten manejar errores o condiciones anómalas en ejecución.
- Java ofrece una jerarquía organizada para clasificar diferentes tipos.
- El manejo correcto usa bloques try-catch-finally.
- Se pueden crear excepciones personalizadas para casos específicos.

---