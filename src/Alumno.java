import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno extends Usuario{
    private ArrayList<String> asignaturas;
    private Map<String, ArrayList<Double>> notas;
    public String curso;
    public Apoderado apoderado;

    public Alumno(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
        esFuncionario = false;
        notas = new HashMap<>();
        asignaturas = new ArrayList<>();
    }

    public Map<String, ArrayList<Double>> getNotas() {
        return notas;
    }

    public ArrayList<String> getAsignaturas(){
        return asignaturas;
    }
    public void setNotas(Map<String, ArrayList<Double>> notas) {
        this.notas = notas;
    }


    public void verNotas(){
        System.out.println(this.notas);
    }
}
