# ResumenPOOAvanzado.md
# Resumen completo de POO Avanzado en Java

Este documento resume los conceptos y buenas prácticas de POO avanzada que hemos visto en el Tema6.

---

## 1. Interfaces

- **Qué son:** contratos que definen qué métodos debe implementar una clase.
- **Uso:** permiten polimorfismo, desacoplamiento y flexibilidad.
- **Características:**
    - Todos los métodos son `abstract` por defecto (Java <8).
    - Desde Java 8, pueden tener `default` y `static`.
    - No pueden tener atributos de instancia, solo constantes (`public static final`).
- **Ejemplo:**
  ```java
  interface Vehiculo {
      void arrancar();
      void frenar();
  }
  class Coche implements Vehiculo {
      public void arrancar() { System.out.println("Coche arrancando"); }
      public void frenar() { System.out.println("Coche frenando"); }
  }
### Ventajas:
- Permiten que clases diferentes implementen la misma interfaz con distinta lógica.
- Facilitan polimorfismo: Vehiculo v = new Coche(); v.arrancar();
---
# 2. Clases abstractas
- **Qué son:** clases que pueden tener métodos abstractos y métodos concretos.
- **Diferencia con interfaces:** pueden tener atributos de instancia y lógica compartida.
- **Ejemplo:**
```java
abstract class Animal {
    abstract void hacerSonido();
    void dormir() { System.out.println("Durmiendo"); }
}
class Perro extends Animal {
    void hacerSonido() { System.out.println("Ladra"); }
}
```
- **Regla:** se usan cuando varias clases comparten comportamiento, pero algunos métodos deben implementarse de manera específica.
---
# 3. Excepciones
- **Try-catch-finally:** para capturar y manejar errores.
- **Throws:** indica que un método puede lanzar una excepción.
- **Excepciones personalizadas:** permiten controlar reglas de negocio específicas.
- **Ejemplo:**
```java
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String msg) { super(msg); }
}
void setEdad(int edad) throws EdadInvalidaException {
    if(edad<0) throw new EdadInvalidaException("Edad negativa");
}
```
- **Buenas prácticas:**
  - Usar excepciones específicas.
  - Validar siempre entradas y estados.
---
# 4. Genéricos
- **Qué son:** permiten crear clases, interfaces y métodos que funcionan con cualquier tipo.
- **Sintaxis:** <T>, <K,V>.
- **Ejemplo:**
```java
class Caja<T> {
    private T contenido;
    public void set(T contenido) { this.contenido = contenido; }
    public T get() { return contenido; }
}
Caja<String> caja = new Caja<>();
caja.set("Hola");
String valor = caja.get();
```
- **Beneficio:** seguridad de tipos en tiempo de compilación y reutilización.
---
# 5. Colecciones y API de Java
