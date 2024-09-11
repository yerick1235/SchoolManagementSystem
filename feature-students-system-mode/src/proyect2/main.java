package proyect2;

public class main {
    public static void main(String[] args) {
        GestorAcademico gestor = new GestorAcademico();

        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", LocalDate.of(2000, 1, 1), "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Ana", "Gomez", LocalDate.of(2001, 2, 2), "matriculado");

        Curso curso1 = new Curso(1, "Matemáticas", "Curso de matemáticas básicas", 3, "1.0");
        Curso curso2 = new Curso(2, "Historia", "Curso de historia mundial", 2, "1.0");

        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);

        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        try {
            gestor.inscribirEstudianteCurso(estudiante1, 1);
            gestor.inscribirEstudianteCurso(estudiante2, 2);
        } catch (EstudianteYaInscritoException e) {
            e.printStackTrace();
        }
    }
}
