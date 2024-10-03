package com.lvillarreal.ejemplo;

import com.lvillarreal.pooherencia.Alumno;
import com.lvillarreal.pooherencia.AlumnoInternacional;
import com.lvillarreal.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println(" ======== Creando la instancia de la Clase Alumno === ");
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("VElas");
        alumno.setInstitucion("instituto nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.5);
        alumno.setNotaMatematica(9.0);


        System.out.println(" ======== Creando la instancia de la Clase Alumno Internacional === ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Juan");
        alumnoInt.setApellido("Paz");
        alumnoInt.setPais("Venezuela");
        alumnoInt.setEdad(18);
        alumnoInt.setInstitucion("intituto nacional");
        alumnoInt.setNotaCastellano(5.8);
        alumnoInt.setNotaCastellano(6.5);
        alumnoInt.setNotaMatematica(9.2);


        System.out.println(" ======== Creando la instancia de la clase profesor === ");
        Profesor profesor = new Profesor();
        profesor.setNombre("Pedro");
        profesor.setApellido("paraera");
        profesor.setAsignatura("Matematicas");

        System.out.println("===================== - =========");

        System.out.println(alumno.getNombre() +
                "  " + alumno.getApellido());

        System.out.println(alumnoInt.getNombre() +
                " " + alumnoInt.getApellido() +
                alumnoInt.getInstitucion() +
                " " + alumnoInt.getPais());

        System.out.println("Profesor "+ profesor.getAsignatura()+": "
                + profesor.getNombre() +" "+ profesor.getApellido());

        Class claseAlumnoInt = alumnoInt.getClass();
        while (claseAlumnoInt.getSuperclass() != null){

            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();
            System.out.println( "|||Es la clase Hija -> " +hija + " |||Es la clase padre -> " + padre);

            claseAlumnoInt = claseAlumnoInt.getSuperclass();

        }

    }
}
