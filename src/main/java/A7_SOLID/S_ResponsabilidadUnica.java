package A7_SOLID;

// S_ResponsabilidadUnica.java
// Ejemplo del Principio de Responsabilidad Única (SRP)
// Mostrando MAL vs BIEN a nivel profesional

import java.util.ArrayList;
import java.util.List;

// ============================================================
// MAL: Una clase con múltiples responsabilidades
// ============================================================
class ReporteMAL {
    private List<String> datos = new ArrayList<>();

    // 1) Responsabilidad de agregar datos
    public void agregarDato(String dato) {
        datos.add(dato);
    }

    // 2) Responsabilidad de generar reporte
    public void generarPDF() {
        System.out.println("Generando PDF con los datos: " + datos);
        // Aquí ya hay lógica específica de PDF (mezclada con datos)
    }

    // 3) Responsabilidad de guardar reporte
    public void guardarEnBaseDatos() {
        System.out.println("Guardando reporte en base de datos: " + datos);
    }
}

// Problemas:
// - Mezcla tres responsabilidades: datos, presentación, persistencia
// - Cambiar la forma de guardar o generar PDF afectará la clase
// - Difícil de testear y mantener

// ============================================================
// BIEN: Separando responsabilidades en clases distintas
// ============================================================

// Clase enfocada SOLO en almacenar datos
class Reporte {
    private List<String> datos = new ArrayList<>();

    public void agregarDato(String dato) {
        datos.add(dato);
    }

    public List<String> getDatos() {
        return new ArrayList<>(datos); // Defensive copy
    }
}

// Clase enfocada SOLO en generar reportes (presentación)
class GeneradorPDF {
    public void generarPDF(Reporte reporte) {
        System.out.println("Generando PDF con los datos: " + reporte.getDatos());
    }
}

// Clase enfocada SOLO en persistencia
class ReporteRepository {
    public void guardarEnBaseDatos(Reporte reporte) {
        System.out.println("Guardando reporte en base de datos: " + reporte.getDatos());
    }
}

// ============================================================
// USO REAL
// ============================================================
public class S_ResponsabilidadUnica {
    public static void main(String[] args) {
        // Crear reporte y agregar datos
        Reporte reporte = new Reporte();
        reporte.agregarDato("Dato 1");
        reporte.agregarDato("Dato 2");

        // Generar PDF usando la clase específica
        GeneradorPDF generador = new GeneradorPDF();
        generador.generarPDF(reporte);

        // Guardar en base de datos usando la clase específica
        ReporteRepository repo = new ReporteRepository();
        repo.guardarEnBaseDatos(reporte);
    }
}

// Beneficios de aplicar SRP:
// ✔ Cada clase tiene una única responsabilidad
// ✔ Más fácil de testear
// ✔ Más fácil de mantener y escalar
// ✔ Cambios en una responsabilidad no afectan a otras