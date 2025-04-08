import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean aprobo(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
