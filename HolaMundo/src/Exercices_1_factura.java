import java.util.Scanner;

public class Exercices_1_factura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de la factura o descripcion:");
        String NombreFactura = scanner.nextLine();

        System.out.println("Ingrese precio del primer producto:");
        double Precio1 = scanner.nextDouble();
        System.out.println("Ingrese precio del segundo producto:");
        double Precio2 = scanner.nextDouble();

        double Impuesto = (Precio1+Precio2)*0.19;


        System.out.println("La factura:"+ NombreFactura + "\n tiene costo total bruto de = " + (Precio1+Precio2) +", con un impuesto de: " + Impuesto +
                " y el monto despues de impuesto es de: " +(Precio1+Precio2+Impuesto) );


    }
}
