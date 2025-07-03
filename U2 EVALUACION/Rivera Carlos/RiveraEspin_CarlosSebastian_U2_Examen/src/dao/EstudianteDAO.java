package dao;

import java.util.ArrayList;
import java.util.List;
import model.Estudiante;

/**
 * Clase DAO que gestiona la persistencia simulada de estudiantes.
 */
public class EstudianteDAO {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    public Estudiante buscarEstudiantePorId(int id) {
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public boolean actualizarEstudiante(Estudiante estudianteActualizado) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId() == estudianteActualizado.getId()) {
                estudiantes.set(i, estudianteActualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(int id) {
        return estudiantes.removeIf(e -> e.getId() == id);
    }
}
