package modulo6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class exercixes9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/yyyy");

        try {
            Date fecha = formato.parse(s.next());

            Date fechaActual = new Date();

            int Edad =  fechaActual.getYear() - fecha.getYear();

            System.out.println("Edad = " + Edad);


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
