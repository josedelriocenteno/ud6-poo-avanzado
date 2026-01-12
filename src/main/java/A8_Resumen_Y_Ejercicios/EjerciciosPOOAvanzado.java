// EjerciciosPOOAvanzado.java
// Ejercicio maestro de POO Avanzado
// Aplica absolutamente todo lo visto en Tema5 y Tema6
// Nivel DAM profesional

package A8_Resumen_Y_Ejercicios;

import java.util.*;
import java.util.stream.Collectors;

// ============================================================
// 1. Interfaces: contratos que las clases deben cumplir
// ============================================================
interface Imprimible {
    void imprimir(); // Cualquier clase que implemente esto debe poder imprimirse
}

interface Calculable {
    double calcular(); // Contrato para calcular algún valor
}

// ============================================================
// 2. Clases abstractas: base para herencia
// ============================================================
abstract class Persona implements Imprimible {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("Nombre vacío");
        this.nombre = nombre;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if(edad < 0 || edad > 120) throw new IllegalArgumentException("Edad inválida");
        this.edad = edad;
    }

    // Método abstracto: cada subclase debe implementar su forma de "actividad"
    public abstract void actividad();

    @Override
    public void imprimir() {
        System.out.println("Persona: " + nombre + ", Edad: " + edad);
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}

// ============================================================
// 3. Herencia y Polimorfismo
// ============================================================
class Empleado extends Persona implements Calculable {
    private double salario;
    private String departamento;

    public Empleado(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad);
        setSalario(salario);
        this.departamento = departamento;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if(salario < 0) throw new IllegalArgumentException("Salario negativo");
        this.salario = salario;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public void actividad() {
        System.out.println(getNombre() + " trabaja en el departamento de " + departamento);
    }

    @Override
    public void imprimir() {
        System.out.println("Empleado: " + getNombre() + ", Edad: " + getEdad() +
                ", Salario: " + salario + ", Departamento: " + departamento);
    }

    @Override
    public double calcular() {
        // Calcula bono de empleado
        return salario * 0.1;
    }
}

class Estudiante extends Persona implements Calculable {
    private String curso;
    private List<Integer> notas;

    public Estudiante(String nombre, int edad, String curso, List<Integer> notas) {
        super(nombre, edad);
        this.curso = curso;
        this.notas = new ArrayList<>(notas);
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public List<Integer> getNotas() { return notas; }

    @Override
    public void actividad() {
        System.out.println(getNombre() + " estudia " + curso);
    }

    @Override
    public void imprimir() {
        System.out.println("Estudiante: " + getNombre() + ", Edad: " + getEdad() +
                ", Curso: " + curso + ", Notas: " + notas);
    }

    @Override
    public double calcular() {
        // Calcula promedio
        return notas.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}

// ============================================================
// 4. Genéricos
// ============================================================
class Caja<T extends Persona> {
    private List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) { elementos.add(elemento); }
    public List<T> getElementos() { return elementos; }

    public void imprimirTodos() {
        elementos.forEach(T::imprimir);
    }

    public List<T> filtrarPorEdad(int edadMinima) {
        return elementos.stream()
                .filter(e -> e.getEdad() >= edadMinima)
                .collect(Collectors.toList());
    }
}

// ============================================================
// 5. Colecciones avanzadas
// ============================================================
class Universidad {
    private Map<String, Estudiante> estudiantes = new HashMap<>();
    private Set<String> cursos = new HashSet<>();

    public void agregarEstudiante(Estudiante s) {
        estudiantes.put(s.getNombre(), s);
        cursos.add(s.getCurso());
    }

    public void listarEstudiantes() {
        System.out.println("Lista de estudiantes:");
        estudiantes.values().forEach(Estudiante::imprimir);
    }

    public void listarCursos() {
        System.out.println("Cursos disponibles:");
        cursos.forEach(System.out::println);
    }

    public Optional<Estudiante> buscarEstudiante(String nombre) {
        return Optional.ofNullable(estudiantes.get(nombre));
    }
}

// ============================================================
// 6. Streams y Lambdas
// ============================================================
class Academia {
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona p) { personas.add(p); }

    public void mostrarPersonasConEdadMayorA(int edad) {
        personas.stream()
                .filter(p -> p.getEdad() > edad)
                .forEach(Persona::imprimir);
    }

    public double promedioBonos() {
        return personas.stream()
                .filter(p -> p instanceof Calculable)
                .mapToDouble(p -> ((Calculable) p).calcular())
                .average()
                .orElse(0.0);
    }
}

// ============================================================
// 7. Excepciones personalizadas
// ============================================================
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String msg) { super(msg); }
}

// ============================================================
// 8. Principios SOLID aplicados
// ============================================================

// S: Responsabilidad Única
class Reporte {
    private List<Persona> personas;
    public Reporte(List<Persona> personas) { this.personas = personas; }
    public void generar() { personas.forEach(Persona::imprimir); }
}

// O: Abierto/Cerrado
abstract class Descuento {
    public abstract double aplicar(double precio);
}
class DescuentoFijo extends Descuento {
    private double cantidad;
    public DescuentoFijo(double cantidad) { this.cantidad = cantidad; }
    @Override
    public double aplicar(double precio) { return precio - cantidad; }
}

// L: Sustitución de Liskov
class Vehiculo { public void conducir() { System.out.println("Conduciendo vehículo"); } }
class Coche extends Vehiculo { @Override public void conducir() { System.out.println("Conduciendo coche"); } }

// I: Segregación de Interfaces
interface Volador { void volar(); }
interface Nadador { void nadar(); }
class Pato implements Volador, Nadador {
    public void volar() { System.out.println("Pato volando"); }
    public void nadar() { System.out.println("Pato nadando"); }
}

// D: Inversión de Dependencias
interface Motor { void arrancar(); }
class MotorElectrico implements Motor { public void arrancar() { System.out.println("Motor eléctrico arrancando"); } }
class Auto {
    private Motor motor;
    public Auto(Motor motor) { this.motor = motor; }
    public void conducir() { motor.arrancar(); }
}

// ============================================================
// 9. Uso completo y pruebas
// ============================================================
public class EjerciciosPOOAvanzado {
    public static void main(String[] args) {
        // Crear objetos
        Empleado emp1 = new Empleado("Juan", 30, 2000, "TI");
        Empleado emp2 = new Empleado("Ana", 40, 3000, "RRHH");
        Estudiante est1 = new Estudiante("Luis", 20, "DAM", Arrays.asList(7,8,9));
        Estudiante est2 = new Estudiante("Marta", 22, "DAW", Arrays.asList(6,9,10));

        // Caja genérica
        Caja<Persona> caja = new Caja<>();
        caja.agregar(emp1);
        caja.agregar(emp2);
        caja.agregar(est1);
        caja.agregar(est2);

        System.out.println("\n--- Imprimir todos desde Caja ---");
        caja.imprimirTodos();

        System.out.println("\n--- Filtrar por edad >= 30 ---");
        caja.filtrarPorEdad(30).forEach(Persona::imprimir);

        // Universidad (colecciones)
        Universidad uni = new Universidad();
        uni.agregarEstudiante(est1);
        uni.agregarEstudiante(est2);
        uni.listarEstudiantes();
        uni.listarCursos();

        // Streams y Lambdas
        Academia academia = new Academia();
        academia.agregarPersona(emp1);
        academia.agregarPersona(emp2);
        academia.agregarPersona(est1);
        academia.agregarPersona(est2);

        System.out.println("\n--- Personas con edad mayor a 25 ---");
        academia.mostrarPersonasConEdadMayorA(25);

        System.out.println("\nPromedio de bonos: " + academia.promedioBonos());

        // SOLID
        Auto auto = new Auto(new MotorElectrico());
        System.out.println("\n--- Conducir auto con DIP ---");
        auto.conducir();

        Pato pato = new Pato();
        pato.volar();
        pato.nadar();

        Descuento desc = new DescuentoFijo(50);
        System.out.println("Precio con descuento: " + desc.aplicar(500));

        Reporte reporte = new Reporte(Arrays.asList(emp1, emp2, est1, est2));
        System.out.println("\n--- Generar reporte ---");
        reporte.generar();

        // Excepciones
        try {
            emp1.setEdad(-5); // IllegalArgumentException
        } catch(IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}