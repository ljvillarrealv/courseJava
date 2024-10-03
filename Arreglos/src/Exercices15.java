import java.util.Scanner;

public class Exercices15 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

       int [] arreglo = new int[7];
        int cantCero = 0;
        int sumaPositivo =0;
        int cantPo=0;
        int sumaNegativo=0;
        int cantNe=0;


       for (int i = 0; i<7 ; i++){
           System.out.println("ingrese el numero "+(i+1)+":");
           arreglo[i] = s.nextInt();

           if (arreglo[i] == 0) {
               cantCero ++;
           } else if (arreglo[i] >0) {
                sumaPositivo += arreglo[i];
                cantPo++;
           } else if(arreglo[i] <0){
               sumaNegativo += arreglo[i];
               cantNe++;
           }
       }
        int PromedioPositivo = sumaPositivo/cantPo;
       int PromedioNegativo = sumaNegativo/cantNe;

        System.out.println("PromedioNegativo = " + PromedioNegativo);
        System.out.println("PromedioPositivo = " + PromedioPositivo);
        System.out.println("cantidad de numeros = Cero son : " + cantCero);

    }
}
