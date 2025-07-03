package controller;

import dao.EstudianteDAO;
import model.Estudiante;
import java.util.List;

/**
 * Clase Controller: gestiona la lógica de negocio de Estudiante.
 */
public class EstudianteController {
    private EstudianteDAO dao = new EstudianteDAO();

    public void crearEstudiante(int id, String apellidos, String nombres, int edad) {
        Estudiante estudiante = new Estudiante(id, apellidos, nombres, edad);
        dao.agregarEstudiante(estudiante);
    }

    public List<Estudiante> obtenerEstudiantes() {
        return dao.listarEstudiantes();
    }

    public Estudiante buscarEstudiantePorId(int id) {
        return dao.buscarEstudiantePorId(id);
    }

    public boolean actualizarEstudiante(int id, String apellidos, String nombres, int edad) {
        Estudiante estudiante = new Estudiante(id, apellidos, nombres, edad);
        return dao.actualizarEstudiante(estudiante);
    }

    public boolean eliminarEstudiante(int id) {
        return dao.eliminarEstudiante(id);
    }
}
