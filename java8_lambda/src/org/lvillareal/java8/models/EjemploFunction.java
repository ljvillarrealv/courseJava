package org.lvillareal.java8.models;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String>f1 = param -> "hola que tal? "+ param;
        String resultado = f1.apply("andres");
        System.out.println(resultado);


        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Andres"));

        BiFunction<String, String,String> f3 = (a,b)-> a.toUpperCase().concat(" "+b.toUpperCase());
        String result2 = f3.apply("Hola","Mundo");
        System.out.println(result2);

        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("Andres","Andres2"));
    }
}
