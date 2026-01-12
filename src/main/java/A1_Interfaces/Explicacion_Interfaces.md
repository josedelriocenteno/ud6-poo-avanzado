# Explicacion_Interfaces.md

# Explicación de Interfaces en Java

## ¿Qué es una interfaz?

Una **interfaz** en Java es un **contrato** que define un conjunto de métodos que una clase debe implementar. No contiene implementación de esos métodos, solo sus firmas (nombre, parámetros y tipo de retorno).

> Es como una lista de obligaciones que una clase debe cumplir, pero sin decir cómo hacerlo.

## Características principales

- Se declara con la palabra clave `interface`.
- Puede contener:
    - **Métodos abstractos**: sin cuerpo, obligatorios implementar.
    - **Métodos default**: con implementación, opcional.
    - **Constantes**: implícitamente `public static final`.
    - **Métodos estáticos** (desde Java 8).

- Las clases implementan una interfaz usando `implements`, comprometiéndose a definir todos los métodos abstractos.

### ¿Por qué usar interfaces?

- Promueven **reutilización** y **flexibilidad**.
- Permiten **polimorfismo**: diferentes clases pueden ser tratadas de forma común.
- Facilitan la **abstracción**: enfocarse en qué hace una clase, no en cómo lo hace.
- Soportan **herencia múltiple de comportamiento**, ya que una clase puede implementar varias interfaces.

---

## Cómo crear una interfaz

**Ejemplo de declaración:**
``` java
// Declaración de una interfaz llamada Reproductor
public interface Reproductor {
    // Método sin implementación: contrato para reproducir algo
    void reproducir();

    // Método sin implementación: contrato para pausar
    void pausar();
}
```

**Implementación en una clase:**
```java
// Clase Musica que implementa la interfaz Reproductor
public class Musica implements Reproductor {

    // Debemos implementar todos los métodos declarados en la interfaz
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
}
```

**Uso polimórfico:**
```java
public class UsoInterfaces {
    public static void main(String[] args) {
    
    // Referencia a la interfaz, puede apuntar a cualquier clase que la implemente
    Reproductor miMusica = new Musica();
    
    // Llamada a los métodos definidos en la interfaz, ejecutando implementación concreta
    miMusica.reproducir();
    miMusica.pausar();
    }
}
```
---

## Múltiples interfaces

Una clase puede implementar varias interfaces:
```java
// Interface que define el comportamiento de volar
interface Volador {
    void volar();
}

// Interface que define el comportamiento de nadar
interface Nadador {
    void nadar();
}

// Clase que implementa múltiples interfaces
public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }
    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }
}
```
---

## Métodos `default` y `static` en interfaces

Desde Java 8 se permiten métodos con implementación:
```java
public interface Vehiculo {
    void conducir(); // método abtracto
    default void marcar() {
        System.out.println("Marcando desde interfaz");
    }

    static void mensajeEstatico() {
        System.out.println("Método estático en interfaz");
    }
}
```
---

## Resumen:

- Las interfaces definen **contratos** o **protocolos**.
- Permiten **herencia múltiple de tipo**.
- Las clases **deben implementar** todos los métodos abstractos.
- Son fundamentales para escribir código **flexible** y **modular**.

---