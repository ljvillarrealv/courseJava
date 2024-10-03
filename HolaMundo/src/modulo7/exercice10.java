package modulo7;

import java.util.Scanner;

public class exercice10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Calcular el area de un Circulo");
        System.out.println("ingrese el valor del radio del circulo en centimetros");
        double radio = s.nextDouble();
        double area = 0.00;


        if ( radio == 0){
            System.err.println("Por favor ingrese un valor diferente a cero (0)");
            main(args);
        } else {
            area = (Math.pow(radio, 2))* Math.PI;

        }
        System.out.println("area del circulo es = " + area + " cm2");
    }
}
