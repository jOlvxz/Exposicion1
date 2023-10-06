import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Profesor extends Usuario{
    public Map<String, ArrayList<Alumno>> cursos;
    public Profesor(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
        this.esFuncionario = true;
        cursos = new HashMap<>();
    }




    public void poblarCurso(String nombreCurso,Alumno... alumnos){
        // Si existe la Key nombreCurso en el maps Cursos agrega los alumnos al curso existente.
        if(cursos.containsKey(nombreCurso)){
            for(Alumno alumno : alumnos){
                cursos.get(nombreCurso).add(alumno);
                // Agrega el nombreCurso al atributo curso del objeto Alumno
                alumno.curso = nombreCurso;
            }
            // Si no existe el curso agrega un nuevo curso al Maps cursos con la lista de alumnos asignada
        }else {
            ArrayList<Alumno> listaDeAlumnos = new ArrayList<>();
            for (Alumno alumno : alumnos) {
                listaDeAlumnos.add(alumno);
                // Agrega el nombreCurso al atributo curso del objeto Alumno
                alumno.curso = nombreCurso;
            }
            cursos.put(nombreCurso, listaDeAlumnos);
        }
    }

    public void agregarAsignaturas(String nombreDelCurso, String... asignaturas){
        // Declaro una listaNueva para trabajar con los estudiantes del curso segun el parametro nombreDelCurso
        ArrayList<Alumno> alumnosPorCurso = cursos.get(nombreDelCurso);
        for(Alumno alumno: alumnosPorCurso){
            for(String asignatura: asignaturas){
                alumno.getAsignaturas().add(asignatura);
                // Lleno los campos del maps "notas" del objeto alumno con una Array vacio
                alumno.getNotas().put(asignatura, new ArrayList<>());

            }
        }
    }

    public void agregarNotas(String nombreDelCurso, String nombreDelAlumno,String apellidoDelAlumno, String nombreAsignatura, double nota){
        ArrayList<Alumno> curso = cursos.get(nombreDelCurso);
        for(Alumno alumno: curso){
            if(alumno.nombre.equalsIgnoreCase(nombreDelAlumno) && alumno.apellido.equalsIgnoreCase(apellidoDelAlumno)){
                alumno.getNotas().get(nombreAsignatura).add(nota);
            }
        }
    }

    public void verNotas(String nombreDelCurso, String nombreDelAlumno, String apellidoDelAlumno){
        ArrayList<Alumno> curso = cursos.get(nombreDelCurso);
        for(Alumno alumno : curso){
            if(alumno.nombre.equalsIgnoreCase(nombreDelAlumno) && alumno.apellido.equalsIgnoreCase(apellidoDelAlumno)){
                System.out.println(alumno.getNotas());
            }
        }
    }

    public void asignarApoderado(Apoderado apoderado, String nombreDelCurso, String nombreDelAlumno, String apellidoDelAlumno){
        ArrayList<Alumno> curso = cursos.get(nombreDelCurso);
        for(Alumno alumno: curso){
            if(alumno.nombre.equalsIgnoreCase(nombreDelAlumno) && alumno.apellido.equalsIgnoreCase(apellidoDelAlumno)){
                // Agrego el objeto alumno al atributo AlumnoACargo del objeto apoderado
                apoderado.alumnoACargo = alumno;
                // Agrego el objeto apoderado al atributo apoderado del objeto alumno
                alumno.apoderado = apoderado;
            }
        }
    }



}


