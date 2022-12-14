package Sofka;

import java.util.HashSet;
import java.util.Set;

public class Institucion {
    public static void main(String[] args) {

        Alumno alumno_1 = new Alumno("Federico", "Gandaria","19");
        Alumno alumno_2 = new Alumno("Mariana","Martinez","29");
        Alumno alumno_3 = new Alumno("Santiago","Rostan","07");


        //Nombre de la coleccion
        Set<Alumno> alumnosInstitucion = new HashSet<Alumno>();


        //Agregamos objetos tipo alumnos a la coleccion alumnosInstitucion
        alumnosInstitucion.add(alumno_1);
        alumnosInstitucion.add(alumno_2);
        alumnosInstitucion.add(alumno_3);

        for (Alumno alumnos: alumnosInstitucion) {
            System.out.println(alumnos.getNombre()+" "+ alumnos.getApellido() + " "+ "nota de: " + alumnos.getNota());
        }



    }
}