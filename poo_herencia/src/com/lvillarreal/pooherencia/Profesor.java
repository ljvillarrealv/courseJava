package com.lvillarreal.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor (String nombre, String apellido, String email){
        super(nombre, apellido, email);
        System.out.println("Profesor: inicializando constructor" );
    }

    public Profesor (String nombre, String apellido){
        super (nombre, apellido);
    }

     public Profesor (String nombre, String apellido, String email,String asignatura) {
        super(nombre, apellido, email);
        this.asignatura = asignatura;
    }

    public Profesor() {

    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias, soy el profesor de:"+getAsignatura()+"Mi nombre es: " + getNombre();
    }
}
