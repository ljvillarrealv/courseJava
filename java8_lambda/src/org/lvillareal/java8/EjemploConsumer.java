package org.lvillareal.java8;

import org.lvillareal.java8.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) ->{

            System.out.println(nombre + ", tiene "+edad +" años!");
        };
    consumidorBi.accept("pepe",25);

    Consumer<String> consumidor2 = System.out::println;
    consumidor2.accept("mensaje");

    List<String> nombres = Arrays.asList("Luis","pedro","Laura","Amanda");
    nombres.forEach(consumidor2);
        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) ->{
            persona.setNombres(nombre);
        };
        asignarNombre.accept(usuario,"Luis Jose");
        System.out.println("Nombre de Usuario: " + usuario.getNombres());

        Supplier<String> proveedor = ()->{
         return "Hola mundo lambda supplier";
        };
        System.out.println(proveedor.get());
    }
}
