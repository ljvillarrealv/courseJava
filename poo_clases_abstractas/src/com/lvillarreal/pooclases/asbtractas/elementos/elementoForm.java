package com.lvillarreal.pooclases.asbtractas.elementos;

abstract public class elementoForm {

    protected  String valor;
    protected String nombre;

    public elementoForm() {
    }

    public elementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    abstract public String dibujarHtml();

}
