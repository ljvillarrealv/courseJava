import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercices14 {
    public static void main(String[] args) {

        // Arreglo de 7 elementos con valores entre 11 y 99
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los 10 números enteros
        System.out.println("Ingrese la cantidad de numeros enteros a comparar)");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        int numero =0;

        int maximo = 0;

        // Leer 10 números desde el teclado y almacenarlos en el arreglo
       for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numero= scanner.nextInt();
            if (numero< 11 ) {
                System.out.println("Por favor introduzca valores entre 11 y 99 ");
                System.out.println("Por favor vuelva a ingresar el numero");
                i--;
            } else if(numero > 99) {
                System.out.println("Por favor introduzca valores entre 11 y 99 ");
                System.out.println("Por favor vuelva a ingresar el numero");

                i--;
            }else{
                arreglo[i]=numero;
            }

                // Crear un conjunto para eliminar duplicados
                Set<Integer> conjunto = new HashSet<>();

                // Agregar elementos al conjunto (eliminando duplicados)
                for (int num : arreglo) {
                    conjunto.add(num);
                }

                // Encontrar el número más alto en el conjunto
                maximo = Integer.MIN_VALUE;
                for (int num : conjunto) {
                    if (num > maximo) {
                        maximo = num;
                    }
                }


            }
        // Imprimir el resultado
        System.out.println("El número más alto es: " + maximo);
        }

    }


