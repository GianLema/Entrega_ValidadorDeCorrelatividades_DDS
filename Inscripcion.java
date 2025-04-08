import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribirse) {
        this.alumno = alumno;
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public List<Materia> getMateriasAInscribirse() {
        return materiasAInscribirse;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public boolean aprobada() {
        for (Materia materia : materiasAInscribirse) {
            for (Materia correlativa : materia.getCorrelativas()) {
                if (!alumno.aprobo(correlativa)) {
                    return false;
                }
            }
        }
        return true;
    }
}
