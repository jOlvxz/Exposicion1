
public class Main {
    public static void main(String[] args) {

        Profesor pablo = new Profesor("10323434-4", "Pablo", "Moraga");
        Alumno jean = new Alumno("10834020-4", "Jean", "Olivares");
        Apoderado guts = new Apoderado ("12376123-2", "holi", "ajskd");


        pablo.poblarCurso("1B", jean);
        pablo.agregarAsignaturas("1B", "Matematicas", "Lenguaje");
        pablo.agregarNotas("1B", "Jean", "Olivares", "Matematicas", 7.0);
        pablo.verNotas("1B", "Jean", "Olivares");
        pablo.asignarApoderado(guts, "1B", "Jean", "Olivares");
        guts.verNotas();




    }
}