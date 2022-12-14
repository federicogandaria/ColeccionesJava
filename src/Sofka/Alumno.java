package Sofka;

public class Alumno {

    private  String nombre;
    private  String apellido;
    private  String nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, String apellido, String nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

}