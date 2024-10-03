package org.lvillareal.java8;

import org.lvillareal.java8.aritmetica.Aritmetica;
import org.lvillareal.java8.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {

    public static void main(String[] args) {

        Aritmetica suma = (a, b9) -> a + b9;
        Aritmetica resta = (a,b9) -> a-b9;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10,52,suma));

        System.out.println(cal.computar(5,5,resta));

        System.out.println(cal.computar(5,5, (a,b9) -> a*b9));
    }
}
