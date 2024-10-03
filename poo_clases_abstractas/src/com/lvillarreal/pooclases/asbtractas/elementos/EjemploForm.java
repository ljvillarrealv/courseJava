package com.lvillarreal.pooclases.asbtractas.elementos;

import com.lvillarreal.pooclases.asbtractas.elementos.select.Option;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

inputForm username = new inputForm("username");
inputForm password = new inputForm("clave", "password");
inputForm email = new inputForm("email", "email");
inputForm edad = new inputForm("edad","number");


TextareaForm experiencia = new TextareaForm("exp", 5, 9);

SelectForm lenguaje = new SelectForm("lenguaje");

        Option java = new Option("1", "java");
        Option typeScript = new Option ("4","typeScript");
        lenguaje.addOption(java);
        lenguaje.addOption(new Option("2","Python"));
        lenguaje.addOption(new Option("3","javaScript"));
        lenguaje.addOption(typeScript);
        lenguaje.addOption(new Option("5","PHP"));
        lenguaje.addOption(new Option("6","C#"));

        elementoForm saludar = new elementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\"" +this.valor+ "\">";
            }
        };
        saludar.setValor("Hola que tal este campo está deshabilitado");
        username.setValor("jhon.doe");
        password.setValor("123456");
        email.setValor("jhon.dow@gmail.com");
        edad.setValor("29");
        experiencia.setValor("... más de 10 años de experiencia..");

        /*java.setSelected(true);*/
        typeScript.setSelected(true);

            List <elementoForm> elementos = new ArrayList<>();

            elementos.add(username);
            elementos.add(password);
            elementos.add(email);
            elementos.add(edad);
            elementos.add(experiencia);
            elementos.add(lenguaje);
            elementos.add(saludar);


            for (elementoForm e: elementos ){
                    System.out.println(e.dibujarHtml());
            }

    }
}
