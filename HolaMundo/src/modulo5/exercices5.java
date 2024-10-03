package modulo5;

import java.util.Scanner;

public class exercices5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a comparar");

        int cantidad = s.nextInt();

        if (cantidad < 10) {
            System.out.println("Error: Debe comparar minimo 10 numeros enteros ");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero = 0;


            for (int i = 0; i < cantidad; i++) {
                System.out.println("ingrese el numero " + (i + 1) + " entero a comparar: ");
                numero = s.nextInt();
                menor = (numero < menor) ? numero : menor;

            }

                System.out.println("El numero menor es : " + menor);
                if (menor < 10) {

                    System.out.println("El numero " + menor + " es menor a 10");
                } else {
                    if (menor > 10) {
                        System.out.println("el numero " + menor + " es mayor que 10");
                    }System.out.println("El numero " + menor + " es igual a 10 ");
                        }


                    }
                }
            }


