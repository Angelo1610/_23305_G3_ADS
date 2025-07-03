package ui;

import controller.EstudianteController;
import model.Estudiante;
import java.util.List;

/**
 * Vista: crea y muestra estudiantes con datos quemados.
 */
public class Main {
    public static void main(String[] args) {
        EstudianteController controller = new EstudianteController();

        // Agregar estudiantes con datos quemados
        controller.crearEstudiante(1, "Pérez", "Juan", 20);
        controller.crearEstudiante(2, "Gómez", "María", 22);
        controller.crearEstudiante(3, "López", "Carlos", 19);

        // Mostrar todos los estudiantes
        System.out.println("=== LISTADO DE ESTUDIANTES ===");
        List<Estudiante> estudiantes = controller.obtenerEstudiantes();
        for (Estudiante e : estudiantes) {
            System.out.printf("ID: %d | %s %s | Edad: %d%n",
                    e.getId(), e.getApellidos(), e.getNombres(), e.getEdad());
        }

        // Ejemplo de actualización
        controller.actualizarEstudiante(2, "Gómez", "María Fernanda", 23);
        System.out.println("\nEstudiante con ID 2 actualizado.");

        // Ejemplo de eliminación
        controller.eliminarEstudiante(1);
        System.out.println("Estudiante con ID 1 eliminado.\n");

        // Mostrar el listado final
        System.out.println("=== LISTADO FINAL ===");
        for (Estudiante e : controller.obtenerEstudiantes()) {
            System.out.printf("ID: %d | %s %s | Edad: %d%n",
                    e.getId(), e.getApellidos(), e.getNombres(), e.getEdad());
        }
    }
}
