package com.lvillarreal.ejemplo;

import com.lvillarreal.pooherencia.Alumno;
import com.lvillarreal.pooherencia.AlumnoInternacional;
import com.lvillarreal.pooherencia.Persona;
import com.lvillarreal.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println(" ======== Creando la instancia de la Clase Alumno === ");
        Alumno alumno = new Alumno("Andres","Veslasquez",41, "instituto nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.5);
        alumno.setNotaMatematica(9.0);
        alumno.setEmail("correo@prueba.com");


        System.out.println(" ======== Creando la instancia de la Clase Alumno Internacional === ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional(
                "Juan","Paz","Venezuela");
        alumnoInt.setEdad(18);
        alumnoInt.setInstitucion("intituto nacional");
        alumnoInt.setNotaCastellano(5.8);
        alumnoInt.setNotaCastellano(6.5);
        alumnoInt.setNotaMatematica(9.2);
        alumnoInt.setEmail("email@prueba.com");


        System.out.println(" ======== Creando la instancia de la clase profesor === ");
        Profesor profesor = new Profesor
                ("Pedro","Hernandez", "prueba@prueba.com","Matematicas");
        profesor.setEdad(18);



        System.out.println("============== - =========");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

        System.out.println(alumno.getNombre()
               + "  " + alumno.getApellido()
               + "  " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                + "  " + alumnoInt.getApellido()
                + "  " + alumnoInt.getInstitucion()
                + "  " + alumnoInt.getPais());

    }

    public static void imprimir (Persona persona){
        System.out.println("Imprimiendo los datos en comun del tipo personas: ");
        System.out.println("nombre: " + persona.getNombre()
                + " , Apellido: " + persona.getApellido()
                + " ,Edad: " + persona.getEdad()
                + " ,email: " + persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo alumno: ");
            System.out.println("institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematica: "+ ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if ( persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo alumno Internacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotasIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());

            }

        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo datos del tipo Profeson");
            System.out.println("Asignatura = " + ((Profesor) persona).getAsignatura());
        }

        System.out.println(" ======================================== " );
        System.out.println(persona.saludar());
        System.out.println(" ======================================== " );
      }
}
