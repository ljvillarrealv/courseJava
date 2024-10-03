import java.util.Scanner;

public class Exercices16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int[] arregloCantidadValores = new int[10];
        int posicion = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
        int max = 0;


        // ingresamos los datos
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero de 1 a 9: ");
            arreglo[i] = scanner.nextInt();
            }




        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
        }

        for (int i = 0; i < 10; i++) {
            if (max < arregloCantidadValores[i]) {
                max = arregloCantidadValores[i];
                posicion = i;
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arreglo[posicion]);
        System.out.println("el elemento " + arreglo[posicion] + " esta repetido " + max + " veces!");
    }
}




