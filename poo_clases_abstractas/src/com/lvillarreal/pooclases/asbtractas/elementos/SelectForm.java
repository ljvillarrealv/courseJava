package com.lvillarreal.pooclases.asbtractas.elementos;

import com.lvillarreal.pooclases.asbtractas.elementos.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends elementoForm{


    private List<Option> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Option>();
    }

    public SelectForm(String nombre, List<Option> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOption(Option option) {

        this.opciones.add(option);
        return this;
    }


    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name=' ")
                .append(this.nombre)
                .append("'>");

        for (Option option : this.opciones){
            sb.append("\n<option value='")
                    .append(option.getValor())
                    .append("'");

            if (option.isSelected()){
                sb.append(" Selected");
                this.valor = option.getValor();

            }
                    sb.append(">").append(option.getName())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
