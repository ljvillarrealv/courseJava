package com.lvillarreal.pooclases.asbtractas.elementos.select;

public class Option {

    private String valor;
    private String name;
    private boolean selected;

    public Option() {
    }

    public Option(String valor, String name) {
        this.valor = valor;
        this.name = name;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}



