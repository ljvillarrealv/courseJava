package modulo5;

import java.util.Arrays;
import java.util.Scanner;

public class exercices6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a comparar");

        int cantidad = 20;
        double nota = 0;
        double[] notasMayores = new double[cantidad];
        double sumaPromedioM = 0;
        double tamañoProMayor = 0;

        double[] notasMenores = new double[cantidad];
        double sumaPromedioMe = 0;
        double tamañoProMenor = 0;

        int cantidadNotasUno = 0;


        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese la nota " + (i + 1) + " en escala del 1 al 7: ");
            nota = s.nextDouble();
            if (nota == 0 || nota > 7) {
                System.out.println("error finalizando el programa");
                System.exit(0);
            } else if (nota == 1) {
                cantidadNotasUno++;
            } else if (nota <= 4 && nota >= 2) {
                    notasMenores[i] += nota;
                    tamañoProMenor++;
             //       System.out.println("notasMenores = " + notasMenores[i]);

            } else if (nota <= 7 && nota >=5){
                notasMayores[i] += nota;
                tamañoProMayor++;
                //System.out.println("notasMayores = " + notasMayores[i]);
                //  sumaPromedioM += notasMayores[j];
            }
        }


        double promedioMayor = Arrays.stream(notasMayores).sum();
        double promedioMenor = Arrays.stream(notasMenores).sum();


        System.out.println("-------------------------------------------------");

        System.out.println("promedio Menor es = " + (promedioMenor/tamañoProMenor));
        System.out.println("......................................................");
        System.out.println("promedio Mayor es = " + (promedioMayor/tamañoProMayor));
        System.out.println("......................................................");
        System.out.println("cantidad Notas igual a Uno son = " + cantidadNotasUno);
        System.out.println("--------------------------------------------------");
    }
}