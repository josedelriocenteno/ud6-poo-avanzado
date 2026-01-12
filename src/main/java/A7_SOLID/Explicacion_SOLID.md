# Explicacion_SOLID.md
# Los 5 principios SOLID explicados fácil (nivel profesional)

---

## Introducción a SOLID

SOLID es un acrónimo que agrupa **5 principios clave de diseño orientado a objetos**, creados por Robert C. Martin (“Uncle Bob”), que ayudan a escribir **código limpio, mantenible, escalable y flexible**.

- Aplicarlos evita **dependencias rígidas**, **código frágil** y **duplicación**.
- Muy útiles en proyectos grandes y en **arquitecturas profesionales** (como Spring, microservicios, librerías).

---

## S - Single Responsibility Principle (SRP)
**Principio de Responsabilidad Única**

> “Una clase debe tener **una y solo una razón para cambiar**.”

- Cada clase debe enfocarse en **una sola tarea o responsabilidad**.
- Ventaja: Cambios en un área no afectan a otras.

**Ejemplo práctico:**

```java
// MAL: mezcla lógica de negocio y persistencia
class Usuario {
    void guardarEnBaseDatos() { ... }
    void calcularEdad() { ... }
}

// BIEN: separar responsabilidades
class Usuario {
    private String nombre;
    private int edad;
    int calcularEdad() { ... }
}

class UsuarioRepository {
    void guardar(Usuario usuario) { ... }
}
```
---
# O - Open/Closed Principle (OCP)
#### Principio Abierto/Cerrado
> “Las entidades de software deben estar abiertas para extensión pero cerradas para modificación.”

- No se modifica código existente para añadir funcionalidad.
- Se crean subclases o implementaciones nuevas.

#### Ejemplo práctico:
```java
// MAL: se modifica clase original cada vez que agregamos un tipo
class CalculadoraDescuento {
    double calcular(Producto p) {
        if(p.tipo == "Normal") return p.precio * 0.9;
        if(p.tipo == "VIP") return p.precio * 0.8;
        return p.precio;
    }
}

// BIEN: usar polimorfismo (extensión)
interface Descuento {
    double aplicar(Producto p);
}

class DescuentoNormal implements Descuento {
    public double aplicar(Producto p) { return p.precio * 0.9; }
}

class DescuentoVIP implements Descuento {
    public double aplicar(Producto p) { return p.precio * 0.8; }
}
```
---
# L - Liskov Substitution Principle (LSP)
#### Principio de Sustitución de Liskov
> “Los objetos de una subclase deben poder sustituir a los de su clase base **sin alterar la correcta ejecución del programa.**”

- Las subclases deben mantener el contrato de la clase padre.
- Evita errores por herencia mal aplicada.

#### Ejemplo práctico:
```java
// MAL: rompe el contrato
class Ave {
    void volar() { ... }
}
class Pinguino extends Ave {
    void volar() { throw new UnsupportedOperationException(); }
}

// BIEN: separar jerarquías lógicas
interface Volador { void volar(); }
class Aguila implements Volador { ... }
class Pinguino { ... } // no implementa Volador
```
---
# I - Interface Segregation Principle (ISP)
#### Principio de Segregación de Interfaces
> “Las interfaces deben ser **pequeñas y específicas**, no obligar a implementar métodos que no se usan.”
#### Ejemplo práctico:
```java
// MAL: interface gigante
interface Trabajador {
    void trabajar();
    void comer();
    void dormir();
}

// BIEN: interfaces específicas
interface Trabajador {
    void trabajar();
}
interface Comedor {
    void comer();
}
interface Dormilón {
    void dormir();
}
```
---
# D - Dependency Inversion Principle (DIP)
#### Principio de Inversión de Dependencias
> “Depende de **abstracciones, no de implementaciones concretas**.”

- Evita acoplamientos fuertes.
- Permite inyectar dependencias (manual o frameworks como Spring).

#### Ejemplo práctico:
```java
// MAL: acoplamiento fuerte a implementación
class Servicio {
    private RepositorioMySQL repo = new RepositorioMySQL();
}

// BIEN: depender de interfaz (abstracción)
interface Repositorio { void guardar(Object obj); }

class Servicio {
    private Repositorio repo;
    public Servicio(Repositorio repo) {
        this.repo = repo; // inyección de dependencia
    }
}
```
---
# Resumen de SOLID
| Principio | Clave                                             |
| --------- | ------------------------------------------------- |
| S         | Una clase, una responsabilidad                    |
| O         | Extender sin modificar                            |
| L         | Subclases sustituyen a la base sin romper         |
| I         | Interfaces pequeñas y específicas                 |
| D         | Depender de abstracciones, no de implementaciones |

#### Beneficios al aplicar SOLID:

- Código más mantenible y testable
- Menor acoplamiento
- Más fácil de refactorizar y escalar
- Compatible con frameworks profesionales (Spring, JPA, etc.)