import java.util.Scanner;

public class ExercicesTrece {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los 10 números enteros
        System.out.println("Ingrese la cantidad de numeros enteros a mostrar)");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        int recorrido = numeros.length-1;

        // Leer 10 números desde el teclado y almacenarlos en el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }
        // Imprimir los números en el orden deseado usando un bucle for
        System.out.println("Números en el orden deseado:");

        for (int i = 0; i <= recorrido; i++) {
            System.out.println(numeros[n-1- i]); // y el i-ésimo por el final
            System.out.println(numeros[i]); // mostramos el i-ésimo número por el principio

            // Cerrar el escáner
            scanner.close();
        }
    }
}