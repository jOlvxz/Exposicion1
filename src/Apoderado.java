public class Apoderado extends  Usuario{

    public Alumno alumnoACargo ;


    public Apoderado(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
        this.esFuncionario = false;
    }



    public void verNotas(){
        System.out.println(alumnoACargo.nombre + " " + alumnoACargo.apellido );
        System.out.println(alumnoACargo.getNotas());
    }



}
