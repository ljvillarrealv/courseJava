package com.lvillarreal.pooherencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona(){

        System.out.println("Persona: Inicializando Constructor");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String email){
        this(nombre, apellido);
        this.edad = edad;
        this.email = email;
    }
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal";
    }

}
