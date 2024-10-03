import java.util.Scanner;

public class Exercices17 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int [] arreglo = new int [12];
        int valor=0;
        String str1, str2, str3, str4, str5, str6;

        str1 = str2 = str3 = str4 = str5 = str6 = "";
        System.out.println(" ingrese números enteros de rango 1 al 6" );
        for (int i =0 ; i <12 ; i++){
            System.out.println(" ingrese el numero "+ (i+1)+" = " );
            valor=s.nextInt();
            switch (valor){

                case 1:
                    arreglo[i]=valor;
                    str1 = str1 + "*";
                    break;
                case 2:
                    arreglo[i]=valor;
                    str2 = str2 + "*";
                    break;
                case 3:
                    arreglo[i]=valor;
                    str3 = str3 + "*";
                    break;
                case 4:
                    arreglo[i]=valor;
                    str4 = str4 + "*";
                    break;
                case 5:
                    arreglo[i]=valor;
                    str5 = str5 + "*";
                    break;
                case 6:
                    arreglo[i]=valor;
                    str6 = str6 + "*";
                    break;
                default:
                    System.err.println("Por favor solo números enteros de rango de 1 al 6");
            }

        }

        System.out.println("1 = " + str1);
        System.out.println("2 = " + str2);
        System.out.println("3 = " + str3);
        System.out.println("4 = " + str4);
        System.out.println("5 = " + str5);
        System.out.println("6 = " + str6);
    }
}
