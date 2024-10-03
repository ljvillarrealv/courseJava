package modulo5;

import java.util.Scanner;

public class Exercices7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Valores a Multiplicar Positivos o negativos (Unarios)");
        System.out.println("Ingrese el valor del primer numero entero positivo o negativo");
        int numero1 = s.nextInt();
        System.out.println("Ingrese el valor del segundo numero entero positivo o negativo");
        int numero2 = s.nextInt();
        int resultado = 0;

        boolean positivo1 = numero1 > -1;
        boolean positivo2 = numero2 > -1;


        for (int i = 0; i < Math.abs(numero1); i++) {
            resultado = resultado + numero2;
        }

        if((!positivo1 && !positivo2) || !positivo1){

            resultado = -resultado;

        }

        // Imprimir el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

    }
}
