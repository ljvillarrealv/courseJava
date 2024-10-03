import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Exercices19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(in);
        out.println("Introduzca el valor del tamaño de la x ");
        int n = 5;
        String[][] matriz = new String[n][n];

        if (n == 0) {
            out.println("Error");
            System.exit(0);
        } else {

            // Inicializar la matriz con guiones bajos
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = "0";
                }
            }

            // Colocar la h en las diagonales de la matriz
            for(int i = 0; i < matriz.length;i++){
                for(int j = 0; j < matriz[i].length; j++){
                    if (j == 0 || i == (matriz.length - 1) / 2 || j == (matriz.length-1) && i >= (matriz.length - 1) / 2 ) {

                        matriz[i][j] = "h";
                    }
                }
            }

            // Imprimir la matriz
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(matriz[i][j] + " ");
                }
                out.println();
            }
        }
    }
}
