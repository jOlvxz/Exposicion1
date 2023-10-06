import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Usuario implements IUsuario{

    public String rut;
    public String nombre;
    public String apellido;
    public boolean esFuncionario;
    public Usuario(String rut, String nombre, String apellido){
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public void poblarCurso() {
    }

    @Override
    public void agregarAsignaturas() {

    }

    @Override
    public void agregarNotas() {

    }

    @Override
    public void verNotas() {

    }

    @Override
    public void asignarApoderado() {

    }
}
