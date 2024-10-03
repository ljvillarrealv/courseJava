package org.lvillarreal.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {


        Stream<String> nombres =Stream.of("Pato","Paco","Pedro","Luis");
      //  nombres.forEach(System.out::println);


        String[]arr ={"Pato","Paco","Pedro","Luis"};
        nombres = Arrays.stream(arr);

        nombres.forEach(System.out::println);

        Stream<String> nombress= Stream.<String>builder()
                .add("Pato")
                .add("Loco")
                .add("Pedrito").build();
        nombress.forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("Cuatro");

        Stream<String> nombres1 = list.stream();
        nombres1.forEach(System.out::println);
    }
}
