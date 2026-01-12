# Explicacion_ClasesAbstractas.md

# Explicación de Clases Abstractas en Java

## ¿Qué es una clase abstracta?

Una **clase abstracta** en Java es una clase que **no se puede instanciar directamente**; es decir, no puedes crear objetos a partir de ella. Su propósito es servir como base para otras clases (subclases) que sí pueden ser instanciadas.

- Puede contener métodos con implementación (métodos concretos) y métodos sin implementación (métodos abstractos).
- Las subclases que heredan de una clase abstracta deben proporcionar implementaciones para todos los métodos abstractos, a menos que también sean abstractas.

> Una clase abstracta es un "esqueleto" o plantilla para crear otras clases más específicas.

---

## Características principales

- Se declara usando la palabra clave `abstract` antes de `class`.
- Puede tener:
    - **Atributos** y **constructores** normales.
    - **Métodos concretos** con código implementado.
    - **Métodos abstractos** (sin cuerpo, solo firma), que obligan a sus subclases a implementarlos.
- No se puede crear una instancia directa de una clase abstracta.
- Facilita la reutilización de código común y define un contrato parcial para las subclases.

---

## ¿Por qué usar clases abstractas?

- Para definir una base común con funcionalidad compartida entre varias clases.
- Para dejar que las subclases definan comportamientos específicos.
- Para evitar la duplicación de código.
- Para garantizar que las subclases implementen ciertos métodos cruciales (métodos abstractos).

---

## Cómo crear una clase abstracta

**Ejemplo básico de una clase abstracta:**

```java
// Clase abstracta llamada Figura
public abstract class Figura {
    private String color;
    
    // Constructor para inicializar color
    public Figura(String color) {
    this.color = color;
    }

    // Método concreto para obtener el color
    public String getColor() {
        return color;
    }

    // Método abstracto – las subclases deberán implementarlo
    public abstract double calcularArea();
}
```

---

## Clases concretas que extienden la clase abstracta

```java
// Clase que representa un círculo, hereda de Figura
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    // Implementación específica del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```
undefined
```java
// Clase que representa un rectángulo, hereda de Figura
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }   

    // Implementación específica del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
```
---

## Uso polimórfico de clases abstractas

```java
public class UsoFiguras {
    public static void main(String[] args) {
        // Creamos objetos de clases concretas usando referencias del tipo clase abstracta
        Figura c = new Circulo("Rojo", 5);
        Figura r = new Rectangulo("Azul", 4, 7);
        // Llamamos método calculoArea(), que es implementado según la clase concreta del objeto
        System.out.println("Área círculo: " + c.calcularArea());
        System.out.println("Color círculo: " + c.getColor());
        System.out.println("Área rectángulo: " + r.calcularArea());
        System.out.println("Color rectángulo: " + r.getColor());
    }
}
```
---

## Resumen:

- Las clases abstractas son plantillas incompletas que definen comportamientos comunes.
- Contienen métodos abstractos que obligan a ser implementados por las subclases.
- Permiten reutilizar código y facilitar el polimorfismo.
- No se pueden instanciar directamente, pero sí sus subclases concretas.

---