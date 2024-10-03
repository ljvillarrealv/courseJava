package com.lvillarreal.pooclases.asbtractas.elementos;

public class inputForm extends elementoForm{

    private String tipo ="text";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public inputForm(String nombre) {
        super(nombre);
    }

    public inputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }


    @Override
    public String dibujarHtml() {
        return "<input type=\"\""+ this.tipo
                +"\" name=\"" + this.nombre
                +"\" value=\""+ this.valor +"\">";
    }
}
